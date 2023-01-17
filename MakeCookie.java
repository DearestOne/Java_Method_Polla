import java.util.Scanner;
public class MakeCookie {
    static Scanner scan = new Scanner(System.in);
    static void calCookieBags(int Flour,int Butter){
        boolean flour = Flour >= 0 && Flour < 100000;
        boolean butter = Butter >= 0 && Butter < 100000;
        int bag = 0;
        System.out.print("Cookie bags: ");
        if(!flour || !butter){
            System.out.println("Error");
        }
        else{
            bag = Math.min(Flour / 6,Butter / 3);
            System.out.println(bag);
        }
        System.out.print("Flour left: ");
        if(!flour){
            System.out.println("Invalid");
        }
        else{
            System.out.println(Flour - (bag * 6));
        }
        System.out.print("Butter left: ");
        if(!butter){
            System.out.println("Invalid");
        }
        else{
            System.out.println(Butter - (bag * 3));
        }
    }
    public static void main(String[] args) {
        int flour = scan.nextInt();
        int butter = scan.nextInt();
        calCookieBags(flour, butter);
    }
}
