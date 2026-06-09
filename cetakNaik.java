import java.util.Scanner;
public class cetakNaik {

    public static void cetakNaik(int n) {
        if (n == 0) {
            return;
        }

        cetakNaik(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        cetakNaik(n);
        input.close();
    }
}

