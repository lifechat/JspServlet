package org.dsir.dao.proxy;

import org.dsir.dao.UserLoginDAO;
import org.dsir.dao.impl.UserLoginDAOImpl;
import org.dsir.pojo.MenuPOJO;
import org.dsir.pojo.VLoginPOJO;
import org.dsir.tools.JDBCHelper;

import java.math.BigDecimal;
import java.sql.Connection;
import java.util.List;

public class UserLoginDAOProxy implements UserLoginDAO {
//    连接数据库
    Connection conn = null;
    UserLoginDAOImpl impl = null;
    public UserLoginDAOProxy(){
        try{
            this.conn = JDBCHelper.getConn();
        }catch (Exception e){
            e.printStackTrace();
        }
        this.impl = new UserLoginDAOImpl(this.conn);
    }


    @Override
    public boolean checkLogin(String loginaccount, String loginPassword) {
        boolean flag = this.impl.checkLogin(loginaccount,loginPassword);
        this.close();
        return flag;
    }
    public void close(){
        try {
            this.conn.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public VLoginPOJO findUserByLogin(String loginaccount) {
        VLoginPOJO pojo = this.impl.findUserByLogin(loginaccount);
        this.close();
        return pojo;
    }

    @Override
    public List<MenuPOJO> findMenuByLoginId(int loginId) {
        List<MenuPOJO> list = this.impl.findMenuByLoginId(loginId);
        this.close();
        return list;
    }

    @Override
    public List<MenuPOJO> findChildMenuByFaherId(BigDecimal menuId) {
        List<MenuPOJO> list = this.impl.findChildMenuByFaherId(menuId);
        this.close();
        return list;
    }
}
