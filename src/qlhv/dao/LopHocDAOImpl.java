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
import qlhv.model.LopHoc;

/**
 *
 * @author Admin
 */
public class LopHocDAOImpl implements LopHocDAO{
   @Override
  public List<LopHoc> getList() {
    Connection cons = null;
    PreparedStatement preparedStatement = null;
    ResultSet rs = null;
    String sql = "select * " +
"	FROM  lop_hoc inner join khoa_hoc on khoa_hoc.ma_khoa_hoc=lop_hoc.ma_khoa_hoc" +
"            join hoc_vien on hoc_vien.ma_hoc_vien = lop_hoc.ma_hoc_vien";
    List<LopHoc> list = new ArrayList<>();  
    try {
      cons = DBConnect.getConnection();
      preparedStatement = cons.prepareStatement(sql);
      rs = preparedStatement.executeQuery();
      
      while (rs.next()) {
        LopHoc lopHoc = new LopHoc();
        
        lopHoc.khoaHoc.setTen_khoa_hoc(rs.getString("ten_khoa_hoc"));
        lopHoc.khoaHoc.setMo_ta(rs.getString("mo_ta"));
        lopHoc.khoaHoc.setNgay_bat_dau(rs.getDate("ngay_bat_dau"));
        lopHoc.khoaHoc.setNgay_ket_thuc(rs.getDate("ngay_ket_thuc"));
        list.add(lopHoc);
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
