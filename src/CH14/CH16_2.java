package CH14;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CH16_2 extends JFrame {
    public static void main(String[] args){
        new CH16_2();
    }
    CH16_2(){
        setLayout(new BorderLayout());
        JTextField sTextField = new JTextField(10);
        JLabel sLabel = new JLabel("¼·¾¾");
        JButton jButton = new JButton("º¯È¯");


        JTextField hTextField = new JTextField(10);
        JLabel hLabel = new JLabel("È­¾¾");
        hTextField.setEnabled(false);
        JPanel p1 = new JPanel();
        p1.add(sLabel);
        p1.add(sTextField);
        add(p1,BorderLayout.NORTH);
        JPanel p2 = new JPanel();
        p2.add(hLabel);
        p2.add(hTextField);
        add(p2,BorderLayout.CENTER);
        jButton.addActionListener(e->{
            if(sTextField.getText().isEmpty()){
                hTextField.setText("????????");
            }else{
                hTextField.setText(String.valueOf(Double.parseDouble(sTextField.getText())*9/5+32));
            }
        });
        add(jButton,BorderLayout.SOUTH);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
