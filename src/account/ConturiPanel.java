package account;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ConturiPanel extends JPanel {

	protected AccountManager manager;

	public ConturiPanel(AccountManager manager) {
		this.manager = manager;
		this.setSize(300, 500);
		manager.setListener(this);
	}

	public void managerChanged() {

		for (Account acc : manager.getAccounts()) {

			if (acc != null)
				this.add(new JLabel(acc.toString()));

		}
		this.repaint();
	}

}
