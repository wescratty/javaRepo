
import javax.swing.JFrame;

 
public class GraphDriver{
 
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new mainPanel());
        f.setSize(1200, 750);
        f.setLocation(200,200);
        f.setVisible(true);
    }
}