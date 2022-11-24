package CH13;

import javax.swing.*;
import java.awt.*;

public class guajae extends JFrame {
    JTextField r;
    JTextField m2;


    public static void main(String[] args){
        new guajae();
    }

    guajae(){
        setLayout(new BorderLayout());
        top();
        middle();
        bottom();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,400);
        setVisible(true);
    }

    void top(){

        r = new JTextField(10);
        m2 = new JTextField(10);

        JLabel rlabel = new JLabel("원의 반지름");
        JLabel m2label = new JLabel("원의 넓이");

        JPanel panel1 = new JPanel();
        panel1.add(rlabel);
        panel1.add(r);

        JPanel panel2 = new JPanel();
        panel2.add(m2label);
        panel2.add(m2);

        JPanel main = new JPanel(new BorderLayout());
        main.add(panel1,BorderLayout.NORTH);
        main.add(panel2,BorderLayout.SOUTH);

        add(main,BorderLayout.NORTH);
    }

    void middle(){
        JPanel p = new JPanel();
        JTextArea memo = new JTextArea(30,20);
        memo.setText("원의 넓이를 계산하는 과정이 나오는 곳입니다.");
        memo.setEditable(false);
        p.add(memo);
        add(p,BorderLayout.CENTER);
    }

    void bottom(){

        String[] type = {"a","b","c","d","e"};
        JPanel p = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
        p.add(new JButton("계산"));
        p.add(new JComboBox<>(type));
        p.add(new JButton("리셋"));

        add(p,BorderLayout.SOUTH);
    }

}
