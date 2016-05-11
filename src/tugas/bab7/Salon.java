package bab7FIX;

public abstract class Salon {

    protected int pilihan;
    protected int pilProduk;
    protected int pilJasa;
    protected int total[];
   
    public int totalharga[];
    

    public int[] getTotalharga() {
        return totalharga;
    }

    public void setTotalharga(int[] totalharga) {
        this.totalharga = totalharga;
    }

    public int[] getTotal() {
        return total;
    }

    public void setTotal(int[] total) {
        this.total = total;
    }
    
    public abstract int diskon();
    
    

    public Salon() {

    }

    public Salon(int pilihan, int pilProduk[], int pilJasa[]) {
        this.pilihan = pilihan;
    }

    public int getPilihan() {
        return pilihan;
    }

    public void setPilihan(int pilihan) {
        this.pilihan = pilihan;
    }

    public int getPilProduk() {
        return pilProduk;
    }

    public void setPilProduk(int pilProduk) {
        this.pilProduk = pilProduk;
    }

    public int getPilJasa() {
        return pilJasa;
    }

    public void setPilJasa(int pilJasa) {
        this.pilJasa = pilJasa;
    }

}
