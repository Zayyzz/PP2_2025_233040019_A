package modul04.Latihan2;

public class Lingkaran extends BangunDatar {

    private double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    // Implementasi method abstrak dari BangunDatar
    @Override
    public double hitungLuas() {
        return Math.PI * this.radius * this.radius;
    }

    // Override method konkrit dari BangunDatar (agar output sesuai)
    @Override
    public void cetakInfo() {
        System.out.println("Ini adalah Lingkaran, Radius: " + this.radius);
    }
}
