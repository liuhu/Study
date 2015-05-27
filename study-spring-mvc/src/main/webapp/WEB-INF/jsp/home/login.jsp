<%--
  Created by IntelliJ IDEA.
  User: LiuHu
  Date: 2015/5/25
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<div class="mini-layout fluid">
  <div class="mini-layout-body-login">
    <form method="post" action="login" id="loginForm">

      <table>
        <tr>
          <td rowspan="2" valign="top"><font color="red">*</font> 用户名：</td>
          <td>
            <input type="text" name="userName" id="userName"/>
          </td>
          <td><div id="u_e" class="divstyle"></div></td>

        </tr>
        <tr><td colspan="2"><font class="fontstyle"></font></td></tr>

        <tr>
          <td rowspan="2" valign="top"><font color="red">*</font> 密码：</td>
          <td>
            <input type="password" name="passWord" id="passWord" />
          </td>
          <td><div id="p1_e" class="divstyle"></div></td>
        </tr>

        <tr>
          <td colspan="2">
            <input type="button" onclick="document.getElementById('loginForm').submit();"  value="登录" class="btn btn-primary"/>
          </td>
        </tr>

      </table>
    </form>
  </div>
</div>

</body>
</html>
