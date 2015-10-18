
import java.io.*;
import java.util.Scanner;

public class CSVClass {

    private static CSVClass ourInstance = new CSVClass();

    /** Static 'instance' method */
    public static CSVClass getInstance() {

        return ourInstance;
    }

    /** A private Constructor prevents any other
     * class from instantiating.
     */
    private CSVClass() {}

    /** Other methods protected by singleton */

    static String[] strData;

    protected String[] getCSV(String p) {

        int index = 0;

        try {
            int size = countLines(p);
            System.out.println("size is " + size);
            strData = new String[size];
            Scanner scanner = new Scanner(new File(p));
            scanner.useDelimiter(",");
            while (scanner.hasNext()) {
                strData[index] = scanner.next().trim();
                index++;
            }
            scanner.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
        return strData;
    }

    /** Other methods protected by singleton */
    protected static int countLines(String filename) throws IOException {
        try {
            LineNumberReader reader = new LineNumberReader(new FileReader(filename));
            int cnt;
            reader.skip(Long.MAX_VALUE);
            cnt = reader.getLineNumber()+1;
            reader.close();
            return cnt;
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return 0;
    }
}




