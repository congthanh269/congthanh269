/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlhv.view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;

public class TrangChuJPanel extends JPanel {

  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;

  public TrangChuJPanel() {
    initComponents();
  }

  @SuppressWarnings("unchecked")

  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jPanel2 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jPanel3 = new javax.swing.JPanel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jPanel4 = new javax.swing.JPanel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();

    jPanel1.setBackground(new Color(240, 240, 240));

    jPanel2.setBackground(new Color(255, 85, 85));

    jLabel1.setIcon(new ImageIcon(getClass().getResource("/qlhv/images/icon_trangchu1_white_48dp.png"))); // NOI18N

    jLabel2.setFont(new Font("Dialog", 1, 24)); // NOI18N
    jLabel2.setForeground(new Color(255, 255, 255));
    jLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
    jLabel2.setText("100");

    jLabel3.setFont(new Font("Dialog", 1, 18)); // NOI18N
    jLabel3.setForeground(new Color(255, 255, 255));
    jLabel3.setText("Khóa Học");

    GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)
                            .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                            .addContainerGap(32, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(jLabel2)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addGap(56, 56, 56))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addComponent(jLabel1)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel3.setBackground(new Color(103, 195, 239));

    jLabel4.setIcon(new ImageIcon(getClass().getResource("/qlhv/images/icon_trangchu2_white_48dp.png"))); // NOI18N

    jLabel5.setFont(new Font("Dialog", 1, 24)); // NOI18N
    jLabel5.setForeground(new Color(255, 255, 255));
    jLabel5.setHorizontalAlignment(SwingConstants.RIGHT);
    jLabel5.setText("100");

    jLabel6.setFont(new Font("Dialog", 1, 18)); // NOI18N
    jLabel6.setForeground(new Color(255, 255, 255));
    jLabel6.setText("Học Viên");

    GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                            .addContainerGap(26, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(jLabel5)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addGap(56, 56, 56))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addGap(20, 20, 20))
    );

    jPanel4.setBackground(new Color(121, 196, 71));

    jLabel7.setIcon(new ImageIcon(getClass().getResource("/qlhv/images/icon_trangchu3_white_48dp.png"))); // NOI18N

    jLabel8.setFont(new Font("Dialog", 1, 24)); // NOI18N
    jLabel8.setForeground(new Color(255, 255, 255));
    jLabel8.setHorizontalAlignment(SwingConstants.RIGHT);
    jLabel8.setText("100");

    jLabel9.setFont(new Font("Dialog", 1, 18)); // NOI18N
    jLabel9.setForeground(new Color(255, 255, 255));
    jLabel9.setText("Hộp Thư");

    GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)
                            .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                            .addContainerGap(33, Short.MAX_VALUE))
    );
    jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(jLabel8)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9)
                            .addGap(56, 56, 56))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addComponent(jLabel7)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(96, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addContainerGap(281, Short.MAX_VALUE))
    );

    GroupLayout layout = new GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
  }// </editor-fold>                        
}
