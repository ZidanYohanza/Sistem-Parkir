package KendaraanPackage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import StrukturData.Person;
import WaktuPackage.Waktu;

/**
 *
 * @author 140810210029 - Rifqi Muhadzib Ahdan
 */
public class Kendaraan {
    protected Person persons; // has-an
    protected String jenis, platKend, namaBrand, bpkb, stnk, status;
    protected Waktu datang, keluar; // has-an
    public Kendaraan next;

    // Constructor
    public Kendaraan() {
        this.persons = new Person();
        this.jenis = " ";
        this.platKend = " ";
        this.namaBrand = " ";
        this.bpkb = " ";
        this.stnk = " ";
        this.status = " ";
        this.datang = new Waktu();
        this.keluar = new Waktu();
        this.next = null;
    }
    public Kendaraan(String jenis, String platKend, String namaBrand, String bpkb, String stnk, String status) {
        this.persons = new Person();
        this.jenis = jenis;
        this.platKend = platKend;
        this.namaBrand = namaBrand;
        this.bpkb = bpkb;
        this.stnk = stnk;
        this.status = status;
        this.datang = new Waktu();
        this.keluar = new Waktu();
        this.next = null;
    }

    // Setters
    public void setJenis(String jenis){
        this.jenis = jenis.toLowerCase();
    } 
    public void setPlatKend(String platKend) {
        this.platKend = platKend;
    }
    public void setNamaBrand(String namaBrand) {
        this.namaBrand = namaBrand;
    }
    public void setBpkb(String bpkb) {
        this.bpkb = bpkb;
    }
    public void setStnk(String stnk) {
        this.stnk = stnk;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setDatang(Waktu datang) {
        this.datang = datang;
    }
    public void setKeluar(Waktu keluar) {
        this.keluar = keluar;
    }

    // Getters
    public String getJenis() {
        return this.jenis;
    }
    public String getPlatKend() {
        return this.platKend;
    }
    public String getNamaBrand() {
        return this.namaBrand;
    }
    public String getBpkb() {
        return this.bpkb;
    }
    public String getStnk() {
        return this.bpkb;
    }
    public String getStatus() {
        return this.status;
    }
    public Waktu getDatang() {
        return this.datang;
    }
    public Waktu getKeluar() {
        return this.keluar;
    }
    public Person getPersons() {
        return this.persons;
    }
    public Kendaraan getClassKendaraan(String jenis){
        Kendaraan kend = new Kendaraan();
        if(jenis.toLowerCase() == "motor"){
            kend = new Motor();
        } else if (jenis.toLowerCase() == "mobil"){
            kend = new Mobil();
        } else if (jenis.toLowerCase() == "truk"){
            kend = new Truk();
        }
        kend.setJenis(jenis);
        return kend;
    }

    // Fungsional
    public int biayaJenis(){
        int biaya = 0;
        if(this.jenis.equals("motor")){
            biaya = 2000;
        } else if (this.jenis.equals("mobil")){
            biaya = 3000;
        } else if (this.jenis.equals("truk")){
            biaya = 5000;
        }
        return biaya;
    }

    public int biayaTotal(){
        Waktu durasiPark = this.keluar.hitungDurasiParkir(this.datang);
        return (biayaJenis() * durasiPark.jamParkir(durasiPark));
    }
}
