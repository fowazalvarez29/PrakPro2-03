/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author alvarez
 */
public class Latihan3 extends JFrame { // Mendefinisikan kelas Latihan3
    
    public Latihan3(){ // Konstruktor kelas Latihan3
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Label dan Input Nama
        JLabel labelNama = new JLabel("Nama: ");
        labelNama.setBounds(15,40,350,10);
        JTextField textFieldNama = new JTextField();
        textFieldNama.setBounds(15,60,350,30);
        
        // Label dan Input Telepon
        JLabel labelTelepon = new JLabel("Nomor HP: ");
        labelTelepon.setBounds(15,100,350,10);
        JTextField textFieldTelepon = new JTextField();
        textFieldTelepon.setBounds(15,120,350,30);
        
        // Radio Button untuk Jenis Kelamin
        JLabel labelKelamin = new JLabel("Jenis Kelamin: ");
        labelKelamin.setBounds(15,140,350,10);
        JRadioButton radioButton1 = new JRadioButton("Laki-Laki");
        radioButton1.setBounds(15,150,350,30);
        JRadioButton radioButton2 = new JRadioButton("Perempuan");
        radioButton2.setBounds(15,180,350,30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(radioButton1);
        bg.add(radioButton2);
        
        // Checkbox untuk Warga Negara Asing
        JCheckBox checkBox = new JCheckBox("Warga Negara Asing");
        checkBox.setBounds(15, 210, 350, 30);
        
        // Tombol Simpan
        JButton button = new JButton("Simpan");
        button.setBounds(15, 250, 100, 40);
        
        // Output Area
        JTextArea txtOutput = new JTextArea("");
        txtOutput.setBounds(15, 350, 350, 100);
        
        // Menambahkan Action Listener untuk tombol Simpan
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String jenisKelamin = "";
                if(radioButton1.isSelected()){
                  jenisKelamin = radioButton1.getText();
              }
              if(radioButton2.isSelected()){
                  jenisKelamin = radioButton2.getText();
              }
                String nama = textFieldNama.getText();
                String nomorTelepon = textFieldTelepon.getText();
                boolean isWNA = checkBox.isSelected();
                
                // Mengatur output sesuai format yang diinginkan
                String output = ("Nama: "+nama+"\n");
                output += ("Nomor Telepon: "+nomorTelepon+"\n");
                output += ("Jenis Kelamin: "+jenisKelamin+"\n");
                output += ("WNA: " + (isWNA ? "YA" : "TIDAK") + "\n");
                txtOutput.setText(output);
                
                // Mengosongkan Kolom Input
                textFieldNama.setText("");
                textFieldTelepon.setText("");
                radioButton1.setSelected(false);
                radioButton2.setSelected(false);
                checkBox.setSelected(false);
                  
            }
        });
        
        // Menambahkan Komponen ke frame
        this.add(labelNama);
        this.add(textFieldNama);
        this.add(labelTelepon);
        this.add(textFieldTelepon);
        this.add(labelKelamin);
        this.add(radioButton1);
        this.add(radioButton2);
        this.add(checkBox);
        this.add(button);
        this.add(txtOutput);
        
        this.setSize(400, 500);
        this.setLayout(null);
    
    }
    
    // Method utama untuk menjalankan aplikasi
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Membuat objek Latihan3 dan menampilkannya
                Latihan3 app = new Latihan3();
                app.setVisible(true);
            }
        });
    }
}