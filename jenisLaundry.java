package com.mycompany.laundry;
import java.util.ArrayList;
public class jenisLaundry {
     String namaLaundry = "\t Laundry WInner";

    private ArrayList<String> jenisLaundry = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();

    public jenisLaundry() {
        this.jenisLaundry.add("Cuci Kering");
        this.harga.add(6000);
        this.durasi.add(50);
        this.jenisLaundry.add("Cuci Lipat");
        this.harga.add(7000);
        this.durasi.add(55);
        this.jenisLaundry.add("Cuci Setrika");
        this.harga.add(9000);
        this.durasi.add(60);
    }
    
    public int getJmlLaundry() {
        return this.jenisLaundry.size();
    }

    public void setNamaLaundry(String namaBarang) {
        this.jenisLaundry.add(namaBarang);
    }

    public String getNamaLaundry(int idLaundry) {
        return this.jenisLaundry.get(idLaundry);
    }

    public void setHarga(int harga) {
        this.harga.add(harga);
    }

    public int getHarga(int idLaundry) {
        return this.harga.get(idLaundry);
    }

    public void editHarga(int idLaundry, int harga) {
        this.harga.set(idLaundry, harga);
    }

    public void setDurasi(int Durasi) {
        this.durasi.add(Durasi);
    }

    public int getDurasi(int idLaundry) {
        return this.durasi.get(idLaundry);
    }
}
