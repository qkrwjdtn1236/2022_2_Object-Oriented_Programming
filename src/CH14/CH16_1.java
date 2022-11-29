package CH14;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CH16_1 extends JFrame {
    public static void main(String[] args){
        new CH16_1();
    }

    CH16_1(){
        JTextField jTextField = new JTextField(30);
        JLabel jLabel = new JLabel("버튼 누르기 전");
        JButton jButton = new JButton("Action");

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText(jTextField.getText());
            }
        });
        setLayout(new BorderLayout());
        add(jTextField,BorderLayout.NORTH);
        add(jLabel,BorderLayout.CENTER);
        add(jButton,BorderLayout.SOUTH);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
