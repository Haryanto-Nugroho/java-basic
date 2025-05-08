/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Haryanto
 */

import java.util.Scanner;

public class DataMahasiswa {
    
    public static void main(String[] args) {
        
        String nama;
        String alamat;
        int nim;
        int umur;
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("====PROGRAM SCAN DATA MAHASISWA====");
        System.out.print("Masukan Nama : ");
        nama = input.nextLine();
        System.out.print("Masukan Alamat : ");
        alamat = input.nextLine();
        System.out.print("Masukan NIM : ");
        nim = input.nextInt();
        System.out.print("Masukan Umur : ");
        umur = input.nextInt();
        
        System.out.println("=============================");
        System.out.println("Nama Mahasiswa ----> " + nama);
        System.out.println("Alamat Mahasiswa --> " + alamat);
        System.out.println("NIM Mahasiswa -----> " + nim);
        System.out.println("umur Mahasiswa ----> " + umur + " tahun");
        System.out.println("=============================");        
                
    }
    
}
