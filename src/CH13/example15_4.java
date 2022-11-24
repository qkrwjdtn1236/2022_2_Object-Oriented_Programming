package CH13;

import javax.swing.*;
import java.awt.*;

public class example15_4 extends JFrame {
    public static void main(String[] args){
        new example15_4();
    }
    example15_4(){
        setLayout(new FlowLayout());
        String[] type = {"red","green","blue"};

        add(new JLabel("색상 선택"));
        add(new JComboBox<>(type));

        setSize(200,100);
        setVisible(true);
    }
}
