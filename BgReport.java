import java.util.Scanner;
public class BgReport {
    static Scanner scan = new Scanner(System.in);
    static void reportBg(String name,int birth,int start){
        System.out.print("Name: ");
        if(name.length() >= 2){
            System.out.println(name);
        }
        else{
            System.out.println("INVALID");
        }
        System.out.print("Birth year: ");
        boolean is_birth = birth >= 1900 && birth <= 2022;
        boolean is_start = start - birth >= 18 && start >= 1900 && start <= 2022;
        if(is_birth){
            System.out.println(birth);
        }
        else{
            System.out.println("INVALID");
        }
        System.out.print("Start year: ");
        if(is_birth && is_start){
            System.out.println(start);
        }
        else{
            System.out.println("INVALID");
        }
    }
    public static void main(String[] args) {
        String name = scan.nextLine();
        int birth = scan.nextInt();
        int start = scan.nextInt();
        reportBg(name, birth, start);
    }
}
