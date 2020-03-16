import javax.swing.JFrame;

public class Runner { 

	public static void main(String args[])
	{

        //Account a = new Account(a);
		JFrame frame = new JFrame("BankLab");
		 
		Screen mg = new Screen();
		frame.add(mg);
		 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		 
	}
}	
