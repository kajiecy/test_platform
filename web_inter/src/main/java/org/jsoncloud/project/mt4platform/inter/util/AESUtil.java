package org.jsoncloud.project.mt4platform.inter.util;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * @author wenka
 * @email wkwenka@gmail.com
 * @Date 2017/9/22
 * @desc
 */
public class AESUtil {

    private static byte[] initAESKey(String seed) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
        if (seed != null) {
            secureRandom.setSeed(seed.getBytes("UTF-8"));
        } else {
            secureRandom.setSeed("Zjg2YzcwNDEtODIyNy00MmI3LWFkZGItZmUyYjgxMDIzZGQw".getBytes("UTF-8"));
        }

        KeyGenerator kg = KeyGenerator.getInstance("AES");
        kg.init(128, secureRandom);
        SecretKey secretKey = kg.generateKey();
        return secretKey.getEncoded();
    }

    private static String aesEncrypt(String source, byte[] key) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(1, secretKey);
        byte[] bytes = cipher.doFinal(source.getBytes());
        return Base64.encodeBase64URLSafeString(bytes);
    }

    private static String aesDecrypt(String source, byte[] key) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
        SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(2, secretKey);
        byte[] bytes = cipher.doFinal(Base64.decodeBase64(source));
        return new String(bytes, "UTF-8");
    }

    public static String encrypt(String source) {
        String result = null;

        try {
            byte[] e = initAESKey("Zjg2YzcwNDEtODIyNy00MmI3LWFkZGItZmUyYjgxMDIzZGQw");
            result = aesEncrypt(source, e);
        } catch (Exception var3) {
            var3.printStackTrace();
        }

        return result;
    }

    public static String decrypt(String source) {
        String result = null;

        try {
            byte[] e = initAESKey("Zjg2YzcwNDEtODIyNy00MmI3LWFkZGItZmUyYjgxMDIzZGQw");
            result = aesDecrypt(source, e);
        } catch (Exception var3) {
            var3.printStackTrace();
        }

        return result;
    }

    public static void main(String[] args) {
        String wenka = encrypt("天空");
        System.out.println("加密：" + wenka);
        wenka = decrypt("KJ0iGAYLt1F2de4P93hjrQ");
        System.out.println("解密：" + wenka);
    }
}
