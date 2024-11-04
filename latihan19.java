package pertemuan5;

public class latihan19 {
    public static void main(String[] args) {
        double saldoAwal = 2500000;  // Saldo awal
        double bunga = 0.15;          // Bunga per bulan (15%)
        int lama = 6;                 // Lama dalam bulan

        for (int i = 1; i <= lama; i++) {
            saldoAwal += saldoAwal * bunga;  // Menghitung saldo baru
            System.out.printf("Saldo di bulan ke-%d Rp.%,.0f%n", i, saldoAwal);
        }
    }
}

