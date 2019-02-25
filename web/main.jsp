<%--
  Created by IntelliJ IDEA.
  User: UVlad
  Date: 24.02.2019
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
</head>
<body>

<form name="username" action="" method="post">
        <table cellpadding=4 cellspacing=2 border=0>

            <th bgcolor="#CCCCFF" colspan=2>
                <font size=5>USER REGISTRATION</font>

                <font size=1>* Required Fields</font>
            </th>

            <tr bgcolor="#c8d8f8">
                <td valign=top>

                    First Name*
                 <input type="text" name="firstName" size="20" value=""></td>
                <td valign=top>
                    Login*
                    <input type="text" name="login" value="" size="20"/></td>
                <td valign=top>
                    Comment
                    <input type="text" name="comment" value="" size="50"/></td>
                <td valign=top>
                    Home Phone*
                    <input type="text" name="homePhoneNumber" value="" size="20"/></td>
                <td valign=top>

                    <input type="submit" value="Ok"/>
            </tr>

            <tr bgcolor="#c8d8f8">


        </table>

</form>
</body>
</html>
