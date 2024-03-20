package Kuis;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class Login extends JFrame implements ActionListener {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    public Login(){
        setTitle("Login Karyawan");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);
        
        //membuat JPanel
        JPanel Panel = new JPanel();
        Panel.setLayout(new GridLayout(3, 2));
        
        //membuat label untuk username
        JLabel usernameLabel = new JLabel("Karyawan");
        usernameField = new JTextField();
        
        //membuat label untuk password
        JLabel passwordLabel = new JLabel ("Password");
        passwordField = new JPasswordField();
        
        //membuat tombol login
        loginButton = new JButton("Login Karyawan");
        loginButton.addActionListener(this);
        
        //menambahkan semua komponen GUI
        Panel.add(usernameLabel);
        Panel.add(usernameField);
        Panel.add(passwordLabel);
        Panel.add(passwordField);
        Panel.add(new JLabel());
        Panel.add(loginButton);
        add(Panel);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //mengambil username dan password dari inputan user
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        
        //pengecekan username dan password
        if(username.equals("tukang_122") && password.equals("tukang_122")){
            JOptionPane.showMessageDialog(this, "Login Sukses");
            new NewPage(); //mengalihkan ke halaman baru jika username dan password benar
            dispose();
        } else{
            JOptionPane.showMessageDialog(this, "Username atau Password Salah");
        }
    }
    
}

//class untuk halaman baru
class NewPage extends JFrame{
    public NewPage(){
        setTitle("Welcome");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 200); //mengatur lebar dan tinggi
        setLocationRelativeTo(null);
        
        //membuat pesan jika login berhasil
        JLabel welcomeLabel = new JLabel ("Selamat Datang di Menu Hitung Siku. Untuk Perhitungannya "
                                          + "Ada Di File Selanjutnya");
        add(welcomeLabel);
        setVisible(true);         
    }   
    
    
}
