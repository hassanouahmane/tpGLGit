package tpGL;
import java.util.Scanner;


public class Client {
	public static void main(String[] args) {
			System.out.println("entrer un nombre pour lancer l'un des programme : ");
			Scanner s = new Scanner(System.in);
			int choix = s.nextInt();
			
 			Program p =  ProgFactory.createProgramm(choix);
			  p.go();
			  s.close();
			  
		  }
	}

