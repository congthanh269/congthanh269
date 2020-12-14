package qlhv.ultity;

import qlhv.model.HocVien;

import javax.swing.table.DefaultTableModel;
import java.util.List;

public class ClassTableModel {
  public DefaultTableModel setTableHocVien(List<HocVien> listItem, String[] listColumn) {
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
        HocVien hocVien = listItem.get(i);
        obj = new Object[column];
        obj[0] = hocVien.getMa_hoc_vien();
        obj[1] = (i+1);
        obj[2] = hocVien.getHo_ten();
        obj[3] = hocVien.getNgaysinh();
        obj[4] = hocVien.isGioitinh() == true ? "Nam" : "Nữ";
        obj[5] = hocVien.getSo_dien_thoai();
        obj[6] = hocVien.getDia_chi();
        obj[7] = hocVien.isTinhtrang();
        dtm.addRow(obj);
      }
    }

    return dtm;
  }

}
