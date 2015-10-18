import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class mainPanel extends JPanel{
    private JComboBox<String> tactChoice,collectorType,dataDisplayType ;//
    private  JButton Go, reset,Write_to_File;
    private String[] myStrArray;

    public mainPanel() {

        JLabel  pathLb2;
        JPanel buttonPanel;

        String[] tactChoices = {  "Import CSV", "Collect","Graph sin" }; //
        String[] collectorChoices = { "Visual", "Audio", "GPS","Generic" }; //
        String[] dataDispChoices = {  "Scatter plot","Statistics" }; //

        String pathString2 = " data and display results as a ";

        pathLb2 = new JLabel(pathString2);
        Write_to_File = new JButton("Data to file");
        Go = new JButton("Go");
        reset = new JButton("Clear graph");
        tactChoice = new JComboBox<>(tactChoices);
        collectorType = new JComboBox<>(collectorChoices);
        dataDisplayType = new JComboBox<>(dataDispChoices);
        buttonPanel = new JPanel();

        setLayout(new BorderLayout());
        setBorder(BorderFactory.createLoweredBevelBorder());
        setBackground(Color.GRAY);
        setPreferredSize(new Dimension(1200, 750));
        add(buttonPanel, BorderLayout.SOUTH);

        buttonPanel.add(tactChoice);
        buttonPanel.add(collectorType);
        buttonPanel.add(pathLb2);
        buttonPanel.add(dataDisplayType);
        buttonPanel.add(Go);
        buttonPanel.add(reset);
        buttonPanel.add(Write_to_File);

        Write_to_File.addActionListener(new buttonListener());
        Go.addActionListener(new buttonListener());
        reset.addActionListener(new buttonListener());

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }


    private void activate(){

        int io_Technique = tactChoice.getSelectedIndex();
        int io_Type  = collectorType.getSelectedIndex();
        int display_Type = dataDisplayType.getSelectedIndex();


        switch (io_Technique){
            case 0:
                /** Call to singleton.getInstance() and use methods */
                GetFileClass myPath = GetFileClass.getInstance();
                String file_path = myPath.getFile();
                /** Call to singleton.getInstance() and use methods */
                CSV csvReader = CSV.getInstance();
                myStrArray =   csvReader.getCSV(file_path);
                break;

            case 1:
                break;
            case 2:
                functionClass myFunc = functionClass.getInstance();
                myStrArray = myFunc.makeSin();

            default:
                break;
        }
        switch (io_Type) {
            case 0:
                break;
            case 1:
                /** Call to singleton.getInstance() and use methods */
                AudioClass myAudio =AudioClass.getInstance();
                byte[] myBytes = myAudio.getAudio();
                byteToString(myBytes);
                break;
            case 2:
                break;
            default:
                break;
        }

        switch (display_Type) {

            case 0:
                revalidate();
                /** Call to singleton.getInstance() and use methods */
                Graph myGraph = Graph.getInstance();
                myGraph.setStrData(myStrArray);
                add(myGraph);
                repaint();
                break;
            case 1:
            default:
                break;
        }
    }

    private String[] byteToString(byte[] b){
        myStrArray = new String[b.length];

        for (int i =0;i<b.length;i++){
            myStrArray[i] =Byte.toString( b[i]);
        }

        return myStrArray;
    }

    private class buttonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {

            if (event.getSource() == Go) {
                activate();
            }else if(event.getSource() == reset){

                Graph theGraph = Graph.getInstance();
                theGraph.clearData();
                revalidate();
                repaint();

            }else if(event.getSource() == Write_to_File){
                GetFileClass fileWriter = GetFileClass.getInstance();
                fileWriter.writeFile(myStrArray);
            }
        }
    }
}
