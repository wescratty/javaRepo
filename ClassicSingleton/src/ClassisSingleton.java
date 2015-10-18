public class ClassisSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassicSingleton[] mySingletonArray = new ClassicSingleton[5];//Array of objects	
		
		for(int i = 0;i<5;i++){
			mySingletonArray[i] = ClassicSingleton.getInstance();
			System.out.println(System.identityHashCode(mySingletonArray[i]));// check to see if their address is the same

		}
	}
}


class ClassicSingleton {
	   private static ClassicSingleton instance = null;
	   protected ClassicSingleton() {
	      // Exists only to defeat instantiation.
	   }
	   public static ClassicSingleton getInstance() {
	      if(instance == null) {
	         instance = new ClassicSingleton();
			System.out.println("\nNew:  "+System.identityHashCode(instance));// print if made new

	      }
	      return instance;
	   }
	}