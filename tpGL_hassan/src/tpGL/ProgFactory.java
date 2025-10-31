package tpGL;

public class ProgFactory {
 public static Program createProgramm(int choix) {
	 if (choix == 1) {
		  return new Program1();
		}else if ( choix == 2) {
		  return new Program2();
		  
		}else if ( choix == 3) {
		  return new Program3();
		  
		 }else {
		 return  null;
		  
	  }
 }
}
