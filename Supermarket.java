import java.util.Scanner;
import java.util.Random;

public class Supermarket {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        if (!login()) {
            return;
        }

        String supermarketName = "Partime Market"; // Penggunaan String
        displayWelcome(supermarketName); // Passing String
        Transaksi transaksi = getTransactionDetails();
        System.out.print("Nama Kasir: ");
        String kasir = scanner.nextLine(); // Input String
        transaksi.tampilkanTransaksi(kasir);
    }

    public static String generateCaptcha(int length) { // Method mengembalikan String
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"; // Penggunaan String
        StringBuilder captcha = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            captcha.append(chars.charAt(random.nextInt(chars.length()))); // Operasi String
        }

        return captcha.toString(); // Mengembalikan String
    }

    private static Transaksi getTransactionDetails() {
        System.out.print("No. Faktur: ");
        String noFaktur = scanner.nextLine(); // Input String
        System.out.print("Kode Barang: ");
        String kodeBarang = scanner.nextLine(); // Input String
        System.out.print("Nama Barang: ");
        String namaBarang = scanner.nextLine(); // Input String
        System.out.print("Harga Barang: ");
        double hargaBarang = scanner.nextDouble(); // Input double
        System.out.print("Jumlah Beli: ");
        int jumlahBeli = scanner.nextInt(); // Input integer
        scanner.nextLine(); // Membersihkan buffer

        return new Transaksi(noFaktur, kodeBarang, namaBarang, hargaBarang, jumlahBeli); // Passing String
    }

    private static void displayWelcome(String message) { // Method menerima String
        System.out.println("                    Selamat datang             ");
        System.out.println("                     "+message                  ); // Operasi String
        System.out.println("                                               ");
    }

    private static boolean login() {
        System.out.println("+-----------------------------------------------------+");
        System.out.println("                        Login                          ");
        System.out.println("+-----------------------------------------------------+");
        System.out.print("Username: ");
        String username = scanner.nextLine(); // Input String
        System.out.print("Password: ");
        String password = scanner.nextLine(); // Input String

        String captcha = generateCaptcha(6); // Method yang mengembalikan String
        System.out.println("Captcha: " + captcha); // Operasi String
        System.out.print("Masukkan Captcha: ");
        String inputCaptcha = scanner.nextLine(); // Input String
        System.out.println("+----------------------------------------------------+");

        if (username.equals("user") && password.equals("user123") && inputCaptcha.equals(captcha)) { // Operasi String
            System.out.println("                    Login berhasil!                  ");
            System.out.println("+-----------------------------------------------------+");
            return true;
        } else if (username.equals("user") && password.equals("user123") && inputCaptcha != captcha) {
            System.out.println("Captha Salah");
            return false;
        } else {
            System.out.println("Login gagal. Silakan coba lagi.");
            System.out.println("+-----------------------------------------------------+");
            return false;
        }
    }
}
