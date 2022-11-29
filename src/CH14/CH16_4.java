package CH14;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CH16_4 extends JFrame {
    public static void main(String[] args){
        new CH16_4();
    }

    CH16_4(){
        setLayout(null);
        JPanel jPanel = new JPanel();
        JLabel jLabel = new JLabel("hello");
        setSize(200,200);
        setVisible(true);

        jPanel.add(jLabel);
        jLabel.setLocation(50,50);
        jPanel.addMouseListener(new MouseInputListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }

            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println(e.getX()+" " + e.getY());
                jLabel.setLocation(e.getX(),e.getY());
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        } );
        add(jPanel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
}
