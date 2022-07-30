<%-- 
    Document   : Login
    Created on : 26 de jul de 2022, 18:20:32
    Author     : filty
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang = "pt">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form de Registro de validação</title>
        <link rel ="stylesheet" href="style.css">
    </head>
    <body>
        <div  id="container_cadastro">
            <h1> Para Logar no Sistema infome seu login e senha</h1>
            <form name="form1" method="get" action="">
                 <div class="full-box">
                    <label  for="userName">Usuario</label>
                    <input type="text" name="userName" id="userName" placeholder="Digite um usuario/login">
                 </div>
                 <div class="full-box">
                    <label  for="password">Senha</label>
                    <input type="password" name="password" id="password" placeholder="Digite uma senha">
                </div>
                <input type="submit" name="Submit" value="Logar"> 
            </form>
        </div>
    </body> 

</html>
