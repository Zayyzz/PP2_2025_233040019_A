package modul04.Latihan1;

public class Latihan1 {

    public static void main(String[] args) {

        // Membuat objek dari subclass 'Mobil'
        Mobil mobilSaya = new Mobil("Toyota", 2020, 4);

        // Memanggil method 'info()'
        // Method ini DIWARISI dari kelas Kendaraan
        mobilSaya.info();

        // Memanggil method 'infoPintu()'
        // Method ini KHUSUS ada di kelas Mobil
        mobilSaya.infoPintu();

        // Memanggil method 'klakson()'
        // Method ini juga DIWARISI dari kelas Kendaraan
        mobilSaya.klakson();
    }
}