/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author MyBook Z Series
 */
public class AlatSnorkeling extends AlatSelam {

    private String jenisMasker;

    public AlatSnorkeling(String idAlat, String namaAlat, String ukuran,
            double tarifPerHari, String kondisi, int jumlahTersedia,
            String jenisMasker) {

        super(idAlat, namaAlat, ukuran, tarifPerHari, kondisi, jumlahTersedia);
        this.jenisMasker = jenisMasker;
    }

    public String getJenisMasker() {
        return jenisMasker;
    }

    public void setJenisMasker(String jenisMasker) {
        this.jenisMasker = jenisMasker;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Alat       : " + getNamaAlat());
        System.out.println("Ukuran          : " + getUkuran());
        System.out.println("Tarif Per Hari  : " + getTarifPerHari());
        System.out.println("Kondisi         : " + getKondisi());
        System.out.println("Jumlah Tersedia : " + getJumlahTersedia());
        System.out.println("Jenis Masker    : " + getJenisMasker());
    }

}
