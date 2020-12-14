package qlhv.dao;

import qlhv.model.HocVien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HocVienDAOImpl implements HocVienDAO {

  @Override
  public List<HocVien> getList() {
    Connection cons = null;
    PreparedStatement preparedStatement = null;
    ResultSet rs = null;
    String sql = "SELECT * FROM hoc_vien";
    List<HocVien> list = new ArrayList<>();
    try {
      cons = DBConnect.getConnection();
      preparedStatement = cons.prepareStatement(sql);
      rs = preparedStatement.executeQuery();
      while (rs.next()) {
        HocVien hocVien = new HocVien();
        hocVien.setMa_hoc_vien(rs.getInt("ma_hoc_vien"));
        hocVien.setHo_ten(rs.getString("ho_ten"));
        hocVien.setNgaysinh(rs.getDate("ngay_sinh"));
        hocVien.setGioitinh(rs.getBoolean("gioi_tinh"));
        hocVien.setSo_dien_thoai(rs.getString("so_dien_thoai"));
        hocVien.setDia_chi(rs.getString("dia_chi"));
        hocVien.setTinhtrang(rs.getBoolean("tinh_trang"));

        list.add(hocVien);
      }
      return list;
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        cons.close();
        rs.close();
        preparedStatement.close();
      } catch (SQLException throwables) {
        throwables.printStackTrace();
      }
    }
    return null;
  }

  public static void main(String[] args) {
    HocVienDAO hocVienDAO = new HocVienDAOImpl();
    System.out.println(hocVienDAO.getList());

  }
}
