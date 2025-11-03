package modul03.Latihan1;

public class Siswa {
    private String nama;
    private String kelas;
    private int nis;

    public Siswa(String  nama, String kelas, int nis) {
        this.nama = nama;
        this.kelas = kelas;
        this.nis = nis;
    }

    public void infoSiswa(){
        System.out.println("Nama: " + this.nama + ", Kelas: " + this.kelas + ", Nis: " + this.nis);
    }
}
