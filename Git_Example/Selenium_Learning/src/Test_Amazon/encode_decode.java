package Test_Amazon;

import org.apache.commons.codec.binary.Base64;

public class encode_decode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "703703";
		byte[] encode = Base64.encodeBase64(str.getBytes());
		
		
		System.out.println("String before encoding is: " +str);
		System.out.println("String after encoding is: " + new String(encode));
		
		byte[] decode = Base64.decodeBase64(encode);
		System.out.println("String after decoding is: " +new String(decode));
		

	}

}
