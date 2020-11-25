package org.dsir.servlet;

import org.dsir.tools.GraphicHelper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.OutputStream;
@WebServlet("/VerifyCodeServlet")
public class VerifyCodeServlet extends HttpServlet {
    private static final long serialVersionUID = 5038302001214793231L;

    //获取当前请求对应的会话对象

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        String uri = req.getRequestURI();
        System.out.println("hello:"+uri);

        final  int width = 180;
        final int height = 40;
        final String imgType = "jpeg";
        final OutputStream output = resp.getOutputStream();

        String code = GraphicHelper.create(width,height,imgType,output);//调用绘制图片类，展示vertifyCode内容
        System.out.println("验证码内容:"+code);

        //建立之间的关联
        session.setAttribute(uri,code);

        System.out.println(session.getAttribute(uri));
    }
}
