import javax.swing.*;

/**
 * Created by wescratty on 9/19/15.
 */
public class MainObserver {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new MainPanel());
        f.setSize(1000, 750);
        f.setLocation(200,200);
        f.setVisible(true);
    }
}


