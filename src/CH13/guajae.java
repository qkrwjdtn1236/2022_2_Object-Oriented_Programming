package CH13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class guajae extends JFrame {
    JTextField r;
    JTextField m2;
    JTextArea memo;

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
        memo = new JTextArea(30,20);
        memo.setText("원의 넓이를 계산하는 과정이 나오는 곳입니다.");
        memo.setEditable(false);
        p.add(memo);
        add(p,BorderLayout.CENTER);
    }

    void bottom(){

        String[] type = {"Red","Green","Blue"};

        JButton process = new JButton("계산");
        JButton reset = new JButton("리셋");

        // 실습 문제 기다리는 동안 이벤트 예습
        process.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double radius = Double.parseDouble(r.getText());
                m2.setText(String.valueOf(radius*radius*3.14));

                memo.setText(String.valueOf(radius)+" * "+String.valueOf(radius)+
                        " = "+m2.getText());
            }
        });
        JPanel p = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
        p.add(process);
        p.add(new JComboBox<>(type));
        p.add(reset);

        add(p,BorderLayout.SOUTH);
    }
}
