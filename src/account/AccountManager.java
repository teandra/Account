package account;

import java.util.Arrays;

public class AccountManager {

	private Account[] account = new Account[100];
	private ConturiPanel listener;
	
	private int position = 0;
	int nElem = 0;

	public void addAccount(Account account1) {
		account[position] = account1;
		// ca sa nu siprasciu
		position++;
		listener.managerChanged();
	}

	@Override
	public String toString() {
		return "AccountManager [account=" + Arrays.toString(account) + "]";
	}

	public void deleteAccount(Account account2) {
		for (int j = 0; j < 100; j++) {
			
			// folosim equals (suprascrie metodele) pentru obiecte; == testeaza referintele; 
			if (account2.equals(account[j])){
				for (int k = j; k < 99; k++) {
					account[k] = account[k + 1];
				}
				// ca sa eliberez positia
				position--;
				break;
			}
		}
	}
	
	public Account getAccount(int pos){
		return account[pos];
	}

	public void setListener(ConturiPanel conturiPanel) {
		listener = conturiPanel;
	}

	public Account[] getAccounts() {

		return account;
	}

}
