<%--
  Created by IntelliJ IDEA.
  User: 欧阳毅
  Date: 2019/9/23
  Time: 10:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

   <script src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript" >
       $(function () {
           $("#btn").click(function () {
              $.ajax({
                  url:"user/testAjax",
                  contentType:"application/json;charset=UTF-8",
                  data:'{"username":"赵敏","password":"1234","age":"30"}',
                  dataType:"json",
                  type:"post",
                  success:function (data) {
                        alert(data);
                        alert(data.username);
                        alert(data.password);
                  }
              });
           });

       });
        function get() {
            alert("hello");
        }
    </script>
</head>
<body>
<a href="user/testString">testString</a></br>
<a href="user/testModelAndView">test</a>
<button id="btn" >发送ajax</button>
<button id="onclick" onclick="get()">调用onclick</button>
</body>
</html>
