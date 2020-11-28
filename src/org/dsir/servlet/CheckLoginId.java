package org.dsir.servlet;

import org.dsir.dao.UserLoginDAO;
import org.dsir.dao.factory.UserLoginDAOFactory;
import org.dsir.pojo.VLoginPOJO;
import org.dsir.tools.StringHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/CheckLoginId")
public class CheckLoginId extends HttpServlet {
    private static final long serialVersionUID = -983858420051241035L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String path = req.getContextPath();
            req.setCharacterEncoding("utf-8");
            resp.setCharacterEncoding("utf-8");
            resp.setContentType("text/html; charset=utf-8");

            String verifyCode = req.getParameter("verifyCode");
            String loginAccount = req.getParameter("loginacount");
            HttpSession sv = req.getSession();
            //获取在会话中存储的那个为登录进行验证的验证码
            final  String code = (String)sv.getAttribute("/jspservlet/VerifyCodeServlet");
            System.out.println( "session code : " + code );
            String password = req.getParameter("password");
            if(StringHelper.equals(verifyCode,code)){
                boolean flag = UserLoginDAOFactory.getDAOInstance().checkLogin(loginAccount,password);
                VLoginPOJO pojo = UserLoginDAOFactory.getDAOInstance().findUserByLogin(loginAccount);
                if(flag){
                    HttpSession session = req.getSession(true);
                    session.setAttribute("pojo",pojo);
                    resp.sendRedirect(path+"/manager/index.jsp");
                    System.out.println("登录成功");
                }else{
                    resp.sendRedirect(path+"/manager/login.jsp");
                }
            }else{
                resp.sendRedirect(path+"/manager/login.jsp");
            }
    }
}
