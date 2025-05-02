import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame implements ActionListener{
    private JButton button1 = new JButton("1");
    private JButton button2 = new JButton("2");
    private JButton button3 = new JButton("3");
    private JButton button4 = new JButton("4");
    private JButton button5 = new JButton("5");
    private JButton button6 = new JButton("6");
    private JButton button7 = new JButton("7");
    private JButton button8 = new JButton("8");
    private JButton button9 = new JButton("9");
    private JButton addition = new JButton("+");
    private JButton subtraction = new JButton("-");
    private JButton multiplication = new JButton("x");
    private JButton division = new JButton("/");
    private String labelText = "";


    UI() {
        // Configure frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(350, 475);
        this.setVisible(true);
        this.setTitle("Calculator");
        this.setResizable(false);

        // Add buttons
        addActionListeners(button1, button2, button3, button4, button5, button6, button7, button8, button9, addition, subtraction, multiplication, division);

        button1.setBounds(5, 140, 65, 40);
        this.add(button1);
        button1.setFocusable(false);
        button2.setBounds(80, 140, 65, 40);
        button2.setFocusable(false);
        this.add(button2);
        button3.setBounds(155, 140, 65, 40);
        button3.setFocusable(false);
        this.add(button3);
        button4.setBounds(5, 210, 65, 40);
        this.add(button4);
        button4.setFocusable(false);
        button5.setBounds(80, 210, 65, 40);
        button5.setFocusable(false);
        this.add(button5);
        button6.setBounds(155, 210, 65, 40);
        button6.setFocusable(false);
        this.add(button6);
        button7.setBounds(5, 280, 65, 40);
        this.add(button7);
        button7.setFocusable(false);
        button8.setBounds(80, 280, 65, 40);
        button8.setFocusable(false);
        this.add(button8);
        button9.setBounds(155, 280, 65, 40);
        button9.setFocusable(false);
        this.add(button9);

        addition.setBounds(260, 140, 65, 40);
        addition.setFocusable(false);
        this.add(addition);
        subtraction.setBounds(260, 210, 65, 40);
        subtraction.setFocusable(false);
        this.add(subtraction);
        multiplication.setBounds(260, 280, 65, 40);
        multiplication.setFocusable(false);
        this.add(multiplication);
        division.setBounds(260, 350, 65, 40);
        division.setFocusable(false);
        this.add(division);
    }

    public void addActionListeners(JButton... buttons) {
        for (JButton button: buttons) {
            button.addActionListener(this);
        }
    }

    public static void setVisible(JButton... buttons) {
        for (JButton button: buttons) {
            button.setVisible(true);
        }
    }

    public String getLabelText() {
        return labelText;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == button1) {
           labelText += "1";
       }
       else if (e.getSource() == button2) {
           labelText += "2";
       }
       else if (e.getSource() == button3) {
           labelText += "3";
       }
       else if (e.getSource() == button4) {
           labelText += "4";
       }
       else if (e.getSource() == button5) {
           labelText += "5";
       }
       else if (e.getSource() == button6) {
           labelText += "6";
       }
       else if (e.getSource() == button7) {
           labelText += "7";
       }
       else if (e.getSource() == button8) {
           labelText += "2";
       }
       else if (e.getSource() == button9) {
           labelText += "2";
       }
       else if (e.getSource() == addition) {
           labelText += "+";
       }
       else if (e.getSource() == subtraction) {
           labelText += "-";
       }
       else if (e.getSource() == multiplication) {
           labelText += "x";
       }
       else {
           labelText += "/";
       }
    }
}
