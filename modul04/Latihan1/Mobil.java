package modul04.Latihan1;

import modul04.Latihan1.Kendaraan;

public class Mobil extends Kendaraan {

    // Atribut tambahan khusus untuk Mobil
    private int jumlahPintu;

    // Constructor untuk Subclass
    public Mobil(String merk, int tahun, int jumlahPintu) {
        // 'super(merk, tahun)' WAJIB dipanggil untuk
        // memberikan data ke constructor superclass (Kendaraan)
        super(merk, tahun);

        // Menginisialisasi atribut milik Mobil sendiri
        this.jumlahPintu = jumlahPintu;
    }



    // Method tambahan khusus untuk Mobil
    public void infoPintu() {
        System.out.println("Jumlah Pintu: " + this.jumlahPintu);
    }
}
