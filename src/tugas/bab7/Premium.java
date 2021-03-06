package bab7FIX;

public class Premium extends Salon {

    public Premium(int pilihan, int pilProduk[], int pilJasa[]) {
        super(pilihan, pilProduk, pilJasa);
    }

    @Override
    public int diskon() {
        int harga[] = new int[5];
        int totalbiaya = 0;
        if (super.pilihan == 1) {
            harga[0] = super.totalharga[0] * (35000);
            harga[1] = super.totalharga[1] * (60000);
            harga[2] = super.totalharga[2] * (150000);
            harga[3] = super.totalharga[3] * (200000);
            harga[4] = super.totalharga[4] * (55000);
            totalbiaya = harga[0] + harga[1] + harga[2] + harga[3] + harga[4];
            totalbiaya = (totalbiaya * 80 / 100);
            System.out.println("-------------------------------------------------------------");
            System.out.println("Selamat!, anda mendapatkan diskon Premium 20%!");
            System.out.println("-------------------------------------------------------------");
            System.out.printf("Total Yang Harus Dibayar: " + "\t%s", " : Rp. " + totalbiaya + "\n");
            System.out.println("-------------------------------------------------------------");
            System.out.println("");
        } else if (super.pilihan == 2) {
            harga[0] = super.totalharga[0] * (70000);
            harga[1] = super.totalharga[1] * (80000);
            harga[2] = super.totalharga[2] * (75000);
            harga[3] = super.totalharga[3] * (80000);
            harga[4] = super.totalharga[4] * (65000);
            totalbiaya = harga[0] + harga[1] + harga[2] + harga[3] + harga[4];
            totalbiaya = (totalbiaya * 80 / 100);
            totalbiaya = totalbiaya * 90 / 100;
            System.out.println("-------------------------------------------------------------");
            System.out.println("Selamat!, anda mendapatkan diskon Premium 20% dan Anggota 10%!");
            System.out.println("-------------------------------------------------------------");
            System.out.printf("Total Yang Harus Dibayar: " + "\t%s", " : Rp. " + totalbiaya + "\n");
            System.out.println("-------------------------------------------------------------");
            System.out.println("");
        }
        return totalbiaya;

    }

}
