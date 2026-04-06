import javax.swing.*;
import java.util.*;
class Practice{
    public static void main(String args[]){
        JFrame f = new JFrame("Calculator");
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        JButton b = new JButton("click me!");
        b.setBounds(50,50,100,100);
        b.setVisible(true);
        b.setSize(30,30);
        f.add(b);
    }
}