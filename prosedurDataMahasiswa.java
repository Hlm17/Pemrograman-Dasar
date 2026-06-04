import java.util.Scanner;
public class prosedurDataMahasiswa {
    static void tampilkanMahasiswa (String nama, String nim, double ipk) {
        System.out.println("=================================================");
        System.out.println("!               KARTU MAHASISWA                 !");
        System.out.println("=================================================");
        System.out.print("!   Nama    : " + nama);
        for (int i = 0; i < 34 - nama.length(); i++) {
            System.out.print(" ");
        }
        System.out.println("!");
        System.out.print("!   NIM     : " + nim);
        for (int i = 0; i < 34 - nim.length(); i++) {
            System.out.print(" ");
        }
        System.out.println("!");
        System.out.print("!   IPK     : " + ipk);
        for (int i = 0; i < 34 - String.valueOf(ipk).length(); i++) {
            System.out.print(" ");
        }
        System.out.println("!");
        System.out.println("=================================================");
    }
//35 sama dengan dari input karakter 0
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = input.nextLine();
        System.out.print("Masukkan IPK mahasiswa: ");
        double ipk = input.nextDouble();
        tampilkanMahasiswa(nama, nim, ipk);
        input.close();
    }
}