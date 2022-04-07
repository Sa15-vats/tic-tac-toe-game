package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;

class Main extends JFrame {
    int k=0, l, count=0;
    JButton a1,a2,a3,a4,a5,a6,a7,a8,a9,b;
    JTextField tf;
    public Main(String tic_tac_toe) {
        super(tic_tac_toe);
    }
    void setComponent(){
        a1=new JButton("");
        a1.setBounds(13,13,90,90);
        add(a1);
        a2=new JButton("");
        a2.setBounds(110,13,90,90);
        add(a2);
        a3=new JButton("");
        a3.setBounds(207,13,90,90);
        add(a3);
        a4=new JButton("");
        a4.setBounds(13,110,90,90);
        add(a4);
        a5=new JButton("");
        a5.setBounds(110,110,90,90);
        add(a5);
        a6=new JButton("");
        a6.setBounds(207,110,90,90);
        add(a6);
        a7=new JButton("");
        a7.setBounds(13,207,90,90);
        add(a7);
        a8=new JButton("");
        a8.setBounds(110,207,90,90);
        add(a8);
        a9=new JButton("");
        a9.setBounds(207,207,90,90);
        add(a9);
        b=new JButton("Start New Game");
        b.setBounds(90,320,130,30);
        add(b);
        tf=new JTextField();
        tf.setBounds(20,370,250,30);
        tf.setEditable(false);
        add(tf);
        a1.addActionListener(new A1());
        a2.addActionListener(new A2());
        a3.addActionListener(new A3());
        a4.addActionListener(new A4());
        a5.addActionListener(new A5());
        a6.addActionListener(new A6());
        a7.addActionListener(new A7());
        a8.addActionListener(new A8());
        a9.addActionListener(new A9());
        b.addActionListener(new A());
    }
    void detail(){
        a1.setEnabled(false);
        a2.setEnabled(false);
        a3.setEnabled(false);
        a4.setEnabled(false);
        a5.setEnabled(false);
        a6.setEnabled(false);
        a7.setEnabled(false);
        a8.setEnabled(false);
        a9.setEnabled(false);
    }
    public int check(){
         count++;
         if(a1.getText()=="X"&& a2.getText()=="X"&&a3.getText()=="X")
            return 1;
        else if(a1.getText()=="X"&& a5.getText()=="X"&&a9.getText()=="X")
            return 1;
        else if(a1.getText()=="X"&& a4.getText()=="X"&&a7.getText()=="X")
            return 1;
        else if(a2.getText()=="X"&& a5.getText()=="X"&&a8.getText()=="X")
            return 1;
        else if(a3.getText()=="X"&& a6.getText()=="X"&&a9.getText()=="X")
            return 1;
        else if(a3.getText()=="X"&& a5.getText()=="X"&&a7.getText()=="X")
            return 1;
        else if(a4.getText()=="X"&& a5.getText()=="X"&&a6.getText()=="X")
            return 1;
        else if(a7.getText()=="X"&& a8.getText()=="X"&&a9.getText()=="X")
            return 1;


        if(a1.getText()=="O"&& a2.getText()=="O"&&a3.getText()=="O")
            return 2;
        else if(a1.getText()=="O"&& a5.getText()=="O"&&a9.getText()=="O")
            return 2;
        else if(a1.getText()=="O"&& a4.getText()=="O"&&a7.getText()=="O")
            return 2;
        else if(a2.getText()=="O"&& a5.getText()=="O"&&a8.getText()=="O")
            return 2;
        else if(a3.getText()=="O"&& a6.getText()=="O"&&a9.getText()=="O")
            return 2;
        else if(a3.getText()=="O"&& a5.getText()=="O"&&a7.getText()=="O")
            return 2;
        else if(a4.getText()=="O"&& a5.getText()=="O"&&a6.getText()=="O")
            return 2;
        else if(a7.getText()=="O"&& a8.getText()=="O"&&a9.getText()=="O")
            return 2;
        else {
            if (count == 9)
                tf.setText("Game Draw");
            return 3;
        }
    }
    class A implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        k=0;l=0;count=0;
        a1.setText("");
            a2.setText("");
            a3.setText("");
            a4.setText("");
            a5.setText("");
            a6.setText("");
            a7.setText("");
            a8.setText("");
            a9.setText("");
            tf.setText("");



