package StrukturData;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 140810210029 - Rifqi Muhadzib Ahdan
 */
import java.util.Scanner;

public class Person{
    private String nama, sim, ktp, jk;
    private int umur;

    // Constructors
    public Person(){
        this.nama = " ";
        this.sim = " ";
        this.ktp = " ";
        this.jk = " ";
        this.umur = 0;
    }
    public Person(String nama, String sim, String ktp, String jk, int umur) {
        this.nama = nama;
        this.sim = sim;
        this.ktp = ktp;
        this.jk = jk;
        this.umur = umur;
    }

    // Setters
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setSim(String sim) {
        this.sim = sim;
    }
    public void setKtp(String ktp) {
        this.ktp = ktp;
    }
    public void setJk(String jk) {
        this.jk = jk;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Getters
    public String getNama() {
        return nama;
    }
    public String getSim() {
        return sim;
    }
    public String getKtp() {
        return ktp;
    }
    public String getJk() {
        return jk;
    }
    public int getUmur() {
        return umur;
    }    

    // Fungsional
    public void input(){
        this.nama = inputString("Nama\t\t: ");
        this.sim = inputString("Sim\t\t: ");
        this.ktp = inputString("Ktp\t\t: ");
        this.jk = inputString("Jk\t\t: ");
        this.umur = inputInt("Umur\t\t: ");
    }
    public String print(String hasil){
        hasil += String.format("%-15s", this.nama);
        hasil += String.format("%-10d", this.umur);
        hasil += String.format("%-5s", this.jk);
        hasil += String.format("%-15s", this.sim);
        hasil += String.format("%-15s\n", this.ktp);
        
        return hasil;
        // %-15s%-10s%-5s%-15s%-15s\n"
    }

    public String inputString(String pesan){
        Scanner in = new Scanner(System.in);  
        System.out.print(pesan);
        return in.nextLine();
    }
    public int inputInt(String pesan){
        Scanner in = new Scanner(System.in);  
        System.out.print(pesan);
        return in.nextInt();
    }
}

