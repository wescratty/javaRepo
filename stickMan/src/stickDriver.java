import javax.swing.JFrame;


public class stickDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame myFrame = new JFrame ("StickMan");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.getContentPane().add( new frankinClass());
		myFrame.pack();
		myFrame.setVisible(true);

	}

}
