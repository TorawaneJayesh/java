import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator implements ActionListener {

    JFrame f;
    JTextField tf;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
    JButton add, sub, mul, div, equal, clear;

    double num1, num2, result;
    char operator;

    Calculator() {

        f = new JFrame("Calculator");

        tf = new JTextField();
        tf.setBounds(30, 40, 240, 30);

        // Number buttons
        b1 = new JButton("1"); b2 = new JButton("2"); b3 = new JButton("3");
        b4 = new JButton("4"); b5 = new JButton("5"); b6 = new JButton("6");
        b7 = new JButton("7"); b8 = new JButton("8"); b9 = new JButton("9");
        b0 = new JButton("0");

        // Operator buttons
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        equal = new JButton("=");
        clear = new JButton("C");

        // Set bounds
        int x = 30, y = 80;

        JButton[] num = {b7,b8,b9,b4,b5,b6,b1,b2,b3,b0};

        for(int i=0;i<10;i++){
            num[i].setBounds(x, y, 50, 40);
            f.add(num[i]);
            num[i].addActionListener(this);
            x += 60;

            if((i+1)%3==0){
                x = 30;
                y += 50;
            }
        }

        b0.setBounds(30, y, 50, 40);

        add.setBounds(210, 80, 60, 40);
        sub.setBounds(210, 130, 60, 40);
        mul.setBounds(210, 180, 60, 40);
        div.setBounds(210, 230, 60, 40);
        equal.setBounds(90, y, 80, 40);
        clear.setBounds(180, y, 80, 40);

        JButton[] ops = {add, sub, mul, div, equal, clear};

        for(JButton b : ops){
            f.add(b);
            b.addActionListener(this);
        }

        f.add(tf);
        f.setSize(320, 350);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String s = e.getActionCommand();

        if(s.charAt(0) >= '0' && s.charAt(0) <= '9') {
            tf.setText(tf.getText() + s);
        }
        else if(s.equals("C")) {
            tf.setText("");
        }
        else if(s.equals("=")) {

            num2 = Double.parseDouble(tf.getText());

            switch(operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
            }

            tf.setText("" + result);
        }
        else {
            num1 = Double.parseDouble(tf.getText());
            operator = s.charAt(0);
            tf.setText("");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}