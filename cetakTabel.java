import java.util.Scanner;
public class cetakTabel {
    static void cetakTabel(int n) {
        for (int i=1; i<=10; i++) {
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka untuk mencetak tabel perkalian: ");
        int n = sc.nextInt();
        cetakTabel(n);
        sc.close();
    }
}
