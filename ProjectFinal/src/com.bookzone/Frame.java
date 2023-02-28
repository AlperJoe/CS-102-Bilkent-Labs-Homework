package com.bookzone;

import java.awt.Color;

import javax.swing.JFrame;

public class Frame extends JFrame{
    public Frame(){
        setSize(1100,750);
        getContentPane().setBackground(new Color(171,212,182));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
