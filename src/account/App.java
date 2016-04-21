package account;

public class App {

	public static void main(String[] args) {
		
		AccountManager manager = new AccountManager();
		
		Account account1 = new Account("teo123", "222");
		Account account2 = new Account("and123", "333");
		
		manager.addAccount(account1);
		manager.addAccount(account2);		

		System.out.println(manager.getAccount(0));
		System.out.println(manager.getAccount(1));

		System.out.println(manager.getAccount(2));
		System.out.println(manager.getAccount(3));
		System.out.println("============================");
		
		
		manager.deleteAccount(new Account("and123", "333"));
		
		// System.out.println(manager);
		System.out.println(manager.getAccount(0));
		System.out.println(manager.getAccount(1));

		System.out.println(manager.getAccount(2));
		System.out.println(manager.getAccount(3));
		
		System.out.println("============================");
		manager.addAccount(new Account("bau", "111"));
		manager.addAccount(new Account("bum", "444"));
		
		System.out.println(manager.getAccount(0));
		System.out.println(manager.getAccount(1));
		System.out.println(manager.getAccount(2));

		System.out.println(manager.getAccount(3));
	}
}
