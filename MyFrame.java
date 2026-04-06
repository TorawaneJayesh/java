import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends Frame {

    MyFrame(){

        setSize(300,300);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.out.println("window closed");
                dispose();   // window close karega
            }
        });
    }

    public static void main(String args[]){
        JFrame f = new JFrame("Swing Window");

        JButton b = new JButton("Click Me");
        b.setBounds(100, 100, 100, 40);

        f.add(b);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
