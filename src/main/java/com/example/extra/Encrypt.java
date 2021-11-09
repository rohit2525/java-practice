package com.example.extra;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.Charset;
import java.util.Base64;

public class Encrypt {
    public static void main(String[] args) {
        //Shop put pv_id of any shop
        System.out.println(encrypt(new Identifier("Shop", new Long(9205240387850193728L).toString())));
        ///Contract
        System.out.println("Contract: "+encrypt(new Identifier("Contract", new Long(9124932358411160571L).toString())));
    }

    public static String encrypt(Identifier identifier) {

        byte[] bytes = identifier.toString().getBytes(Charset.forName("UTF-8"));
        byte[] encrypted = encryptBytes(bytes, getCryptKey());
        // On ne peut pas utiliser Base64 d'apache car on utilise des caractères spécifiques ($ & _)

        return (encrypted == null) ? null : Base64.getEncoder().encodeToString(encrypted);
    }

    private static byte[] encryptBytes(byte[] plainText, byte[] cryptKey) {
        if (cryptKey == null) {
            throw new IllegalArgumentException("Invalid key (null)");
        }
        try {
            SecretKeySpec key = new SecretKeySpec(cryptKey, "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, key);
            return cipher.doFinal(plainText);
        } catch (Exception e) {
            return null;
        }
    }

    private static byte[] getCryptKey() {
        return parse("62394e492ff2dd91817eaa3d02bb409ed8d934275e5dbe682614dd5ecc7f3e0d");
    }

    private static byte[] parse(String str) {
        if (str == null) {
            return null;
        }

        int pos = 0;
        int len = str.length();
        byte[] data = new byte[len / 2];
        int i = 0;
        while (pos < len) {
            data[i] = (byte) Integer.parseInt(str.substring(pos, pos + 2), 16);
            pos += 2;
            ++i;
        }
        return data;
    }
}
