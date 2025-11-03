package modul04.Latihan2;

public class Persegi extends BangunDatar implements DapatDiwarnai {

    private double sisi;
    private String warna;

    public Persegi(double sisi, String warnaAwal) {
        this.sisi = sisi;
        this.warna = warnaAwal;
    }

    // Implementasi method abstrak dari BangunDatar
    @Override
    public double hitungLuas() {
        return this.sisi * this.sisi;
    }

    // Implementasi method dari interface DapatDiwarnai
    @Override
    public void warnai(String warna) {
        this.warna = warna;
        System.out.println("Persegi diwarnai " + warna);
    }

    // Override method konkrit dari BangunDatar (agar output sesuai)
    @Override
    public void cetakInfo() {
        System.out.println("Ini adalah Persegi, Warna: " + this.warna + ", Sisi: " + this.sisi);
    }
}
