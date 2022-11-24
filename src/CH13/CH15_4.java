package CH13;

import javax.swing.*;
import java.awt.*;

public class CH15_4 extends JFrame {
    public static void main(String[] args){
        new CH15_4();
    }

    CH15_4(){
        setTitle("hi");
        setLayout(new GridLayout(2,1));
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

        p1.add(new JLabel("테스트1"));
        p1.add(new JButton("버튼1"));

        p2.add(new JLabel("테스트2"));
        p2.add(new JButton("버튼2"));

        add(p1);
        add(p2);
        setSize(400,150);
        setVisible(true);
    }
}
