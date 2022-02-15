import java.util.Scanner;
public class floorceil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double des = input.nextDouble();
        int bulat = (int)des;
        if (des-bulat == 0){
            System.out.println(bulat + " " + bulat);
        } else if (des < 0){
            int floor = bulat - 1;
            System.out.print(floor + " " + bulat);
        } else {
            int ceil = bulat + 1;
            System.out.println(bulat + " " + ceil);
        }
    }
}
