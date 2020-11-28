package org.dsir.dao.impl;

import org.dsir.dao.MenuDAO;
import org.dsir.pojo.MenuPOJO;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class MenuDAOImpl implements MenuDAO {
    Connection conn;
    public MenuDAOImpl(Connection conn){
        this.conn = conn;
    }

    @Override
    public List<MenuPOJO> findAll(String menuName, int isDelete, int pageSize, int pageCurrent) {
        return null;
    }

    @Override
    public int findCountByNameState(String menuName, int isDelete) {
        return 0;
    }

    @Override
    public MenuPOJO findByMenuId(BigDecimal menuId) {
        return null;
    }

    @Override
    public boolean doUpd(MenuPOJO pojo) {
        return false;
    }

    @Override
    public boolean doIns(MenuPOJO pojo) {
        boolean flag = false;
        PreparedStatement pstate =null;
        try {
            this.conn.setAutoCommit(false);
            String sql = "insert into menu (menu_id,menu_path,menu_name,is_delete"
                    +"value(?,?,?，1)";
            pstate = this.conn.prepareStatement(sql);

            pstate.setBigDecimal(1,pojo.getMenuId());
            pstate.setString(2,pojo.getMenuPath());
            pstate.setString(3,pojo.getMenuName());
            pstate.execute();
            this.conn.commit();
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
            try {
            this.conn.rollback();
            }catch (Exception e1){
                e1.printStackTrace();
            }
        }finally {
            try {
               pstate.close();
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
        return flag;
    }
}
