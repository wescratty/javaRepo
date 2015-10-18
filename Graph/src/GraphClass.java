import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JPanel;

public class GraphClass extends JPanel {

    private static GraphClass ourInstance = new GraphClass();  //
    /** Static 'instance' method */
    public static GraphClass getInstance() {

        return ourInstance;
    }

    /** A private Constructor prevents any other
     * class from instantiating.
     */
    private GraphClass() {}

    ArrayList<String> data = new ArrayList<>();

    final int PAD = 20;

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        int w = getWidth();
        int h = getHeight();
        // Draw axis.
        g2.draw(new Line2D.Double(PAD, PAD, PAD, h - PAD));
        // Draw axis.
        g2.draw(new Line2D.Double(PAD, h - PAD, w - PAD, h - PAD));
        double xInc = (double) (w - 2 * PAD) / (data.size() - 1);
        double scale = (double) (h - 2 * PAD) / getMax();
        // Mark data points.
        g2.setPaint(Color.red);
        for (int i = 0; i < data.size(); i++) {
            double x = PAD + i * xInc;
            double y = h - PAD - scale * Integer.parseInt(data.get(i) );
            g2.fill(new Ellipse2D.Double(x - 2, y - 2, 4, 4));
        }
    }

    private int getMax() {

        int max = -Integer.MAX_VALUE;

            for (String i : data)
                if (Integer.parseInt(i) > max)
                max = Integer.parseInt(i);

        return max;
    }

    /** Other methods protected by singleton */
    protected void setStrData(String[] a){

        Collections.addAll(data,a);

    }

    protected void clearData(){

            data.clear();
    }
}

