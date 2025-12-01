package modul08.Latihan1.View;

import javax.swing.*;
import java.awt.*;

public class PersegiPanjangView extends JFrame {
    public JTextField txtPanjang;
    public JTextField txtLebar;
    public JButton btnHitung;
    public JButton btnKeliling;
    public JLabel lblHasil;
    public JButton btnReset;




    public PersegiPanjangView() {
        setTitle("Hitung Luas Persegi Panjang");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Panjang:"));
        txtPanjang = new JTextField();
        add(txtPanjang);

        add(new JLabel("Lebar:"));
        txtLebar = new JTextField();
        add(txtLebar);

        btnHitung = new JButton("Hitung");
        add(btnHitung);

        btnKeliling = new JButton("Hitung Keliling");
        add(btnKeliling);

        lblHasil = new JLabel("Hasil: ");
        add(lblHasil);

        btnReset = new JButton("Reset");
        add(btnReset);


        setVisible(true);
    }
}
