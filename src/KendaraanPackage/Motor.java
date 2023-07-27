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
public class Motor extends Kendaraan{
    private String tipe;
    
    // Constructors
    public Motor() {
        super();
        this.tipe = " ";
    }
    public Motor(String tipe) {
        super();
        this.tipe = tipe;
    }
    public Motor(String jenis, String platKend, String namaBrand, String bpkb, String stnk, String status) {
        super(jenis, platKend, namaBrand, bpkb, stnk, status);
        this.tipe = " ";
    }
    public Motor(String jenis, String platKend, String namaBrand, String bpkb, String stnk, String status, String tipe) {
        super(jenis, platKend, namaBrand, bpkb, stnk, status);
        this.tipe = tipe;
    }

    // Setter
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    // Getter
    public String getTipe() {
        return tipe;
    }
} 

