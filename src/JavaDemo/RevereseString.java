package JavaDemo;

public class RevereseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="mohan";
		String str2="";
		
		for(int i=str1.length()-1; i>=0 ; i--)
		{
		str2=str2+str1.charAt(i);
		}
		System.out.println(str2);
	}

}
