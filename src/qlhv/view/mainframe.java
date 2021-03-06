/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlhv.view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import qlhv.bean.DanhMucBean;
import qlhv.controller.ChuyenManHinhController;

public class mainframe extends JFrame {
  JPanel jpnRoot = null;
  JPanel jpnMenu  = null;
  JPanel jPanel4  = null;
  JLabel jLabel1  = null;
  JPanel jpnTrangChu  = null;
  JLabel  jlbTrangChu  = null;
  JPanel jpnHocVien  = null;
  JLabel  jlbHocVien  = null;
  JPanel jpnKhoaHoc  = null;
  JLabel jlbKhoaHoc  = null;
  JPanel jpnLopHoc  = null;
  JLabel jlbLopHoc  = null; 
  JPanel jpnThongKe  = null;
  JLabel jlbThongKe  = null;
  JPanel jpnView  = null;

  public mainframe() {
    initComponents();
    setTitle("QUẢN LÝ HỌC VIÊN");

    ChuyenManHinhController controller = new ChuyenManHinhController(jpnView);
    controller.setView(jpnTrangChu, jlbTrangChu);

    List<DanhMucBean> listItem = new ArrayList<>();
    listItem.add(new DanhMucBean("TrangChu", jpnTrangChu, jlbTrangChu));
    listItem.add(new DanhMucBean("HocVien", jpnHocVien, jlbHocVien));
    listItem.add(new DanhMucBean("KhoaHoc", jpnKhoaHoc, jlbKhoaHoc));
    listItem.add(new DanhMucBean("LopHoc", jpnLopHoc, jlbLopHoc));
    listItem.add(new DanhMucBean("ThongKe", jpnThongKe, jlbThongKe));

    controller.setEvent(listItem);
    setVisible(true);
  }

