package account;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AccountInput extends JPanel {
	
	private JTextField c1 = new JTextField();
	private JTextField c2= new JTextField();
	private JTextField c3= new JTextField();
	private JButton c4= new JButton();

	public AccountInput(AccountManager manager) {

		c1.setColumns(20);
		c2.setColumns(20);
		c3.setColumns(20);
		c4.setText("Save");
		
		c4.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// luam textele din input si salvam un nou account in manager
				String username = c1.getText();
				String parola = c2.getText();
				String locatie = c3.getText();
				
				System.out.println("Urmeaza sa se adauge un nou cont in manager");
				System.out.println("Contul are ca parola : "  + parola);
				manager.addAccount(new Account(username, parola));
				System.out.println("S-a adaugat un nou cont. Noul manager este:");
				System.out.println(manager);
			}
		});
		
		this.setSize(300, 200);
		this.add(c1);
		this.add(c2);
		this.add(c3);
		this.add(c4);
	}
			
}
