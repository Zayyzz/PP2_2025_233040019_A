package modul03.Latihan2;

public class ProgramBuku {

    public static void main(String[] args) {

        Buku buku1 = new Buku("Atomic Habits", "James Clear", 288);

        System.out.println("--- Tes Awal ---");
        buku1.getInfoBuku();
        System.out.println("Jumlah halaman awal: " + buku1.getHalaman());
        System.out.println("\n--- Tes Setter (Valid) ---");
        buku1.setHalaman(300);
        System.out.println("Jumlah halaman sekarang: " + buku1.getHalaman());
        System.out.println("\n--- Tes Setter (Invalid) ---");
        buku1.setHalaman(-50);
        System.out.println("Jumlah halaman setelah percobaan invalid: " + buku1.getHalaman());
        System.out.println("\n--- Tes Akses Langsung (Pasti Error) ---");
        System.out.println("Mencoba 'buku1.jumlahHalaman' akan gagal kompilasi karena");
        System.out.println("'jumlahHalaman' memiliki akses private di kelas Buku.");
    }
}