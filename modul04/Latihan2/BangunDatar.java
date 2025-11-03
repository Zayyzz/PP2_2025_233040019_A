package modul04.Latihan2;

public abstract class BangunDatar {

    // Method abstrak: WAJIB di-override oleh subclass
    public abstract double hitungLuas();

    // Method konkrit: Boleh di-override, boleh juga tidak
    public void cetakInfo() {
        System.out.println("Ini adalah bangun datar.");
    }
}
