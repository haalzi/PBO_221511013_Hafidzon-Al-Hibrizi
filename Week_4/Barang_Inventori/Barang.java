package Week_4.Barang_Inventori;

public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;
    public Barang(String kode, String nama, int stk) { 
    kode_barang = kode;
    nama_barang = nama;
    stok = stk;
    }
    public int getStok() {
        return stok;
    }
    public void setStok(int S) {
        if(S > 0){
            this.stok += S;
        }
    }
}