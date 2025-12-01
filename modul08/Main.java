package modul08;

import modul08.Latihan1.Controller.PersegiPanjangController;
import modul08.Latihan1.View.PersegiPanjangView;

public class Main {
    public static void main(String[] args) {
        PersegiPanjangView view = new PersegiPanjangView();
        new PersegiPanjangController(view);
    }
}