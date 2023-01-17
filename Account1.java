import java.util.Scanner;
public class Account1 {
    static Scanner scan = new Scanner(System.in);
    int balance = 10000;
    int diposit(int income){
        balance += income;
        return balance;
    }
    public static void main(String[] args) {
        Account1 ac1 = new Account1();
        int in = scan.nextInt();
        System.out.println(ac1.diposit(in));
    }
}
