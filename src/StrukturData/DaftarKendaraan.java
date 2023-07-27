package StrukturData;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import KendaraanPackage.Kendaraan;

/**
 *
 * @author 140810210029 - Rifqi Muhadzib Ahdan
 */
public class DaftarKendaraan {
    private Kendaraan firstKendaraan;

    // Constructors
    public DaftarKendaraan(){
        this.firstKendaraan = null;
    }
    public DaftarKendaraan(int jumlah){
        this.firstKendaraan = null;
    }
    
    public Kendaraan getKendaraan() {
        return this.firstKendaraan;
    }

    /*
     * @desc
     *  Fungsi untuk membuat element kendaraan baru
     * @return
     *  Kendaraan
     */

    public void insertFirst(Kendaraan newKend){
        // Jika list kosong
        if(this.firstKendaraan == null) { 
            this.firstKendaraan = newKend;
        // Jika list tidak kosog
        }else {			
            newKend.next = this.firstKendaraan;
            this.firstKendaraan = newKend;
        }
    }
    
    public void insertLast(Kendaraan newKend){
        // list kosong
        if (this.firstKendaraan == null) { 
            this.firstKendaraan = newKend;
        // Jika list tidak kosog
        } else {
            Kendaraan temp = this.firstKendaraan;
            // Ambil element terakhir
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newKend;
        }
    }

    public void insertAfter(Kendaraan newKend, Kendaraan pCari){
        // Jika kosong
        if(this.firstKendaraan == null){
          this.firstKendaraan = newKend;
        // jika ada isi, maka insert setelah pCari
        } else {
          newKend.next = pCari.next;
          pCari.next = newKend;
        }
    }
    
    public void deleteFirst(){
        Kendaraan deleteKend;

        // List kosong
        if(this.firstKendaraan == null){
            System.out.println("Tidak ada kendaraan yang parkir");
            deleteKend = null;
        // List berisi 1 buah data
        }else if(this.firstKendaraan.next == null){
            deleteKend = this.firstKendaraan;
            this.firstKendaraan = null;
        // List berisi > 1 data
        }else{
            deleteKend = this.firstKendaraan;
            this.firstKendaraan = this.firstKendaraan.next;
            deleteKend.next = null;
        }

        // Mengosongkan data
        deleteKend = null;
    }
    
    public void deleteLast() {
        Kendaraan deleteKend;

        // Jika list kosong
        if (this.firstKendaraan == null) { 
            deleteKend = null;
        // Jika isi list = 1
        } else if (this.firstKendaraan.next == null) { 
            deleteKend = this.firstKendaraan;
            this.firstKendaraan = null;
        // Jika isi list > 1
        } else {
            Kendaraan last = this.firstKendaraan;
            Kendaraan pre = null;
            while (last.next != null) {
                pre = last;
                last = last.next;
            }
            deleteKend = last;
            pre.next = null;
        }

        deleteKend = null;
    }
    
    /*
     * @return
     *  Jika null, maka yang dicari tidak ada
     *  Jika tidak null, maka yang dicari ditemukan
     */
    public Kendaraan linearSearch(String plat){
        boolean notFound = true; // belum ditemukan
        Kendaraan currKend = this.firstKendaraan; // Start dari element pertama 
        
        while (notFound && currKend != null){
            if(currKend.getPlatKend().equals(plat)){
                notFound = false;
            }else{
                currKend = currKend.next;
            }
        }
        return currKend;
    }
    
    public void deleteAfter(Kendaraan pCari){
        Kendaraan cariKend;
        // Jika tidak ada kendaraan atau yang dicari merupakan element terakhir
        if(this.firstKendaraan == null || pCari.next == null){
            System.out.println("Tidak ada kendaraan yang parkir atau kendaraan key elemen terakhir");
        // Jika kendaraan hanya ada 1
        } else if (this.firstKendaraan.next == null){
            cariKend = pCari.next;
            pCari.next = null;
        // Jika kendaraan > 1 dan kendaraan kunci bukan terkahir
        } else {
            cariKend = pCari.next; 
            pCari.next = cariKend.next;
            cariKend.next = null;
        }
        cariKend = null;    
    }
    
    public void deleteSearch(Kendaraan cariKend){
        Kendaraan deleteKend;

        // Jika kendaraan yang dicari adalah elemen pertama
        if (this.firstKendaraan == cariKend) 
        {
            deleteKend = cariKend;
            this.firstKendaraan = this.firstKendaraan.next;
            deleteKend.next = null;
        }
        //Jika cariKend adalah akhir list dan lebih dari 1 elemen
        else if(cariKend.next == null) 
        {
            Kendaraan preSearch = this.firstKendaraan;
            while (preSearch.next != cariKend)
            {
                preSearch = preSearch.next;
            }
            deleteKend = cariKend;
            preSearch.next = null;
        }
        // Jika cariKend ada di tengah list
        else 
        {
            Kendaraan preSearch = this.firstKendaraan;
            while (preSearch.next != cariKend)
            {
                preSearch = preSearch.next;
            }
            preSearch.next = cariKend.next;
            deleteKend = cariKend;
            deleteKend.next = null;
        }
    }
}
