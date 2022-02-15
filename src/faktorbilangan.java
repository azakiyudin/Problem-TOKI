import java.util.Scanner;
public class faktorbilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil = input.nextInt();
        for (int i=bil; i>=1; i--){
            if (bil%i == 0){
                System.out.println(i);
            }
        }
    }
}
