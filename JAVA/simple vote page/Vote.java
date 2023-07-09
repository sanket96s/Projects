// package GUI;
// save file as Vote.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Vote implements ActionListener {

    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JFrame frame = new JFrame();
    
    static int cand1 = 0, cand2 = 0, cand3 = 0, cand4 = 0, cand5 = 0;
    static int [] voted;
    static int [] validid;
    static int a1, k = -1, i = 1;

    public static void main(String[] args) {

        String n1 = JOptionPane.showInputDialog("ENTER THE NUMBER OF VOTERS ?");
        a1 = Integer.parseInt(n1);
        String[] id = new String[a1];
        voted = new int[a1];
        validid = new int[a1];
        for (int j = 0; j < a1; j++) {
            voted[j] = 0;
            validid[j]=j+1;
        }
        vote();
    }

    static void vote() {

        Vote s = new Vote();
        int id = -1;
        if (i > a1) {
            JOptionPane.showMessageDialog(null, "VOTE LIMIT FINISHED", "MESSAGE", JOptionPane.ERROR_MESSAGE);
            int confirm = JOptionPane.showConfirmDialog(null, "DO YOU WANT TO SEE RESULT", "OPERATION",
                    JOptionPane.YES_NO_OPTION);
            if (confirm == 0){
                s.result();
            }
            else {
                vote();
            }
        }
        else if(i<=a1){
            int confirm = JOptionPane.showConfirmDialog(null, "DO YOU WANT TO VOTE", "OPERATION",
                    JOptionPane.YES_NO_OPTION);
            if (confirm == 0){
            String n2 = JOptionPane.showInputDialog("ENTER THE UNIQUE ID ?");
            id = Integer.parseInt(n2);
            voteconsole(id);
            }
            else{
                int result = JOptionPane.showConfirmDialog(null, "DO YOU WANT TO SEE RESULT", "OPERATION",
                        JOptionPane.YES_NO_OPTION);
                if (result == 0){
                    i=a1+10;
                    s.result();
                }
                else {
                    vote();
                }
            }
        }
    }

    static void voteconsole(int id){
        Vote s = new Vote();
        if (checkvoted(voted, a1, id)) {
            JOptionPane.showMessageDialog(null, "SORRY! YOU HAVE VOTED", "MESSAGE", JOptionPane.ERROR_MESSAGE);
            vote();
        }
        else if (!checkvalidid(validid,a1,id)){
            JOptionPane.showMessageDialog(null, "SORRY! YOU ENTERED INVALID ID", "MESSAGE", JOptionPane.ERROR_MESSAGE);
            vote();
        }
        else if (!checkvoted(voted, a1, id) && checkvalidid(validid,a1,id)){
            voted[++k] = id;
            s.createconsole();
        }
    }
    static boolean checkvoted(int[] voted, int a1, int id) {
        for (int j = 0; j < a1; j++) {
            if (id == voted[j]) {
                return true;
            }
        }
        return false;
    }

    static boolean checkvalidid(int[] validdid, int a1, int id) {
        for (int j = 0; j < a1; j++) {
            if (id == validdid[j]) {
                return true;
            }
        }
        return false;
    }


    String scheck() {

        int x1 = Math.max(cand1, cand2);
        int x2 = Math.max(cand3, cand4);
        int x3 = Math.max(x1, x2);
        int x4 = Math.max(x3, cand5);
        if (x4 == cand1) {
            return "CANDIDATE 1";
        } else if (x4 == cand2) {
            return "CANDIDATE 2";
        } else if (x4 == cand3) {
            return "CANDIDATE 3";
        } else if (x4 == cand4) {
            return "CANDIDATE 4";
        }
        return "NOTA";
    }

    int icheck() {
        int x1 = Math.max(cand1, cand2);
        int x2 = Math.max(cand3, cand4);
        int x3 = Math.max(x1, x2);
        return Math.max(x3, cand5);
    }


    void result() {

        String sresult;
        int iresult;
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        JPanel panel6 = new JPanel();

        JTextField field1 = new JTextField();
        field1.setBounds(0, 10, 70, 80);
        field1.setFont(new Font("s", Font.BOLD, 20));
        field1.setBackground(Color.gray);
        field1.setForeground(Color.black);
        field1.setText("SR.NO.");
        field1.setEditable(false);

        JTextField field1b = new JTextField();
        field1b.setBounds(80, 10, 250, 80);
        field1b.setFont(new Font("s1", Font.BOLD, 25));
        field1b.setBackground(Color.gray);
        field1b.setForeground(Color.black);
        field1b.setText(" CANDIDATE NAME");
        field1b.setEditable(false);
        field1b.setFocusable(false);

        JTextField field1c = new JTextField();
        field1c.setBounds(350, 10, 100, 80);
        field1c.setFont(new Font("s1", Font.BOLD, 25));
        field1c.setBackground(Color.gray);
        field1c.setForeground(Color.black);
        field1c.setText(" VOTES");
        field1c.setEditable(false);
        field1c.setFocusable(false);

        panel1.setLayout(null);
        panel1.setBackground(Color.red);
        panel1.setBounds(0, 0, 500, 100);
        panel1.add(field1);
        panel1.add(field1b);
        panel1.add(field1c);

        JTextField field2 = new JTextField();
        field2.setBounds(0, 10, 70, 80);
        field2.setFont(new Font("s", Font.BOLD, 35));
        field2.setBackground(Color.CYAN);
        field2.setForeground(Color.black);
        field2.setText("1");
        field2.setEditable(false);

        JTextField field2b = new JTextField();
        field2b.setBounds(80, 10, 250, 80);
        field2b.setFont(new Font("s1", Font.BOLD, 35));
        field2b.setBackground(Color.cyan);
        field2b.setForeground(Color.black);
        field2b.setText(" CANDIDATE 1");
        field2b.setEditable(false);
        field2b.setFocusable(false);

        JTextField field2c = new JTextField();
        field2c.setBounds(350, 10, 100, 80);
        field2c.setFont(new Font("s1", Font.BOLD, 35));
        field2c.setBackground(Color.CYAN);
        field2c.setForeground(Color.black);
        field2c.setText(String.valueOf(cand1));
        field2c.setEditable(false);
        field2c.setFocusable(false);

        panel2.setLayout(null);
        panel2.setBackground(Color.red);
        panel2.setBounds(0, 100, 500, 100);
        panel2.add(field2);
        panel2.add(field2b);
        panel2.add(field2c);

        JTextField field3 = new JTextField();
        field3.setBounds(0, 10, 70, 80);
        field3.setFont(new Font("s", Font.BOLD, 35));
        field3.setBackground(Color.CYAN);
        field3.setForeground(Color.black);
        field3.setText("2");
        field3.setEditable(false);

        JTextField field3b = new JTextField();
        field3b.setBounds(80, 10, 250, 80);
        field3b.setFont(new Font("s1", Font.BOLD, 35));
        field3b.setBackground(Color.cyan);
        field3b.setForeground(Color.black);
        field3b.setText(" CANDIDATE 2");
        field3b.setEditable(false);
        field3b.setFocusable(false);

        JTextField field3c = new JTextField();
        field3c.setBounds(350, 10, 100, 80);
        field3c.setFont(new Font("s1", Font.BOLD, 35));
        field3c.setBackground(Color.CYAN);
        field3c.setForeground(Color.black);
        field3c.setText(String.valueOf(cand2));
        field3c.setEditable(false);
        field3c.setFocusable(false);

        panel3.setLayout(null);
        panel3.setBackground(Color.red);
        panel3.setBounds(0, 200, 500, 100);
        panel3.add(field3);
        panel3.add(field3b);
        panel3.add(field3c);

        JTextField field4 = new JTextField();
        field4.setBounds(0, 10, 70, 80);
        field4.setFont(new Font("s", Font.BOLD, 35));
        field4.setBackground(Color.CYAN);
        field4.setForeground(Color.black);
        field4.setText("3");
        field4.setEditable(false);

        JTextField field4b = new JTextField();
        field4b.setBounds(80, 10, 250, 80);
        field4b.setFont(new Font("s1", Font.BOLD, 35));
        field4b.setBackground(Color.cyan);
        field4b.setForeground(Color.black);
        field4b.setText(" CANDIDATE 3");
        field4b.setEditable(false);
        field4b.setFocusable(false);

        JTextField field4c = new JTextField();
        field4c.setBounds(350, 10, 100, 80);
        field4c.setFont(new Font("s1", Font.BOLD, 35));
        field4c.setBackground(Color.CYAN);
        field4c.setForeground(Color.black);
        field4c.setText(String.valueOf(cand3));
        field4c.setEditable(false);
        field4c.setFocusable(false);

        panel4.setLayout(null);
        panel4.setBackground(Color.red);
        panel4.setBounds(0, 300, 500, 100);
        panel4.add(field4);
        panel4.add(field4b);
        panel4.add(field4c);

        JTextField field5 = new JTextField();
        field5.setBounds(0, 10, 70, 80);
        field5.setFont(new Font("s", Font.BOLD, 35));
        field5.setBackground(Color.CYAN);
        field5.setForeground(Color.black);
        field5.setText("4");
        field5.setEditable(false);

        JTextField field5b = new JTextField();
        field5b.setBounds(80, 10, 250, 80);
        field5b.setFont(new Font("s1", Font.BOLD, 35));
        field5b.setBackground(Color.cyan);
        field5b.setForeground(Color.black);
        field5b.setText(" CANDIDATE 4");
        field5b.setEditable(false);
        field5b.setFocusable(false);

        JTextField field5c = new JTextField();
        field5c.setBounds(350, 10, 100, 80);
        field5c.setFont(new Font("s1", Font.BOLD, 35));
        field5c.setBackground(Color.CYAN);
        field5c.setForeground(Color.black);
        field5c.setText(String.valueOf(cand4));
        field5c.setEditable(false);
        field5c.setFocusable(false);

        panel5.setLayout(null);
        panel5.setBackground(Color.red);
        panel5.setBounds(0, 400, 500, 100);
        panel5.add(field5);
        panel5.add(field5b);
        panel5.add(field5c);

        JTextField field6 = new JTextField();
        field6.setBounds(0, 10, 70, 80);
        field6.setFont(new Font("s", Font.BOLD, 35));
        field6.setBackground(Color.CYAN);
        field6.setForeground(Color.black);
        field6.setText("5");
        field6.setEditable(false);

        JTextField field6b = new JTextField();
        field6b.setBounds(80, 10, 250, 80);
        field6b.setFont(new Font("s1", Font.BOLD, 35));
        field6b.setBackground(Color.cyan);
        field6b.setForeground(Color.black);
        field6b.setText(" CANDIDATE 5");
        field6b.setEditable(false);
        field6b.setFocusable(false);

        JTextField field6c = new JTextField();
        field6c.setBounds(350, 10, 100, 80);
        field6c.setFont(new Font("s1", Font.BOLD, 35));
        field6c.setBackground(Color.CYAN);
        field6c.setForeground(Color.black);
        field6c.setText(String.valueOf(cand5));
        field6c.setEditable(false);
        field6c.setFocusable(false);

        panel6.setLayout(null);
        panel6.setBackground(Color.red);
        panel6.setBounds(0, 500, 500, 100);
        panel6.add(field6);
        panel6.add(field6b);
        panel6.add(field6c);

        boolean r = cand1 == cand2 && cand3 == cand4 && cand4 == cand5 && cand1 == cand4;
        boolean s = cand1 == cand2 || cand1 == cand3 || cand1 == cand4 || cand1 == cand5 || cand2 == cand3
                || cand2 == cand4 || cand2 == cand5 || cand3 == cand4 || cand3 == cand5 || cand4 == cand5;
        if (r && s) {
            sresult = "NO-ONE";
            iresult = 1;
        } else {
            sresult = scheck();
            iresult = icheck();
        }

        JLabel label1 = new JLabel();
        label1.setText(sresult + " WON WITH " + iresult + " VOTES");
        label1.setBounds(0, 600, 500, 110);
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.CENTER);
        label1.setForeground(Color.yellow);
        label1.setFont(new Font("My", Font.BOLD, 25));
        label1.setBackground(Color.red);
        label1.setOpaque(true);
        label1.setVerticalAlignment(JLabel.CENTER);
        label1.setHorizontalAlignment(JLabel.CENTER);

        JFrame frame = new JFrame();
        frame.setSize(500, 730);
        frame.setLayout(null);
        frame.setTitle("RESULT OF VOTING");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(panel5);
        frame.add(panel6);
        frame.add(label1);
        frame.setVisible(true);
    }
    void createconsole() {

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        JPanel panel6 = new JPanel();

        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();

        JTextField field1 = new JTextField();
        field1.setBounds(0, 20, 40, 80);
        field1.setFont(new Font("s", Font.BOLD, 35));
        field1.setBackground(Color.gray);
        field1.setForeground(Color.black);
        field1.setText(" 1");
        field1.setEditable(false);

        JTextField field2 = new JTextField();
        field2.setBounds(0, 20, 40, 80);
        field2.setFont(new Font("s", Font.BOLD, 35));
        field2.setBackground(Color.gray);
        field2.setForeground(Color.black);
        field2.setText(" 2");
        field2.setEditable(false);

        JTextField field3 = new JTextField();
        field3.setBounds(0, 20, 40, 80);
        field3.setFont(new Font("s", Font.BOLD, 35));
        field3.setBackground(Color.gray);
        field3.setForeground(Color.black);
        field3.setText(" 3");
        field3.setEditable(false);

        JTextField field4 = new JTextField();
        field4.setBounds(0, 20, 40, 80);
        field4.setFont(new Font("s", Font.BOLD, 35));
        field4.setBackground(Color.gray);
        field4.setForeground(Color.black);
        field4.setText(" 4");
        field4.setEditable(false);

        JTextField field5 = new JTextField();
        field5.setBounds(0, 20, 40, 80);
        field5.setFont(new Font("s", Font.BOLD, 35));
        field5.setBackground(Color.gray);
        field5.setForeground(Color.black);
        field5.setText(" 5");
        field5.setEditable(false);

        JTextField field1b = new JTextField();
        field1b.setBounds(80, 20, 250, 80);
        field1b.setFont(new Font("s1", Font.BOLD, 35));
        field1b.setBackground(Color.gray);
        field1b.setForeground(Color.black);
        field1b.setText("CANDIDATE 1");
        field1b.setEditable(false);
        field1b.setFocusable(false);

        JTextField field2b = new JTextField();
        field2b.setBounds(80, 20, 250, 80);
        field2b.setFont(new Font("s1", Font.BOLD, 35));
        field2b.setBackground(Color.gray);
        field2b.setForeground(Color.black);
        field2b.setText("CANDIDATE 2");
        field2b.setEditable(false);
        field2b.setFocusable(false);

        JTextField field3b = new JTextField();
        field3b.setBounds(80, 20, 250, 80);
        field3b.setFont(new Font("s1", Font.BOLD, 35));
        field3b.setBackground(Color.gray);
        field3b.setForeground(Color.black);
        field3b.setText("CANDIDATE 3");
        field3b.setEditable(false);
        field3b.setFocusable(false);

        JTextField field4b = new JTextField();
        field4b.setBounds(80, 20, 250, 80);
        field4b.setFont(new Font("s1", Font.BOLD, 35));
        field4b.setBackground(Color.gray);
        field4b.setForeground(Color.black);
        field4b.setText("CANDIDATE 4");
        field4b.setEditable(false);
        field4b.setFocusable(false);

        JTextField field5b = new JTextField();
        field5b.setBounds(80, 20, 250, 80);
        field5b.setFont(new Font("s1", Font.BOLD, 35));
        field5b.setBackground(Color.gray);
        field5b.setForeground(Color.black);
        field5b.setText("NOTA");
        field5b.setEditable(false);
        field5b.setFocusable(false);

        button1.setBounds(350, 30, 100, 60);
        button1.setBackground(Color.yellow);
        button1.setForeground(Color.black);
        button1.setText("vote");
        button1.setFont(new Font("s", Font.BOLD, 30));
        button1.setFocusable(false);
        button1.addActionListener(this);
        button1.setEnabled(true);

        button2.setBounds(350, 30, 100, 60);
        button2.setBackground(Color.yellow);
        button2.setForeground(Color.black);
        button2.setText("vote");
        button2.setFont(new Font("s", Font.BOLD, 30));
        button2.setFocusable(false);
        button2.addActionListener(this);
        button2.setEnabled(true);

        button3.setBounds(350, 30, 100, 60);
        button3.setBackground(Color.yellow);
        button3.setForeground(Color.black);
        button3.setText("vote");
        button3.setFont(new Font("s", Font.BOLD, 30));
        button3.setFocusable(false);
        button3.addActionListener(this);
        button3.setEnabled(true);

        button4.setBounds(350, 30, 100, 60);
        button4.setBackground(Color.yellow);
        button4.setForeground(Color.black);
        button4.setText("vote");
        button4.setFont(new Font("s", Font.BOLD, 30));
        button4.setFocusable(false);
        button4.addActionListener(this);
        button4.setEnabled(true);

        button5.setBounds(350, 30, 100, 60);
        button5.setBackground(Color.yellow);
        button5.setForeground(Color.black);
        button5.setText("vote");
        button5.setFont(new Font("s", Font.BOLD, 30));
        button5.setFocusable(false);
        button5.addActionListener(this);
        button5.setEnabled(true);

        panel1.setLayout(null);
        panel1.setBackground(Color.gray);
        panel1.setBounds(0, 0, 500, 120);
        panel1.add(field1);
        panel1.add(field1b);
        panel1.add(button1);

        panel2.setLayout(null);
        panel2.setBackground(Color.gray);
        panel2.setBounds(0, 121, 500, 120);
        panel2.add(field2);
        panel2.add(field2b);
        panel2.add(button2);
        panel2.setBorder(BorderFactory.createLoweredBevelBorder());

        panel3.setLayout(null);
        panel3.setBackground(Color.gray);
        panel3.setBounds(0, 241, 500, 120);
        panel3.add(field3);
        panel3.add(field3b);
        panel3.add(button3);
        panel3.setBorder(BorderFactory.createLoweredBevelBorder());

        panel4.setLayout(null);
        panel4.setBackground(Color.gray);
        panel4.setBounds(0, 361, 500, 120);
        panel4.add(field4);
        panel4.add(field4b);
        panel4.add(button4);
        panel4.setBorder(BorderFactory.createLoweredBevelBorder());

        panel5.setLayout(null);
        panel5.setBackground(Color.gray);
        panel5.setBounds(0, 481, 500, 120);
        panel5.add(field5);
        panel5.add(field5b);
        panel5.add(button5);
        panel5.setBorder(BorderFactory.createLoweredBevelBorder());

        frame.setSize(500, 630);
        frame.setTitle("WELCOME TO VOTING PAGE");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(panel5);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        Vote s = new Vote();
        if (e.getSource() == button1) {
            cand1++;
        } else if (e.getSource() == button2) {
            cand2++;
        } else if (e.getSource() == button3) {
            cand3++;
        } else if (e.getSource() == button4) {
            cand4++;
        } else if (e.getSource() == button5) {
            cand5++;
        }
        frame.dispose();
        i++;
        JOptionPane.showMessageDialog(null, "VOTE SUCCESSFUL!");
        int ans = JOptionPane.showConfirmDialog(null, "DO YOU WANT TO CONTINUE?", "CONFIRMATION PAGE",
                JOptionPane.YES_NO_OPTION);
        if (ans == 0) {
            vote();
        } else {
            int x = JOptionPane.showConfirmDialog(null, "DO YOU WANT SEE RESULT", "OPERATION",
                    JOptionPane.YES_NO_OPTION);
            if (x == 0) {
                s.result();
            }
            else {
                vote();
            }
        }
    }
}