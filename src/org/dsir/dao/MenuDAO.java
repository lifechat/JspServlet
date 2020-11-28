package org.dsir.dao;

import org.dsir.pojo.MenuPOJO;

import java.math.BigDecimal;
import java.util.List;

public interface MenuDAO {
    public List<MenuPOJO> findAll(String menuName, int isDelete, int pageSize,
                                  int pageCurrent);
    public int findCountByNameState(String menuName,int isDelete);
    public  MenuPOJO findByMenuId(BigDecimal menuId);
    public boolean doUpd(MenuPOJO pojo);
    public boolean doIns(MenuPOJO pojo);
}
