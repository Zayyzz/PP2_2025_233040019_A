package modul07.Tugas;

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
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        tabPane = new JTabbedPane();
        tabPane.addTab("Input Data", createInputPanel());
        tabPane.addTab("Daftar Nilai", createTablePanel());

        add(tabPane);
    }

    private JPanel createInputPanel() {
        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));
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

        JButton btnReset = new JButton("Reset");
        btnReset.addActionListener(e -> {
            tfNama.setText("");
            tfNilai.setText("");
            cbMataKuliah.setSelectedIndex(0);
        });

        panel.add(lblNama);
        panel.add(tfNama);
        panel.add(lblNilai);
        panel.add(tfNilai);
        panel.add(lblMK);
        panel.add(cbMataKuliah);

        panel.add(btnReset);
        panel.add(btnSimpan);

        return panel;
    }

    private JPanel createTablePanel() {
        JPanel panel = new JPanel(new BorderLayout());

        String[] kolom = {"Nama", "Mata Kuliah", "Nilai", "Grade"};
        tableModel = new DefaultTableModel(kolom, 0);
        tableData = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(tableData);

        // Tombol Hapus
        JButton btnHapus = new JButton("Hapus Data");
        btnHapus.addActionListener(e -> {
            int selected = tableData.getSelectedRow();
            if (selected > -1) {
                tableModel.removeRow(selected);
            } else {
                JOptionPane.showMessageDialog(this, "Pilih baris yang ingin dihapus!");
            }
        });

        JPanel southPanel = new JPanel();
        southPanel.add(btnHapus);

        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(southPanel, BorderLayout.SOUTH);

        return panel;
    }

    private void prosesSimpan() {
        String nama = tfNama.getText();
        String strNilai = tfNilai.getText();
        String mk = cbMataKuliah.getSelectedItem().toString();

        // VALIDASI NAMA
        if (nama.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama tidak boleh kosong!");
            return;
        }
        if (nama.trim().length() < 3) {
            JOptionPane.showMessageDialog(this, "Nama minimal 3 karakter!");
            return;
        }

        int nilai;

        // VALIDASI NILAI ANGKA
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

        // GRADE MENGGUNAKAN SWITCH CASE
        String grade;
        int level = (nilai / 10) * 10;  // Membuat range 80-89 jadi 80, 70-79 jadi 70, dll

        switch (level) {
            case 90:
            case 80:
                grade = "A";
                break;
            case 70:
                grade = "B";
                break;
            case 60:
                grade = "C";
                break;
            case 50:
                grade = "D";
                break;
            default:
                grade = "E";
                break;
        }

        tableModel.addRow(new Object[]{nama, mk, nilai, grade});

        JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");

        // Reset form setelah simpan
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

