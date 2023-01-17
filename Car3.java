import java.util.Scanner;
public class Car3 {
    static Scanner scan = new Scanner(System.in);
    int calculatePrice(int year,int km){
        int age = 2021 - year;
        int value = 10000 - km;
        return 25000 + value - (age * 1000);
    }
    public static void main(String[] args) {
        Car3 c2 = new Car3();
        int year = scan.nextInt();
        int km = scan.nextInt();
        System.out.println(c2.calculatePrice(year,km));
    }
}
