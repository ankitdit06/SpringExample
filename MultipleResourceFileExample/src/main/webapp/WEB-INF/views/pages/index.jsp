<%
   String appName=(String)request.getAttribute("appName");
   String msg=(String)request.getAttribute("msg");
   
 %>
<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Hello World! Maven</h1>
        <h2> App Name :<%=appName%></h2>
        <h2> Msg is : <%=msg%></h2>
    </body>
</html>
