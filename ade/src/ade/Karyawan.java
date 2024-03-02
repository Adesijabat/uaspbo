/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ade;

/**
 *
 * @author ACER
 */
public class Karyawan {
     private String nama;
    private String jabatan;

    public Karyawan(String nama, String jabatan) {
        this.nama = nama;
        this.jabatan = jabatan;
    }

    public void info() {
        System.out.println("Nama: " + nama);
        System.out.println("Jabatan: " + jabatan);
    }
}
