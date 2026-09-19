/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author MyBook Z Series
 */
public class AlatDiving extends AlatSelam {

    private int kapasitasTabung;

    public AlatDiving(String idAlat, String namaAlat, String ukuran,
            double tarifPerHari, String kondisi, int jumlahTersedia,
            int kapasitasTabung) {

        super(idAlat, namaAlat, ukuran, tarifPerHari, kondisi, jumlahTersedia);
        this.kapasitasTabung = kapasitasTabung;
    }

    public int getKapasitasTabung() {
        return kapasitasTabung;
    }

    public void setKapasitasTabung(int kapasitasTabung) {
        this.kapasitasTabung = kapasitasTabung;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Alat       : " + getNamaAlat());
        System.out.println("Ukuran          : " + getUkuran());
        System.out.println("Tarif Per Hari  : " + getTarifPerHari());
        System.out.println("Kondisi         : " + getKondisi());
        System.out.println("Jumlah Tersedia : " + getJumlahTersedia());
        System.out.println("Kapasitas Tabung: " + getKapasitasTabung());
    }
}
