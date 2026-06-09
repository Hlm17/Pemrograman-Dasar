import java.util.Scanner;
public class rekursifBintang {

    static void cetakBintang(int n) {
        if (n <= 0) {
            return;
        }

        System.out.println("*");

        cetakBintang(n - 1);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        cetakBintang(n);
    input.close();
    }
}