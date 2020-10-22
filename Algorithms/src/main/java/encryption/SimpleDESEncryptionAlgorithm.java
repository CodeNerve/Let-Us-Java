package encryption;

import java.util.*;
public class SimpleDESEncryptionAlgorithm {
	String[] keyGeneration(String key0,int[] p10,int[] p8){
		StringBuilder Key1 = new StringBuilder(key0);
		for(int i = 0;i<p10.length;i++){
			Key1.setCharAt(i,key0.charAt((p10[i])-1));
		}
		StringBuilder rightBit = new StringBuilder(Key1.substring(0,5));
		StringBuilder leftBit = new StringBuilder(Key1.substring(5));

		StringBuilder lf1 = new StringBuilder(rightBit.substring(1));
		lf1.append(rightBit.charAt(0));
		StringBuilder lf2 = new StringBuilder(leftBit.substring(1));
		lf2.append(leftBit.charAt(0));

		lf1.append(lf2);
		String key1 = "";
		for(int i = 0;i<p8.length;i++){
			key1+=Character.toString(lf1.charAt((p8[i])-1));
		}

		StringBuilder lf11 = new StringBuilder(lf1.substring(2,5));
		lf11.append(lf1.charAt(0));lf11.append(lf1.charAt(1));

		StringBuilder lf12 = new StringBuilder(lf1.substring(7));
		lf12.append(lf1.charAt(5));lf12.append(lf1.charAt(6));
		lf11.append(lf12);
		String key2 = "";

		for(int i  = 0;i<p8.length;i++){
			key2+=Character.toString(lf11.charAt((p8[i])-1));
		}
		String keys[] = {key1,key2};
		return keys;
	}

	String encryption1(String pText,int[] ip,String[] keys){
		StringBuilder Ip = new StringBuilder(pText);
		for(int i = 0;i<ip.length;i++){
			Ip.setCharAt(i,pText.charAt((ip[i])-1));
		}
		//System.out.println(Ip);
		StringBuilder Fkey1Left = new StringBuilder(Ip.substring(0,4));
		StringBuilder Fkey1Right = new StringBuilder(Ip.substring(4));

		int ExpBox[] = {4,1,2,3,2,3,4,1};

		StringBuilder Fkey1RightExpanded = new StringBuilder();
		for(int i = 0;i<ExpBox.length;i++){
			Fkey1RightExpanded.append(Fkey1Right.charAt((ExpBox[i])-1));
		}
		//Now
		String XORresult = XOR(Fkey1RightExpanded.toString(),keys[0]);
		StringBuilder xorResult = new StringBuilder(XORresult); 
		//System.out.println(xorResult);
		StringBuilder xorResultLeft = new StringBuilder(xorResult.substring(0,4));
		StringBuilder xorResultRight = new StringBuilder(xorResult.substring(4));
		//System.out.println(xorResultLeft+" "+xorResultRight);
		String SBoxResult = SBox(xorResultLeft.toString(),xorResultRight.toString());
		//System.out.println(SBoxResult);
		String PBoxResult = PBox(SBoxResult);

		String XORresult1 = XOR(Fkey1Left.toString(),PBoxResult);
		String finalResult0 = XORresult1+Fkey1Right.toString();

		String finalResult1 = swap(finalResult0);

		String grandFinalResult = encryption2(finalResult1,ExpBox,keys[1]);
		return grandFinalResult;
	}

