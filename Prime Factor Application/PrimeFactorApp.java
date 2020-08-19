import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.NumberFormatException;

public class PrimeFactorApp implements ActionListener {

    private JFrame frame;
    private JLabel label1;
    private JLabel label2;
    private JTextField textfield;
    private JButton button1;

    public PrimeFactorApp() {
        frame = new JFrame("Factoring App");
        label1 = new JLabel("Enter a number to factorize");
        label2 = new JLabel(" ");
        textfield = new JTextField("", 40);
        button1 = new JButton("Find Prime Factorization");

        frame.add(textfield);
        frame.add(label1);
        frame.add(label2);
        frame.add(button1);
        frame.setSize(600, 400);
        frame.setLayout(new GridLayout(5, 1, 20, 20));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);

        button1.addActionListener(this);
    }

    public static boolean exepection(String t) {
        boolean ans = false;
        try {
            Long.parseLong(t);
            ans = true;
        } catch (NumberFormatException et) {
        }
        return ans;
    }


    public void actionPerformed(ActionEvent e) {
        boolean exep = exepection(textfield.getText());
        if (exep && Long.parseLong(textfield.getText()) > 999999999) {
            label2.setText("Input number can be no longer than 999999999");
        }else if (exep && Long.parseLong(textfield.getText()) > 0){
                long num = Long.parseLong(textfield.getText());
                prime(num);
            }else{
                label2.setText("Invalid input");
            }
        }

        public void prime ( long number){
            long input = Long.parseLong(textfield.getText());
            number = Long.parseLong(textfield.getText());
            String output = "";
            for (int i = 2; i < number; i++) {
                while (number % i == 0) {
                    number = number / i;
                    output += (i + "x");
                }
            }
            label2.setText("The prime factorization of " + input + " is " + output + number);
        }

        public static void main (String args[]){
            PrimeFactorApp app = new PrimeFactorApp();
        }
    }
