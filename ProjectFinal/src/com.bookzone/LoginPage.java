package com.bookzone;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

public class LoginPage extends JFrame implements ActionListener {

    ArrayList<User> users = new ArrayList<User>();
    ArrayList<Order> orders = new ArrayList<Order>();
    ArrayList<Transaction> transactions = new ArrayList<>();

    Container container = getContentPane();
    JLabel welcome = new JLabel("Welcome to ");
    JLabel bookzone = new JLabel("BookZone");
    JLabel userLabel = new JLabel("Email: ");
    JLabel passwordLabel = new JLabel("Password: ");
    JTextField userTextField = new JTextField("baris.kiciman@ug.bilkent.edu.tr");
    JPasswordField passwordField = new JPasswordField("k1ngp1n");
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JCheckBox showPassword = new JCheckBox("Show Password");
    Font font = new Font("Arial", Font.PLAIN, 30);
    Font bookzoneFont = new Font("Arial", Font.BOLD, 40);
    JButton registration = new JButton();
    Color color = new Color(171,212,182);


    public LoginPage(ArrayList<User> users , ArrayList<Order> orders , ArrayList<Transaction> transactions ) {
        this.users = users;
        this.orders = orders;
        this.transactions = transactions;

        setTitle("Book Zone Login Page");
        setVisible(true);
        setSize(1000,700);
        getContentPane().setBackground(color);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        container.setLayout(null);

        setContents();
        addComponentsToContainer();
        addActionEvent();

    }

    public void setContents() {
        showPassword.setBackground(color);
        registration.setText("No account? Click here to register!");
        registration.setForeground(Color.BLUE);
        registration.setBorderPainted(false);
        registration.setBackground(color);
        userLabel.setFont(font);
        passwordLabel.setFont(font);
        welcome.setFont(font);
        bookzone.setFont(bookzoneFont);
        welcome.setBounds(250, 100, 200, 30);
        bookzone.setBounds(425, 90, 200, 45);
        userLabel.setBounds(250, 250, 150, 30);
        passwordLabel.setBounds(250, 320, 150, 30);
        userTextField.setBounds(500, 250, 200, 30);
        passwordField.setBounds(500, 320, 200, 30);
        showPassword.setBounds(500, 350, 150, 30);
        loginButton.setBounds(250, 400, 100, 30);
        resetButton.setBounds(600, 400, 100, 30);
        registration.setBounds(400, 440, 300, 30);


    }

    public void addComponentsToContainer() {
        container.add(welcome);
        container.add(bookzone);
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);
        container.add(registration);
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
        registration.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();

            boolean userFound = false;
            int userIndex=0;
            for (int i = 0; i < users.size(); i++) {
                if(userText.equals(users.get(i).getEmail())&&pwdText.equals(users.get(i).getPassword())) {
                    userFound = true;
                    userIndex = i;
                }
            }

            if (userFound){
                this.setVisible(false);
                new UserProfile(users,orders,transactions, users.get(userIndex));
            } else {
                JOptionPane.showMessageDialog(this, "invalid password or email!");
            }

        }
        if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
        }
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }

        }
        if (e.getSource() == registration){
            this.setVisible(false);
            new RegistrationPage(users,orders,transactions);
        }
    }
}
