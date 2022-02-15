import java.util.Scanner;
public class for1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int jumlah = 0;
        for (int i=1; i<=n;i++){
            jumlah += input.nextInt();
        }
        System.out.println(jumlah);
    }
}
