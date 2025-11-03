package modul03.Latihan2;

public class Buku {
    private String judul;
    private String penulis;
    private int jumlahHalaman;

    public Buku(String judul, String penulis, int jumlahHalaman) {
        this.judul = judul;
        this.penulis = penulis;
        if (jumlahHalaman > 0) {
            this.jumlahHalaman = jumlahHalaman;
        } else {
            this.jumlahHalaman = 1;
            System.out.println("Peringatan: Jumlah halaman awal tidak valid, diatur ke 1.");
        }
    }

    public void getInfoBuku() {
        System.out.println("Judul: " + this.judul + ", Penulis: " + this.penulis);
    }

    public int getHalaman() {
        return this.jumlahHalaman;
    }

    public void setHalaman(int halamanBaru) {
        if (halamanBaru > 0) {
            this.jumlahHalaman = halamanBaru;
            System.out.println("INFO: Jumlah halaman berhasil diubah menjadi " + this.jumlahHalaman);
        } else {
            System.out.println("ERROR: Jumlah halaman harus lebih besar dari 0.");
        }
    }
}