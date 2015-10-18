
public class MemoryUsageLogClass {
    private static MemoryUsageLogClass ourInstance = new MemoryUsageLogClass();


    // Runtime initialization
    // By default ThreadSafe
    public static MemoryUsageLogClass getInstance() {

        return ourInstance;
    }

    private MemoryUsageLogClass() {
    }

    protected void doThis(){
//        do stuff...

    }

    protected void doThat(){
//        do stuff...

    }

}







