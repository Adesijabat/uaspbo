/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ade;

/**
 *
 * @author ACER
 */
public class Staff extends Karyawan{
     private int tahunMasuk;

    public Staff(String nama, String jabatan, int tahunMasuk) {
        super(nama, jabatan);
        this.tahunMasuk = tahunMasuk;
    }

    public void info() {
        super.info();
        System.out.println("Tahun Masuk: " + tahunMasuk);
    }
}
