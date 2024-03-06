package com.mycompany.laundry;
import java.util.ArrayList;

public class Client implements User{
    private ArrayList<String> namaClient = new ArrayList<String>(); 
    private ArrayList<String> alamat = new ArrayList<String>(); 
    private ArrayList<String> telepon = new ArrayList<String>(); 
    private ArrayList<Integer> saldo = new ArrayList<Integer>();
   
     public Client() {
        this.namaClient.add("Davito Winner");
        this.alamat.add("London");
        this.telepon.add("\t0293725372");
        this.saldo.add(70000);
        this.namaClient.add("Yuwanto Kwan");
        this.alamat.add("Tarakann");
        this.telepon.add("0392387153");
        this.saldo.add(50000);
        this.namaClient.add("Darwin");
        this.alamat.add("Suhat");
        this.telepon.add("0827163716");
        this.saldo.add(60000);
    }

    public void setSaldo(int saldo) {
        this.saldo.add(saldo);
    }

    public int getSaldo(int idClient) {
        return this.saldo.get(idClient);
    }

    public void editSaldo(int idClient, int saldo) {
        this.saldo.set(idClient, saldo);
    }

    public int getJmlClient() {
        return this.saldo.size();
    }

    @Override
    public void setNama(String nama) {

    }
    
    @Override
    public String getNama(int idClient) {
        return this.namaClient.get(idClient);
    }

    @Override
    public void setAlamat(String alamat) {

    }
    
    @Override
    public String getAlamat(int idClient) {
        return this.alamat.get(idClient);
    }

    @Override
    public void setTelepon(String telepon) {

    }

    @Override
    public String getTelepon(int idClient) {
        return this.telepon.get(idClient);
    }   
}