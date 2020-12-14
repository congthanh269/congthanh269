/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlhv.controller;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import qlhv.model.KhoaHoc;
import qlhv.model.LopHoc;
import qlhv.service.KhoaHocService;
import qlhv.service.KhoaHocServiceImpl;
import qlhv.service.LopHocService;
import qlhv.service.LopHocServiceImpl;
import qlhv.ultity.ClassTableModelKhoaHoc;
import qlhv.ultity.ClassTableModelLopHoc;

/**
 *
 * @author Admin
 */
public class QuanLyLopHocController {
  private JPanel jpnView;
  private JTextField jtfSearch;

  private LopHocService lopHocService = null;

  private String[] listColumn = {"STT", "Tên khóa hoc", "Mô tả", "Ngày bắt đầu", "Ngày kết thúc"};
  private TableRowSorter<TableModel> rowSorter = null;    

    public QuanLyLopHocController(JPanel jpnView, JTextField jtfSearch) {
    this.jpnView = jpnView;
    this.jtfSearch = jtfSearch;

    this.lopHocService = new LopHocServiceImpl();
  }

  public void setDateToTable() {
    List<LopHoc> listItem = lopHocService.getList();
    DefaultTableModel model = new ClassTableModelLopHoc().setTableLopHoc(listItem, listColumn);
    JTable table = new JTable(model);

    rowSorter = new TableRowSorter<>(table.getModel());
    table.setRowSorter(rowSorter);
    jtfSearch.getDocument().addDocumentListener(new DocumentListener() {
      @Override
      public void insertUpdate(DocumentEvent e) {
        String text = jtfSearch.getText();
        if (text == null) {
          rowSorter.setRowFilter(null);
        } else {
          rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
        }
      }

      @Override
      public void removeUpdate(DocumentEvent e) {
        String text = jtfSearch.getText();
        if (text == null) {
          rowSorter.setRowFilter(null);
        } else {
          rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
        }
      }

      @Override
      public void changedUpdate(DocumentEvent e) {

      }
    });

    table.getColumnModel().getColumn(0).setMinWidth(0);
    table.getColumnModel().getColumn(0).setMaxWidth(0);
    table.getColumnModel().getColumn(0).setMaxWidth(0);

    table.getColumnModel().getColumn(1).setMinWidth(80);
    table.getColumnModel().getColumn(1).setMaxWidth(80);
    table.getColumnModel().getColumn(1).setMaxWidth(80);

    table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
    table.getTableHeader().setPreferredSize(new Dimension(100, 50));
    table.setRowHeight(50);
    table.validate();
    table.repaint();

    JScrollPane scrollPane = new JScrollPane();
    scrollPane.getViewport().add(table);
    scrollPane.setPreferredSize(new Dimension(1300, 400));

    jpnView.removeAll();
    jpnView.setLayout(new BorderLayout());
    jpnView.add(scrollPane);
    jpnView.validate();
    jpnView.repaint();
  }

}
