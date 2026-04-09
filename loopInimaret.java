import java.util.Scanner;
public class loopInimaret {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int inputInt = 0;
        double totalHarga = 0;

        System.out.println("Masukkan harga barang yang dibeli: (Masukkan 0 untuk selesai)");
        do{
            int inputUser = inputScanner.nextInt();
            inputInt = inputUser;
            totalHarga += inputInt;
        } while (inputInt != 0);

        System.out.println("Total harga barang yang dibeli: " + totalHarga);
        
        
        System.out.print("Ingin menggunakan sistem yang lebih advanced? (y/n) : ");
        int i = 0;
        String[] dataBarang = new String[99];
        String inputString = "";
        String inputString2 = inputScanner.next();
        inputString = inputString2;

        do {
            if (inputString.equalsIgnoreCase(inputString = "y")) {
                System.out.println("Masukkan nama barang yang dibeli : ");
            }if (inputString.equalsIgnoreCase(inputString = "y")) {
                
                String namaBarang = inputScanner.next();
                System.out.print("Masukkan jumlah barang yang dibeli: ");
                int jumlahBarang = inputScanner.nextInt();
                System.out.print("Masukkan harga barang yang dibeli: ");
                int hargaBarang = inputScanner.nextInt();
                int totalHargaAdvanced = jumlahBarang * hargaBarang;

                dataBarang[i] = namaBarang + " = " + jumlahBarang + " x " + hargaBarang + " = " + totalHargaAdvanced;
                i++;
                System.out.print("Ingin menambah barang lagi? (y/n) : ");
                String inputString3 = inputScanner.next();
                inputString = inputString3;
            }
        } while (inputString.equalsIgnoreCase("y"));
            for (int j = 0; j < i; j++) {
                System.out.println(dataBarang[j]);
            }






    inputScanner.close();
    }
}

