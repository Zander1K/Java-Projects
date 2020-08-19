import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SimpleTextApp implements ActionListener {
    private JFrame frame;
    private JTextField textfield;
    private JButton button1;
    private JButton button2;

    public SimpleTextApp(int x, int y) {
        frame = new JFrame("Simple Text App");
        textfield = new JTextField("", 10);
        button1 = new JButton("upper case");
        button2 = new JButton("lower case");

        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.add(textfield);
        frame.add(button1);
        frame.add(button2);

        button1.addActionListener(this);
        button2.addActionListener(this);

        frame.setSize(x, y);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("upper case")){
            textfield.setText(textfield.getText().toUpperCase());
        }
        else if (e.getActionCommand().equals("lower case")){
            textfield.setText(textfield.getText().toLowerCase());
        }
    }

    public static void main(String[] args) {
        SimpleTextApp app = new SimpleTextApp(400, 100);
    }
}