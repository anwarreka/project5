/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelMahasiswa;

/**
 *
 * @author RSA
 * HARI/TANGGAL : Kamis, 7 Februari 2019

NO SOAL : 5

KELAS : IF8

NIM : 10110269

NAMA : RIZKI ADAM KURNIAWAN
 * 
 */
public class ModelMahasiswa {

    private String nim;
    private String nama;

    // ini method setter
    public void setNim(String nim){
        this.nim = nim;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    // ini method getter
    public String getNim(){
        return this.nim;
    }

    public String getNama(){
        return this.nama;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        // membuat objek dari class User
        ModelMahasiswa reka = new ModelMahasiswa();

    // menggunakan method setter
        reka.setNim("10116361");
        reka.setNama("Reka Saepul Anwar");
        System.out.println("NIM Mahasiswa  :"+ reka.getNim());
        System.out.println("Nama Mahasiswa :"+ reka.getNama());
    }
}
