import java.util.Scanner;
public class ThreeNumber {
    static Scanner scan = new Scanner(System.in);
    int[] num = new int[3];
    int precess(int o){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<3;i++){
            max = Math.max(max,num[i]);
            min = Math.min(min,num[i]);
        }
        int result = 0;
        if(o == -1){
            result = min;
        }
        else if(o == 1){
            result = max;
        }
        else if(o == 0){
            for(int i=0;i<3;i++){
                if(num[i] != max && num[i] != min){
                    result = num[i];
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ThreeNumber tr = new ThreeNumber();
        for(int i=0;i<3;i++){
            tr.num[i] = scan.nextInt();
        }
        int option = scan.nextInt();
        System.out.println(tr.precess(option)); 
    }
}
