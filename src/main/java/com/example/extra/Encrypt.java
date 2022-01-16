package com.example.extra;

import lombok.extern.log4j.Log4j2;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.Charset;
import java.util.Base64;

@Log4j2
public class Encrypt {
/*    public static void main(String[] args) {
        //Shop put pv_id of any shop
    //    System.out.println(encrypt(new Identifier("Shop", new Long(88057868).toString())));
        ///Contract
        System.out.println("Contract: "+encrypt(new Identifier("Contract", new Long(12345678).toString())));

       // System.out.println(new Identifier("Shop", new Long(9205240387850193728L).toString()));
     //   System.out.println(decrypt("i$Qy$_17A1RIkKIw9vQr2w--"));
        System.out.println("Contract: "+encryptTwo(new Identifier("Contract", new Long(12345678).toString())));
    }*/

    public static Identifier decrypt(String cryptedText) {
        if (getCryptKey() == null) {
            return new Identifier("Clear", cryptedText);
        }
        byte[] bytes = org.apache.commons.codec.binary.Base64.decodeBase64(cryptedText);
        byte[] decrypted = decryptBytes(bytes, getCryptKey());
        return (decrypted == null) ? null : new Identifier(new String(decrypted, Charset.forName("UTF-8")));
    }

    private static byte[] decryptBytes(byte[] cryptedText, byte[] cryptKey) {
        if (cryptKey == null) {
            throw new IllegalArgumentException("Invalid key (null)");
        }
        try {
            SecretKeySpec key = new SecretKeySpec(cryptKey, "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, key);
            return cipher.doFinal(cryptedText);
        } catch (Exception e) {
        log.error(e);
            return null;
        }
    }

    public static String encrypt(Identifier identifier) {

        byte[] bytes = identifier.toString().getBytes(Charset.forName("UTF-8"));
        byte[] encrypted = encryptBytes(bytes, getCryptKey());
        // On ne peut pas utiliser Base64 d'apache car on utilise des caractères spécifiques ($ & _)

        return (encrypted == null) ? null :encrypted.toString();// Base64.getEncoder().encodeToString(encrypted);
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

    public static String encryptTwo(Identifier identifier) {
        if (getCryptKey() == null) {
            return identifier.getIdAsString();
        }
        byte[] bytes = identifier.toString().getBytes(Charset.forName("UTF-8"));
        byte[] encrypted = encryptBytes(bytes, getCryptKey());
        // On ne peut pas utiliser Base64 d'apache car on utilise des caractères spécifiques ($ & _)

        return (encrypted == null) ? null : org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(encrypted);
    }

    private static String encrypt(byte[] data, byte[] key) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
        Cipher acipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        acipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        byte[] encryptedBytes = acipher.doFinal(data);
        return new String(Base64.getEncoder().encode(encryptedBytes));
    }

    public static void main(String[] args) throws Exception {
        String contactDetails ="Contract:12345678";
        String key = "62394e492ff2dd91817eaa3d02bb409ed8d934275e5dbe682614dd5ecc7f3e0d";
       // System.out.println(encryptThree(key,contactDetails));
      //  System.out.println(parse(key));
        System.out.println("Contract: "+encrypt(new Identifier("Contract", new Long(12345678).toString())));

    }



    public static String encryptThree(String key, String value) {
        try {
           // IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec);

            byte[] encrypted = cipher.doFinal(value.getBytes());
            System.out.println("encrypted string: "
                    + org.apache.commons.codec.binary.Base64.encodeBase64String(encrypted));

            return org.apache.commons.codec.binary.Base64.encodeBase64String(encrypted);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }
}
