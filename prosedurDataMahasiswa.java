import java.util.Scanner;
public class prosedurDataMahasiswa {
    static int tampilkanMahasiswa (String nama, String nim, double ipk) {
        System.out.println("=================================================");
        System.out.println("!               KARTU MAHASISWA                 !");
        System.out.println("=================================================");
        System.out.println("!   Nama    : " + nama+"    "+"                        !");
        System.out.println("!   NIM     : " + nim+ "    "+"                   !");
        System.out.println("!   IPK     : " + ipk+ "    "+"                        !");
        System.out.println("=================================================");
        int n = 0;
        return n;
    }

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