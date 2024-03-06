package com.mycompany.laundry;
public class Laundry {

     public static void main(String[] args) {
        Client client = new Client();
        jenisLaundry jenis = new jenisLaundry();
        Transaksi transaksi = new Transaksi();
        Laporan lapor= new Laporan();
        
        lapor.NamaLaundry();
        lapor.laporan(jenis);
        lapor.laporan(client);
        transaksi.prosesTransaksi(client, transaksi, jenis);
        lapor.laporan(jenis);
        lapor.laporan(client);
    }
}
