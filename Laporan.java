package com.mycompany.laundry;

public class Laporan extends jenisLaundry{
    
    public void NamaLaundry(){
        System.out.println("\t"+super.namaLaundry);
    }
    public void laporan(jenisLaundry JenisLaundry) {
        int x = JenisLaundry.getJmlLaundry();
        System.out.println();
        System.out.println("Tabel Laundry");
        System.out.println();
        System.out.println("Jenis Laundry \tHarga \tDurasi Laundry");
        for (int i = 0; i < x; i++) {
            System.out.println(JenisLaundry.getNamaLaundry(i) + "\t"
                    + JenisLaundry.getHarga(i) + "\t" 
                    + JenisLaundry.getDurasi(i));
        }
    }
    public void laporan(Client client) {
        int x = client.getJmlClient();

        System.out.println();
        System.out.println("Tabel Member");
        System.out.println();
        System.out.println("Nama \t\tAlamat \t\tTelepon \tSaldo");
        for (int i = 0; i < x; i++) {
            System.out.println(client.getNama(i) + "\t"
                    + client.getAlamat(i) + "\t" 
                    + client.getTelepon(i) + "\t"
                    + client.getSaldo(i));
        }
    }
    
    public void laporan(Transaksi transaksi, jenisLaundry JenisLaundry) {
        int x = transaksi.getJmlTransaksi();
        System.out.println();
        System.out.println("Laporan Transaksi");
        System.out.println();
        System.out.println("Nama Barang Qty Harga Jumlah");
        int total = 0;
        for (int i = 0; i < x; i++) {
            int jumlah = transaksi.getBanyaknya(i) * JenisLaundry.getHarga(transaksi.getIdJenisLaundry(i));
            total += jumlah;
            System.out.println(JenisLaundry.getNamaLaundry(transaksi.getIdJenisLaundry(i)) + "\t"
                    + transaksi.getBanyaknya(i) + "\t" 
                    + JenisLaundry.getDurasi(transaksi.getIdJenisLaundry(i)) + "\t"
                    + jumlah);
        }
        System.out.println("Total Omset = " + total);
    }
}
