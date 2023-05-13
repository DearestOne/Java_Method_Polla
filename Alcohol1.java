import java.util.Scanner;
class Alcohol{
    int Concentration;
    int volume;
    boolean type;
    Alcohol(int Concentration,int volume,int type){
        this.type = type == 1;
        if(Concentration < 0){
            this.Concentration = 0;
            System.out.println("invalid concentration");
        }
        else{
            this.Concentration = Concentration;
        }
        if(volume < 0){
            this.volume = 0;
            System.out.println("invalid volume");
        }
        else{
            this.volume = volume;
        }
    }
    void printInfo(){
        if(type){ // type == true
            System.out.print("Ethyl Alcohol ");
        }
        else{
            System.out.print("Methyl Alcohol ");
        }
        System.out.println(Concentration + "% " + volume + "ml.");
    }
}
public class Alcohol1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c = scan.nextInt();
        int volume = scan.nextInt();
        int type = scan.nextInt();
        Alcohol ach = new Alcohol(c,volume,type);
        ach.printInfo();
    }
}