            a1.setEnabled(true);
            a2.setEnabled(true);
            a3.setEnabled(true);
            a4.setEnabled(true);
            a5.setEnabled(true);
            a6.setEnabled(true);
            a7.setEnabled(true);
            a8.setEnabled(true);
            a9.setEnabled(true);


        }
        }
     class A1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (k == 0) {
                a1.setText("X");
                a1.setEnabled(false);
                l= check();
                k = 1;
                if(l==1){
                    tf.setText("Player 1 Won");
                    detail();
                }
                else if (l==2){
                    tf.setText("Player 2 Won");
                    detail();
                }
                else;
            }
            else {
                a1.setText("O");
                a1.setEnabled(false);
                k = 0;
                l=check();
                if(l==1){
                    tf.setText("Player 1 Won");
                    detail();
                }
                else if(l==2){
                    tf.setText("Player 2 Won");
                    detail();
                }
            }
        }
    }
    class A2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (k == 0) {
                a2.setText("X");
                a2.setEnabled(false);
                l= check();
                k = 1;
                if(l==1){
                    tf.setText("Player 1 Won");
                    detail();
                }
                else if (l==2){
                    tf.setText("Player 2 Won");
                    detail();
                }
                else;
            } else {
                a2.setText("O");
                a2.setEnabled(false);
                k = 0;
                l=check();
                if(l==1){
                    tf.setText("Player 1 Won");
                    detail();
                }
                else if(l==2){
                    tf.setText("Player 2 Won");
                    detail();
                }
            }
        }
    }
    class A3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (k == 0) {
                a3.setText("X");
                a3.setEnabled(false);
                l= check();
                k = 1;
                if(l==1){
                    tf.setText("Player 1 Won");
                    detail();
                }
                else if (l==2){
                    tf.setText("Player 2 Won");
                    detail();
                }
                else;
            } else {
                a3.setText("O");
                a3.setEnabled(false);
                k = 0;
                l=check();
                if(l==1){
                    tf.setText("Player 1 Won");
                    detail();
                }
                else if(l==2){
                    tf.setText("Player 2 Won");
                    detail();
                }
            }
        }
    }
    class A4 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (k == 0) {
                a4.setText("X");
                a4.setEnabled(false);
                l= check();
                k = 1;
                if(l==1){
                    tf.setText("Player 1 Won");
                    detail();
                }
                else if (l==2){
                    tf.setText("Player 2 Won");
                    detail();
                }
                else;
            } else {
                a4.setText("O");
                a4.setEnabled(false);
                k = 0;
                l=check();
                if(l==1){
                    tf.setText("Player 1 Won");
                    detail();
                }
                else if(l==2){
                    tf.setText("Player 2 Won");
                    detail();
                }
            }
        }
    }
    class A5 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (k == 0) {
                a5.setText("X");
                a5.setEnabled(false);
                l= check();
                k = 1;
                if(l==1){
                    tf.setText("Player 1 Won");
                    detail();
                }
                else if (l==2){
                    tf.setText("Player 2 Won");
                    detail();
                }
                else;
            } else {
                a5.setText("O");
                a5.setEnabled(false);
                k = 0;
                l=check();
                if(l==1){
                    tf.setText("Player 1 Won");
                    detail();
                }
                else if(l==2){
                    tf.setText("Player 2 Won");
                    detail();
                }
            }
        }
    }
    class A6 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (k == 0) {
                a6.setText("X");
                a6.setEnabled(false);
                l= check();
                k = 1;
                if(l==1){
                    tf.setText("Player 1 Won");
                    detail();
                }
                else if (l==2){
                    tf.setText("Player 2 Won");
                    detail();
                }
                else;
            } else {
                a6.setText("O");
                a6.setEnabled(false);
                k = 0;
                l=check();
                if(l==1){
                    tf.setText("Player 1 Won");
                    detail();
                }
                else if(l==2){
                    tf.setText("Player 2 Won");
                    detail();
                }
            }
        }
    }
    class A7 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (k == 0) {
                a7.setText("X");
                a7.setEnabled(false);
                l= check();
                k = 1;
                if(l==1){
                    tf.setText("Player 1 Won");
                    detail();
                }
                else if (l==2){
                    tf.setText("Player 2 Won");
                    detail();
                }
                else;
            } else {
                a7.setText("O");
                a7.setEnabled(false);
                k = 0;
                l=check();
                if(l==1){
                    tf.setText("Player 1 Won");
                    detail();
                }
                else if(l==2){
                    tf.setText("Player 2 Won");
                    detail();
                }
            }
        }
    }
    class A8 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (k == 0) {
                a8.setText("X");
                a8.setEnabled(false);
                l= check();
                k = 1;
                if(l==1){
                    tf.setText("Player 1 Won");
                    detail();
                }
                else if (l==2){
                    tf.setText("Player 2 Won");
                    detail();
                }
                else;
            } else {
                a8.setText("O");
                a8.setEnabled(false);
                k = 0;
                l=check();
                if(l==1){
                    tf.setText("Player 1 Won");
                    detail();
                }
                else if(l==2){
                    tf.setText("Player 2 Won");
                    detail();
                }
            }

        }
    }
    class A9 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (k == 0) {
                a9.setText("X");
                a9.setEnabled(false);
                l= check();
                k = 1;
                if(l==1){
                    tf.setText("Player 1 Won");
                    detail();
                }
                else if (l==2){
                    tf.setText("Player 2 Won");
                    detail();
                }
                else;
            } else {
                a9.setText("O");
                a9.setEnabled(false);
                k = 0;
                l=check();
                if(l==1){
                    tf.setText("Player 1 Won");
                    detail();
                }
                else if(l==2){
                    tf.setText("Player 2 Won");
                    detail();
                }
            }

        }
    }
    public static void main(String[] args) {
	 Main  a= new Main("Tic Tac Toe");
     a.setVisible(true);
     a.setSize(325,450);
     a.setLocation(100,100);
     a.setResizable(false);
     a.setLayout(null);
     a.setComponent();
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
