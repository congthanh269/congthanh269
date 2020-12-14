package qlhv.controller;


import qlhv.model.HocVien;
import qlhv.service.HocVienService;
import qlhv.service.HocVienServiceImpl;
import qlhv.ultity.ClassTableModel;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.util.List;

public class QuanLyHocVienController {
  private JPanel jpnView;
  private JButton btnAdd;
  private JTextField jtfSearch;

  private HocVienService hocVienService = null;

  private String[] listColumn = {"Mã học viên", "STT", "Họ Tên", "Ngày sinh", "Giới tính",
          "Số điện thoại", "Địa chỉ", "Tình trạng"};

  private TableRowSorter<TableModel> rowSorter = null;

  public QuanLyHocVienController(JPanel jpnView, JButton btnAdd, JTextField jtfSearch) {
    this.jpnView = jpnView;
    this.btnAdd = btnAdd;
    this.jtfSearch = jtfSearch;

    this.hocVienService = new HocVienServiceImpl();
  }

  public void setDateToTable() {
    List<HocVien> listItem = hocVienService.getList();
    DefaultTableModel model = new ClassTableModel().setTableHocVien(listItem, listColumn);
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
