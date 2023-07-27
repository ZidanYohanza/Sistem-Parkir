package KendaraanPackage;


import KendaraanPackage.Kendaraan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 140810210029 - Rifqi Muhadzib Ahdan
 */
public class Mobil extends Kendaraan{
    private String tipe;
    private int pintu;

    // Constructors
    public Mobil() {
        super();
        this.tipe = " ";
        this.pintu = 0;
    }
    public Mobil(String tipe, int pintu) {
        super();
        this.tipe = tipe;
        this.pintu = pintu;
    }
    public Mobil(String jenis, String platKend, String namaBrand, String bpkb, String stnk, String status) {
        super(jenis, platKend, namaBrand, bpkb, stnk, status);
        this.tipe = " ";
        this.pintu = 0;
    }
    public Mobil(String jenis, String platKend, String namaBrand, String bpkb, String stnk, String status, String tipe, int pintu) {
        super(jenis, platKend, namaBrand, bpkb, stnk, status);
        this.tipe = tipe;
        this.pintu = pintu;
    }

    // Setters
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
    public void setPintu(int pintu) {
        this.pintu = pintu;
    }

    // Getters
    public String getTipe() {
        return tipe;
    }
    public int getPintu() {
        return pintu;
    }
}

