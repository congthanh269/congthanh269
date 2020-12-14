package qlhv.service;

import qlhv.dao.HocVienDAO;
import qlhv.dao.HocVienDAOImpl;
import qlhv.model.HocVien;

import java.util.List;

public interface HocVienService {
  public List<HocVien> getList();
}
