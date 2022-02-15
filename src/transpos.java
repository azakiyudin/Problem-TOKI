import java.util.Scanner;
public class transpos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a11 = input.nextInt();
        int a12 = input.nextInt();
        int a13 = input.nextInt();
        int a21 = input.nextInt();
        int a22 = input.nextInt();
        int a23 = input.nextInt();
        int a31 = input.nextInt();
        int a32 = input.nextInt();
        int a33 = input.nextInt();
        System.out.println(a11 + " " + a21 + " " + a31);
        System.out.println(a12 + " " + a22 + " " + a32);
        System.out.println(a13 + " " + a23 + " " + a33);
    }
}
