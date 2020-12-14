/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlhv.ultity;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import qlhv.model.HocVien;
import qlhv.model.KhoaHoc;

/**
 *
 * @author Admin
 */
public class ClassTableModelKhoaHoc {
  public DefaultTableModel setTableKhoaHoc(List<KhoaHoc> listItem, String[] listColumn) {
    DefaultTableModel dtm = new DefaultTableModel() {
      public boolean isCellEditable(int row, int column) {

        return false;
      }

      @Override
      public Class<?> getColumnClass(int columnIndex) {
        return columnIndex == 7 ? Boolean.class : String.class;
      }
    };
    dtm.setColumnIdentifiers(listColumn);
    int column = listColumn.length;
    Object[] obj = null;
    int rows = listItem.size();
    if(rows > 0) {
      for(int i=0; i<rows; i++) {
        KhoaHoc khoaHoc = listItem.get(i);
        obj = new Object[column];
        obj[0] = khoaHoc.getMa_khoa_hoc();
        obj[1] = khoaHoc.getTen_khoa_hoc();
        obj[2] = khoaHoc.getMo_ta();
        obj[3] = khoaHoc.getNgay_bat_dau();
        obj[4] = khoaHoc.getNgay_ket_thuc();
        obj[5] = khoaHoc.isTinh_trang();
        dtm.addRow(obj);
      }
    }

    return dtm;
  }    
}
