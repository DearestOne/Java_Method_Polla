import java.util.Scanner;
class ComAndBench{
    int CPU_power,GPU_power,Memory;
    int GPU_price,CPU_price,RAM_price;
    int Total_price;
    int WindStrike,PastMark,Soreal,SiSandro;
    ComAndBench(int cpuPow,int memory,int gpuPow,int cpuPrice,int ramPrice,int gpuPrice){
        CPU_power = cpuPow;
        Memory = memory;
        GPU_power = gpuPow;
        CPU_price = cpuPrice;
        RAM_price = ramPrice;
        GPU_price = gpuPrice;
        Total_price = cpuPrice + ramPrice + gpuPrice;
    }
    void runWindStrike(){
        if(Memory <= 4){
            WindStrike = (GPU_power + CPU_power) / 2;
        }
        else if(Memory > 8){
            WindStrike = (GPU_power + CPU_power) * 2;
        }
        else{
            WindStrike = GPU_power + CPU_power;
        }
    }
    void runPastMark(){
        PastMark = Math.max(CPU_power,GPU_power);
    }
    void runSoreal(){
        if(PastMark > 300){
            Soreal = GPU_power + (CPU_power / 2);
        }
        else{
            Soreal = (GPU_power + (CPU_power / 2)) / 2;
        }
    }
    boolean runSiSandro(){
        if(Memory < 4){
            System.out.println("SiSandro Failed");
            return false;
        }
        else{
            SiSandro = (Memory * 100) + CPU_power;
            return true;
        }
    }
    void runAllBenches(){
        runWindStrike();
        runPastMark();
        runSoreal();
        boolean A = runSiSandro();
        System.out.println("WindStrike: " + WindStrike);
        System.out.println("PastMark: " + PastMark);
        System.out.println("Soreal: " + Soreal);
        System.out.print("SiSandro: ");
        if(A){
            System.out.println(SiSandro);
        }
        else{
            System.out.println("Failed");
        }
    }
    void reportPerfPerPrice(){
        int allscore = PastMark + WindStrike + Soreal;
        System.out.print("Performance per Price = ");
        System.out.println(allscore / Total_price);
    }
}
public class ComBenchmarks {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int CPU = scan.nextInt();
        int GPU = scan.nextInt();
        int RAM = scan.nextInt();
        int CPUp = scan.nextInt();
        int GPUp = scan.nextInt();
        int RAMp = scan.nextInt();
        ComAndBench CB = new ComAndBench(CPU, RAM, GPU, CPUp, RAMp, GPUp);
        CB.runAllBenches();
        CB.reportPerfPerPrice();
    }
}
