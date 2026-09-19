/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Scanner;

/**
 *
 * @author MyBook Z Series
 */
public class SewaAlatView {

    private Scanner input = new Scanner(System.in);
    
    private void garis() {
        System.out.println("+------------------------------------------+");
    }
       
    public int tampilkanMenuUtama() {
        System.out.println();
        garis();
        System.out.println("|    SISTEM SEWA ALAT SNORKELING & DIVING  |");
        garis();
        System.out.println("|  1. Kelola Data Alat                     |");
        System.out.println("|  2. Buat Penyewaan                       |");
        System.out.println("|  3. Lihat Data Penyewaan                 |");
        System.out.println("|  4. Pengembalian Alat                    |");
        System.out.println("|  5. Keluar                               |");
        garis();
        System.out.print("Pilih menu: ");

        while (!input.hasNextInt()) {
            System.out.println("Input harus berupa angka");
            input.next();
            System.out.print("Pilih menu: ");
        }

        return input.nextInt();
    }

    public int tampilkanMenuAlat() {
        System.out.println();
        garis();
        System.out.println("|             KELOLA DATA ALAT             |");
        garis();
        System.out.println("|  1. Tambah Alat                          |");
        System.out.println("|  2. Lihat Alat                           |");
        System.out.println("|  3. Ubah Alat                            |");
        System.out.println("|  4. Hapus Alat                           |");
        System.out.println("|  5. Kembali                              |");
        garis();
        System.out.print("Pilih menu: ");

        while (!input.hasNextInt()) {
            System.out.println("Input harus berupa angka");
            input.next();
            System.out.print("Pilih menu: ");
        }

        return input.nextInt();
    }

    public String inputNamaAlat() {
        input.nextLine();
        System.out.print("Nama Alat: ");
        return input.nextLine();
    }

    public String inputIdAlat() {
        System.out.print("ID Alat: ");
        return input.next();
    }

    public String inputUkuran() {
        System.out.print("Ukuran: ");
        return input.next();
    }

    public double inputTarifPerHari() {
        System.out.print("Tarif Per Hari: ");

        while (!input.hasNextDouble()) {
            System.out.println("Input harus berupa angka");
            input.next();
            System.out.print("Tarif Per Hari: ");
        }

        return input.nextDouble();
    }

    public String inputKondisi() {
        input.nextLine();
        System.out.print("Kondisi: ");
        return input.nextLine();
    }

    public int inputJumlahTersedia() {
        System.out.print("Jumlah Tersedia: ");

        while (!input.hasNextInt()) {
            System.out.println("Input harus berupa angka");
            input.next();
            System.out.print("Jumlah Tersedia: ");
        }

        return input.nextInt();
    }
    
    public int inputJenisAlat() {
        System.out.println();
        garis();
        System.out.println("|               JENIS ALAT                 |");
        garis();
        System.out.println("|  1. Alat Snorkeling                      |");
        System.out.println("|  2. Alat Diving                          |");
        garis();
        System.out.print("Pilih jenis alat: ");

        while (!input.hasNextInt()) {
            System.out.println("Input harus berupa angka");
            input.next();
            System.out.print("Pilih jenis alat: ");
        }

        return input.nextInt();
    }
    
    public String inputJenisMasker() {
        input.nextLine();
        System.out.print("Jenis Masker: ");
        return input.nextLine();
    }

    public int inputKapasitasTabung() {
        System.out.print("Kapasitas Tabung: ");

        while (!input.hasNextInt()) {
            System.out.println("Input harus berupa angka");
            input.next();
            System.out.print("Kapasitas Tabung: ");
        }

        return input.nextInt();
    }

    public String inputNamaPenyewa() {
        input.nextLine();
        System.out.print("Nama Penyewa: ");
        return input.nextLine();
    }

    public String inputNoHp() {
        System.out.print("No HP: ");
        return input.next();
    }

    public int inputJumlahUnit() {
        System.out.print("Jumlah Unit: ");

        while (!input.hasNextInt()) {
            System.out.println("Input harus berupa angka.");
            input.next();
            System.out.print("Jumlah Unit: ");
        }

        return input.nextInt();
    }

    public int inputDurasiHari() {
        System.out.print("Durasi Sewa (hari): ");

        while (!input.hasNextInt()) {
            System.out.println("Input harus berupa angka.");
            input.next();
            System.out.print("Durasi Sewa (hari): ");
        }

        return input.nextInt();
    }

    public String inputIdPenyewaan() {
        System.out.print("ID Penyewaan: ");
        return input.next();
    }
}
