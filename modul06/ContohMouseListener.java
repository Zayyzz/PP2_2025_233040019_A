package modul06;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ContohMouseListener {
    public static void main(String[] args) {
        // 1. Membuat frame utama
        JFrame frame = new JFrame("Contoh MouseListener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        // 2. Buat komponen (Event Source)
        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setPreferredSize(new Dimension(200, 200));

        // 3. Buat Event Listener (menggunakan MouseAdapter)
        MouseAdapter adapter = new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Saat mouse masuk, ubah warna jadi biru
                panel.setBackground(Color.CYAN);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Saat mouse keluar, kembalikan warna semula
                panel.setBackground(Color.LIGHT_GRAY);
            }
        };

        // 4. Tambahkan event listener ke panel
        panel.addMouseListener(adapter);

        // 5. Tambahkan panel ke frame
        frame.add(panel);

        // 6. Tampilkan frame
        frame.setVisible(true);
    }
}