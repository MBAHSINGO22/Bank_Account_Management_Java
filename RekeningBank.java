package Modul_2;

// Kelas RekeningBank digunakan untuk merepresentasikan rekening bank dengan nomor rekening dan saldo
public class RekeningBank {
    // Variabel anggota untuk menyimpan nomor rekening
    // Tipe data: String, private (hanya dapat diakses dalam kelas ini)
    private String nomorRekening;
    // Variabel anggota untuk menyimpan saldo rekening
    // Tipe data: int, private (hanya dapat diakses dalam kelas ini)
    private int saldo;

    // Konstruktor untuk menginisialisasi objek RekeningBank dengan nomor rekening dan saldo awal 0
    // Tipe data: public (dapat diakses dari kelas lain), RekeningBank (nama kelas), String nomor (parameter)
    public RekeningBank(String nomor) {
        // Menyimpan nomor rekening yang diberikan
        // Tipe data: String, nomorRekening (variabel anggota), = (operator penugasan), nomor (parameter)
        nomorRekening = nomor;
        // Mengatur saldo awal menjadi 0
        // Tipe data: int, saldo (variabel anggota), = (operator penugasan), 0 (nilai awal)
        saldo = 0;
    }

    // Metode untuk mengecek saldo rekening
    // Tipe data: public (dapat diakses dari kelas lain), int (tipe pengembalian), cekSaldo (nama metode)
    public int cekSaldo() {
        // Mengembalikan nilai saldo saat ini
        // Tipe data: return (kata kunci), saldo (variabel anggota)
        return saldo;
    }

    // Metode untuk menambahkan jumlah ke saldo rekening
    // Tipe data: public (dapat diakses dari kelas lain), void (tipe pengembalian, tidak ada nilai yang dikembalikan), tabung (nama metode), int jumlah (parameter)
    public void tabung(int jumlah) {
        // Menambahkan jumlah ke saldo saat ini
        // Tipe data: saldo (variabel anggota), = (operator penugasan), saldo (variabel anggota), + (operator penjumlahan), jumlah (parameter)
        saldo = saldo + jumlah;
    }

    // Metode untuk mengurangi jumlah dari saldo rekening
    // Tipe data: public (dapat diakses dari kelas lain), void (tipe pengembalian, tidak ada nilai yang dikembalikan), ambil (nama metode), int jumlah (parameter)
    public void ambil(int jumlah) {
        // Mengurangi jumlah dari saldo saat ini
        // Tipe data: saldo (variabel anggota), = (operator penugasan), saldo (variabel anggota), - (operator pengurangan), jumlah (parameter)
        saldo = saldo - jumlah;
    }
}