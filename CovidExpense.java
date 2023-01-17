import java.util.Scanner;
public class CovidExpense {
    static Scanner scan = new Scanner(System.in);
    static int[] calCovidExpense(int[] RT_PCR,int[] MED,int[] ADMIT,int[] OXY){
        int[] price = new int[4];
        for(int i=0;i<RT_PCR.length;i++){
            price[0] += (1500 * RT_PCR[i]);
            price[1] += 80 + (50 * MED[i]);
            price[2] += (800 * ADMIT[i]);
            price[3] += (2000 * OXY[i]);
        }
        return price;
    }
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] rt_pcr = new int[n];
        int[] medicine = new int[n];
        int[] admit = new int[n];
        int[] oxygen = new int[n];
        int[] all_price = new int[4];
        for(int i=0;i<n;i++){
            rt_pcr[i] = scan.nextInt();
            medicine[i] = scan.nextInt();
            admit[i] = scan.nextInt();
            oxygen[i] = scan.nextInt();
        }
        all_price = calCovidExpense(rt_pcr, medicine, admit, oxygen);
        System.out.println("RT-PCR cost = " + all_price[0]);
        System.out.println("Medicine cost = " + all_price[1]);
        System.out.println("Inpatient cost = " + all_price[2]);
        System.out.println("Breath-aid equipment cost = " + all_price[3]);
    }
}
