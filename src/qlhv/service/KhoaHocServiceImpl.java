/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlhv.service;

import java.util.List;
import qlhv.dao.HocVienDAO;
import qlhv.dao.HocVienDAOImpl;
import qlhv.dao.KhoaHocDAO;
import qlhv.dao.KhoaHocDAOImpl;
import qlhv.model.KhoaHoc;

/**
 *
 * @author Admin
 */
public class KhoaHocServiceImpl implements KhoaHocService {
   private KhoaHocDAO khoaHocDAO = null;
  public KhoaHocServiceImpl() {
    khoaHocDAO = new KhoaHocDAOImpl();
  }
  @Override
  public List<KhoaHoc> getList() {
    return khoaHocDAO.getList();
  }   
}
