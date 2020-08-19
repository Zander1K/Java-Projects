package packtictac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToe extends JFrame implements ActionListener {

    private JFrame frame;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JPanel panel6;
    private int UserPoint=0; // initial points for User
    private int ComPoint=0;  // initial points for CPU
    private JLabel CPU;
    private JLabel User;
    private JLabel Scoreboard;
    private JButton[][] buttons;  // Buttons for 3x3 Grid
    private JLabel label;
    private JLabel turn;
    private int RemainingMoves = 8;
    private boolean GameOver = false;
    private int NextTurn = 1;
    private JButton PlayAgain;
    private String UserPoints="";
    private String ComPoints;
    private JLabel p1; // User's points
    private JLabel p2; // CPU's points


    public TicTacToe()
    {
        frame = new JFrame("Tic-Tac-Toe");
        panel1 = new JPanel(new GridLayout(3,3));
        panel2 = new JPanel(new GridLayout(3,1));
        panel3 = new JPanel(new GridLayout(3,1));
        panel4 = new JPanel();
        panel5 = new JPanel(new GridLayout(1,2));
        panel5.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
        panel6 = new JPanel(new GridLayout(1,2));
        panel6.setBorder(BorderFactory.createEmptyBorder(0, 70, 0, 0));
        CPU = new JLabel("Computer");
        User = new JLabel("Human");
        Scoreboard = new JLabel("SCORE BOARD");
        p1 = new JLabel("0");
        p2 = new JLabel("0");
        frame.setLayout(new GridLayout(1,2,20,20));


        frame.add(panel1);
        frame.add(panel2);
        panel2.add(panel3);
        panel3.add(panel4);
        panel4.add(Scoreboard);
        panel3.add(panel5);
        panel5.add(User);
        panel5.add(CPU);
        panel6.add(p1);
        panel6.add(p2);
        panel3.add(panel6);


        panel4.setBackground(Color.white);
        panel5.setBackground(Color.white);
        panel6.setBackground(Color.white);

        panel1.setSize(300,300);
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);

        turn = new JLabel("You go first");
        panel2.add(turn);
        turn.setBorder(BorderFactory.createEmptyBorder(0, 95, 0, 0));
        PlayAgain =  new JButton("Play Another Game");
        PlayAgain.addActionListener(this);
        panel2.add(PlayAgain);



    }

    public void GameGrid()
    {
        buttons = new JButton[3][3];
        for(int i = 0; i < 3; i++)
        {
            for(int j=0; j<3; j++)
            {
                buttons[i][j] = new JButton();
                buttons[i][j].setText("");
                panel1.add(buttons[i][j]);
                buttons[i][j].setVisible(true);
                buttons[i][j].addActionListener(this);
                buttons[i][j].setBackground(new Color(255,255,255));
            }
        }
    }

    public void WinChecker(int row, int col) {

        // There are 8 Possible Variations of Winning in TicTacToe which are stated in the 8 main  if statements

        if (buttons[0][2].getText().equals(buttons[1][2].getText()) && buttons[1][2].getText().equals(buttons[2][2].getText()) && buttons[2][2].getText().equals(buttons[0][2].getText()) && buttons[1][2].getText() != "") {
            GameOver = true;
            NextTurn = 0;

            if (buttons[1][2].getText().equals("X")) {
                turn.setText("YOU WIN!");
                UserPoint = UserPoint + 1;
                UserPoints = UserPoint + "";
                p1.setText("" + UserPoints);
            } else if (buttons[1][2].getText().equals("O")) {
                turn.setText("COMPUTER WINS!");
                ComPoint = ComPoint + 1;
                ComPoints = ComPoint + "";
                p2.setText("" + ComPoints);
            }else{
                turn.setText("ITS A DRAW");
                UserPoint = (UserPoint+1)/2;
                UserPoints = UserPoint+"";
                p1.setText(""+UserPoints);
                ComPoint = (ComPoint+1)/2;
                ComPoints = ComPoint+"";
                p1.setText(""+ComPoints);
            }

        }
        if (buttons[0][1].getText().equals(buttons[1][1].getText()) && buttons[1][1].getText().equals(buttons[2][1].getText()) && buttons[2][1].getText().equals(buttons[0][1].getText()) && buttons[1][1].getText() != "") {
            GameOver = true;
            NextTurn = 0;

            if (buttons[1][1].getText().equals("X")) {
                turn.setText("YOU WIN!");
                UserPoint = UserPoint + 1;
                UserPoints = UserPoint + "";
                p1.setText("" + UserPoints);
            } else if (buttons[1][1].getText().equals("O")) {
                turn.setText("COMPUTER WINS!");
                ComPoint = ComPoint + 1;
                ComPoints = ComPoint + "";
                p2.setText("" + ComPoints);
            }else{
                turn.setText("ITS A DRAW");
                UserPoint = (UserPoint+1)/2;
                UserPoints = UserPoint+"";
                p1.setText(""+UserPoints);
                ComPoint = (ComPoint+1)/2;
                ComPoints = ComPoint+"";
                p1.setText(""+ComPoints);
            }

        }
        if (buttons[0][0].getText().equals(buttons[1][0].getText()) && buttons[1][0].getText().equals(buttons[2][0].getText()) && buttons[2][0].getText().equals(buttons[0][0].getText()) && buttons[1][0].getText() != "") {
            GameOver = true;
            NextTurn = 0;

            if (buttons[1][0].getText().equals("X")) {
                turn.setText("YOU WIN!");
                UserPoint = UserPoint + 1;
                UserPoints = UserPoint + "";
                p1.setText("" + UserPoints);
            } else if (buttons[1][0].getText().equals("O")) {
                turn.setText("COMPUTER WINS!");
                ComPoint = ComPoint + 1;
                ComPoints = ComPoint + "";
                p2.setText("" + ComPoints);
            }else{
                turn.setText("ITS A DRAW");
                UserPoint = (UserPoint+1)/2;
                UserPoints = UserPoint+"";
                p1.setText(""+UserPoints);
                ComPoint = (ComPoint+1)/2;
                ComPoints = ComPoint+"";
                p1.setText(""+ComPoints);
            }

        }
        if (buttons[2][0].getText().equals(buttons[2][1].getText()) && buttons[2][1].getText().equals(buttons[2][2].getText()) && buttons[2][2].getText().equals(buttons[2][0].getText()) && buttons[2][1].getText() != "") {
            GameOver = true;
            NextTurn = 0;

            if (buttons[2][1].getText().equals("X")) {
                turn.setText("YOU WIN!");
                UserPoint = UserPoint + 1;
                UserPoints = UserPoint + "";
                p1.setText("" + UserPoints);
            } else if (buttons[2][1].getText().equals("O")) {
                turn.setText("COMPUTER WINS!");
                ComPoint = ComPoint + 1;
                ComPoints = ComPoint + "";
                p2.setText("" + ComPoints);
            }else{
                turn.setText("ITS A DRAW");
                UserPoint = (UserPoint+1)/2;
                UserPoints = UserPoint+"";
                p1.setText(""+UserPoints);
                ComPoint = (ComPoint+1)/2;
                ComPoints = ComPoint+"";
                p1.setText(""+ComPoints);
            }

        }
        if (buttons[1][0].getText().equals(buttons[1][1].getText()) && buttons[1][1].getText().equals(buttons[1][2].getText()) && buttons[1][2].getText().equals(buttons[1][0].getText()) && buttons[1][1].getText() != "") {
            GameOver = true;
            NextTurn = 0;

            if (buttons[1][1].getText().equals("X")) {
                turn.setText("YOU WIN!");
                UserPoint = UserPoint + 1;
                UserPoints = UserPoint + "";
                p1.setText("" + UserPoints);
            } else if (buttons[1][1].getText().equals("O")) {
                turn.setText("COMPUTER WINS!");
                ComPoint = ComPoint + 1;
                ComPoints = ComPoint + "";
                p2.setText("" + ComPoints);
            }else{
                turn.setText("ITS A DRAW");
                UserPoint = (UserPoint+1)/2;
                UserPoints = UserPoint+"";
                p1.setText(""+UserPoints);
                ComPoint = (ComPoint+1)/2;
                ComPoints = ComPoint+"";
                p1.setText(""+ComPoints);
            }

        }
        if (buttons[0][0].getText().equals(buttons[0][1].getText()) && buttons[0][1].getText().equals(buttons[0][2].getText()) && buttons[0][2].getText().equals(buttons[0][0].getText()) && buttons[0][1].getText() != "") {
            GameOver = true;
            NextTurn = 0;

            if (buttons[0][1].getText().equals("X")) {
                turn.setText("YOU WIN!");
                UserPoint = UserPoint + 1;
                UserPoints = UserPoint + "";
                p1.setText("" + UserPoints);
            } else if (buttons[0][1].getText().equals("O")) {
                turn.setText("COMPUTER WINS!");
                ComPoint = ComPoint + 1;
                ComPoints = ComPoint + "";
                p2.setText("" + ComPoints);
            }else{
                turn.setText("ITS A DRAW");
                UserPoint = (UserPoint+1)/2;
                UserPoints = UserPoint+"";
                p1.setText(""+UserPoints);
                ComPoint = (ComPoint+1)/2;
                ComPoints = ComPoint+"";
                p1.setText(""+ComPoints);
            }

        }
        if (buttons[0][0].getText().equals(buttons[1][1].getText()) && buttons[1][1].getText().equals(buttons[2][2].getText()) && buttons[2][2].getText().equals(buttons[0][0].getText()) && buttons[1][1].getText() != "") {
            GameOver = true;
            NextTurn = 0;

            if (buttons[1][1].getText().equals("X")) {
                turn.setText("YOU WIN!");
                UserPoint = UserPoint + 1;
                UserPoints = UserPoint + "";
                p1.setText("" + UserPoints);
            } else if (buttons[1][1].getText().equals("O")) {
                turn.setText("COMPUTER WINS!");
                ComPoint = ComPoint + 1;
                ComPoints = ComPoint + "";
                p2.setText("" + ComPoints);
            }else{
                turn.setText("ITS A DRAW");
                UserPoint = (UserPoint+1)/2;
                UserPoints = UserPoint+"";
                p1.setText(""+UserPoints);
                ComPoint = (ComPoint+1)/2;
                ComPoints = ComPoint+"";
                p1.setText(""+ComPoints);
            }

        }
        if (buttons[0][2].getText().equals(buttons[1][1].getText()) && buttons[1][1].getText().equals(buttons[2][0].getText()) && buttons[2][0].getText().equals(buttons[0][2].getText()) && buttons[1][1].getText() != "") {
            GameOver = true;
            NextTurn = 0;

            if (buttons[1][1].getText().equals("X")) {
                turn.setText("YOU WIN!");
                UserPoint = UserPoint + 1;
                UserPoints = UserPoint + "";
                p1.setText("" + UserPoints);
            } else if (buttons[1][1].getText().equals("O")) {
                turn.setText("COMPUTER WINS!");
                ComPoint = ComPoint + 1;
                ComPoints = ComPoint + "";
                p2.setText("" + ComPoints);
            }else{
                turn.setText("ITS A DRAW");
                UserPoint = (UserPoint+1)/2;
                UserPoints = UserPoint+"";
                p1.setText(""+UserPoints);
                ComPoint = (ComPoint+1)/2;
                ComPoints = ComPoint+"";
                p1.setText(""+ComPoints);
            }
            }
        }

    public void CompStrategy(int count)
            // If User is about to Win, CPU will block the User from winning
    {
        if (buttons[0][0].getText().equals(buttons[0][1].getText()) && buttons[0][2].getText().equals("")) {
            buttons[0][2].setText("O");
            buttons[0][2].setEnabled(false);
            RemainingMoves--;
            NextTurn = 1;
            WinChecker(0, 2);
        } else if (buttons[1][0].getText().equals(buttons[1][1].getText()) && buttons[1][2].getText().equals("")) {
            buttons[1][2].setText("O");
            buttons[1][2].setEnabled(false);
            RemainingMoves--;
            NextTurn = 1;
            WinChecker(1, 2);
        } else if (buttons[2][0].getText().equals(buttons[2][1].getText()) && buttons[2][2].getText().equals("")) {
            buttons[2][2].setText("O");
            buttons[2][2].setEnabled(false);
            RemainingMoves--;
            NextTurn = 1;
            WinChecker(2, 2);
        } else if (buttons[0][1].getText().equals(buttons[0][2].getText()) && buttons[0][0].getText().equals("")) {
            buttons[0][0].setText("O");
            buttons[0][0].setEnabled(false);
            RemainingMoves--;
            NextTurn = 1;
            WinChecker(0, 0);
        } else if (buttons[1][1].getText().equals(buttons[1][2].getText()) && buttons[1][0].getText().equals("")) {
            buttons[1][0].setText("O");
            buttons[1][0].setEnabled(false);
            RemainingMoves--;
            NextTurn = 1;
            WinChecker(1, 0);
        } else if (buttons[2][1].getText().equals(buttons[2][2].getText()) && buttons[2][0].getText().equals("")) {
            buttons[2][0].setText("O");
            buttons[2][0].setEnabled(false);
            RemainingMoves--;
            NextTurn = 1;
            WinChecker(2, 0);
        } else if (buttons[0][0].getText().equals(buttons[0][2].getText()) && buttons[0][1].getText().equals("")) {
            buttons[0][1].setText("O");
            buttons[0][1].setEnabled(false);
            RemainingMoves--;
            NextTurn = 1;
            WinChecker(0, 1);
        } else if (buttons[0][0].getText().equals(buttons[0][2].getText()) && buttons[0][1].getText().equals("")) {
            buttons[0][2].setText("O");
            buttons[0][2].setEnabled(false);
            RemainingMoves--;
            NextTurn = 1;
            WinChecker(0, 2);
        } else if (buttons[1][0].getText().equals(buttons[1][2].getText()) && buttons[1][1].getText().equals("")) {
            buttons[1][1].setText("O");
            buttons[1][1].setEnabled(false);
            RemainingMoves--;
            NextTurn = 1;
            WinChecker(1, 1);
        } else if (buttons[2][0].getText().equals(buttons[2][2].getText()) && buttons[2][1].getText().equals("")) {
            buttons[2][1].setText("O");
            buttons[2][1].setEnabled(false);
            RemainingMoves--;
            NextTurn = 1;
            WinChecker(2, 1);
        }else if (buttons[0][0].getText().equals(buttons[0][1].getText()) && buttons[0][2].getText().equals("")) {
            buttons[0][2].setText("O");
            buttons[0][2].setEnabled(false);
            RemainingMoves--;
            NextTurn = 1;
            WinChecker(0, 2);
        }else if (buttons[1][0].getText().equals(buttons[1][1].getText()) && buttons[1][2].getText().equals("")) {
            buttons[1][2].setText("O");
            buttons[1][2].setEnabled(false);
            RemainingMoves--;
            NextTurn = 1;
            WinChecker(1, 2);
        }else if (buttons[2][0].getText().equals(buttons[2][1].getText()) && buttons[2][2].getText().equals("")) {
            buttons[2][2].setText("O");
            buttons[2][2].setEnabled(false);
            RemainingMoves--;
            NextTurn = 1;
            WinChecker(2, 2);
        }else if (buttons[0][2].getText().equals(buttons[0][1].getText()) && buttons[0][0].getText().equals("")) {
            buttons[0][0].setText("O");
            buttons[0][0].setEnabled(false);
            RemainingMoves--;
            NextTurn = 1;
            WinChecker(0, 0);
        }else if (buttons[1][2].getText().equals(buttons[1][1].getText()) && buttons[1][0].getText().equals("")) {
            buttons[1][0].setText("O");
            buttons[1][0].setEnabled(false);
            RemainingMoves--;
            NextTurn = 1;
            WinChecker(1, 0);
        }else if (buttons[2][2].getText().equals(buttons[2][1].getText()) && buttons[2][0].getText().equals("")) {
            buttons[2][0].setText("O");
            buttons[2][0].setEnabled(false);
            RemainingMoves--;
            NextTurn = 1;
            WinChecker(2, 0);
        }else if (buttons[2][0].getText().equals(buttons[0][0].getText()) && buttons[1][0].getText().equals("")) {
            buttons[1][0].setText("O");
            buttons[1][0].setEnabled(false);
            RemainingMoves--;
            NextTurn = 1;
            WinChecker(1, 0);
        }else if (buttons[2][1].getText().equals(buttons[0][1].getText()) && buttons[1][1].getText().equals("")) {
            buttons[1][1].setText("O");
            buttons[1][1].setEnabled(false);
            RemainingMoves--;
            NextTurn = 1;
            WinChecker(1, 1);
        }else if (buttons[2][2].getText().equals(buttons[0][2].getText()) && buttons[1][2].getText().equals("")) {
            buttons[1][2].setText("O");
            buttons[1][2].setEnabled(false);
            RemainingMoves--;
            NextTurn = 1;
            WinChecker(1, 2);
        } else if(buttons[0][0].getText().equals(buttons[1][1].getText()) && buttons[2][2].getText().equals("")) {
            buttons[2][2].setText("O");
            buttons[2][2].setEnabled(false);
            RemainingMoves--;
            NextTurn = 1;
            WinChecker(2, 2);
        }else if(buttons[0][2].getText().equals(buttons[1][1].getText()) && buttons[2][0].getText().equals("")) {
            buttons[2][0].setText("O");
            buttons[2][0].setEnabled(false);
            RemainingMoves--;
            NextTurn = 1;
            WinChecker(2, 0);
        }else if(buttons[0][0].getText().equals(buttons[1][1].getText()) && buttons[2][2].getText().equals("")) {
            buttons[2][2].setText("O");
            buttons[2][2].setEnabled(false);
            RemainingMoves--;
            NextTurn = 1;
            WinChecker(2, 2);
        }else if(buttons[2][2].getText().equals(buttons[1][1].getText()) && buttons[0][0].getText().equals("")) {
            buttons[0][0].setText("O");
            buttons[0][0].setEnabled(false);
            RemainingMoves--;
            NextTurn = 1;
            WinChecker(0, 0);
        }else if(buttons[0][0].getText().equals(buttons[2][2].getText()) && buttons[1][1].getText().equals("")) {
            buttons[1][1].setText("O");
            buttons[1][1].setEnabled(false);
            RemainingMoves--;
            NextTurn = 1;
            WinChecker(1, 1);
        }else if(buttons[0][2].getText().equals(buttons[2][0].getText()) && buttons[1][1].getText().equals("")) {
            buttons[1][1].setText("O");
            buttons[1][1].setEnabled(false);
            RemainingMoves--;
            NextTurn = 1;
            WinChecker(1, 1);
        }else{
// If the CPU cannot see a possible of the user winning, it will jsut make a random move
            int randommove = count;
            Random num = new Random();
            randommove = num.nextInt(randommove) + 1;

            while (GameOver == false & NextTurn == 2) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (buttons[i][j].isEnabled() == true) {
                            randommove--;

                            if (randommove == 0) {
                                buttons[i][j].setText("O");
                                buttons[i][j].setEnabled(false);
                                RemainingMoves--;
                                NextTurn = 1;
                                WinChecker(i, j);

                            }

                        }

                    }
                }
            }

        }
    }


        public void actionPerformed (ActionEvent e)
        {
            if (e.getSource() == PlayAgain) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        GameOver = false;
                        buttons[i][j].setText("");
                        buttons[i][j].setEnabled(true);
                        RemainingMoves = 8;
                        NextTurn = 1;
                        turn.setText("You go first");

                    }
                }
            }

            if (GameOver == false) {
                if (e.getSource() == buttons[0][0]) {
                    buttons[0][0].setText("X");
                    buttons[0][0].setEnabled(false);
                    NextTurn = 2;
                    --RemainingMoves;
                    CompStrategy(RemainingMoves);
                    WinChecker(0, 0);


                } else if (e.getSource() == buttons[0][1]) {
                    buttons[0][1].setText("X");
                    buttons[0][1].setEnabled(false);
                    NextTurn = 2;
                    --RemainingMoves;
                    CompStrategy(RemainingMoves);
                    WinChecker(0, 1);
                } else if (e.getSource() == buttons[1][0]) {
                    buttons[1][0].setText("X");
                    buttons[1][0].setEnabled(false);
                    NextTurn = 2;
                    --RemainingMoves;
                    CompStrategy(RemainingMoves);
                    WinChecker(1, 0);

                } else if (e.getSource() == buttons[1][1]) {
                    buttons[1][1].setText("X");
                    buttons[1][1].setEnabled(false);
                    NextTurn = 2;
                    --RemainingMoves;
                    CompStrategy(RemainingMoves);
                    WinChecker(1, 1);

                } else if (e.getSource() == buttons[1][2]) {
                    buttons[1][2].setText("X");
                    buttons[1][2].setEnabled(false);
                    NextTurn = 2;
                    --RemainingMoves;
                    CompStrategy(RemainingMoves);
                    WinChecker(1, 2);

                } else if (e.getSource() == buttons[2][2]) {
                    buttons[2][2].setText("X");
                    buttons[2][2].setEnabled(false);
                    NextTurn = 2;
                    --RemainingMoves;
                    CompStrategy(RemainingMoves);
                    WinChecker(2, 2);

                } else if (e.getSource() == buttons[0][2]) {
                    buttons[0][2].setText("X");
                    buttons[0][2].setEnabled(false);
                    NextTurn = 2;
                    --RemainingMoves;
                    CompStrategy(RemainingMoves);
                    WinChecker(0, 2);

                } else if (e.getSource() == buttons[2][1]) {
                    buttons[2][1].setText("X");
                    buttons[2][1].setEnabled(false);
                    NextTurn = 2;
                    --RemainingMoves;
                    CompStrategy(RemainingMoves);
                    WinChecker(2, 1);

                } else if (e.getSource() == buttons[2][0]) {
                    buttons[2][0].setText("X");
                    buttons[2][0].setEnabled(false);
                    NextTurn = 2;
                    --RemainingMoves;
                    CompStrategy(RemainingMoves);
                    WinChecker(2, 0);

                }


            }
        }


    public static void main(String args[])
    {
        TicTacToe app = new TicTacToe();
        app.GameGrid();
    }
}