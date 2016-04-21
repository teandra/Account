package account;

import javax.swing.JFrame;

public class ApplicationInterface extends JFrame {
	
	private AccountManager manager = new AccountManager();
	
	public ApplicationInterface() {
		
		AccountInput inputPanel = new AccountInput(manager);
		ConturiPanel conturiPanel = new ConturiPanel(manager);
		
		this.add(inputPanel);		
		this.add(conturiPanel);
		this.setSize(700,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		
		ApplicationInterface interfata = new ApplicationInterface();
		
	}

}
