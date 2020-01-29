package JavaDemo;

public class RevereseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 23456;
		int b = 0;
		
		while (a!=0) {
			
			int c= a%10;
			b = b*10 +c;
			System.out.println(b);
			a /= 10;
			
		}
			System.out.println("reverse number "+b);	
		
		
		/*String str1="mohan";
		String str2="";
		
		for(int i=str1.length()-1; i>=0 ; i--)
		{
		str2=str2+str1.charAt(i);
		}
		System.out.println(str2);*/
	}

}
