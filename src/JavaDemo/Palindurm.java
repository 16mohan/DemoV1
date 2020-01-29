package JavaDemo;

public class Palindurm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str3="madam";
		String str4="";
		
		for(int i=str3.length()-1; i>=0; i--)
		{
		str4= str4+str3.charAt(i);	
		//System.out.println(str4);
		}
		
		if (str3.equals(str4))
		
			System.out.println(str3 +"  it's PALINDROME String");
	/*	else
						System.out.println(str3 +"  not Palidrum");*/
		
		System.out.println(str4);
		
	}

}
