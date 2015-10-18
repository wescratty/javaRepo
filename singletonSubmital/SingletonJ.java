package Singleton_1;

public class SingletonJ {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		
		
//	            
		Singleton[] mySingletonArray = new Singleton[10];//Array of objects
		
		for(int i = 0;i<10;i++){
			mySingletonArray[i] = Singleton.Instance();//get 5 singletons
			mySingletonArray[i].printStats(mySingletonArray[i],i);
			Thread.sleep(50);
		}
		
		if (mySingletonArray[0].equals(mySingletonArray[4])) {
			System.out.println("\n\nSame object");
		}else{System.out.println("\n\nIntruder");}
	}
}

class Singleton 
{
	
	public static Singleton Instance()  {
     if (_instance == null) {
         synchronized (Singleton.class) {
        	
        	 //----- Second lock -----
             if (_instance == null) {
            	
                 _instance = new Singleton();

                 System.out.println("New object  "+System.identityHashCode(_instance)+"\t Born on:   "
                 +_instance.startTime);// print if made new
             }  
          }
     }
     return _instance;      
 }
 protected Singleton() {}
 
 public void printStats(Singleton current, int i){
	System.out.print("\nObj["+i+"]. lcl "+System.identityHashCode(current));// check to see if their address is the same
	System.out.print("\t birthdate: "+current.startTime);
	System.out.print("\t time from birth: "+(System.currentTimeMillis()-startTime));
 }
 
 private static Singleton _instance = null;
 public final long startTime = System.currentTimeMillis();
 
 
}
