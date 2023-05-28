package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.*;

public class Main {

    public static void main(String[] args) {
        new complex();
    }
}
class complex extends JFrame {
    String strnum1="",strnum2="",strtotal="";
    double num1=0,num2=0,total=0;
    String []statement;
    Font f1=new Font("Arial",Font.BOLD,18);

    complex(){

        //background color
        Panel p1=new Panel();
        p1.setBounds(0,50,350,350);
        p1.setBackground(Color.BLACK);

        //Text field
        JTextArea t1=new JTextArea();
        t1.setBounds(30,50,270,40);
        t1.setFont(f1);
        t1.setBackground(Color.WHITE);
        add(t1);

        //button design
        JButton b1=new JButton("AC");
        b1.setBounds(30,100,60,40);
        b1.setFont(f1);
        b1.setBackground(Color.GREEN);
        add(b1);
        JButton b2=new JButton("←");
        b2.setBounds(100,100,60,40);
        b2.setFont(f1);
        b2.setBackground(Color.GREEN);
        JButton b3=new JButton("±");
        b3.setBounds(170,100,60,40);
        b3.setFont(f1);
        b3.setBackground(Color.GREEN);
        JButton b4=new JButton("÷");
        b4.setBounds(240,100,60,40);
        b4.setFont(f1);
        b4.setBackground(Color.GREEN);
        add(b2);add(b3);add(b4);

        JButton b5=new JButton("7");
        b5.setBounds(30,150,60,40);
        b5.setFont(f1);
        b5.setBackground(Color.yellow);
        JButton b6=new JButton("8");
        b6.setBounds(100,150,60,40);
        b6.setFont(f1);
        b6.setBackground(Color.yellow);
        JButton b7=new JButton("9");
        b7.setBounds(170,150,60,40);
        b7.setFont(f1);
        b7.setBackground(Color.yellow);
        JButton b8=new JButton("×");
        b8.setBounds(240,150,60,40);
        b8.setFont(f1);
        b8.setBackground(Color.GREEN);
        add(b5);add(b6);add(b7);add(b8);

        JButton b9=new JButton("4");
        b9.setBounds(30,200,60,40);
        b9.setFont(f1);
        b9.setBackground(Color.yellow);
        JButton b10=new JButton("5");
        b10.setBounds(100,200,60,40);
        b10.setFont(f1);
        b10.setBackground(Color.yellow);
        JButton b11=new JButton("6");
        b11.setBounds(170,200,60,40);
        b11.setFont(f1);
        b11.setBackground(Color.yellow);
        JButton b12=new JButton("-");
        b12.setBounds(240,200,60,40);
        b12.setFont(f1);
        b12.setBackground(Color.GREEN);
        add(b9);add(b10);add(b11);add(b12);

        JButton b13=new JButton("1");
        b13.setBounds(30,250,60,40);
        b13.setFont(f1);
        b13.setBackground(Color.yellow);
        JButton b14=new JButton("2");
        b14.setBounds(100,250,60,40);
        b14.setFont(f1);
        b14.setBackground(Color.yellow);
        JButton b15=new JButton("3");
        b15.setBounds(170,250,60,40);
        b15.setFont(f1);
        b15.setBackground(Color.yellow);
        JButton b16=new JButton("+");
        b16.setBounds(240,250,60,40);
        b16.setFont(f1);
        b16.setBackground(Color.GREEN);
        add(b13);add(b14);add(b15);add(b16);

        JButton b17=new JButton("%");
        b17.setBounds(30,300,60,40);
        b17.setFont(f1);
        b17.setBackground(Color.yellow);
        JButton b18=new JButton("0");
        b18.setBounds(100,300,60,40);
        b18.setFont(f1);
        b18.setBackground(Color.yellow);
        JButton b19=new JButton(".");
        b19.setBounds(170,300,60,40);
        b19.setFont(f1);
        b19.setBackground(Color.yellow);
        JButton b20=new JButton("=");
        b20.setBounds(240,300,60,40);
        b20.setFont(f1);
        b20.setBackground(Color.GREEN);
        add(b17);add(b18);add(b19);add(b20);

        // button actions
        b13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                t1.append("1");
            }
        });
        b14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                t1.append("2");
            }
        });
        b15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                t1.append("3");
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                t1.append("4");
            }
        });
        b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                t1.append("5");
            }
        });
        b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                t1.append("6");
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                t1.append("7");
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                t1.append("8");
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                t1.append("9");
            }
        });
        b18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                t1.append("0");
            }
        });
        b19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                t1.append(".");
            }
        });
        b16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                t1.append("+");
            }
        });
        b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                t1.append("-");
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                t1.append("×");
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                t1.append("÷");
            }
        });

        //buttons actions
        b20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if(t1.getText().contains("+")){
                    System.out.println("contains");
                    statement = t1.getText().split("\\+");

                    strnum1=statement[0];
                    strnum2=statement[1];

                    num1=Double.parseDouble(strnum1);
                    num2=Double.parseDouble(strnum2);
                    total=num1+num2;

                    strtotal=Double.toString(total);
                    t1.setText(strtotal);
                }
                else if(t1.getText().contains("-")){
                    System.out.println("contains");
                    statement = t1.getText().split("\\-");

                    strnum1=statement[0];
                    strnum2=statement[1];

                    num1=Double.parseDouble(strnum1);
                    num2=Double.parseDouble(strnum2);
                    total=num1-num2;

                    strtotal=Double.toString(total);
                    t1.setText(strtotal);
                }
                else if(t1.getText().contains("×")){
                    System.out.println("contains");
                    statement = t1.getText().split("\\×");

                    strnum1=statement[0];
                    strnum2=statement[1];

                    num1=Double.parseDouble(strnum1);
                    num2=Double.parseDouble(strnum2);
                    total=num1*num2;

                    strtotal=Double.toString(total);
                    t1.setText(strtotal);
                }
                else if(t1.getText().contains("÷")){
                    System.out.println("contains");
                    statement = t1.getText().split("\\÷");

                    strnum1=statement[0];
                    strnum2=statement[1];

                    num1=Double.parseDouble(strnum1);
                    num2=Double.parseDouble(strnum2);
                    total=num1/num2;

                    strtotal=Double.toString(total);
                    t1.setText(strtotal);
                }
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                strnum1=t1.getText();
                num1=Double.parseDouble(strnum1);
                num1=num1*(-1);
                total=num1;
                strtotal=Double.toString(total);
                t1.setText(strtotal);
            }
        });
        b17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                strnum1=t1.getText();
                num1=Double.parseDouble(strnum1);
                num1=num1/100;
                total=num1;
                strtotal=Double.toString(total);
                t1.setText(strtotal);
            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                t1.setText(null);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                strnum1=t1.getText();
                t1.setText("");
                for(int i=0;i<strnum1.length()-1;i++){
                    t1.setText(t1.getText()+strnum1.charAt(i));
                }
            }
        });

        add(p1);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Pro_Max");
        setSize(350,400);
    }


}
