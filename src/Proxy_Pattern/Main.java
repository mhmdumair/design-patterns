package Proxy_Pattern;

public class Main {
    public static void main(String[] args) {
        Account acc = new AccountProxy("admin");
        acc.createAccount();
        Account acc2 = new AccountProxy("user");
        acc2.createAccount();
    }
}
