package qlhv.service;

import qlhv.dao.HocVienDAO;
import qlhv.dao.HocVienDAOImpl;
import qlhv.model.HocVien;

import java.util.List;

public class HocVienServiceImpl implements HocVienService {
  private HocVienDAO hocVienDao = null;
  public HocVienServiceImpl() {
    hocVienDao = new HocVienDAOImpl();
  }
  @Override
  public List<HocVien> getList() {
    return hocVienDao.getList();
  }
}
