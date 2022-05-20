public class Main {
    public static void main(String[] args) {
        ATM a = new ATM();
        a.createAccount("ziad",1234);
        System.out.println( a.login("ziad",1234));
        System.out.println(a.showBalance());
        System.out.println(a.deposit(5000));
        System.out.println(a.showBalance());
        System.out.println(a.withdraw(50));
        System.out.println(a.showBalance());

    }
}