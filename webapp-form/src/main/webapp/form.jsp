<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Map"%>
<%
 Map<String, String> errors = (Map<String, String>)request.getAttribute("errors");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" >
        <meta name="viewport"
              content="width=device-width, user-scalable=no,initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0" >
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Create Product</title>
    </head>
    <body>
        <h1>Create Product</h1>
         <% if(errors != null && errors.size()>0){ %>
           <ul>
             <% for(String error: errors.values()) { %>
                <li> <%=error%> </li>
             <% } %>
           </ul>
         <%}%>
        <form action="/webapp-form/create" method="post">
            <div>
                <label for="name">Name</label>
                <div>
                    <input type="text" name="name" id="name" />
                </div>
            </div>
            <div>
                <label for="price">Price</label>
                <div>
                    <input type="number" name="price" id="price" min="1" step="1" value="1" />
                </div>
            </div>
            <div>
                <label for="manufacturer">Manufacturer</label>
                <div>
                    <input type="text" name="manufacturer" id="manufacturer"
                        minlength=2 maxlength=10 />
                </div>
            </div>
            <div>
                <div>
                    <input type="submit" value="send" />
                </div>
            </div>
        </form>
    </body>
</html>