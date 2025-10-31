package tpGL_hassan;

import java.util.Scanner;


public class Client {
	public static void main(String[] args) {
		
			Scanner s = new Scanner(System.in);
			int choix = s.nextInt();
			
 			if (choix == 1) {
			  Program1 P1 = new Program1();
			  P1.go();
 			}else if ( choix == 2) {
			  Program2 P = new Program2();
			  P.go();
 			}else if ( choix == 3) {
			  Program3 P = new Program3();
			  P.go();
			 }else {
			  System.out.println("PROGRAM INCONNUE !");
			  
		  }
 		s.close();
	}
}

