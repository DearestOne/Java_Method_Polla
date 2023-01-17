import java.util.Scanner;
public class TaskManager {
    static Scanner scan = new Scanner(System.in);
    static void reportLoad(int Mc,int Mr,int Cc,int Cr){
        int percentCPU = (Cc * 100)/ Mc;
        int percentRAM = (Cr * 100)/ Mr;
        System.out.print("CPU: " + Cc + "/" + Mc);
        System.out.println(" (" + percentCPU +"%)");
        System.out.print("RAM: " + Cr + "/" + Mr);
        System.out.println(" (" + percentRAM +"%)");
        if(percentCPU >= 80){
            System.out.println("Limited CPU power");
        }
        if(percentRAM >= 80){
            System.out.println("Limited RAM availability");
        }
    }
    public static void main(String[] args) {
        int maxCPU = scan.nextInt();
        int maxRAM = scan.nextInt();
        int currentCPU = scan.nextInt();
        int currentRAM = scan.nextInt();
        reportLoad(maxCPU, maxRAM, currentCPU, currentRAM);
    }
}
