/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan21_ProgramRataRataNilai;

import java.util.Scanner;

/**
 *
 * @author sweenutt
 * 
 * NAMA         : FAEL ANTONI WIJAYA
 * KELAS        : PBO-2
 * NIM          : 10116414
 * DESKRIPSI    : Program Rata-Rata Nilai
 */
public class PBO_IF2_10116414_ProgramRataRataNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
  
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        //prompt untuk input jumlah siswa
        int jumlahSiswa = input.nextInt();
        int totalNilai = 0;//inisialisasi total nilai
  
            //for loop
            for (int i = 1; i <= jumlahSiswa; i++)
            {
                System.out.print("Nilai mahasiswa ke " + i + ": ");
                //prompt untuk input nilai siswa 
                int nilai = input.nextInt();
                totalNilai += nilai;
            }
            
            double nilaiRataRata = (double) totalNilai / jumlahSiswa;
            System.out.println();
            System.out.println("Maka, Rata-rata Nilainya adalah : " + nilaiRataRata);
            System.out.println("Developed by : Fael Antoni WIjaya");
    }
}
