package implementationProg;

import java.awt.Point;
import java.util.ArrayList;


public class singleAdder {
	private static singleAdder instance = null;
	
	static ArrayList<String> mathString = new ArrayList<>();
	
	   protected singleAdder() {
	      // Exists only to defeat instantiation.
	   }
	   public static singleAdder getInstance() {
	      if(instance == null) {
	         instance = new singleAdder();
//			System.out.println("\nNew:  "+System.identityHashCode(instance));// print if made new

	      }
	      
	   
	      return instance;
	   }
	   
	   public static void addMath(String item){
		   mathString.add(item);
		   
	   }
	   public void print(){
		   for (String value : mathString) {
			    System.out.println(value);
			} 
	   }
	   public static String getNext(){
		   return (mathString.remove(0));
	   }

}
