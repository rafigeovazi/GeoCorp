/**
 *
 * @author rafig
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class  Jtextfield_area_button {
    public static void main(String[] args) {
        // Membuat frame
        JFrame frame = new JFrame("Contoh JTextField ke JTextArea");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        // Membuat JTextField
        JTextField textField = new JTextField();
        textField.setBounds(50, 50, 200, 30);
        
        // Membuat JTextArea
        JTextArea textArea = new JTextArea();
        textArea.setBounds(50, 150, 300, 100);
        
        // Membuat JButton
        JButton button = new JButton("Tambah Teks");
        button.setBounds(50, 100, 200, 30);
        
        // Menambahkan ActionListener untuk tombol
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mengambil teks dari JTextField
                String text = textField.getText();
                // Menambahkan teks ke JTextArea
                textArea.append(text + "\n");
                // Mengosongkan JTextField
                textField.setText("");
            }
        });
        
        // Menambahkan komponen ke frame
        frame.add(textField);
        frame.add(textArea);
        frame.add(button);
        
        
        // Menampilkan frame
        frame.setVisible(true);
    }
}

