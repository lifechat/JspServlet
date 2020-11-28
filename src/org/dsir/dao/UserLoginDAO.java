package org.dsir.dao;

import org.dsir.pojo.MenuPOJO;
import org.dsir.pojo.VLoginPOJO;

import java.math.BigDecimal;
import java.util.List;

/*
* @author xiaqi
* 用户登录接口
* */
public interface UserLoginDAO {
    public boolean checkLogin(String loginaccount,String loginPassword);

    public VLoginPOJO findUserByLogin(String loginaccount);

    public List<MenuPOJO> findMenuByLoginId(int loginId);

    public List<MenuPOJO> findChildMenuByFaherId(BigDecimal menuId);
}
