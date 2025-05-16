/**
 *
 * @author rafig
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class  Jtextfield_area_button {
    public static void main(String[] args) {
        // frame
        JFrame frame = new JFrame("Contoh JTextField ke JTextArea");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        // JTextField
        JTextField textField = new JTextField();
        textField.setBounds(50, 50, 200, 30);
        
        // JTextArea
        JTextArea textArea = new JTextArea();
        textArea.setBounds(50, 150, 300, 100);
        
        // JButton
        JButton button = new JButton("Tambah Teks");
        button.setBounds(50, 100, 200, 30);
        
        // ActionListener for button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Take a text from JTextField
                String text = textField.getText();
                // Add a text to JTextArea
                textArea.append(text + "\n");
                // Empty the JTextField
                textField.setText("");
            }
        });
        
        // Add componen to frame
        frame.add(textField);
        frame.add(textArea);
        frame.add(button);
        
        
        // Shows frame
        frame.setVisible(true);
    }
}

