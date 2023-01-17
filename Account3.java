import java.util.Scanner;
public class Account3 {
    static Scanner scan = new Scanner(System.in);
    int balance = 10000;
    int diposit(int income){
        if(income <= 0){
            return -1;
        }
        else{
            balance += income;
            return 0;
        }
    }
    public static void main(String[] args) {
        Account3 ac3 = new Account3();
        int in = scan.nextInt();
        System.out.println(ac3.diposit(in) == 0 ? ac3.balance : "Error");
    }
}
