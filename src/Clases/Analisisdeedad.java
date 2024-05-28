package Clases;

import java.util.ArrayList;

public class Analisisdeedad {
	 ArrayList<Integer>edad=new ArrayList();

	 public Analisisdeedad(ArrayList<Integer> edad) {
	 	super();
	 	this.edad = edad;
	 }
	  
	   public void comprobar(ArrayList<Integer>edad) {
	 	  int menores=0,mayores=0,jubilados=0;
	 	  for(int i=0;i<edad.size();i++) {
	 		  if(edad.get(i)<18) {
	 			  menores++;
	 		  }else if(edad.get(i)>18||edad.get(i)<65) {
	 			  mayores++;
	 		  }else if(edad.get(i)>65) {
	 			  jubilados++;
	 		  }
	 	  }
	 	  System.out.println("Menores de edad hay "+ menores +" Mayores de edad "+mayores+" Jubilados "+ jubilados);
	   }
}
