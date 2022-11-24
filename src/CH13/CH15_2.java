package CH13;

import javax.swing.*;

public class CH15_2 extends JFrame {
    JButton[] b = {new JButton("Test1"),new JButton("Test2"),
    new JButton("Test3"),new JButton("Test4")};
    CH15_2(){
        setTitle("플로우 레이아웃!");
        JPanel p = new JPanel();
        for(int i = b.length-1;i>=0;i--){
            p.add(b[i]);
        }
        add(p);
        setSize(300,100);
        setVisible(true);
    }

    public static void main(String[] args){
        new CH15_2();
    }
}
