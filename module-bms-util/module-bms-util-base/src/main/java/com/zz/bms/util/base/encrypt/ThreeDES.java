package com.zz.bms.util.base.encrypt;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * Created by lijiaojiao on 2017/1/20.
 */
public class ThreeDES {//key 根据实际情况对应的修改
    private final byte[] keybyte="123456788765432112345678".getBytes(); //keybyte为加密密钥，长度为24字节
    private static final String Algorithm = "DESede"; //定义 加密算法,可用 DES,DESede,Blowfish
    private SecretKey deskey;
    ///生成密钥
    public ThreeDES(){
        deskey = new SecretKeySpec(keybyte, Algorithm);
    }
    //加密
    public byte[] encrypt(byte[] data){
        try {
            Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, deskey);
            return cipher.doFinal(data);
        } catch (Exception ex) {
            //加密失败，打日志
            ex.printStackTrace();
        }
        return null;
    }
    //解密
    public byte[] decrypt(byte[] data){
        try {
            Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE,deskey);
            return cipher.doFinal(data);
        } catch (Exception ex) {
            //解密失败，打日志
            ex.printStackTrace();
        }
        return null;
    }


    public static void main(String[] args) throws Exception {
        ThreeDES des=new ThreeDES();
        String req ="135|一二|10100001|410883198501285014|||||1|2|";
//       String req1 ="<?xml version=\"1.0\" encoding=\"UTF-8\"?><service><head><field name=\"spdtrancode\">11111</field><field name=\"spdtranserno\">CM0172061308908f4dc995222321f6ecb888</field><field name=\"spdressys\">2001</field><field name=\"spdresdate\">20141223</field><field name=\"spdrestime\">153606</field><field name=\"spdtranstate\">S</field><field name=\"spderrocode\"></field><field name=\"spderrormsg\"></field></head><body><field name=\"spdcheckrslt\">000000</field></body></service>";

        String toreq  =toHexString(req);
        System.err.println("十六进制报文===="+toreq);
        byte [] srcData=req.toString().getBytes("GBK");
        byte[] encryptData=des.encrypt(srcData);
        System.out.println("密文：");
        if(encryptData!=null){
            for(int i=0;i<encryptData.length;i++){
                String hex= Integer.toHexString(encryptData[i]);
                if(hex.length()>1)
                    System.out.print(hex.substring(hex.length()-2)+" ");
                else
                    System.out.print("0"+hex+" ");
            }
        }
        System.out.println("");
        System.out.println("明文：");
    }

    // 转化字符串为十六进制编码
    public static String toHexString(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            int ch = (int) s.charAt(i);
            String s4 = Integer.toHexString(ch);
            str = str + s4;
        }
        return str;
    }
}