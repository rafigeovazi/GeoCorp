/**
 *
 * @author rafig
 */
import javax.swing.*;
import java.awt.*;
public class Jtextfield2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contoh BorderLayout");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        frame.add(new JButton("Utara"), BorderLayout.NORTH);
        frame.add(new JButton("Selatan"), BorderLayout.SOUTH);
        frame.add(new JButton("Timur"), BorderLayout.EAST);
        frame.add(new JButton("Barat"), BorderLayout.WEST);
        frame.add(new JButton("Tengah"), BorderLayout.CENTER);

        frame.setVisible(true);
    }
}

