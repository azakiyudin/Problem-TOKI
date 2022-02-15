import java.util.Scanner;
public class ifthenelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a > 0) {
            System.out.println("positif");
        } else if (a<0){
            System.out.println("negatif");
        } else {
            System.out.println("nol");
        }
    }
}
