import java.util.Scanner;
public class ifthenmulti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a > 0) {
            if (a%2 == 0)
            System.out.println(a);
        }
    }
}
