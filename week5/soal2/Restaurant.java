package week5.soal2;

import java.util.Scanner;

class Produk{
    String namaProduk;     
    int harga;
    int qty;

    public Produk(String nama, int harga, int qty){
        this.namaProduk = nama;
        this.harga = harga;
        this.qty = qty;
    }        
}

class Penjualan{
    Produk produkTerjual;
    int hargaTotal;
    int quantity;
        
    public Penjualan(Produk produk, int quantity){
        this.produkTerjual = produk;
        this.quantity = quantity;
    }
    public int hitung(){
       return produkTerjual.harga * quantity;
    }
}
    
public class Restaurant {    
    public static void main(String[] args) {
        int pilihanMenu = 0;
        Scanner input = new Scanner (System.in);

        Produk[] listMenu = new Produk[10];
        listMenu[0] = new Produk("Siomay", 10000, 10);
        listMenu[1] = new Produk("Indomie Nasi", 10000, 10);
        listMenu[2] = new Produk("Nasi Goreng", 10000, 10);
        listMenu[3] = new Produk("Es Teler", 7000, 10);
        listMenu[4] = new Produk("Ice Cream", 5000, 10);
        listMenu[5] = new Produk("Air Mineral", 3000, 10);
        listMenu[6] = new Produk("Es Jeruk", 4000, 10);
        listMenu[7] = new Produk("Susu Gembira", 6000, 10); 
        listMenu[8] = new Produk("Teh Botol", 5000, 10);
        listMenu[9] = new Produk("Jus Buah", 8000, 10);
        
        Penjualan Pesanan;
        System.out.println("List Menu:");
        for (int i = 0; i < listMenu.length; i++){
            if (listMenu[i] != null){
                System.out.println(i+1 + ". " + listMenu[i].namaProduk + "\t" + "Rp." + listMenu[i].harga);
            }
        }
        boolean nomor = true;
        while(nomor){
            System.out.println("Pilih no menu : ");
            pilihanMenu = input.nextInt();
            if (pilihanMenu > listMenu.length || pilihanMenu < 0){
                System.out.println("Nomor yang anda masukan salah");
                nomor = true;
            }else{
                nomor = false;
            }
        }
        
        System.out.println("Masukkan jumlah yang ingin dipesan " );
        int jumlahDipesan = input.nextInt();
        
        Pesanan = new Penjualan(listMenu[pilihanMenu-1], jumlahDipesan);
        listMenu[pilihanMenu-1].qty = listMenu[pilihanMenu-1].qty - jumlahDipesan; 
        
        System.out.println("Pesanan anda : ");
        System.out.println(Pesanan.produkTerjual.namaProduk +"\t"+ Pesanan.quantity +"\t"+ "Rp." + Pesanan.produkTerjual.harga +"\t"+ "Total bayar : Rp.  " + Pesanan.hitung() +"\t"+ "Sisa Stok: " +"\t"+ Pesanan.produkTerjual.qty);
        input.close();
    }
}