package implementationProg;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;


public class calcDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputString = "3+4";
//		List<String> myList = new ArrayList<String>(Arrays.asList(inputString.split("")));
		
		 singleAdder.getInstance();
//		 singleAdder.mathString.forEach(value:Arrays.asList(inputString.split("")));
//		 singleAdder.mathString.addAll(Arrays.asList(inputString.split("")));

//		 singleAdder.addMath("^");
//		 singleAdder.addMath("5");
//		 List<String> myList =singleAdder.mathString

//		myAdder.print();
		
		FunctionClass myFunc = new FunctionClass();
		
		System.out.println(myFunc.calculate(Integer.parseInt(singleAdder.getNext()), singleAdder.getNext(), Integer.parseInt(singleAdder.getNext()))); 
//		System.out.println(myFunc.calculate(Integer.parseInt(String.valueOf(inputString.charAt(0))), String.valueOf(inputString.charAt(1)), Integer.parseInt(String.valueOf(inputString.charAt(2))))); 
//		System.out.println(String.valueOf(inputString.charAt(1))); 

	}
}
