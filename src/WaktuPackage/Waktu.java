package WaktuPackage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 140810210029 - Rifqi Muhadzib Ahdan
 */
public class Waktu{
    private int jam, menit, detik;

    // Constructor
    public Waktu(){
        this.jam = 0;
        this.menit = 0;
        this.detik = 0;
    }
    public Waktu(int jam, int menit, int detik){
        this.jam = jam;
        this.menit = menit;
        this.detik = detik;
    }

    // Setters
    public void setJam(int jam) {
        this.jam = jam;
    }
    public void setMenit(int menit) {
        this.menit = menit;
    }
    public void setDetik(int detik){
        this.detik = detik;
    }
    public void setWaktu(int jam, int menit, int detik){
        this.jam = jam;
        this.menit = menit;
        this.detik = detik;
    }
    public void setWaktuDariMilitary(String waktu) {
        String[] arrWaktu = waktu.split(":");
        this.jam = Integer.parseInt(arrWaktu[0]);
        this.menit = Integer.parseInt(arrWaktu[1]);
        this.detik = Integer.parseInt(arrWaktu[2]); 
    }

    // Getters
    public int getJam() {
        return this.jam;
    }
    public int getMenit() { 
        return this.menit;
    }
    public int getDetik() {
        return this.detik;
    }

    // Memverifikasi jam < 24, menit < 60, dan detik < 60
    public void fixTime() {
        if (this.detik >= 60) {
            this.menit += (this.detik / 60);
            this.detik %= 60;
        }
        if (this.menit >= 60) {
            this.jam += (this.menit / 60);
            this.menit %= 60;
        }
        if (this.jam >= 24) {
            this.jam %= 24;
        }
    }

    public int konversiToDetik(){
        return (this.jam*3600 + 
                this.menit*60 + 
                this.detik
                );
    }

    public String konversiToMilitary(){
        return String.format("%02d:%02d:%02d", this.jam, this.menit, this.detik);
    }

    // Passing objek cara 2 : passing with return value function
    public Waktu hitungDurasiParkir(Waktu wktAwal){
        Waktu waktuDurasi = new Waktu();
        
        int durasiParkir = konversiToDetik() - wktAwal.konversiToDetik();
        // Jika waktu akhir < waktu awal, maka artinya sudah berganti hari
        // Sehingga durasi akan bernilai negatif dan durasi akan ditambah dengan waktu 1 hari (dalam satuan detik)
        if(durasiParkir < 0) durasiParkir += (24*3600);

        // Jika durasi parkir hanya kurang dari sama dengan 10 menit, maka dianggap gratis
        // Sehingga durasi dianggap 0
        if(durasiParkir <= 600) durasiParkir = 0;

        waktuDurasi.setWaktu((durasiParkir/3600), ((durasiParkir%3600)/60), ((durasiParkir%3600)%60));

        return waktuDurasi;
    }

    public int jamParkir(Waktu waktuDurasi){
        if(waktuDurasi.getDetik() > 0 || waktuDurasi.getMenit() > 0){
            return (waktuDurasi.getJam() + 1);
        }
        return (waktuDurasi.getJam());
    }
}

