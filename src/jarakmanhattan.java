import java.util.Scanner;
public class jarakmanhattan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int jarak = 0;
        if (c>a){
            if (d>b){
                jarak = c-a + d-b;
            } else {
                jarak = c-a + b-d;
            }
        } else {
            if (d>b){
                jarak = a-c + d-b;
            } else {
                jarak = a-c + b-d;
            }
        }
        System.out.println(jarak);
    }
}
