package com.mycompany.laundry;
import java.util.ArrayList;
import java.util.Scanner;

public class Transaksi {
    private ArrayList<Integer> idClient = new ArrayList<Integer>();
    private ArrayList<Integer> IdLaundry = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();

    public Transaksi() {
        this.banyak.add(0);
        this.idClient.add(0);
        this.IdLaundry.add(2);
        
        this.banyak.add(0);
        this.idClient.add(1);
        this.IdLaundry.add(3);
        
        this.banyak.add(1);
        this.idClient.add(0);
        this.IdLaundry.add(1);
        
        this.banyak.add(1);
        this.idClient.add(2);
        this.IdLaundry.add(2);
    }

    public void prosesTransaksi(Client client, Transaksi transaksi, jenisLaundry Jenislaundry) {
        Scanner vito = new Scanner(System.in);
        System.out.println("\nSilahkan Laundry");
        System.out.print("Masukkan ID Client: ");
        int idClient = vito.nextInt();
        System.out.println("Selamat datang " + client.getNama(idClient));
        ArrayList<Integer> idLaundry = new ArrayList<Integer>();
        ArrayList<Integer> banyak = new ArrayList<Integer>();
        int i = 0;
        int temp = 0;
        do {
            System.out.print("Pilih jenis laundry : ");
            temp = vito.nextInt();
            if (temp != 99) {
                idLaundry.add(temp);
                System.out.print(Jenislaundry.getNamaLaundry(idLaundry.get(i)) + " sebanyak : ");
                banyak.add(vito.nextInt());

                i++;
            }
        } while (temp != 99);

        System.out.println("\nTransaksi belanja " + client.getNama(idClient) + " sebagai berikut");
        System.out.println("Nama Barang \\Jumlah \\Harga \\Total Harga \\\"");

        int total = 0;
        int x = idLaundry.size();
        for (int j = 0; j < x; j++) {
            int jumlah = banyak.get(j) * Jenislaundry.getHarga(idLaundry.get(j));
            total += jumlah;
            System.out.println(Jenislaundry.getNamaLaundry(idLaundry.get(j))+ "\t" 
                    + banyak.get(j) + "\t"
                    + Jenislaundry.getHarga(idLaundry.get(j)) + "\t" 
                    + jumlah);
            transaksi.setTransaksi(Jenislaundry, idClient, idLaundry.get(j), banyak.get(j));
        }

        System.out.println("Total Transaksi : " + total);
        client.editSaldo(idClient, client.getSaldo(idClient) - total);
    }

    public void setTransaksi(jenisLaundry jenislaundry, int idLaundry, int idClient, int banyaknya) {
        this.idClient.add(idClient);
        this.idClient.add(idClient);
        this.banyak.add(banyaknya);
        jenislaundry.editHarga(idClient, jenislaundry.getHarga(idLaundry));
    }

    public int getIdJenisLaundry(int id) {
        return this.IdLaundry.get(id);
    }

    public int getBanyaknya(int id) {
        return this.banyak.get(id);
    }

    public int getIdMember(int id) {
        return this.idClient.get(id);
    }

    public int getJmlTransaksi() {
        return this.idClient.size();
    }
}