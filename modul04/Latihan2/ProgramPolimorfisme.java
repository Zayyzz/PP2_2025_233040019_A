package modul04.Latihan2;

public class ProgramPolimorfisme {

    public static void main(String[] args) {
        System.out.println("--- Info Bangun Datar (Polimorfisme) ---");

        // 1. Buat array dengan tipe Superclass (polimorfisme)
        BangunDatar[] koleksiBangun = new BangunDatar[2];

        // 2. Isi array dengan objek Subclass yang berbeda
        koleksiBangun[0] = new Persegi(5.0, "Hitam");
        koleksiBangun[1] = new Lingkaran(3.0);

        // 3. Loop menggunakan tipe Superclass
        for (BangunDatar bangun : koleksiBangun) {

            // Polimorfisme: Memanggil cetakInfo() versi Persegi/Lingkaran
            bangun.cetakInfo();

            // Polimorfisme: Memanggil hitungLuas() versi Persegi/Lingkaran
            System.out.println("Luas: " + bangun.hitungLuas());

            // 4. Cek apakah objek ini juga TUNDUK pada interface DapatDiwarnai
            if (bangun instanceof DapatDiwarnai) {
                // Jika ya, kita bisa 'cast' dan panggil method interface-nya
                DapatDiwarnai objekBisaWarna = (DapatDiwarnai) bangun;
                objekBisaWarna.warnai("Merah");
            }

            System.out.println("--------------------");
        }
    }
}
