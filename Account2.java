import java.util.Scanner;
public class Account2 {
    static Scanner scan = new Scanner(System.in);
    int balance = 10000;
    void diposit(int income){
        balance += income;
    }
    public static void main(String[] args) {
        Account2 ac2 = new Account2();
        int in = scan.nextInt();
        ac2.diposit(in);
        System.out.println(ac2.balance);
    }
}
