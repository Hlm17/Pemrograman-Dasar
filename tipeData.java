public class tipeData { //blok class
    // blok main --> psvm + tab
    public static void main(String[] args) {
        // tempat code
      
        /*comment
        berbaris
        menggunakan
        command
        
        Membuat program untuk mencatat biodata mahasiswa
        NIM --> String
        Nama --> String
        Alamat --> String
        No. HP --> String
        Jenis Kelamin --> String
        Program Studi --> String
        Dosen Wali --> String
        Sisa BOP --> Integer
        */

        //1. Deklarasi Variabel
        String nim, nama, alamat, noHp, jenisKelamin, programStudi, dosenWali, BOP;
        int sisaBOP;
        nim = "254510100065";
        nama = "Muhammad Hilmi Rajwandhika";
        alamat = "Jl. Manukan Tengah I";
        noHp = "081234567890";
        jenisKelamin = "Laki-laki";
        programStudi = "Sistem Informasi";
        dosenWali = "Pak Teguh";
        sisaBOP = 0;
        
        if (sisaBOP > 0) {
            BOP = "Belum Lunas";
        } else {
            BOP = "Sudah Lunas";
        }
        
        //2. Print Variabel menggunakan shortcut sout
        // Gunakan operator \n untuk membuat baris baru
        System.out.println(
            "NIM          : " + nim + 
            "\nNama         : " + nama + 
            "\nAlamat       : " + alamat + 
            "\nNo. HP       : " + noHp + 
            "\nJenis Kelamin: " + jenisKelamin + 
            "\nProgram Studi: " + programStudi + 
            "\nDosen Wali   : " + dosenWali + 
            "\nSisa BOP     : " + sisaBOP + " (" + BOP + ") ");
            
        }
    }