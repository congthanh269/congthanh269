/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlhv.view;

import qlhv.controller.QuanLyHocVienController;

public class HocVienJPanel extends javax.swing.JPanel {

  public HocVienJPanel() {
    initComponents();
    QuanLyHocVienController controller = new QuanLyHocVienController(jpnView, btnAdd, jtfSearch);
    controller.setDateToTable();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jpnRoot = new javax.swing.JPanel();
    jtfSearch = new javax.swing.JTextField();
    btnAdd = new javax.swing.JButton();
    jpnView = new javax.swing.JPanel();

    jpnRoot.setBackground(new java.awt.Color(240, 240, 240));

    jtfSearch.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

    btnAdd.setBackground(new java.awt.Color(76, 175, 80));
    btnAdd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    btnAdd.setForeground(new java.awt.Color(0, 0, 0));
    btnAdd.setText("+ Thêm mới");
    btnAdd.setBorder(null);

    javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
    jpnView.setLayout(jpnViewLayout);
    jpnViewLayout.setHorizontalGroup(
      jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 0, Short.MAX_VALUE)
    );
    jpnViewLayout.setVerticalGroup(
      jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 398, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
    jpnRoot.setLayout(jpnRootLayout);
    jpnRootLayout.setHorizontalGroup(
      jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRootLayout.createSequentialGroup()
        .addGap(21, 21, 21)
        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(jpnRootLayout.createSequentialGroup()
            .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 324, Short.MAX_VALUE)
            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(16, 16, 16))
    );
    jpnRootLayout.setVerticalGroup(
      jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jpnRootLayout.createSequentialGroup()
        .addGap(22, 22, 22)
        .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAdd;
  private javax.swing.JPanel jpnRoot;
  private javax.swing.JPanel jpnView;
  private javax.swing.JTextField jtfSearch;
  // End of variables declaration//GEN-END:variables
}