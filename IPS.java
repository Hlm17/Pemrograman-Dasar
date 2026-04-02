/* Mata kuliah dan SKS
    1. Agama (2)
    2. Dasar Teknologi dan Informasi (2)
    3. Kewarganegaraan (2)
    4. Logika dan Algoritma (3)
    5. Etika Profesi (2)
    6. Kepemimpinan dan Manajemen Organisasi (3)
    7. Aljabar Linear (3)
    8. Statistika dan Probabilitas (3)
    
   Indeks Nilai =   A   = 4.0,
                    B+  = 3.5,
                    B   = 3.0,
                    C   = 2.0,
                    D   = 1.0,
                    E   = 0.0.
   Rumus IPS = (Total SKS * Total Nilai) / Total SKS 
   
   Aturan mengambil mata kuliah berdasarkan IPS:
    IPS < 2.00      → 18 SKS
    IPS 2.00 – 2.99 → 20 SKS
    IPS 3.00 – 3.49 → 22 SKS
    IPS ≥ 3.50      → 24 SKS
*/ 

import java.util.Scanner;
public class IPS {
    public static void main(String[] args) {
        double Agama = 0;
        double DasarTeknologiDanInformasi = 0;
        double Kewarganegaraan = 0;
        double LogikaDanAlgoritma = 0;
        double EtikaProfesi = 0;
        double KepemimpinanDanManajemenOrganisasi = 0;
        double AljabarLinear = 0;
        double StatistikaDanProbabilitas = 0;
        int totalSKS = 0;
        double totalBobot = 0.0;
        double IPS = 0.0;
        String input;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai Mata Kuliah Agama (A, B+, B, C, D, E): ");
        input = scanner.nextLine();
        switch (input) {
            case "A":
                Agama = 4.0;
                break;
            case "B+":
                Agama = 3.5;
                break;
            case "B":
                Agama = 3.0;
                break;
            case "C":
                Agama = 2.0;
                break;
            case "D":
                Agama = 1.0;
                break;
            case "E":
                Agama = 0.0;
                break;
            default:
                System.out.println("Nilai tidak valid.");
                break;
        }
        totalBobot = totalBobot + (Agama * 2);
        totalSKS = totalSKS + 2;

        System.out.print("Masukkan nilai Mata Kuliah Dasar Teknologi dan Informasi (A, B+, B, C, D, E): ");
        input = scanner.nextLine();
        switch (input) {
            case "A":
                DasarTeknologiDanInformasi = 4.0;
                break;
            case "B+":
                DasarTeknologiDanInformasi = 3.5;
                break;
            case "B":
                DasarTeknologiDanInformasi = 3.0;
                break;
            case "C":
                DasarTeknologiDanInformasi = 2.0;
                break;
            case "D":
                DasarTeknologiDanInformasi = 1.0;
                break;
            case "E":
                DasarTeknologiDanInformasi = 0.0;
                break;
            default:
                System.out.println("Nilai tidak valid.");
                break;
        }
        totalBobot = totalBobot + (DasarTeknologiDanInformasi * 2);
        totalSKS = totalSKS + 2;

        System.out.print("Masukkan nilai Mata Kuliah Kewarganegaraan (A, B+, B, C, D, E): ");
        input = scanner.nextLine();
        switch (input) {
            case "A":
                Kewarganegaraan = 4.0;
                break;
            case "B+":
                Kewarganegaraan = 3.5;
                break;
            case "B":
                Kewarganegaraan = 3.0;
                break;
            case "C":
                Kewarganegaraan = 2.0;
                break;
            case "D":
                Kewarganegaraan = 1.0;
                break;
            case "E":
                Kewarganegaraan = 0.0;
                break;
            default:
                System.out.println("Nilai tidak valid.");
                break;
        }
        totalBobot = totalBobot + (Kewarganegaraan * 2);
        totalSKS = totalSKS + 2;

        System.out.print("Masukkan nilai Mata Kuliah Logika dan Algoritma (A, B+, B, C, D, E): ");
        input = scanner.nextLine();
        switch (input) {
            case "A":
                LogikaDanAlgoritma = 4.0;
                break;
            case "B+":
                LogikaDanAlgoritma = 3.5;
                break;
            case "B":
                LogikaDanAlgoritma = 3.0;
                break;
            case "C":
                LogikaDanAlgoritma = 2.0;
                break;
            case "D":
                LogikaDanAlgoritma = 1.0;
                break;
            case "E":
                LogikaDanAlgoritma = 0.0;
                break;
            default:
                System.out.println("Nilai tidak valid.");
                break;
        }
        totalBobot = totalBobot + (LogikaDanAlgoritma * 3);
        totalSKS = totalSKS + 3;

        System.out.print("Masukkan nilai Mata Kuliah Etika Profesi (A, B+, B, C, D, E): ");
        input = scanner.nextLine();
        switch (input) {
            case "A":
                EtikaProfesi = 4.0;
                break;
            case "B+":
                EtikaProfesi = 3.5;
                break;
            case "B":
                EtikaProfesi = 3.0;
                break;
            case "C":
                EtikaProfesi = 2.0;
                break;
            case "D":
                EtikaProfesi = 1.0;
                break;
            case "E":
                EtikaProfesi = 0.0;
                break;
            default:
                System.out.println("Nilai tidak valid.");
                break;
        }
        totalBobot = totalBobot + (EtikaProfesi * 2);
        totalSKS = totalSKS + 2;

        System.out.print("Masukkan nilai Mata Kuliah Kepemimpinan dan Manajemen Organisasi (A, B+, B, C, D, E): ");
        input = scanner.nextLine();
        switch (input) {
            case "A":
                KepemimpinanDanManajemenOrganisasi = 4.0;
                break;
            case "B+":
                KepemimpinanDanManajemenOrganisasi = 3.5;
                break;
            case "B":
                KepemimpinanDanManajemenOrganisasi = 3.0;
                break;
            case "C":
                KepemimpinanDanManajemenOrganisasi = 2.0;
                break;
            case "D":
                KepemimpinanDanManajemenOrganisasi = 1.0;
                break;
            case "E":
                KepemimpinanDanManajemenOrganisasi = 0.0;
                break;
            default:
                System.out.println("Nilai tidak valid.");
                break;
        }
        totalBobot = totalBobot + (KepemimpinanDanManajemenOrganisasi * 3);
        totalSKS = totalSKS + 3;
        
        System.out.print("Masukkan nilai Mata Kuliah Aljabar Linear (A, B+, B, C, D, E): ");
        input = scanner.nextLine();
        switch (input) {
            case "A":
                AljabarLinear = 4.0;
                break;
            case "B+":
                AljabarLinear = 3.5;
                break;
            case "B":
                AljabarLinear = 3.0;
                break;
            case "C":
                AljabarLinear = 2.0;
                break;
            case "D":
                AljabarLinear = 1.0;
                break;
            case "E":
                AljabarLinear = 0.0;
                break;
            default:
                System.out.println("Nilai tidak valid.");
                break;
        }
        totalBobot = totalBobot + (AljabarLinear * 3);
        totalSKS = totalSKS + 3;

        System.out.print("Masukkan nilai Mata Kuliah Statistika dan Probabilitas (A, B+, B, C, D, E): ");
        input = scanner.nextLine();
        switch (input) {
            case "A":
                StatistikaDanProbabilitas = 4.0;
                break;
            case "B+":
                StatistikaDanProbabilitas = 3.5;
                break;
            case "B":
                StatistikaDanProbabilitas = 3.0;
                break;
            case "C":
                StatistikaDanProbabilitas = 2.0;
                break;
            case "D":
                StatistikaDanProbabilitas = 1.0;
                break;
            case "E":
                StatistikaDanProbabilitas = 0.0;
                break;
            default:
                System.out.println("Nilai tidak valid.");
                break;
        }
        totalBobot = totalBobot + (StatistikaDanProbabilitas * 3);
        totalSKS = totalSKS + 3;

        // Rumus IPS = (Total SKS * Total Bobot) / Total SKS
        IPS = totalBobot / totalSKS;

        // IPS = scanner.nextDouble();

        System.out.println("IPS Anda adalah: " + IPS);
        if (IPS < 2.00) {
            System.out.println("Anda dapat mengambil maksimal 18 SKS.");
        } else if (IPS >= 2.00 && IPS <= 2.99) {
            System.out.println("Anda dapat mengambil maksimal 20 SKS.");
        } else if (IPS >= 3.00 && IPS <= 3.49) {
            System.out.println("Anda dapat mengambil maksimal 22 SKS.");
        } else if (IPS >= 3.50) {
            System.out.println("Anda dapat mengambil maksimal 24 SKS.");
        }
    scanner.close();
    }
}
