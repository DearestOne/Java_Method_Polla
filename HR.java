import java.util.Scanner;
class employee{
    int exWork = 0;
    int opWork = 0;
    String Name,Id;
    int Option,Wage;
    public employee(String name,String id,int option,int wage){
        Name = name;
        Id = id;
        Option = option;
        Wage = wage;
    }
    boolean workExecutive(int hour){
        if(hour > 0){
            exWork += hour;
            return true;
        }
        else{
            System.out.println("Invalid hour for executive work");
            return false;
        }
    }
    boolean workOperation(int hour){
        if(hour > 0){
            opWork += hour;
            return true;
        }
        else{
            System.out.println("Invalid hour for operation work");
            return false;
        }
    }
    int calPayment(){
        if(Option == 1){
            return (exWork * Wage) + (opWork * (Wage * 2));
        }
        else{ 
            return (opWork * Wage) + (exWork * (Wage * 2));
        }
    }
    void printStat(){
        System.out.println("ID: " + Id);
        System.out.println("Name: " + Name);
        System.out.print("Position: ");
        if(Option == 1){
            System.out.println("Executive");
        }
        else{
            System.out.println("Operation");
        }
        System.out.println("Ex Hour: " + exWork);
        System.out.println("Op Hour: " + opWork);
        System.out.println("Wage: " + Wage);
        System.out.println("Payment: " + calPayment());
    }
}
public class HR {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String name = scan.nextLine();
        String id = scan.nextLine();
        int option = scan.nextInt();
        int wage = scan.nextInt();
        employee em = new employee(name, id, option, wage);
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            int T = scan.nextInt();
            int H = scan.nextInt();
            System.out.print(T == 1 ? em.workExecutive(H) : em.workOperation(H));
            System.out.println(" " + em.calPayment());
        }
        em.printStat();
    }
}