	String encryption2(String FKey1,int Ep[],String k){
		StringBuilder Fkey2Left = new StringBuilder(FKey1.substring(0,4));
		StringBuilder Fkey2Right = new StringBuilder(FKey1.substring(4));

		StringBuilder Fkey2RightExpanded = new StringBuilder();
		for(int i = 0;i<Ep.length;i++){
			Fkey2RightExpanded.append(Fkey2Right.charAt((Ep[i])-1));
		}
		String XORresult = XOR(Fkey2RightExpanded.toString(),k);
		StringBuilder xorResult = new StringBuilder(XORresult); 
		StringBuilder xorResultLeft = new StringBuilder(xorResult.substring(0,4));
		StringBuilder xorResultRight = new StringBuilder(xorResult.substring(4));

		String SBoxResult = SBox(xorResultLeft.toString(),xorResultRight.toString());
		String PBoxResult = PBox(SBoxResult);

		String XORresult1 = XOR(Fkey2Left.toString(),PBoxResult);
		String finalResult0 = XORresult1+Fkey2Right.toString();
		String finalResult1 = "";

		int IpInverse[] = {4,1,3,5,7,2,8,6};
		for(int i = 0;i<IpInverse.length;i++){
			finalResult1+=Character.toString(finalResult0.charAt((IpInverse[i])-1));
		}

		return finalResult1;
	}
	static String SBox(String a,String b){
		String s0[][] = {{"01","00","11","10"},{"11","10","01","00"},{"00","10","01","11"},{"11","01","11","10"}};
		String s1[][] = {{"00","01","10","11"},{"10","00","01","11"},{"11","00","01","00"},{"10","01","00","11"}};
		String SZero = "";
		String SOne = "";
		int SZeroRow = 0,SZeroCol = 0;
		int SOneRow = 0,SOneCol = 0;
		switch(Character.toString(a.charAt(0))+Character.toString(a.charAt(3))){
			case "00":SZeroRow=0;
			break;
			case "01":SZeroRow=1;
			break;
			case "10":SZeroRow=2;
			break;
			case "11":SZeroRow=3;
		}
		switch(Character.toString(a.charAt(1))+Character.toString(a.charAt(2))){
			case "00":SZeroCol=0;
			break;
			case "01":SZeroCol=1;
			break;
			case "10":SZeroCol=2;
			break;
			case "11":SZeroCol=3;
		}

		switch(Character.toString(b.charAt(0))+Character.toString(b.charAt(3))){
			case "00":SOneRow=0;
			break;
			case "01":SOneRow=1;
			break;
			case "10":SOneRow=2;
			break;
			case "11":SOneRow=3;
		}
		switch(Character.toString(b.charAt(1))+Character.toString(b.charAt(2))){
			case "00":SOneCol=0;
			break;
			case "01":SOneCol=1;
			break;
			case "10":SOneCol=2;
			break;
			case "11":SOneCol=3;
		}
		SZero = s0[SZeroRow][SZeroCol];
		SOne = s1[SOneRow][SOneCol];
		//System.out.println(SZero+" "+SOne);
		String result = SZero+SOne;
		return result;
	}
	static String PBox(String a){
		int p4[] = {2,4,3,1};
		String b = "";
		for(int i = 0;i<p4.length;i++){
			b+=Character.toString(a.charAt((p4[i])-1));
		}
		return b;
	}
	static String swap(String a){
		StringBuilder b = new StringBuilder(a);
		StringBuilder c = new StringBuilder(b.substring(4));
		c.append(b.substring(0,4));
		return c.toString();
	}
	 static String XOR(String a,String b){
		String c = "";
		for(int i = 0;i<a.length();i++){
			if(a.charAt(i)==b.charAt(i))
				c+="0";
			else
				c+="1";
		}
		return c;
	}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the plaintext:");
	String pText = s.nextLine();
	System.out.println("Enter the key:");
	String key = s.nextLine();
	int pTen[] = {3,5,2,7,4,10,1,9,8,6};
	int pEight[] = {6,3,7,4,8,5,10,9};
	SimpleDESEncryptionAlgorithm cipher= new SimpleDESEncryptionAlgorithm();
	String keys[] = cipher.keyGeneration(key,pTen,pEight);

	System.out.println("Key1 is:- "+keys[0]+"\n"+"Key2 is:- "+keys[1]);

	int Ip[] = {2,6,3,1,4,8,5,7};

	String cipherText = cipher.encryption1(pText,Ip,keys);
	System.out.println("Cipher Text is:- "+cipherText);
}
}