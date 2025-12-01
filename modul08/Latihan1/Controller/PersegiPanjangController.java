package modul08.Latihan1.Controller;

import modul08.Latihan1.Model.PersegiPanjangModel;
import modul08.Latihan1.View.PersegiPanjangView;

public class PersegiPanjangController {

    private PersegiPanjangView view;

    public PersegiPanjangController(PersegiPanjangView view) {
        this.view = view;

        this.view.btnHitung.addActionListener(e -> hitungLuas());
        this.view.btnKeliling.addActionListener(e -> hitungKeliling());
        this.view.btnReset.addActionListener(e -> resetInput());


    }

    private void hitungLuas() {
        double panjang = Double.parseDouble(view.txtPanjang.getText());
        double lebar = Double.parseDouble(view.txtLebar.getText());

        PersegiPanjangModel model = new PersegiPanjangModel(panjang, lebar);
        double hasil = model.hitungLuas();

        view.lblHasil.setText("Hasil: " + hasil);
    }

    private void hitungKeliling() {
        double panjang = Double.parseDouble(view.txtPanjang.getText());
        double lebar = Double.parseDouble(view.txtLebar.getText());

        PersegiPanjangModel model = new PersegiPanjangModel(panjang, lebar);
        double hasil = model.hitungKeliling();

        view.lblHasil.setText("Keliling: " + hasil);
    }

    private void resetInput() {
        view.txtPanjang.setText("");
        view.txtLebar.setText("");
        view.lblHasil.setText("Hasil: ");
    }


}