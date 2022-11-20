/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.aji.s1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Aji Pramana
 */
public class mahasiswa {
    
    public static void main(String[] args) {
        String[] size = new String[5];
        Scanner input = new Scanner (System.in);

        //membuat data dan menentukan tipe data
        int id[] = new int[10];
        String nama[] = new String[10];
        String kelas[] = new String[10];
        int tglMasuk[] = new int[10];
        int i=0,total=0;
        
        Random randomGenerator = new Random();
             
             
        //perulangan
        do {
            i++;
            //Masukkan Nama
            System.out.print("Nama : ");
            nama[i] = input.next();
            //Masukkan Kelas (Ex. TeknikInformatika)
            System.out.print("Kelas : ");
            kelas[i] = input.next();
            
            //Masukkan tanggal masuk
            System.out.print("tglMasuk : ");
            tglMasuk[i] = input.nextInt();
            
            //membuat nomor id acak
            id[i] = randomGenerator.nextInt(100);
            
            
            if (i% 2 == 0) {
                //absen jika bernilai ganjil
                System.out.print(id[1]+" Adalah Absen Genap");
            } else {
                //absen jika bernilai ganjil
                System.out.print(id[1]+" Adalah Absen Ganjil");
//                    
            }
        
        //Membuat Array List    
        ArrayList DataMahasiswa;
        DataMahasiswa = new DataMahasiswa();
        
        System.out.println("");
        System.out.println("Data Nama Di Hapus");
        
        //Add Data
        DataMahasiswa.add(nama[i]);
        DataMahasiswa.add(kelas[i]);
        DataMahasiswa.add(tglMasuk[i]);
        
        //Remove Data Bagian Nama
        DataMahasiswa.remove(nama[i]);
        System.out.println(DataMahasiswa);
        System.out.println("Size Data : "+DataMahasiswa.size());
            
            
            
            
        }while(nama[i] == null ? "0" != null : !nama[i].equals("0"));
        
        System.out.print("\n----[Hasil Data]----\n");
        
    }     

    private static class DataMahasiswa extends ArrayList {

        public DataMahasiswa() {
        }
    }
}