  public void initComponents() {
    jpnRoot = new javax.swing.JPanel();
    jpnMenu = new javax.swing.JPanel();
    jPanel4 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jpnTrangChu = new javax.swing.JPanel();
    jlbTrangChu = new javax.swing.JLabel();
    jpnHocVien = new javax.swing.JPanel();
    jlbHocVien = new javax.swing.JLabel();
    jpnKhoaHoc = new javax.swing.JPanel();
    jlbKhoaHoc = new javax.swing.JLabel();
    jpnLopHoc = new javax.swing.JPanel();
    jlbLopHoc = new javax.swing.JLabel();
    jpnThongKe = new javax.swing.JPanel();
    jlbThongKe = new javax.swing.JLabel();
    jpnView = new javax.swing.JPanel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jpnMenu.setBackground(new java.awt.Color(82, 83, 81));

    jPanel4.setBackground(new java.awt.Color(232, 64, 60));

    jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlhv/images/icon_ung_dung_circle_white_24dp.png"))); // NOI18N
    jLabel1.setText("QUẢN LÝ HỌC VIÊN");

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jLabel1)
                            .addContainerGap(15, Short.MAX_VALUE))
    );

    jpnTrangChu.setBackground(new java.awt.Color(76, 175, 80));

    jlbTrangChu.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jlbTrangChu.setForeground(new java.awt.Color(255, 255, 255));
    jlbTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlhv/images/icon_menu0_white_24dp.png"))); // NOI18N
    jlbTrangChu.setText("Màn Hình Chính");

    javax.swing.GroupLayout jpnTrangChuLayout = new javax.swing.GroupLayout(jpnTrangChu);
    jpnTrangChu.setLayout(jpnTrangChuLayout);
    jpnTrangChuLayout.setHorizontalGroup(
            jpnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnTrangChuLayout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jlbTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(15, Short.MAX_VALUE))
    );
    jpnTrangChuLayout.setVerticalGroup(
            jpnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnTrangChuLayout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jlbTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(15, Short.MAX_VALUE))
    );

    jpnHocVien.setBackground(new java.awt.Color(76, 175, 80));

    jlbHocVien.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jlbHocVien.setForeground(new java.awt.Color(255, 255, 255));
    jlbHocVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlhv/images/icon_menu1_white_24dp.png"))); // NOI18N
    jlbHocVien.setText("Quản Lý Học Viên");

    javax.swing.GroupLayout jpnHocVienLayout = new javax.swing.GroupLayout(jpnHocVien);
    jpnHocVien.setLayout(jpnHocVienLayout);
    jpnHocVienLayout.setHorizontalGroup(
            jpnHocVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnHocVienLayout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jlbHocVien, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(15, Short.MAX_VALUE))
    );
    jpnHocVienLayout.setVerticalGroup(
            jpnHocVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnHocVienLayout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jlbHocVien, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(15, Short.MAX_VALUE))
    );

    jpnKhoaHoc.setBackground(new java.awt.Color(76, 175, 80));

    jlbKhoaHoc.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jlbKhoaHoc.setForeground(new java.awt.Color(255, 255, 255));
    jlbKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlhv/images/icon_menu2_white_24dp.png"))); // NOI18N
    jlbKhoaHoc.setText("Quản Lý Khóa Học");

    javax.swing.GroupLayout jpnKhoaHocLayout = new javax.swing.GroupLayout(jpnKhoaHoc);
    jpnKhoaHoc.setLayout(jpnKhoaHocLayout);
    jpnKhoaHocLayout.setHorizontalGroup(
            jpnKhoaHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnKhoaHocLayout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jlbKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(15, Short.MAX_VALUE))
    );
    jpnKhoaHocLayout.setVerticalGroup(
            jpnKhoaHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnKhoaHocLayout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jlbKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(15, Short.MAX_VALUE))
    );

    jpnLopHoc.setBackground(new java.awt.Color(76, 175, 80));

    jlbLopHoc.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jlbLopHoc.setForeground(new java.awt.Color(255, 255, 255));
    jlbLopHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlhv/images/icon_menu3_white_24dp.png"))); // NOI18N
    jlbLopHoc.setText("Quản Lý Lớp Học");

    javax.swing.GroupLayout jpnLopHocLayout = new javax.swing.GroupLayout(jpnLopHoc);
    jpnLopHoc.setLayout(jpnLopHocLayout);
    jpnLopHocLayout.setHorizontalGroup(
            jpnLopHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnLopHocLayout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jlbLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(15, Short.MAX_VALUE))
    );
    jpnLopHocLayout.setVerticalGroup(
            jpnLopHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnLopHocLayout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jlbLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(15, Short.MAX_VALUE))
    );

    jpnThongKe.setBackground(new java.awt.Color(76, 175, 80));

    jlbThongKe.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jlbThongKe.setForeground(new java.awt.Color(255, 255, 255));
    jlbThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlhv/images/icon_menu4_white_24dp.png"))); // NOI18N
    jlbThongKe.setText("Thống Kê Dữ Liệu");

    javax.swing.GroupLayout jpnThongKeLayout = new javax.swing.GroupLayout(jpnThongKe);
    jpnThongKe.setLayout(jpnThongKeLayout);
    jpnThongKeLayout.setHorizontalGroup(
            jpnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnThongKeLayout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jlbThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(15, Short.MAX_VALUE))
    );
    jpnThongKeLayout.setVerticalGroup(
            jpnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnThongKeLayout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jlbThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(15, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
    jpnMenu.setLayout(jpnMenuLayout);
    jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpnMenuLayout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jpnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jpnLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jpnKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jpnHocVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jpnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(15, Short.MAX_VALUE))
    );
    jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnMenuLayout.createSequentialGroup()
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jpnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jpnHocVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jpnKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jpnLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jpnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(195, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
    jpnView.setLayout(jpnViewLayout);
    jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGap(0, 666, Short.MAX_VALUE)
    );
    jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGap(0, 0, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
    jpnRoot.setLayout(jpnRootLayout);
    jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                            .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                            .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
  }

  public static void main(String[] args) {
    new mainframe();
  }

}
