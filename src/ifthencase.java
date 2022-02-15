import java.util.Scanner;
public class ifthencase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a >= 0 && a<10) {
            System.out.println("satuan");
        } else if (a>=10 && a<100){
            System.out.println("puluhan");
        } else if (a>=100 && a<1000){
            System.out.println("ratusan");
        } else if (a>=1000 && a<10000){
            System.out.println("ribuan");
        } else if (a>=10000 && a<100000){
            System.out.println("puluhribuan");
        }
    }
}
