package modul07.Latihan1;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ManajemenNilaiSiswaApp extends JFrame {

    private JTextField tfNama;
    private JTextField tfNilai;
    private JComboBox<String> cbMataKuliah;

    private JTable tableData;
    private DefaultTableModel tableModel;

    private JTabbedPane tabPane;

    public ManajemenNilaiSiswaApp() {
        super("Manajemen Nilai Siswa");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        tabPane = new JTabbedPane();
        tabPane.addTab("Input Data", createInputPanel());
        tabPane.addTab("Daftar Nilai", createTablePanel());

        add(tabPane);
    }

    private JPanel createInputPanel() {
        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel lblNama = new JLabel("Nama Siswa:");
        tfNama = new JTextField();

        JLabel lblNilai = new JLabel("Nilai:");
        tfNilai = new JTextField();

        JLabel lblMK = new JLabel("Mata Kuliah:");
        cbMataKuliah = new JComboBox<>(new String[]{
                "Pemrograman II",
                "Basis Data",
                "Jaringan Komputer",
                "Struktur Data"
        });

        JButton btnSimpan = new JButton("Simpan Data");
        btnSimpan.addActionListener(e -> prosesSimpan());

        panel.add(lblNama);
        panel.add(tfNama);
        panel.add(lblNilai);
        panel.add(tfNilai);
        panel.add(lblMK);
        panel.add(cbMataKuliah);
        panel.add(new JLabel());
        panel.add(btnSimpan);

        return panel;
    }

    private JPanel createTablePanel() {
        JPanel panel = new JPanel(new BorderLayout());

        String[] kolom = {"Nama", "Mata Kuliah", "Nilai", "Grade"};
        tableModel = new DefaultTableModel(kolom, 0);
        tableData = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(tableData);

        panel.add(scrollPane, BorderLayout.CENTER);

        return panel;
    }

    private void prosesSimpan() {
        String nama = tfNama.getText();
        String strNilai = tfNilai.getText();
        String mk = cbMataKuliah.getSelectedItem().toString();

        if (nama.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama tidak boleh kosong!");
            return;
        }

        int nilai;

        try {
            nilai = Integer.parseInt(strNilai);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Nilai harus berupa angka!");
            return;
        }

        if (nilai < 0 || nilai > 100) {
            JOptionPane.showMessageDialog(this, "Nilai harus 0-100!");
            return;
        }

        String grade;
        if (nilai >= 85) grade = "A";
        else if (nilai >= 70) grade = "B";
        else if (nilai >= 55) grade = "C";
        else if (nilai >= 40) grade = "D";
        else grade = "E";

        tableModel.addRow(new Object[]{nama, mk, nilai, grade});

        JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");

        tfNama.setText("");
        tfNilai.setText("");
        cbMataKuliah.setSelectedIndex(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ManajemenNilaiSiswaApp().setVisible(true);
        });
    }
}
