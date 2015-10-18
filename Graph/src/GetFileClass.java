import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


/**
 * Created by wescratty on 9/19/15.
 */
public class GetFileClass {
    private static GetFileClass ourInstance = new GetFileClass();  //
    /** Static 'instance' method */
    public static GetFileClass getInstance() {
        return ourInstance;
    }

    /** A private Constructor prevents any other
     * class from instantiating.
     */
    private GetFileClass() {}

    /** Other methods protected by singleton-ness */

    String filename;

    /** Other methods protected by singleton-ness */
    protected String getFile() {

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("/Users/wescratty/Desktop"));
        fileChooser.setSelectedFile(new File("README.html"));

        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            filename = fileChooser.getSelectedFile().getPath();
            JOptionPane.showMessageDialog(null, "You selected " + filename);

            return filename;
        } else if (result == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "You selected nothing.");
        } else if (result == JFileChooser.ERROR_OPTION) {
            JOptionPane.showMessageDialog(null, "An error occurred.");
        }
        return "Failed to procure file";
    }

    protected void writeFile(String [] a){
        try
        {
            File aFile = new File("/Users/wescratty/Desktop/data.csv");
        FileWriter writer = new FileWriter(aFile);
            for (int i = 0; i < a.length-1; i++) {
                writer.append(a[i]);
                writer.append(",\n");
            }

            writer.append(a[a.length-1]);
            writer.flush();
            writer.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}