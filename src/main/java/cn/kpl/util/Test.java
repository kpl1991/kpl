package cn.kpl.util;


import com.alibaba.druid.sql.visitor.functions.Hex;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Test {
    // MD5加码。32位
    public static String MD5(String inStr) {
        MessageDigest md5 = null;
        StringBuilder result = new StringBuilder();

        try {
            md5 = MessageDigest.getInstance("MD5");
            byte[] bytes = md5.digest(inStr.getBytes(Charset.forName("utf-8")));
            for (Byte b : bytes) {
                String s = Integer.toHexString(b&0xff);
                if (s.length() == 1) {
                    result.append("0");
                }
                result.append(s);

            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return result.toString();
    }
    // 测试主函数
    public static void main(String args[]) {
        System.out.println(MD5("kpl1cdxfgdfg23"));
    }


}
