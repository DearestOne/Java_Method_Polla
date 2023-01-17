import java.util.Scanner;
public class CovidScreening {
    static Scanner scan = new Scanner(System.in);
    static void  screenCovid(Boolean insurance,int severity,int age,int vaccines){
        if(insurance){
            System.out.println("RT-PCR recommended");
        }
        if(age >= 70 || severity == 3){
            System.out.println("Hospital admission");
        }
        else{
            System.out.println("Home isolation");
        }
        if(vaccines < 2 || severity >= 2){
            System.out.println("Favipiravia included");
        }
        else {
            System.out.println("Standard medicine package");
        }
    }
    public static void main(String[] args) {
        int insurance = scan.nextInt();
        int severity = scan.nextInt();
        int age = scan.nextInt();
        int vaccines = scan.nextInt();
        boolean is_insurance = insurance == 1;
        screenCovid(is_insurance, severity, age, vaccines);
    }
}
