/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlhv.service;

import java.util.List;
import qlhv.dao.KhoaHocDAO;
import qlhv.dao.KhoaHocDAOImpl;
import qlhv.dao.LopHocDAO;
import qlhv.dao.LopHocDAOImpl;
import qlhv.model.KhoaHoc;
import qlhv.model.LopHoc;

/**
 *
 * @author Admin
 */
public class LopHocServiceImpl implements LopHocService{
    private LopHocDAO lopHocDAO = null;
  public LopHocServiceImpl() {
    lopHocDAO = new LopHocDAOImpl();
  }
  @Override
  public List<LopHoc> getList() {
    return lopHocDAO.getList();
  }   
}
