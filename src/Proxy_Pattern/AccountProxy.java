package Proxy_Pattern;

public class AccountProxy implements Account {
    SavingsAccount savingsAccount ;
    private String role;

    public AccountProxy(String role) {
        this.role = role;
    }

    @Override
    public void createAccount() {
        if(role.equalsIgnoreCase("admin")){
            if (savingsAccount==null){
                savingsAccount = new SavingsAccount();
            }
            savingsAccount.createAccount();
        }
        else {
            System.out.println("Access denied");
        }
    }
}
