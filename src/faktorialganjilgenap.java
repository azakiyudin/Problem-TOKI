import java.util.Scanner;
public class faktorialganjilgenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tes = input.nextInt();
        System.out.println(fact(tes));
    } public static int fact(int n){
        if (n==1){
            return 1;
        } else if(n%2==0){
            return n/2 * fact(n-1);
        } else {
            return n * fact(n-1);
        }
    }
}
