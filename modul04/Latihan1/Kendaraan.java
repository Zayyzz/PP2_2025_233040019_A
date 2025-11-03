package modul04.Latihan1;

public class Kendaraan {
    protected String merk;
    protected int tahun;

    // Constructor Superclass
    public Kendaraan(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }

    public void klakson() {
        System.out.println("Tin Tin!");
    }

    public void info() {
        System.out.println("Merk: " + this.merk + ", Tahun: " + this.tahun);
    }
}
