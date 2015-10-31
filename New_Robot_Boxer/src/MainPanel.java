
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import javax.swing.JPanel;


public class MainPanel extends JPanel {

    public MainPanel() {


        JLabel  fatigueLblP1, strengthLblP1, agilityLblP1, fatigueLblP2, strengthLblP2, agilityLblP2;
        JPanel labelPanel = new JPanel();





        fatigueLblP1 = new JLabel(" P1 Fatigue: 0   ");
        strengthLblP1= new JLabel(" P1 Strength: 0  ");
        agilityLblP1= new JLabel("  P1 Agility: 0   ");
        fatigueLblP2= new JLabel("  P2 Fatigue: 0   ");
        strengthLblP2= new JLabel(" P2 Strength: 0  ");
        agilityLblP2= new JLabel("  P2 Agility: 0   ");

        labelPanel.add(fatigueLblP1);
        labelPanel.add(strengthLblP1);
        labelPanel.add(agilityLblP1);

        labelPanel.add(fatigueLblP2);
        labelPanel.add(strengthLblP2);
        labelPanel.add(agilityLblP2);


        setLayout(new BorderLayout());
        setBorder(BorderFactory.createLoweredBevelBorder());
//        setPreferredSize(new Dimension(500, 750));
        setBackground(Color.GRAY);

        add(labelPanel, BorderLayout.SOUTH);



    }

// added a comment
    //added another comment

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int top = 100;
        int width = 800;
        int poleDiag = 80;



        g.drawLine(top,top,top-poleDiag,top-poleDiag);
        g.drawLine(width,top,width+poleDiag,top-poleDiag);
        g.drawLine(top,width,top-poleDiag,width+poleDiag);
        g.drawLine(width, width, width + poleDiag, width + poleDiag);


        g.drawLine(top,top,top,width);
        g.drawLine(top,top,width,top);
        g.drawLine(width,top,width,width);
        g.drawLine(top, width, width, width);

        //g.setColor(Color.BLUE);
        g.drawArc(20,20,20,20,20,360);
        g.drawArc(20,860,20,20,20,360);
        g.drawArc(860,860,20,20,20,360);
        g.drawArc(860,20,20,20,20,360);


        g.drawArc(30,5,840,50,180,180);  //top rope
        g.drawArc(5,30,50,840,270,180);  // left rope

        g.drawArc(845,30,50,840,90,180);  //right rope
        g.drawArc(30, 845, 840, 50, 0, 180);

        g.setColor(Color.BLUE);
        g.fillArc(200, 400, 50, 50, 0, 360);
        g.fillArc(200+30, 400+50, 30, 30, 0, 360);
        g.fillArc(200+30, 400-30, 30, 30, 0, 360);


        g.setColor(Color.RED);
        g.fillArc(600, 400, 50, 50, 0, 360);
        g.fillArc(600, 400+50, 30, 30, 0, 360);
        g.fillArc(600, 400-30, 30, 30, 0, 360);



        //Endpoint =(getLocationOnScreen());

//		PointerInfo a = MouseInfo.getPointerInfo();
//		Point b  = a.getLocation();
//		 xx = (int)b.getX();
//		 yy = (int)b.getY();
//		g.drawLine(Startpoint.x,Startpoint.y,xx,yy);

//            int i=0;
//            try {
//
//                for (Point spot: pointListStart) {
//
//                    Point finish= pointListFinish.get(i);
//                    g.drawLine(spot.x,spot.y, finish.x,finish.y);
//                    i++;
//                }
//            } catch (Exception e) {
//                // TODO: handle exception
//
//
//
//            }

    }

}
