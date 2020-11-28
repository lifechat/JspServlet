<%--
  Created by IntelliJ IDEA.
  User: 25966
  Date: 2020/11/24
  Time: 6:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path = request.getContextPath(); %>


<html>
<head>
    <title>登录</title>
    <link rel="stylesheet" href="<%=path%>/css/pintuer.css">
    <link rel="stylesheet" href="<%=path%>/css/admin.css">
</head>
<body style="background: #d5fffd">
    <div class="bg"></div>
    <div class="container">
        <div class="line bouncein">
            <div class="xs6 xm4 xs3-move xm4-move">
                <div style="height: 150px;"></div>
                <div class="media media-y margin-big-bottom"></div>
                <form action="<%=path %>/CheckLoginId" method="post" name="f">
                    <div class="panel loginbox">
                        <div class="text-center margin-big padding-big-top">
                            <h1>CRM后台管理中心</h1>
                        </div>
                        <div class="panel-body" style="padding:30px; padding-bottom:10px; padding-top:10px;">
                            <div class="form-group">
                                <div class="field field-icon-right">
                                    <input type="text" class="input input-big" name="loginacount" placeholder="登录账号" data-validate="required:请填写账号" onblur="checkLogin();" />
                                    <span class="icon icon-user margin-small"></span>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="field field-icon-right">
                                    <input type="password" class="input input-big" name="password" placeholder="登录密码" data-validate="required:请填写密码" onblur="checkPassword();" />
                                    <span class="icon icon-key margin-small"></span>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="field">
                                    <input type="text" class="input input-big" name="verifyCode" placeholder="填写右侧的验证码" data-validate="required:请填写右侧的验证码" />
                                    <img src="<%=path%>/VerifyCodeServlet" alt="" width="100" height="32" class="passcode" style="height:43px;cursor:pointer;" onclick="this.src=this.src+'?'">
                                </div>
                            </div>
                            <input type="hidden" name="admin" value="admin">
                        </div>
                        <div style="padding:30px;"><input type="submit" class="button button-block bg-main text-big input-big" value="登录"></div>
                    </div>
                </form>
            </div>

        </div>
    </div>
</body>
<script>
   function checkLogin(){
       var loginacount = f.loginacount.value;
       if(loginacount == "" ){
           alert("账号不能为空");
       }
   }
   function checkPassword(){
       var loginPwd =  f.password.value;
       if(loginPwd == "")
       {
           alert("密码不能为空");
       }
   }
</script>
</html>
