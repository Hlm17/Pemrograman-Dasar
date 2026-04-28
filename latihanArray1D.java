import java.util.Scanner;

public class latihanArray1D {

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        String[] kategori = new String[0];
        int[] harga = new int[0];
        int[] jumlahBeli = new int[0];

        int total = 0, input = 0;

        do {
            System.out.println("\nPemesanan Tiket Zoo");
            System.out.println("1. Kategori dan Harga");
            System.out.println("2. Input Jumlah Beli");
            System.out.println("3. Total Harga");
            System.out.println("4. Keluar");
            System.out.println("==============================");
            System.out.print("Pilih menu: ");
            input = inputUser.nextInt();

            switch (input) {
                case 1:
                    System.out.print("Jumlah Kategori: ");
                    int inputKategori = inputUser.nextInt();
                    inputUser.nextLine(); // buang newline

                    kategori = new String[inputKategori];
                    harga = new int[inputKategori];
                    jumlahBeli = new int[inputKategori];

                    for (int i = 0; i < kategori.length; i++) {
                        System.out.print("Nama kategori ke-" + (i + 1) + ": ");
                        kategori[i] = inputUser.nextLine();

                        System.out.print("Masukkan harga kategori " + kategori[i] + ": ");
                        harga[i] = inputUser.nextInt();
                        inputUser.nextLine(); // buang newline
                    }

                    System.out.println("\nList Kategori dan Harga:");
                    for (int i = 0; i < kategori.length; i++) {
                        System.out.println((i + 1) + ". " + kategori[i] + " - " + harga[i]);
                    }
                    break;

                case 2:
                    if (kategori.length == 0) {
                        System.out.println("Silakan input kategori dulu di menu 1!");
                        break;
                    }

                    for (int i = 0; i < kategori.length; i++) {
                        System.out.print("Jumlah beli untuk " + kategori[i] + ": ");
                        jumlahBeli[i] = inputUser.nextInt();
                    }
                    break;

                case 3:
                    if (kategori.length == 0) {
                        System.out.println("Data belum ada!");
                        break;
                    }

                    total = 0;
                    System.out.println("\nDetail Pembelian:");
                    for (int i = 0; i < kategori.length; i++) {
                        int subtotal = harga[i] * jumlahBeli[i];
                        System.out.println(kategori[i] + " = " + jumlahBeli[i] + " x " + harga[i] + " = " + subtotal);
                        total += subtotal;
                    }

                    System.out.println("Total Bayar: " + total);
                    break;

                case 4:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (true);
    }
}