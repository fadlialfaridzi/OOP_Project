import java.text.SimpleDateFormat; // Import untuk memformat tanggal
import java.util.Date; // Import untuk menangani tanggal dan waktu

class Transaksi {
    private String noFaktur; // String untuk No Faktur
    private String kodeBarang; // String untuk Kode Barang
    private String namaBarang; // String untuk Nama Barang
    private double hargaBarang; // Tipe data double untuk harga barang
    private int jumlahBeli; // Tipe data integer untuk jumlah beli

    public Transaksi(String noFaktur, String kodeBarang, String namaBarang, double hargaBarang, 
    int jumlahBeli) {
        this.noFaktur = noFaktur; // Inisialisasi String
        this.kodeBarang = kodeBarang; // Inisialisasi String
        this.namaBarang = namaBarang; // Inisialisasi String
        this.hargaBarang = hargaBarang;
        this.jumlahBeli = jumlahBeli;
    }

    public double hitungTotal() {
        return hargaBarang * jumlahBeli; // Menghitung total harga
    }

    public void tampilkanTransaksi(String kasir) { // Method menerima String
        double total = hitungTotal();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // Format tanggal dan waktu
        Date date = new Date(); // Membuat instance Date untuk mendapatkan waktu saat ini

        System.out.println("+----------------------------------------------------+");
        System.out.println("                   Selamat Datang                      ");
        System.out.println("                   -LandbouwMart-                      ");
        System.out.println("+----------------------------------------------------+");
        System.out.println("Tanggal dan Waktu : " + formatter.format(date)); // Menggunakan Date dengan format String
        System.out.println("+----------------------------------------------------+");
        System.out.println("No. Faktur      : " + noFaktur); // Menampilkan String
        System.out.println("Kode Barang     : " + kodeBarang); // Menampilkan String
        System.out.println("Nama Barang     : " + namaBarang); // Menampilkan String
        System.out.println("Harga Barang    : " + hargaBarang); // Menampilkan double
        System.out.println("Jumlah Beli     : " + jumlahBeli); // Menampilkan integer
        System.out.println("TOTAL           : " + total); // Menampilkan hasil perhitungan
        System.out.println("+----------------------------------------------------+");
        System.out.println("Kasir : " + kasir); // Menampilkan String
        System.out.println("+----------------------------------------------------+");
    }
}
