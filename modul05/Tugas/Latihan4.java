package modul05.Tugas;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Latihan4 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Contoh BorderLayout");
                frame.setSize(400, 300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // 1. Atur Layout Manager ke BorderLayout
                frame.setLayout(new BorderLayout());

                // 2. Buat semua komponen dan simpan dalam variabel
                JLabel label = new JLabel("Label ada di Atas (NORTH)");
                JButton buttonSouth = new JButton("Tombol ada di Bawah (SOUTH)");
                JButton buttonWest = new JButton("WEST");
                JButton buttonEast = new JButton("EAST");
                JButton buttonCenter = new JButton("CENTER");

                // 3. Tambahkan Aksi (ActionListener) ke semua tombol
                buttonSouth.addActionListener(e -> {
                    label.setText("Tombol SOUTH diklik");
                });
                buttonWest.addActionListener(e -> {
                    label.setText("Tombol WEST diklik");
                });
                buttonEast.addActionListener(e -> {
                    label.setText("Tombol EAST diklik");
                });
                buttonCenter.addActionListener(e -> {
                    label.setText("Tombol CENTER diklik");
                });

                // 4. Tambahkan komponen ke frame DENGAN POSISI
                frame.add(label, BorderLayout.NORTH);
                frame.add(buttonSouth, BorderLayout.SOUTH);
                frame.add(buttonWest, BorderLayout.WEST);
                frame.add(buttonEast, BorderLayout.EAST);
                frame.add(buttonCenter, BorderLayout.CENTER);
                frame.setVisible(true);
            }
        });
    }
}