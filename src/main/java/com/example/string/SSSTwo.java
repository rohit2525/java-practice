package com.example.string;

import java.io.ByteArrayOutputStream;
import java.sql.DriverManager;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

public class SSSTwo {

	public static void main(String args[]) throws Exception {

		String username = "rgupta";
		String password = "Lyra@1234567";
		String host = "10.91.49.4";
		int port = 22;
		String command = "ls";
		listFolderStructure(username, password, host, port, command);
	}

	public static String listFolderStructure(String username, String password, String host, int port, String command)
			throws Exception {
		String tunnelRemoteHost = "10.91.50.67"; // The host of the second target
		Session session = null;
		String response = null;
		try {
			session = new JSch().getSession(username, host, port);
			session.setConfig("StrictHostKeyChecking", "no");
			session.setPassword(password);
			session.setConfig("PreferredAuthentications", "publickey,keyboard-interactive,password");
			session.setPortForwardingL(9999, tunnelRemoteHost, 22);
			session.connect();

			Session secondSession = new JSch().getSession(username, "localhost", 9999);
			secondSession.setPassword(password);
			secondSession.setConfig("StrictHostKeyChecking", "no");
			secondSession.setConfig("PreferredAuthentications", "publickey,keyboard-interactive,password");
			secondSession.connect();
			System.out.println("SSH Connected");

			String lyra = "jdbc:mariadb://dbpzl01.mum.prod.in.lyra:3306/pzl?useSSL=false&serverTimezone=+05:30&useLegacyDatetimeCode=false&useBatchMultiSend=false";
			String driverName = "com.mysql.cj.jdbc.Driver";
			// mysql database connectivity
			Class.forName(driverName).newInstance();
			DriverManager.getConnection(lyra, "rgupta", "Lyra@1234567");

			System.out.println("Connected");

			secondSession.disconnect();
			session.disconnect();
		} catch (JSchException e) {
			e.printStackTrace();
		}
		return response;
	}
}