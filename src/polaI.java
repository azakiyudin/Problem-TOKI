import java.util.Scanner;
public class polaI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = input.nextInt();
        int x = input.nextInt();
        for (int i = 1; i < max; i++) {
            if (i % x == 0) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
        if (x == 1) {
            System.out.println("*");
        } else if (max%x==0){
            System.out.println("*");
        } else {
            System.out.println(max);
        }
    }
}
