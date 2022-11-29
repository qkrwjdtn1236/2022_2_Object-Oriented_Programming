package CH14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CH16_3 extends JFrame {
    public static void main(String[] args){
        new CH16_3();
    }

    CH16_3(){
        JButton jButton = new JButton("Moue Event 테스트 버튼");

        jButton.setBackground(Color.yellow);

        jButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JButton eventButton = (JButton) e.getSource();

                eventButton.setBackground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent e) {

                JButton eventButton = (JButton) e.getSource();

                eventButton.setBackground(Color.yellow);

            }
        });
        add(jButton);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
