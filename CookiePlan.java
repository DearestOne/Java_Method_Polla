import java.util.Scanner;
public class CookiePlan {
    static Scanner scan = new Scanner(System.in);
    static int planCookie(int[] Flour,int[] Butter){
        int cnt_fail = 0;
        for(int i=0;i<Flour.length;i++){
            int min = Math.min(Flour[i] / 6,Butter[i] / 3);
            if(min < 10){
                System.out.println(i + 1);
                cnt_fail++;
            }
        }
        return cnt_fail;
    }
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] f = new int[n];
        int[] b = new int[n];
        for(int i=0;i<n;i++){
            f[i] = scan.nextInt();
            b[i] = scan.nextInt();
        }
        int fail = planCookie(f, b);
        System.out.print("There are " + fail);
        System.out.println(" days that ingredients are insufficient");
    }
}
