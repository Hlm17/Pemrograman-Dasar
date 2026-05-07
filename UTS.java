import java.util.Scanner;
public class UTS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // user mengisi jumlah pelanggan disimpan dalam variabel (minimal 3 pelanggan), kemudian tanggal dan total belanja diisi dan disimpan dalam array 1 dimensi
        //kategori pelanggan yang disediakan adalah 2, kategori member dan non member
        //Jika member dan belanja >= 100.000 maka dapat poin 50. Jika member dan belanja <100.000 maka dapat poin 20. Jika non member dan belanja >= 100.000 maka dapat poin 10.
        int pelanggan[];

        System.out.print("Masukkan jumlah pelanggan (minimal 3): ");
        int jumlahPelanggan = input.nextInt();
        do {
            if (jumlahPelanggan >= 3) {
                pelanggan = new int[jumlahPelanggan];
                break;
            } else {
                System.out.println("Jumlah pelanggan harus minimal 3. Silakan coba lagi.");
                System.out.print("Masukkan jumlah pelanggan (minimal 3): ");
                jumlahPelanggan = input.nextInt();
            }
        } while (true);

        int tanggal[] = new int[jumlahPelanggan];
        String kategori[] = new String[jumlahPelanggan];

        for (int i = 0; i < jumlahPelanggan; i++) {
            System.out.print("Masukkan total belanja untuk pelanggan ke-" + (i + 1) + ": Rp. ");
            pelanggan[i] = input.nextInt();
            System.out.print("Tanggal transaksi untuk pelanggan ke-" + (i + 1) + ": ");
            tanggal[i] = input.nextInt();
            System.out.print("Apakah pelanggan ke-" + (i + 1) + " adalah member? (y/n): ");
            String jawaban = input.next();
            if (jawaban.equalsIgnoreCase("y")) {
                kategori[i] = "Member";
            } else if (jawaban.equalsIgnoreCase("n")) {
                kategori[i] = "Non Member";
            } else {
                System.out.println("Masukkan jawaban harus (y/n). Silakan coba lagi.");
                i--;
            }
        }
        int dapatPoin = 0;
        for (int i = 0; i < jumlahPelanggan; i++) {
            int poin = 0;
            if (kategori[i].equals("Member") && pelanggan[i] >= 100000) {
                poin = 50;
                dapatPoin += 1;
            } else if (kategori[i].equals("Member") && pelanggan[i] < 100000) {
                poin = 20;
                dapatPoin += 1;
            } else if (kategori[i].equals("Non Member") && pelanggan[i] >= 100000) {
                poin = 10;
                dapatPoin += 1;
            }
            System.out.println("Pelanggan ke-" + (i + 1) + " (" + kategori[i] + ") dengan total belanja Rp. " + pelanggan[i] + " pada tanggal " + tanggal[i] + " mendapatkan poin: " + poin);
        }
        System.out.println("Jumlah pelanggan yang mendapatkan poin: " + dapatPoin);
        input.close();
    }
}