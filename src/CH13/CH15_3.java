package CH13;

import javax.swing.*;
import java.awt.*;

public class CH15_3 extends JFrame {
    public static void main(String[] args){
        new CH15_3();
    }

    CH15_3(){

        JPanel jPanel = new JPanel(new BorderLayout());
        JPanel row1 = new JPanel();


        JLabel text = new JLabel("섭씨");
        JTextField cTemp = new JTextField(10);
        row1.add(text);
        row1.add(cTemp);
        jPanel.add(row1,BorderLayout.NORTH);

        JPanel row2 = new JPanel();
        JLabel text_ = new JLabel("화씨");
        JTextField hTemp = new JTextField(10);
        row2.add(text_);
        row2.add(hTemp);

        JPanel row3 = new JPanel();
        row3.add(new JButton("변환"));
        jPanel.add(row2,BorderLayout.CENTER);
        jPanel.add(row3,BorderLayout.SOUTH);


        add(jPanel);
        setSize(300,140);
        setVisible(true);
    }
}
