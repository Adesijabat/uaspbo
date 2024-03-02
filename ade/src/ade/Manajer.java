/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ade;

/**
 *
 * @author ACER
 */
public class Manajer extends Karyawan {
     private String departemen;

    
    public Manajer(String nama, String jabatan, String departemen) {
        super(nama, jabatan);
        this.departemen = departemen;
    }

    public void info() {
        super.info();
        System.out.println("Departemen: " + departemen);
    }
}
