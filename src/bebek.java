import java.util.Scanner;
public class bebek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int hasil = a/b;
        int sisa = a%b;
        System.out.println("masing-masing " + hasil);
        System.out.println("bersisa " + sisa);
    }
}
