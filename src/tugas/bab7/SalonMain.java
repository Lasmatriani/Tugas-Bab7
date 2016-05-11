package bab7FIX;

import java.util.*;

public class SalonMain {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int daftar[] = new int[5];
        int pilihan = 0;
        String[] jud = {"JENIS JASA", "  HARGA"};
        String[] jud2 = {"   PRODUK", "  HARGA"};
        String[][] jenisprodukfix = {{"1. SHAMPOO MAKARIZO", "70.000"}, {"2. CREAMBATH MAKARIZO", "80.000"}, {"3. MASKER RAMBUT RUDY", "75.000"}, {"4. CONDITIONER RUDY", "80.000"}, {"5. VITAMIN SUNSILK", "65000"}};
        String[][] jenisjasa = {{"1. GUNTING", "35.000"}, {"2. CREAMBATH", "60.000"}, {"3. BONDING", "150.000"}, {"4. SMOOTHING", "200.000"}, {"5. MASKER RAMBUT", "55.000"}};
        do {
            System.out.println("==========>>>SELAMAT DATANG DI SALON KECANTIKAN<<<==========");
            System.out.print("1. JASA KECANTIKAN\n2. PRODUK KECANTIKAN\n3. KELUAR\n");
            System.out.print("MASUKKAN PILIHAN ANDA: ");
            pilihan = in.nextInt();
            System.out.println("-------------------------------------------------------------");
            if (pilihan == 1) {
                for (int i = 0; i < jud.length; i++) {
                    System.out.printf("%-10s\t\t", jud[i]);
                }
                System.out.println();
                for (int i = 0; i < jenisjasa.length; i++) {
                    for (int j = 0; j < jenisjasa[0].length; j++) {
                        System.out.printf("%-25s", jenisjasa[i][j]);
                    }
                    System.out.println();
                }
                System.out.println("-------------------------------------------------------------");
                System.out.println("MASUKKAN ANGKA 1 DI JASA YANG DIINGINKAN DAN 0 BILA TIDAK : ");
                for (int i = 0; i < daftar.length; i++) {
                    System.out.printf(jenisjasa[i][0] + "\t\t%s", " : ");
                    daftar[i] = in.nextInt();
                }
            } else if (pilihan == 2) {
                for (int i = 0; i < jud2.length; i++) {
                    System.out.printf("%-10s\t\t", jud2[i]);
                }
                System.out.println();
                for (int i = 0; i < jenisprodukfix.length; i++) {
                    for (int j = 0; j < jenisprodukfix[0].length; j++) {
                        System.out.printf("%-25s", jenisprodukfix[i][j]);
                    }
                    System.out.println();
                }
                System.out.println("-------------------------------------------------------------");
                System.out.println(">>SILAHKAN MASUKKAN BANYAK BARANG<<");
                for (int i = 0; i < daftar.length; i++) {
                    System.out.printf(jenisprodukfix[i][0] + "\t\t%s", " : ");
                    daftar[i] = in.nextInt();
                }
            } else if (pilihan == 3) {
                System.exit(0);
            } else {
                System.out.println("MASUKKAN ANDA SALAH!");
            }
            System.out.println("-------------------------------------------------------------");
            System.out.println("=>>>KETIKKAN BUKAN JIKA TIDAK PUNYA KARTU ANGGOTA<<<=");
            System.out.println("-------------------------------------------------------------");
            System.out.print("MASUKKAN JENIS KEANGGOTAAN: ");
            String anggo = in.next();
            
            ArrayList<Salon> salon = new ArrayList();
            
            if (anggo.equalsIgnoreCase("Premium") || anggo.equalsIgnoreCase("premium")) {
                salon.add(new Premium(pilihan, daftar, daftar));
                salon.get(0).setTotalharga(daftar);
            } else if (anggo.equalsIgnoreCase("Gold") || anggo.equalsIgnoreCase("Gold")) {
                salon.add(new Gold(pilihan, daftar, daftar));
                salon.get(0).setTotalharga(daftar);
            } else if (anggo.equalsIgnoreCase("Silver") || anggo.equalsIgnoreCase("silver")) {
                salon.add(new Silver(pilihan, daftar, daftar));
                salon.get(0).setTotalharga(daftar);
            } else if (anggo.equalsIgnoreCase("Bukan") || anggo.equalsIgnoreCase("bukan")) {
                salon.add(new BukanAnggota(pilihan, daftar, daftar));
                salon.get(0).setTotalharga(daftar);
            }
            
            for (Salon x : salon) {
                x.diskon();
            }
            
        } while (pilihan != 3);
    }
}
