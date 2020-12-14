/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlhv.model;

import java.util.Date;

/**
 *
 * @author duc
 */
public class HocVien {
  private int ma_hoc_vien;
  private String ho_ten;
  private String so_dien_thoai;
  private String dia_chi;
  private Date ngaysinh;
  private boolean gioitinh;

  public int getMa_hoc_vien() {
    return ma_hoc_vien;
  }

  public void setMa_hoc_vien(int ma_hoc_vien) {
    this.ma_hoc_vien = ma_hoc_vien;
  }

  public String getHo_ten() {
    return ho_ten;
  }

  public void setHo_ten(String ho_ten) {
    this.ho_ten = ho_ten;
  }

  public String getSo_dien_thoai() {
    return so_dien_thoai;
  }

  public void setSo_dien_thoai(String so_dien_thoai) {
    this.so_dien_thoai = so_dien_thoai;
  }

  public String getDia_chi() {
    return dia_chi;
  }

  public void setDia_chi(String dia_chi) {
    this.dia_chi = dia_chi;
  }

  public Date getNgaysinh() {
    return ngaysinh;
  }

  public void setNgaysinh(Date ngaysinh) {
    this.ngaysinh = ngaysinh;
  }

  public boolean isGioitinh() {
    return gioitinh;
  }

  public void setGioitinh(boolean gioitinh) {
    this.gioitinh = gioitinh;
  }

  public boolean isTinhtrang() {
    return tinhtrang;
  }

  public void setTinhtrang(boolean tinhtrang) {
    this.tinhtrang = tinhtrang;
  }
  private boolean tinhtrang;
  
  public String toString() {
    return ma_hoc_vien + " - " + ho_ten;
  }
  
  
}
