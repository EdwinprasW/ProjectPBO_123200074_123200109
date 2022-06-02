/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectprakpbi;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class AdminScreen extends JFrame{
    JLabel lTitle = new JLabel("Admin Toko Game");
    JLabel lJudul = new JLabel("Judul");
    JLabel lJumlah = new JLabel("Jumlah");
    JLabel lHarga = new JLabel("Harga");
    JTextField theHarga = new JTextField();
    JTextField theJudul = new JTextField();
    JTextField tfJumlah = new JTextField();
    
    JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    Object namaKolom[] = {"Judul", "Jumlah Stock", "Harga"};
    
    JButton btnBack = new JButton("Kembali");
    JButton RegBtn = new JButton("Register");
    JButton btnUpdate = new JButton("Update");
    JButton btnDelete = new JButton("Delete");
    JButton btnAdd = new JButton("Add");

    public AdminScreen () {
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);
        
        setTitle("Data Pembelian Game");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(550, 600);
        
        add(lTitle);
        lTitle.setBounds(225, 5, 200, 50);
        
        add(scrollPane);
        scrollPane.setBounds(20, 50, 500, 300);
        
        add(btnBack);
        btnBack.setBounds(20, 350, 100, 20);
        
        add(RegBtn);
        RegBtn.setBounds(410, 350, 100, 20);
        
        add(lJudul);
        lJudul.setBounds(75, 400, 200, 20);
        
        add(theJudul);
        theJudul.setBounds(50, 425, 100, 20);
        
        add(lJumlah);
        lJumlah.setBounds(250, 400, 200, 20);
        
        add(tfJumlah);
        tfJumlah.setBounds(235, 425, 100, 20);
        
        add(lHarga);
        lHarga.setBounds(425, 400, 100, 20);
        
        add(theHarga);
        theHarga.setBounds(410, 425, 100, 20);
        
        add(btnAdd);
        btnAdd.setBounds(50, 475, 100, 20);
        
        add(btnDelete);
        btnDelete.setBounds(235, 475, 100, 20);
        
        add(btnUpdate);
        btnUpdate.setBounds(410, 475, 100, 20);
    }

    public String getTheHarga() {
        return theHarga.getText();
    }

    public String getTheJudul() {
        return theJudul.getText();
    }

    public String getTfJumlah() {
        return tfJumlah.getText();
    }
    
    
}
