package modul08.Latihan1.Model;

public class PersegiPanjangModel {
    private double panjang;
    private double lebar;

    public PersegiPanjangModel(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

}
