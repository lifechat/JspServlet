package org.dsir.dao.factory;

import org.dsir.dao.UserLoginDAO;
import org.dsir.dao.proxy.UserLoginDAOProxy;

public class UserLoginDAOFactory {
    public static UserLoginDAO getDAOInstance(){
        return new UserLoginDAOProxy();
    }
}
