package JavaDemo;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Rows: ");
		int rows = sc.nextInt();
		
		System.out.print("Col: ");
		int col = sc.nextInt();
		
		if(rows <=0 || col <=0) {
			System.out.println("equal values");
			}else
				for(int i =1; i<=rows; i++) {
					for(int j=1; j<=col; j++) {
						System.out.print("B");
					}
					System.out.println();
				}
		
		

	}

}
