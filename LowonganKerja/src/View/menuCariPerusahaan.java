/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Lowongan;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ISMA
 */
public class menuCariPerusahaan extends javax.swing.JFrame {

    /**
     * Creates new form menuCariPerusahaan
     */
    public menuCariPerusahaan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        cariperusahaan = new javax.swing.JPanel();
        nmperusahaanlabel = new javax.swing.JLabel();
        nmperusahaan = new javax.swing.JTextField();
        btnCari = new java.awt.Button();
        btnLogOut = new javax.swing.JButton();
        buatberkas = new javax.swing.JPanel();
        skilllabel = new javax.swing.JLabel();
        pengalamanlabel = new javax.swing.JLabel();
        skill = new javax.swing.JTextField();
        pengalaman = new javax.swing.JTextField();
        btnBuat = new javax.swing.JButton();
        btnLogOut1 = new javax.swing.JButton();
        infolowongankerja = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollBar();
        btnDaftar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLowongan = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        }
        ;
        btnLogOut2 = new javax.swing.JButton();
        berkasditerima = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableBerkasDiterima = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        }
        ;
        btnLogOut3 = new javax.swing.JButton();
        editberkas = new javax.swing.JPanel();
        skilleditlabel = new javax.swing.JLabel();
        skilledit = new javax.swing.JTextField();
        pengalamaneditlabel = new javax.swing.JLabel();
        pengalamanedit = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        btnLogOut4 = new javax.swing.JButton();
        lihatberkas = new javax.swing.JPanel();
        berkasanda = new javax.swing.JLabel();
        idpelamar = new javax.swing.JLabel();
        namapelamar = new javax.swing.JLabel();
        nohppelamar = new javax.swing.JLabel();
        emailpelamar = new javax.swing.JLabel();
        pendidikan = new javax.swing.JLabel();
        skillberkas = new javax.swing.JLabel();
        pengalamanberkas = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnLogOut5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(522, 522));

        nmperusahaanlabel.setFont(new java.awt.Font("Myriad Hebrew", 0, 14)); // NOI18N
        nmperusahaanlabel.setText("Nama Perusahaan :");
        nmperusahaanlabel.setName("nmperusahaanlabel"); // NOI18N

        nmperusahaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nmperusahaanActionPerformed(evt);
            }
        });

        btnCari.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnCari.setLabel("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        btnLogOut.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cariperusahaanLayout = new javax.swing.GroupLayout(cariperusahaan);
        cariperusahaan.setLayout(cariperusahaanLayout);
        cariperusahaanLayout.setHorizontalGroup(
            cariperusahaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cariperusahaanLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(nmperusahaanlabel)
                .addGap(63, 63, 63)
                .addComponent(nmperusahaan, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cariperusahaanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cariperusahaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cariperusahaanLayout.createSequentialGroup()
                        .addComponent(btnLogOut)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cariperusahaanLayout.createSequentialGroup()
                        .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(283, 283, 283))))
        );
        cariperusahaanLayout.setVerticalGroup(
            cariperusahaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cariperusahaanLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(cariperusahaanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nmperusahaanlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nmperusahaan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(btnLogOut)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cari Perusahaan", cariperusahaan);

        skilllabel.setText("Skill                                 :");

        pengalamanlabel.setText("Pengalaman                   :");

        skill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skillActionPerformed(evt);
            }
        });

        btnBuat.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        btnBuat.setText("Buat");
        btnBuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuatActionPerformed(evt);
            }
        });

        btnLogOut1.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        btnLogOut1.setText("Log Out");

        javax.swing.GroupLayout buatberkasLayout = new javax.swing.GroupLayout(buatberkas);
        buatberkas.setLayout(buatberkasLayout);
        buatberkasLayout.setHorizontalGroup(
            buatberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buatberkasLayout.createSequentialGroup()
                .addGroup(buatberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buatberkasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLogOut1))
                    .addGroup(buatberkasLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(buatberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBuat, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(buatberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(buatberkasLayout.createSequentialGroup()
                                    .addComponent(pengalamanlabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(pengalaman))
                                .addGroup(buatberkasLayout.createSequentialGroup()
                                    .addComponent(skilllabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(skill, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 95, Short.MAX_VALUE)))
                .addContainerGap())
        );
        buatberkasLayout.setVerticalGroup(
            buatberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buatberkasLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(buatberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(skilllabel)
                    .addComponent(skill, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(buatberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buatberkasLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pengalamanlabel))
                    .addGroup(buatberkasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pengalaman, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72)
                .addComponent(btnBuat)
                .addGap(38, 38, 38)
                .addComponent(btnLogOut1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Buat Berkas", buatberkas);

        btnDaftar.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 12)); // NOI18N
        btnDaftar.setText("Daftar");

        tableLowongan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableLowongan);

        btnLogOut2.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        btnLogOut2.setText("Log Out");

        javax.swing.GroupLayout infolowongankerjaLayout = new javax.swing.GroupLayout(infolowongankerja);
        infolowongankerja.setLayout(infolowongankerjaLayout);
        infolowongankerjaLayout.setHorizontalGroup(
            infolowongankerjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infolowongankerjaLayout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(btnDaftar)
                .addContainerGap(310, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infolowongankerjaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(infolowongankerjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infolowongankerjaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnLogOut2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        infolowongankerjaLayout.setVerticalGroup(
            infolowongankerjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infolowongankerjaLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(infolowongankerjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                .addGap(120, 120, 120)
                .addComponent(btnDaftar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(btnLogOut2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Info Lowongan Kerja", infolowongankerja);

        tableBerkasDiterima.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tableBerkasDiterima);

        btnLogOut3.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        btnLogOut3.setText("Log Out");

        javax.swing.GroupLayout berkasditerimaLayout = new javax.swing.GroupLayout(berkasditerima);
        berkasditerima.setLayout(berkasditerimaLayout);
        berkasditerimaLayout.setHorizontalGroup(
            berkasditerimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(berkasditerimaLayout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addGroup(berkasditerimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, berkasditerimaLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, berkasditerimaLayout.createSequentialGroup()
                        .addComponent(btnLogOut3)
                        .addContainerGap())))
        );
        berkasditerimaLayout.setVerticalGroup(
            berkasditerimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, berkasditerimaLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(btnLogOut3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Berkas Diterima", berkasditerima);

        skilleditlabel.setText("Skill                                 :");

        skilledit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skilleditActionPerformed(evt);
            }
        });

        pengalamaneditlabel.setText("Pengalaman                   :");

        btnEdit.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnLogOut4.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        btnLogOut4.setText("Log Out");

        javax.swing.GroupLayout editberkasLayout = new javax.swing.GroupLayout(editberkas);
        editberkas.setLayout(editberkasLayout);
        editberkasLayout.setHorizontalGroup(
            editberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editberkasLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(editberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(editberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(editberkasLayout.createSequentialGroup()
                            .addComponent(pengalamaneditlabel)
                            .addGap(18, 18, 18)
                            .addComponent(pengalamanedit))
                        .addGroup(editberkasLayout.createSequentialGroup()
                            .addComponent(skilleditlabel)
                            .addGap(18, 18, 18)
                            .addComponent(skilledit, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editberkasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogOut4)
                .addContainerGap())
        );
        editberkasLayout.setVerticalGroup(
            editberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editberkasLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(editberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(skilleditlabel)
                    .addComponent(skilledit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(editberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editberkasLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pengalamaneditlabel))
                    .addGroup(editberkasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pengalamanedit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addComponent(btnEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(btnLogOut4)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Edit Berkas", editberkas);

        berkasanda.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        berkasanda.setText("Berkas Anda!");

        idpelamar.setText("Id Pelamar          :");

        namapelamar.setText("Nama Pelamar    :");

        nohppelamar.setText("No.HP Pelamar   :");

        emailpelamar.setText("Email Pelamar     :");

        pendidikan.setText("Pendidikan         :");

        skillberkas.setText("Skill                     :");

        pengalamanberkas.setText("Pengalaman       :");

        btnLogOut5.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        btnLogOut5.setText("Log Out");

        javax.swing.GroupLayout lihatberkasLayout = new javax.swing.GroupLayout(lihatberkas);
        lihatberkas.setLayout(lihatberkasLayout);
        lihatberkasLayout.setHorizontalGroup(
            lihatberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lihatberkasLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(lihatberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lihatberkasLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(berkasanda, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lihatberkasLayout.createSequentialGroup()
                        .addGroup(lihatberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pengalamanberkas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idpelamar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namapelamar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nohppelamar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emailpelamar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pendidikan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(skillberkas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(lihatberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(175, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lihatberkasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogOut5)
                .addGap(19, 19, 19))
        );
        lihatberkasLayout.setVerticalGroup(
            lihatberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lihatberkasLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(berkasanda, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(lihatberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idpelamar)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(lihatberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namapelamar)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(lihatberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nohppelamar)
                    .addComponent(jLabel10))
                .addGap(24, 24, 24)
                .addGroup(lihatberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailpelamar)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(lihatberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pendidikan)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(lihatberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(skillberkas)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(lihatberkasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pengalamanberkas)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(btnLogOut5)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Lihat Berkas", lihatberkas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nmperusahaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nmperusahaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nmperusahaanActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCariActionPerformed
    
    private void skillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_skillActionPerformed

    private void btnBuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuatActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void skilleditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skilleditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_skilleditActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditActionPerformed

    public JButton getBtnBuat() {
        return btnBuat;
    }

    public Button getBtnCari() {
        return btnCari;
    }

    public JButton getBtnDaftar() {
        return btnDaftar;
    }
    
    public JButton getBtnLogOut(){
        return btnLogOut;
    }
    
    public JButton getBtnLogOut1(){
        return btnLogOut1;
    }
    
    public JButton getBtnLogOut2(){
        return btnLogOut2;
    }

    public JPanel getBuatberkas() {
        return buatberkas;
    }

    public JPanel getCariperusahaan() {
        return cariperusahaan;
    }

    public JTable getTableLowongan() {
        return tableLowongan;
    }

    public JPanel getInfolowongankerja() {
        return infolowongankerja;
    }


    public String getNmperusahaan() {
        return nmperusahaan.getText();
    }

    public String getPengalaman() {
        return pengalaman.getText();
    }


    public String getSkill() {
        return skill.getText();
    }

    public void setPengalaman(String pengalaman) {
        this.pengalaman.setText(pengalaman);
    }
    public void setSkill(String skill) {
        this.skill.setText(skill);
    }
    public void addListener(ActionListener e){
        btnBuat.addActionListener(e);
        btnCari.addActionListener(e);
        btnDaftar.addActionListener(e);
        btnLogOut.addActionListener(e);
        btnLogOut1.addActionListener(e);
        btnLogOut2.addActionListener(e);
        btnLogOut3.addActionListener(e);
        btnEdit.addActionListener(e);
        btnLogOut4.addActionListener(e);
        btnLogOut5.addActionListener(e);
    }
    
    public void addAdapter(MouseAdapter e){
        tableLowongan.addMouseListener(e);
        tableBerkasDiterima.addMouseListener(e);
    }
    
    public void viewAllLowongan(List<Lowongan> lowongan){
        String [] judul= {
            "idLowongan","Nama Lowongan","DeadLine","Nama Perusahaan"
        };
        String[][] data=new String[lowongan.size()][4];
        for(int i=0;i<lowongan.size();i++){
            Lowongan l=lowongan.get(i);
            data[i][0]=String.valueOf(l.getIdLowongan());
            data[i][1]=String.valueOf(l.getNama());
            data[i][2]=String.valueOf(l.getDeadline());
            data[i][3]=l.getNamaPerusahaan();
        }
        tableLowongan.setModel(new DefaultTableModel(data,judul));
    }
    public void viewAllBerkasDiterima(List<Lowongan> lowongan){
        String [] judul= {
            "Nama Lowongan"
        };
        String[][] data=new String[lowongan.size()][1];
        for(int i=0;i<lowongan.size();i++){
            Lowongan l=lowongan.get(i);
            data[i][0]=String.valueOf(l.getNama());
        }
        tableBerkasDiterima.setModel(new DefaultTableModel(data,judul));
    }
    public int getSelectedLowongan(){
        return tableLowongan.getSelectedRow();
    }
    public int getSelectedBerkasDiterima(){
        return tableBerkasDiterima.getSelectedRow();
    }
    
    public JButton getBtnLogOut3() {
        return btnLogOut3;
    }

    public JTable getTableBerkasDiterima() {
        return tableBerkasDiterima;
    }

    public JButton getBtnEdit() {
        return btnEdit;
    }

    public JButton getBtnLogOut4() {
        return btnLogOut4;
    }

    public String getPengalamanedit() {
        return pengalamanedit.getText();
    }

    public String getSkilledit() {
        return skilledit.getText();
    }

    public void setPengalamanedit(String pengalamanedit) {
        this.pengalamanedit.setText(pengalamanedit);
    }

    public void setSkilledit(String skilledit) {
        this.skilledit.setText(skilledit);
    }

    public JButton getBtnLogOut5() {
        return btnLogOut5;
    }

    public void setIdpelamarset(String s) {
        this.jLabel8.setText(s);
    }

    public void setNamapelamarset(String s) {
        this.jLabel9.setText(s);
    }

    public void setNohppelamarset(String s) {
        this.jLabel10.setText(s);
    }

    public void setEmailpelamarset(String s) {
        this.jLabel11.setText(s);
    }
    

    public void setPendidikanset(String s) {
        this.jLabel12.setText(s);
    }

    public void setPengalamanlihatset(String s) {
        this.jLabel14.setText(s);
    }

    public void setSkilllihatset(String s) {
        this.jLabel13.setText(s);
    }
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel berkasanda;
    private javax.swing.JPanel berkasditerima;
    private javax.swing.JButton btnBuat;
    private java.awt.Button btnCari;
    private javax.swing.JButton btnDaftar;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnLogOut1;
    private javax.swing.JButton btnLogOut2;
    private javax.swing.JButton btnLogOut3;
    private javax.swing.JButton btnLogOut4;
    private javax.swing.JButton btnLogOut5;
    private javax.swing.JPanel buatberkas;
    private javax.swing.JPanel cariperusahaan;
    private javax.swing.JPanel editberkas;
    private javax.swing.JLabel emailpelamar;
    private javax.swing.JLabel idpelamar;
    private javax.swing.JPanel infolowongankerja;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel lihatberkas;
    private javax.swing.JLabel namapelamar;
    private javax.swing.JTextField nmperusahaan;
    private javax.swing.JLabel nmperusahaanlabel;
    private javax.swing.JLabel nohppelamar;
    private javax.swing.JLabel pendidikan;
    private javax.swing.JTextField pengalaman;
    private javax.swing.JLabel pengalamanberkas;
    private javax.swing.JTextField pengalamanedit;
    private javax.swing.JLabel pengalamaneditlabel;
    private javax.swing.JLabel pengalamanlabel;
    private javax.swing.JScrollBar scroll;
    private javax.swing.JTextField skill;
    private javax.swing.JLabel skillberkas;
    private javax.swing.JTextField skilledit;
    private javax.swing.JLabel skilleditlabel;
    private javax.swing.JLabel skilllabel;
    private javax.swing.JTable tableBerkasDiterima;
    private javax.swing.JTable tableLowongan;
    // End of variables declaration//GEN-END:variables
}
