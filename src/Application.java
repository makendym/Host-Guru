import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class Application implements ActionListener {
	private int clicks = 0;
    private JLabel label = new JLabel("Number of clicks:  0     ");
    private JFrame frame = new JFrame();
	public static void main(String[] args) {
		new Application();
//		// TODO Auto-generated method stub
//		//Functional Requirements:
//		String users,passo;
//		userInfo users1 = new userInfo("mmidouin","test","host");
//		int x = 1;
//		hostGuru user = new hostGuru();
//		while(x <= 2) {
//		
//		user.userInterface();
//		}
	}
	public Application() {
		  JButton button = new JButton("Click Me");
	        button.addActionListener(this);

	        // the panel with the button and text
	        JPanel panel = new JPanel();
	        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
	        panel.setLayout(new GridLayout(0, 1));
	        panel.add(button);
	        panel.add(label);

	        // set up the frame and display it
	        frame.add(panel, BorderLayout.CENTER);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setTitle("GUI");
	        frame.pack();
	        frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		clicks++;
        label.setText("Number of clicks:  " + clicks);
		
	}
}
		// TODO req1: Host and a guest have an account
		
		
		
		
		//11createUser(userName,password,accountType);
		
		// TODO req2: Have a welcome message for both host and guest
			//welcomeHost(userName);
		
			
		// TODO req3: Host can create a list of items to bring
		
		// TODO req4: List of items is presented to the guest
		
		// TODO req5: A guest can only choose 2 items
		
		// TODO req6: Application should thank user for agreeing to bring items
		
		// TODO req7: Host can see who is bringing what 



