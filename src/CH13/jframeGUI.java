package CH13;

import javax.swing.*;

public class jframeGUI extends JFrame{
    jframeGUI(){
        setTitle("ㅎㅇ");


        JButton b = new JButton("버튼");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        add(b);
        setSize(300,100);
        setVisible(true);
    }
    public static void main(String[] args){
//        JFrame jframe = new JFrame("test");

//        jframe.setTitle("Hello GUI");
//        jframe.setSize(300,100);
//        jframe.setVisible(true);
//        jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


//        new MyFrame();
        new jframeGUI();
    }
}

class MyFrame extends JFrame{
    MyFrame(){
        setTitle("ㅎㅇ");
        setSize(300,100);
        setVisible(true);
    }
}