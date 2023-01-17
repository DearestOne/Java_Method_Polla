import java.util.Scanner;
public class ProcessInfo {
    static Scanner scan = new Scanner(System.in);
    static boolean listProcesses(String[] name,int[] ramUse,int maxram){
        int used = 0;
        for(int i=0;i<name.length;i++){
            System.out.print(name[i]);
            if(ramUse[i] >= 10){
                System.out.println("* " + ramUse[i]);
            }
            else{
                System.out.println(" " + ramUse[i]);
            }
            used += ramUse[i];
        }
        System.out.print("RAM used = ");
        System.out.println(used + " out of " + maxram);
        if(used <= maxram){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int n = scan.nextInt();
        String[] name = new String[n];
        int[] ramUse = new int[n];
        for(int i=0;i<n;i++){
            name[i] = scan.next();
            ramUse[i] = scan.nextInt();
        }
        int maxram = scan.nextInt();
        if(listProcesses(name, ramUse, maxram)){
            System.out.println("Sufficient RAM");
        }
        else{
            System.out.println("Not enough RAM");
        }
    }
}
