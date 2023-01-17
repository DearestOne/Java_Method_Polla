import java.util.Scanner;
public class UnderLineParamiter {
    static Scanner scan = new Scanner(System.in);
    static void display_line(int num){
        for(int i=0;i<num;i++){
            System.out.print("-");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n = scan.nextInt();
        String[] text = new String[n];
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            text[i] = scan.next();
            num[i] = scan.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(text[i]);
            display_line(num[i]);
        }
    }
}
