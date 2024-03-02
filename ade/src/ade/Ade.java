/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ade;

/**
 *
 * @author ACER
 */
public class Ade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Manajer manajer = new Manajer("Ade", "Manager", "HR");
        System.out.println("Informasi Karyawan Manager:");
        manajer.info();
        System.out.println();

        Staff staff = new Staff("Atta", "Staff", 2018);
        System.out.println("Informasi Karyawan Staff:");
        staff.info();
    }
}
