package com.learn.blog.until;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD加密工具
 * 
 */
public class Md5Util {
	/**
	 * 按照md5进行加密
	 * @param pwd 密码字符串
	 * @return
	 */
		public final static String md5(String pwd) {
			//用于加密的字符
			char md5String[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
					'A', 'B', 'C', 'D', 'E', 'F' };
			try {
				//使用平台的默认字符集将此 String 编码为 byte序列，并将结果存储到一个新的 byte数组中
				byte[] btInput = pwd.getBytes();

				//信息摘要是安全的单向哈希函数，它接收任意大小的数据，并输出固定长度的哈希值。
				MessageDigest mdInst = MessageDigest.getInstance("MD5");

				//MessageDigest对象通过使用 update方法处理数据， 使用指定的byte数组更新摘要
				mdInst.update(btInput);

				// 摘要更新之后，通过调用digest（）执行哈希计算，获得密文
				byte[] md = mdInst.digest();

				// 把密文转换成十六进制的字符串形式
				int j = md.length;
				char str[] = new char[j * 2];
				int k = 0;
				for (int i = 0; i < j; i++) {   //  i = 0
					byte byte0 = md[i];  //95
					str[k++] = md5String[byte0 >>> 4 & 0xf];    //    5
					str[k++] = md5String[byte0 & 0xf];   //   F
				}

				//返回经过加密后的字符串
				return new String(str);

			} catch (Exception e) {
				return null;
			}
		}

	/**
	 * 按照指定的方式进行加密
	 * @param plainText
	 * @param algorithm
	 * @return
	 */
	public static String encrypte(String plainText, String algorithm) {
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance(algorithm);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		md.update(plainText.getBytes());
		byte[] b = md.digest();
		StringBuilder output = new StringBuilder(32);
		for (int i = 0; i < b.length; i++) {
			String temp = Integer.toHexString(b[i] & 0xff);
			if (temp.length() < 2) {
				output.append("0");
			}
			output.append(temp);
		}
		return output.toString();
	}
	public static void main(String[] args) {
		System.err.println("md5=" + Md5Util.md5("111111"));
		System.err.println("md5=" + Md5Util.encrypte("admin", "MD5"));
		System.err.println("md2=" + Md5Util.encrypte("admin", "MD2"));
		System.err.println("sha-512=" + Md5Util.encrypte("admin", "SHA-512"));
		System.err.println("sha-256=" + Md5Util.encrypte("admin", "SHA-256"));
		System.err.println("sha-1=" + Md5Util.encrypte("admin", "SHA-1"));
	}
}
