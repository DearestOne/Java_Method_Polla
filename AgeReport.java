import java.util.Scanner;
public class AgeReport {
    static Scanner scan = new Scanner(System.in);
    static int reportage(int[] code,int[] age,int y1,int y2){
        int count = 0;
        for(int i=0;i<code.length;i++){
            if(age[i] >= y1 && age[i] <= y2){
                System.out.println(code[i]);
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] id = new int[n];
        int[] age = new int[n];
        for(int i=0;i<n;i++){
            id[i] = scan.nextInt();
            age[i] = scan.nextInt();
        }
        int y1 = scan.nextInt();
        int y2 = scan.nextInt();
        int result = reportage(id, age, y1, y2);
        System.out.print("There are " + result + " persons in ");
        System.out.println("age range of " + y1 + " to " + y2);
    }
}
