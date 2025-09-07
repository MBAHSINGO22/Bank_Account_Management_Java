package Modul_2;

// Kelas RekeningBankMain digunakan sebagai titik masuk utama untuk menjalankan program
public class RekeningBankMain {
    // Metode main adalah titik masuk utama dari program Java
    // Tipe data: public (dapat diakses dari kelas lain), static (metode dapat diakses tanpa membuat objek kelas), void (tipe pengembalian, tidak ada nilai yang dikembalikan), main (nama metode), String args[] (parameter)
    public static void main(String args[]) {
        // Mendeklarasikan variabel rekeningBudi dari tipe RekeningBank
        // Tipe data: RekeningBank, rekeningBudi (nama variabel)
        RekeningBank rekeningBudi;
        // Membuat objek rekeningBudi dengan nomor rekening "12345"
        // Tipe data: rekeningBudi (variabel), = (operator penugasan), new RekeningBank("12345") (pembuatan objek dengan konstruktor)
        rekeningBudi = new RekeningBank("12345");
        // Menampilkan saldo awal rekening Budi
        // Tipe data: System.out.println (metode untuk menampilkan output), "Rekening Budi = " (string), + (operator penjumlahan string), rekeningBudi.cekSaldo() (memanggil metode cekSaldo dari objek rekeningBudi)
        System.out.println("Rekening Budi = " +
                rekeningBudi.cekSaldo());
        // Menampilkan pesan tentang menabung
        System.out.println("Menabung Rp 50.000");
        // Menambahkan Rp 50.000 ke saldo rekening Budi
        // Tipe data: rekeningBudi.tabung (memanggil metode tabung dari objek rekeningBudi), 50000 (parameter)
        rekeningBudi.tabung(50000);
        // Menampilkan saldo rekening Budi setelah menabung
        System.out.println("Rekening Budi sekarang = " +
                rekeningBudi.cekSaldo());
        // Menampilkan pesan tentang mengambil uang
        System.out.println("Mengambil Rp 20.000");
        // Mengurangi Rp 20.000 dari saldo rekening Budi
        // Tipe data: rekeningBudi.ambil (memanggil metode ambil dari objek rekeningBudi), 20000 (parameter)
        rekeningBudi.ambil(20000);
        // Menampilkan saldo rekening Budi setelah mengambil uang
        System.out.println("Rekening Budi sekarang = " +
                rekeningBudi.cekSaldo());
    }
}
