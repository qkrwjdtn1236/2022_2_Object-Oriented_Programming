package CH13;

import javax.swing.*;

public class CH15_1 extends JFrame {
    CH15_1(){
        JLabel[] jLabel = {new JLabel("텍스트 문자1"),new JLabel("텍스트 문자2")};
        JButton[] jButtons = {new JButton("버튼 1"),new JButton("버튼 2")};
        JPanel jPanels = new JPanel();

        for(int i = 0;i< jButtons.length;i++){
            jPanels.add(jLabel[i]);
            jPanels.add(jButtons[i]);
        }
        add(jPanels);

        setSize(200,120);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new CH15_1();
    }
}
