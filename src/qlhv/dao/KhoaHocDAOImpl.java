/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlhv.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import qlhv.model.KhoaHoc;
import qlhv.service.KhoaHocServiceImpl;

/**
 *
 * @author Admin
 */
public class KhoaHocDAOImpl implements KhoaHocDAO {
   
    @Override
  public List<KhoaHoc> getList() {
    Connection cons = null;
    PreparedStatement preparedStatement = null;
    ResultSet rs = null;
    String sql = "SELECT * FROM khoa_hoc";
    List<KhoaHoc> list = new ArrayList<>();  
    try {
      cons = DBConnect.getConnection();
      preparedStatement = cons.prepareStatement(sql);
      rs = preparedStatement.executeQuery();
      while (rs.next()) {
        KhoaHoc khoaHoc = new KhoaHoc();
        khoaHoc.setMa_khoa_hoc(rs.getInt("ma_khoa_hoc"));
        khoaHoc.setTen_khoa_hoc(rs.getString("ten_khoa_hoc"));
        khoaHoc.setMo_ta(rs.getString("mo_ta"));
        khoaHoc.setNgay_bat_dau(rs.getDate("ngay_bat_dau"));
        khoaHoc.setNgay_ket_thuc(rs.getDate("ngay_ket_thuc"));
        khoaHoc.setTinh_trang(rs.getBoolean("tinh_trang"));

        list.add(khoaHoc);
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
}