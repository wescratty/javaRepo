
/**
 * Created by wescratty on 9/19/15.
 */


public class functionClass {
    private static functionClass ourInstance = new functionClass();  //
    /** Static 'instance' method */
    public static functionClass getInstance() {
        return ourInstance;
    }

    /** A private Constructor prevents any other
     * class from instantiating.
     */
    private functionClass() {}

    /** Other methods protected by singleton-ness */
    protected String[] makeSin(){
        double theta;
        String [] anArray = new String[720];
        for (int i = 0; i < 720; i++) {
            theta = (((i) * Math.PI)/90 );
            anArray[i] =Integer.toString((int)(Math.sin(theta)*1000)+1000);
        }
        return anArray;
    }
}
