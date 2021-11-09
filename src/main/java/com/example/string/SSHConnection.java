package com.example.string;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class SSHConnection {

	public static void main(String[] args) throws Exception {
		SSHConnection t = new SSHConnection();
		try {
			t.go();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void go() throws Exception {

		StringBuilder outputBuffer = new StringBuilder();

		String host = "10.91.49.4"; // First level target
		String user = "rgupta";
		String password = "Lyra@1234567";
		String tunnelRemoteHost = "10.91.50.67"; // The host of the second target
		String secondPassword = "Lyra@1234567";
		int port = 22;

		JSch jsch = new JSch();
		Session session = jsch.getSession(user, host, port);
		session.setPassword(password);
		// localUserInfo lui = new localUserInfo();
		/* session.setUserInfo(lui); */
		session.setConfig("StrictHostKeyChecking", "no");
		// create port from 2233 on local system to port 22 on tunnelRemoteHost
		session.setPortForwardingL(2233, tunnelRemoteHost, 22);
		session.connect();
		session.openChannel("direct-tcpip");

		// create a session connected to port 2233 on the local host.
		Session secondSession = jsch.getSession(user, "localhost", 2233);
		secondSession.setPassword(secondPassword);
		// secondSession.setUserInfo(lui);
		secondSession.setConfig("StrictHostKeyChecking", "no");

		secondSession.connect();
		System.out.println("Connected");
		// now we're connected to the secondary system
		/*
		 * Channel channel = secondSession.openChannel("exec"); ((ChannelExec)
		 * channel).setCommand("hostname");
		 * 
		 * channel.setInputStream(null);
		 * 
		 * InputStream stdout = channel.getInputStream();
		 * 
		 * channel.connect();
		 * 
		 * while (true) { byte[] tmpArray = new byte[1024]; while (stdout.available() >
		 * 0) { int i = stdout.read(tmpArray, 0, 1024); if (i < 0) break;
		 * outputBuffer.append(new String(tmpArray, 0, i)); } if (channel.isClosed()) {
		 * System.out.println("exit-status: " + channel.getExitStatus()); break; } }
		 * stdout.close();
		 */

		// channel.disconnect();

		secondSession.disconnect();
		session.disconnect();

		System.out.print(outputBuffer.toString());
	}
}
