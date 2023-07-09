// package GUI;
// Save file as Guess.java
// guess the number game in java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Guess implements ActionListener
{
    static int number;
    static int chance=100;
    static int number1;
    static String name;
    JFrame frame1;
    JFrame frame2;
    JFrame frame3;
    JFrame frame4;
    JFrame frame5;
    JTextField field1;
    JTextField field2;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;
    JLabel label7;
    JLabel label8;
    JLabel label9;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JProgressBar bar;

    public static void main(String[] args)
    {
        generate();
        Guess s = new Guess();
    }

    Guess()
    {
        label1 = new JLabel();
        label1.setBounds(100,20,200,50);
        label1.setFont(new Font("s",Font.BOLD,20));
        label1.setForeground(Color.green);
        label1.setText("LOGIN PAGE");
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setBorder(BorderFactory.createLineBorder(Color.CYAN,3));

        label2 = new JLabel();
        label2.setBounds(10,75,200,50);
        label2.setFont(new Font("s",Font.BOLD,15));
        label2.setForeground(Color.yellow);
        label2.setText("ENTER YOUR NAME");

        field1 = new JTextField();
        field1.setBounds(10,135,200,25);
        field1.setFont(new Font("s1",Font.ITALIC,20));
        field1.setForeground(Color.black);

        button1 = new JButton();
        button1.setBounds(230,135,50,25);
        button1.setText("ok");
        button1.setFocusable(false);
        button1.addActionListener(this);

        frame1 = new JFrame("GUESS THE NUMBER GAME");
        frame1.setBounds(550,250,400,250);
        frame1.setLayout(null);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.getContentPane().setBackground(Color.black);
        frame1.add(label1);
        frame1.add(label2);
        frame1.add(field1);
        frame1.add(button1);
        frame1.setVisible(true);
    }

    static void generate()
    {
        Random r = new Random();
        number = r.nextInt(100);
    }

    void start()
    {
        if (chance == 0){
            System.exit(0);
        }
        else {
            label3 = new JLabel();
            label3.setBounds(10, 10, 600, 50);
            label3.setFont(new Font("s", Font.BOLD, 25));
            label3.setForeground(Color.yellow);
            label3.setText("ENTER NUMBER YOU GUESSED(0 TO 100)");

            field2 = new JTextField();
            field2.setBounds(20, 70, 100, 25);
            field2.setFont(new Font("s1", Font.ITALIC, 20));
            field2.setForeground(Color.black);

            button2 = new JButton("Guess");
            button2.setForeground(Color.green);
            button2.setFont(new Font("s3", Font.BOLD, 20));
            button2.setBackground(Color.black);
            button2.setBounds(150, 70, 100, 25);
            button2.setFocusable(false);
            button2.addActionListener(this);

            bar = new JProgressBar(0, 100);
            bar.setValue(chance);
            bar.setBounds(20, 120, 500, 50);
            bar.setStringPainted(true);
            bar.setFont(new Font("s", Font.BOLD, 25));
            bar.setForeground(Color.red);
            bar.setBackground(Color.white);

            frame2 = new JFrame("GUESS THE NUMBER GAME");
            frame2.setBounds(400, 250, 600, 300);
            frame2.setLayout(null);
            frame2.add(label3);
            frame2.add(field2);
            frame2.add(button2);
            frame2.add(bar);
            frame2.getContentPane().setBackground(Color.black);
            frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame2.setVisible(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == button1){
            name = field1.getText();
            name = name.toUpperCase();
            frame1.dispose();
            start();
        }
        if (e.getSource() == button2){
            String temp = field2.getText();
            number1 = Integer.parseInt(temp);
            frame2.dispose();
            chance -= 10;
            check();
        }
        if (e.getSource() == button3){
            frame3.dispose();
            start();
        }
        if (e.getSource() == button4){
            frame4.dispose();
            start();
        }
    }

    void check()
    {
        Guess s2 = new Guess();
        if (number1 == number){
            s2.equal();
        }
        else if (number1 < number){
            s2.less();
        }
        else if (number1 > number){
            s2.greater();
        }
    }

    void equal()
    {
        if (chance >= 70) {

            label6 = new JLabel();
            label6.setBounds(10,10,600,30);
            label6.setFont(new Font("s",Font.BOLD,25));
            label6.setForeground(Color.ORANGE);
            label6.setBackground(Color.black);
            label6.setText(name+" YOU ARE HACKER 🗿");

            label7 = new JLabel();
            label7.setBounds(10,50,600,30);
            label7.setFont(new Font("s",Font.ITALIC,20));
            label7.setForeground(Color.white);
            label7.setBackground(Color.black);
            label7.setText("YOU WIN IN VERY LESS ATTEMPT");

            label8 = new JLabel();
            label8.setBounds(10,90,600,30);
            label8.setFont(new Font("s",Font.BOLD,25));
            label8.setForeground(Color.green);
            label8.setBackground(Color.black);
            label8.setText("YOUR REWARD IS $100");

            label9 = new JLabel();
            label9.setBounds(50,140,200,100);
            label9.setLayout(null);

            frame5 = new JFrame();
            frame5.setBounds(400, 250, 600, 300);
            frame5.setLayout(null);
            frame5.add(label6);
            frame5.add(label7);
            frame5.add(label8);
            frame5.add(label9);
            frame5.getContentPane().setBackground(Color.black);
            frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame5.setVisible(true);
        }
        else if (chance >= 50 && chance < 70) {

            label6 = new JLabel();
            label6.setBounds(10,10,400,30);
            label6.setFont(new Font("s",Font.BOLD,25));
            label6.setForeground(Color.ORANGE);
            label6.setBackground(Color.black);
            label6.setText(name+" YOU ARE PRO 😎");

            label7 = new JLabel();
            label7.setBounds(10,50,400,30);
            label7.setFont(new Font("s",Font.ITALIC,20));
            label7.setForeground(Color.white);
            label7.setBackground(Color.black);
            label7.setText("YOU WIN IN LESS ATTEMPT");

            label8 = new JLabel();
            label8.setBounds(10,90,400,30);
            label8.setFont(new Font("s",Font.BOLD,25));
            label8.setForeground(Color.green);
            label8.setBackground(Color.black);
            label8.setText("YOUR REWARD IS $70");

            label9 = new JLabel();
            label9.setBounds(50,140,200,100);
            label9.setLayout(null);

            frame5 = new JFrame();
            frame5.setBounds(400, 250, 600, 300);
            frame5.setLayout(null);
            frame5.add(label6);
            frame5.add(label7);
            frame5.add(label8);
            frame5.add(label9);
            frame5.getContentPane().setBackground(Color.black);
            frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame5.setVisible(true);
        }
        else if (chance >= 20 && chance < 50) {

            label6 = new JLabel();
            label6.setBounds(10,10,400,30);
            label6.setFont(new Font("s",Font.BOLD,25));
            label6.setForeground(Color.ORANGE);
            label6.setBackground(Color.black);
            label6.setText(name+" YOU ARE BEGINNER 😉");

            label7 = new JLabel();
            label7.setBounds(10,50,400,30);
            label7.setFont(new Font("s",Font.ITALIC,20));
            label7.setForeground(Color.white);
            label7.setBackground(Color.black);
            label7.setText("YOU WIN IN MORE ATTEMPT");

            label8 = new JLabel();
            label8.setBounds(10,90,400,30);
            label8.setFont(new Font("s",Font.BOLD,25));
            label8.setForeground(Color.green);
            label8.setBackground(Color.black);
            label8.setText("YOUR REWARD IS $50");

            label9 = new JLabel();
            label9.setBounds(50,140,200,100);
            label9.setLayout(null);

            frame5 = new JFrame();
            frame5.setBounds(400, 250, 600, 300);
            frame5.setLayout(null);
            frame5.add(label6);
            frame5.add(label7);
            frame5.add(label8);
            frame5.add(label9);
            frame5.getContentPane().setBackground(Color.black);
            frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame5.setVisible(true);
        }
        else {

            label6 = new JLabel();
            label6.setBounds(10,10,400,30);
            label6.setFont(new Font("s",Font.BOLD,25));
            label6.setForeground(Color.ORANGE);
            label6.setBackground(Color.black);
            label6.setText(name+" YOU ARE NOOB 😂");

            label7 = new JLabel();
            label7.setBounds(10,50,400,30);
            label7.setFont(new Font("s",Font.ITALIC,20));
            label7.setForeground(Color.white);
            label7.setBackground(Color.black);
            label7.setText("YOU WIN IN MAX ATTEMPTS");

            label8 = new JLabel();
            label8.setBounds(10,90,400,30);
            label8.setFont(new Font("s",Font.BOLD,25));
            label8.setForeground(Color.green);
            label8.setBackground(Color.black);
            label8.setText("YOUR REWARD IS $0");

            label9 = new JLabel();
            label9.setBounds(50,140,200,100);
            label9.setLayout(null);

            frame5 = new JFrame();
            frame5.setBounds(400, 250, 600, 300);
            frame5.setLayout(null);
            frame5.add(label6);
            frame5.add(label7);
            frame5.add(label8);
            frame5.add(label9);
            frame5.getContentPane().setBackground(Color.black);
            frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame5.setVisible(true);
        }
    }

    void less()
    {
        label4 = new JLabel();
        label4.setBounds(10,10,400,50);
        label4.setFont(new Font("s",Font.BOLD,25));
        label4.setForeground(Color.yellow);
        label4.setText("ENTERED NUMBER IS LESS");

        button3 = new JButton("TRY AGAIN");
        button3.setForeground(Color.green);
        button3.setFont(new Font("s3",Font.BOLD,20));
        button3.setBackground(Color.black);
        button3.setBounds(100,70,200,25);
        button3.setFocusable(false);
        button3.addActionListener(this);

        frame3 = new JFrame();
        frame3.setBounds(550,250,400,250);
        frame3.setLayout(null);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.getContentPane().setBackground(Color.black);
        frame3.add(label4);
        frame3.add(button3);
        frame3.setVisible(true);
    }

    void greater()
    {
        label5 = new JLabel();
        label5.setBounds(10, 10, 400, 50);
        label5.setFont(new Font("s", Font.BOLD, 20));
        label5.setForeground(Color.yellow);
        label5.setText("ENTERED NUMBER IS GREATER");

        button4 = new JButton("TRY AGAIN");
        button4.setForeground(Color.green);
        button4.setFont(new Font("s3", Font.BOLD, 20));
        button4.setBackground(Color.black);
        button4.setBounds(100, 70, 200, 25);
        button4.setFocusable(false);
        button4.addActionListener(this);

        frame4 = new JFrame();
        frame4.setBounds(550, 250, 400, 250);
        frame4.setLayout(null);
        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame4.getContentPane().setBackground(Color.black);
        frame4.add(label5);
        frame4.add(button4);
        frame4.setVisible(true);
    }
}
