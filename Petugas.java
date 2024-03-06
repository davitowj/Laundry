package com.mycompany.laundry;
import java.util.ArrayList;

public class Petugas implements User {
    private ArrayList<String> namaPetugas = new ArrayList<String>(); 
    private ArrayList<String> alamat = new ArrayList<String>(); 
    private ArrayList<String> telepon = new ArrayList<String>(); 
    private ArrayList<Integer> jabatan = new ArrayList<Integer>(); 
     
    public Petugas() { 
        this.namaPetugas.add("Osas"); 
        this.alamat.add("Suhat"); 
        this.telepon.add("0889192819"); 
    } 
 
    public void setJabatan(int jabatan ){ 
        this.jabatan.add(jabatan); 
    } 
    public int getJabatan(int id){ 
        return this.jabatan.get(id); 
    }        
    public int getJmlKaryawan(){ 
        return this.namaPetugas.size(); 
    }       
 
    @Override 
    public void setNama(String namaPetugas ){ 
        this.namaPetugas.add(namaPetugas); 
    } 
    
    @Override 
    public String getNama(int idPetugas){ 
        return this.namaPetugas.get(idPetugas); 
    } 
         
    @Override 
    public void setAlamat(String alamat ){ 
        this.namaPetugas.add(alamat);
    } 
        
    @Override 
    public String getAlamat(int idPetugas){ 
        return this.alamat.get(idPetugas); 
    } 
     
    @Override 
    public void setTelepon(String telepon ){ 
        this.namaPetugas.add(telepon); 
    } 
     
    @Override 
    public String getTelepon(int idPetugas){ 
        return this.telepon.get(idPetugas); 
    }        
} 