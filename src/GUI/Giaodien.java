package GUI;

import Entities.docgia;
import Entities.phieumuon;
import Entities.sach;
import Proceed.Giaotiep;
import Proceed.docghifile;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class Giaodien extends javax.swing.JFrame {

    DefaultTableModel model;
    DefaultTableModel model1;
    DefaultTableModel model2;
    private ArrayList<Giaotiep> listsach;
    private ArrayList<Giaotiep> listdocgia;
    private ArrayList<Giaotiep> listphieumuon;
    docghifile ioFile;

    public Giaodien() {
        initComponents();
        ioFile = new docghifile();
        listsach = ioFile.doc("sach.DAT");
        listdocgia = ioFile.doc("docgia.DAT");
        listphieumuon = ioFile.doc("phieumuon.DAT");
        hienthisach();
        hienthidocgia();
        hienthiphieumuon();
    }

    public void hienthisach() {
        model = (DefaultTableModel) banghienthisach.getModel();
        for (Giaotiep g : listsach) {
            sach s = (sach) g;
            model.addRow(new Object[]{
                s.getMasach(), s.getTensach(), s.getTacgia(), s.getSoluong(), s.getTinhtrang()
            });
        }
    }

    public void hienthidocgia() {
        model1 = (DefaultTableModel) banghienthidg.getModel();
        for (Giaotiep g : listdocgia) {
            docgia dg = (docgia) g;
            model1.addRow(new Object[]{
                dg.getMadg(), dg.getTendg(), dg.getDiachi(), dg.getSdtdg()
            });
        }
    }

    public void hienthiphieumuon() {
        model2 = (DefaultTableModel) banghienthiphieumuon.getModel();
        for (Giaotiep g : listphieumuon) {
            phieumuon pm = (phieumuon) g;
            model2.addRow(new Object[]{
                pm.getMadausach(), pm.getMaphieumuon(), pm.getMadocgia(), pm.getNgaymuon()
            });
        }
    }

    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        banghienthisach = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        nhaptensach = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        nhaptacgia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        nhapsoluongsach = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tinhtrangsach = new javax.swing.JComboBox<>();
        themsach = new javax.swing.JButton();
        nutxoa = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        themdg = new javax.swing.JButton();
        xoadg = new javax.swing.JButton();
        nhapsdt = new javax.swing.JTextField();
        nhapdiachi = new javax.swing.JTextField();
        nhaptendg = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        banghienthidg = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        nutthemkhach = new javax.swing.JButton();
        nutxoakhachmuon = new javax.swing.JButton();
        nhapngay = new javax.swing.JTextField();
        nhapmaspm = new javax.swing.JTextField();
        nhapmadgpm = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        banghienthiphieumuon = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý Mượn Trả Sách Thư viện");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        banghienthisach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Mã sách", "Tên sách", "Tác giả", "Số lượng", "Tình trạng"
            }
        ) {
            private static final long serialVersionUID = 1L;
			Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(banghienthisach);

        jLabel6.setText("Tên sách");

        nhaptensach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhaptensachActionPerformed(evt);
            }
        });

        jLabel8.setText("Tác giả");

        nhaptacgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhaptacgiaActionPerformed(evt);
            }
        });

        jLabel9.setText("Số lượng");

        jLabel10.setText("Tình trạng");

        tinhtrangsach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Còn", "Hết" }));
        tinhtrangsach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });

        themsach.setText("Thêm");
        themsach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themsachActionPerformed(evt);
            }
        });

        nutxoa.setText("Xóa");
        nutxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutxoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(themsach, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(34, 34, 34)
                    .addComponent(nutxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(74, 74, 74)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10))
                    .addGap(28, 28, 28)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(nhaptensach, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nhapsoluongsach, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nhaptacgia, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tinhtrangsach, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(46, 46, 46)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(nhaptensach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(themsach)
                        .addComponent(nutxoa))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nhaptacgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addGap(13, 13, 13)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nhapsoluongsach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addGap(15, 15, 15)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(tinhtrangsach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(33, Short.MAX_VALUE))
        );
        jTabbedPane1.addTab("Quản lý sách", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        themdg.setText("Thêm");
        themdg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themdgActionPerformed(evt);
            }
        });

        xoadg.setText("Xóa");
        xoadg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoadgActionPerformed(evt);
            }
        });

        nhapsdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapsdtActionPerformed(evt);
            }
        });

        nhapdiachi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapdiachiActionPerformed(evt);
            }
        });

        jLabel11.setText("Tên đọc giả");

        jLabel12.setText("Địa chỉ");

        jLabel14.setText("Số điện thoại");

        banghienthidg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã đọc giả", "Tên đọc giả", "Địa chỉ", "Số điện thoại"
            }
        ) {
            private static final long serialVersionUID = 1L;
			Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(banghienthidg);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(themdg, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(xoadg, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14))))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nhapsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nhapdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nhaptendg, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(nhaptendg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(themdg)
                            .addComponent(xoadg))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(nhapdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(nhapsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản lý đọc giả", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        nutthemkhach.setText("Thêm ");
        nutthemkhach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutthemkhachActionPerformed(evt);
            }
        });

        nutxoakhachmuon.setText("Xóa ");
        nutxoakhachmuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutxoakhachmuonActionPerformed(evt);
            }
        });

        nhapngay.setText("   /   / 2023");
        nhapngay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapngayActionPerformed(evt);
            }
        });

        nhapmaspm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapmaspmActionPerformed(evt);
            }
        });

        nhapmadgpm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapmadgpmActionPerformed(evt);
            }
        });

        jLabel16.setText("Mã đọc giả");
        jLabel18.setText("Mã sách      ");
        jLabel19.setText("Ngày mượn     ");
        banghienthiphieumuon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu mượn", "Mã đọc giả ", "Mã sách ", "Ngày mượn"
            }
        ) {
            private static final long serialVersionUID = 1L;
			Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(banghienthiphieumuon);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(nutthemkhach, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nhapngay, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nhapmaspm, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(nutxoakhachmuon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nhapmadgpm, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(nhapmadgpm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(nhapmaspm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(nhapngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nutthemkhach)
                            .addComponent(nutxoakhachmuon))))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản lý mượn sách", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }                       

    private void nhapdiachiActionPerformed(java.awt.event.ActionEvent evt) {                                           

    }                                          

    private void nutxoakhachmuonActionPerformed(java.awt.event.ActionEvent evt) {                                                
 int hangpm = banghienthiphieumuon.getSelectedRow();
       if (hangpm != -1) {
           model2.removeRow(hangpm);
            listphieumuon.remove(hangpm);
           ioFile.ghi(listphieumuon, "phieumuon.DAT");
        }else{
           JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn dòng muốn xóa!");
       }
    
    }                                               

    public boolean khongtrungmasach(int masach) { 
        for (Giaotiep g : listsach) {
            sach s = (sach) g;
            if (s.getMasach() == masach) {
                return false;
            }
        }
        return true;
    }

    public boolean khongtrungmadg(int madg) {
        for (Giaotiep g : listdocgia) {
            docgia dg = (docgia) g;
            if (dg.getMadg() == madg) {
                return false;
            }
        }
        return true;
    }

    public boolean khongtrungmapm(int mapm) { 
        for (Giaotiep g : listphieumuon) {
            phieumuon pm = (phieumuon) g;
            if (pm.getMaphieumuon() == mapm) {
                return false;
            }
        }
        return true;
 }
        // Chức năng nút thêm sách
    private void themdgActionPerformed(java.awt.event.ActionEvent evt) {
        if (nhaptendg.getText().length() != 0 && nhapsdt.getText().length() != 0 && nhapdiachi.getText().length() != 0 ) {
            int madg = 1;
            while (true) {
                if (khongtrungmadg(madg)) {
                    break;
                }
                madg++;
            }
            docgia dg = new docgia();
            dg.setMadg(madg);
            dg.setTendg(nhaptendg.getText());
            dg.setDiachi(nhapdiachi.getText());
            dg.setSdtdg(Integer.parseInt(nhapsdt.getText()));
            listdocgia.add(dg);
            ioFile.ghi(listdocgia, "docgia.DAT");
            model1.addRow(new Object[]{
                dg.getMadg(), dg.getTendg(), dg.getDiachi(), dg.getSdtdg()});
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần nhập tất cả thông tin!");
        }
    }                                      
    // nút xóa đọc giả
    private void xoadgActionPerformed(java.awt.event.ActionEvent evt) {
        int hangdg = banghienthidg.getSelectedRow();
        if (hangdg != -1) {
            model1.removeRow(hangdg);
            listdocgia.remove(hangdg);
            ioFile.ghi(listdocgia, "docgia.DAT");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn đọc giả muốn xóa!");
        }
    }                                     

    private void nutthemkhachActionPerformed(java.awt.event.ActionEvent evt) {                                             
        if (nhapmadgpm.getText().length() != 0 && nhapmaspm.getText().length() != 0 && nhapngay.getText().length() != 0) {//độ dài chuỗi nhập vào khác 0
            int mapm = 1;
            while (true) {
                if (khongtrungmapm(mapm)) {
                    break;
                }
                mapm++;
            }
            phieumuon pm = new phieumuon();
            pm.setMaphieumuon(mapm);
            pm.setNgaymuon(nhapngay.getText());
            pm.setMadausach(Integer.parseInt(nhapmaspm.getText()));
            pm.setMadocgia(Integer.parseInt(nhapmadgpm.getText()));
            listphieumuon.add(pm);
            ioFile.ghi(listphieumuon, "phieumuon.DAT");
            model2.addRow(new Object[]{
                pm.getMaphieumuon(), pm.getMadocgia(), pm.getMadausach(), pm.getNgaymuon()});
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần nhập đầy đủ thông tin!");
        }
    }                                            

    private void nhapngayActionPerformed(java.awt.event.ActionEvent evt) {
    }                                        

    private void nhapmaspmActionPerformed(java.awt.event.ActionEvent evt) {                                          
    }                                         

    private void nhapmadgpmActionPerformed(java.awt.event.ActionEvent evt) {                                           
    }                                          
    // Nút xóa sách
    private void nutxoaActionPerformed(java.awt.event.ActionEvent evt) {                                       
        int hang = banghienthisach.getSelectedRow();
        if (hang != -1) {
            model.removeRow(hang);
            listsach.remove(hang);
            ioFile.ghi(listsach, "sach.DAT");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn dòng muốn xóa!");
        }
    }                                      
    //nút thêm sách
    private void themsachActionPerformed(java.awt.event.ActionEvent evt) {
        if (nhaptensach.getText().length() != 0) {
            int ma = 1;
            while (true) {
                if (khongtrungmasach(ma)) {
                    break;
                }
                ma++;
            }
            sach s = new sach();
            s.setMasach(ma);
            s.setTensach(nhaptensach.getText());
            s.setTacgia(nhaptacgia.getText());
            if (nhapsoluongsach.getText().length() == 0) {
                s.setSoluong(0);
            } else {
                s.setSoluong(Integer.parseInt(nhapsoluongsach.getText()));//(1)
            }

            s.setTinhtrang(tinhtrangsach.getSelectedItem().toString());
            listsach.add(s);
            ioFile.ghi(listsach, "sach.DAT");

            model.addRow(new Object[]{
                s.getMasach(), s.getTensach(), s.getTacgia(), s.getSoluong(), s.getTinhtrang()});
    }
     else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần nhập Tên sách!");
        }
    }                                       
    private void nhaptensachActionPerformed(java.awt.event.ActionEvent evt) {                                            
    }                                           

    private void nhapsdtActionPerformed(java.awt.event.ActionEvent evt) {                                        
    }                                       

    private void nhaptacgiaActionPerformed(java.awt.event.ActionEvent evt) {                                           
    }                                          

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Giaodien.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Giaodien.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Giaodien.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Giaodien.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Giaodien().setVisible(true);
            }
        });
    }                 
    private javax.swing.JTable banghienthidg;
    private javax.swing.JTable banghienthiphieumuon;
    private javax.swing.JTable banghienthisach;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nhapdiachi;
    private javax.swing.JTextField nhapmadgpm;
    private javax.swing.JTextField nhapmaspm;
    private javax.swing.JTextField nhapngay;
    private javax.swing.JTextField nhapsdt;
    private javax.swing.JTextField nhapsoluongsach;
    private javax.swing.JTextField nhaptacgia;
    private javax.swing.JTextField nhaptendg;
    private javax.swing.JTextField nhaptensach;
    private javax.swing.JButton nutthemkhach;
    private javax.swing.JButton nutxoa;
    private javax.swing.JButton nutxoakhachmuon;
    private javax.swing.JButton themdg;
    private javax.swing.JButton themsach;
    private javax.swing.JComboBox<String> tinhtrangsach;
    private javax.swing.JButton xoadg;
}