package week5.soal1;

public class Restaurant {
    private String[] namaMakanan;
    private double[] hargaMakanan;
    private int[] stok;
    private static byte id=0;

    public Restaurant(){
        namaMakanan = new String[10];
        hargaMakanan = new double[10];
        stok = new int[10];
    }
    public void tambahMenuMakanan(String nama, double harga, int stok){
        this.namaMakanan[id] = nama;
        this.hargaMakanan[id] = harga;
        this.stok[id] = stok;
    }
    public void tampilMenuMakanan(){
        for(int i = 0; i <= id; i++){
            if(!isOutOfStock(i)){
                System.out.println(namaMakanan[i] + "[" + stok[i] + "]" + hargaMakanan[i]);
            }
        }
    }
    public boolean isOutOfStock(int id){
        if(stok[id] == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void nextId(){
        id++;
    }
}
