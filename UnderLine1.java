import java.util.Scanner;
public class UnderLine1 {
    static Scanner scan = new Scanner(System.in);
    static void display_line(){
        for(int i=0;i<20;i++){
            System.out.print("-");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n = scan.nextInt();
        String[] text = new String[n];
        for(int i=0;i<n;i++){
            text[i] = scan.next();
        }
        for(int i=0;i<n;i++){
            System.out.println(text[i]);
            display_line();
        }
    }
}
