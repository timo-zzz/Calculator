import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI implements ActionListener {
    private JButton button1 = new JButton("1");
    private JButton button2 = new JButton("2");
    private JButton button3 = new JButton("3");
    private JButton button4 = new JButton("4");
    private JButton button5 = new JButton("5");
    private JButton button6 = new JButton("6");
    private JButton button7 = new JButton("7");
    private JButton button8 = new JButton("8");
    private JButton button9 = new JButton("9");
    private String labelText = "";


    public UI() {
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(300, 200, 300, 200));
        panel.setLayout(new GridLayout(0, 1));

        JFrame frame = new JFrame();
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");
        frame.pack();
        frame.setVisible(true);
        setVisible(button1, button2, button3, button4, button5, button6, button7, button8, button9);
        addActionListeners(button1, button2, button3, button4, button5, button6, button7, button8, button9);
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
       /*switch (e.getSource()) {
            case button1:


        }*/
    }
}
