package implementationProg;

public  class FunctionClass {
	public FunctionClass(){
		
		
		
	}
	
	public int calculate(int x, String operator, int y){
		if(operator == "+"){
			return x+y;
		}else if (operator == "*"){
			return x*y;
		}else if (operator == "^"){
			int pow = 1;
			for(int i=0;i<y;i++){
				pow = pow*x;
			}
			return pow;
		}else if (operator == "-"){
			return x-y;
		}else if (operator == "/"){
			return x/y;
		}else{
			return 0;
		}
		
		
		
		
	}

}
