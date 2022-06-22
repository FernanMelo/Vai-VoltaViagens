<%@page import="JavaVVv.Model.Login"%>
<%@page import="JavaVVv.Model.Cadastro"%>
<%
String Nome = request.getParameter("userName");


%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang = "pt">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form de Registro de validação</title>
        <link rel ="stylesheet" href="style.css">
    </head>
    <body>
        <div  id="principal_cadastro">
           <div id="container_cadastro">
            <h1> Cadastre-se para acessar o sistema</h1>
            <form action="index.jsp" method="post">
                <div class="half-box">
                    <label  for="userName">Usuario</label>
                    <input type="text" name="userName" id="userName" placeholder="Digite um usuario/login">
                 </div>
                 <div class="half-box">
                    <label  for="password">Senha</label>
                    <input type="password" name="password" id="password" placeholder="Digite uma senha">
                 </div>
                 <div class="half-box">
                    <label  for="email">E-mail</label>
                    <input type="email" name="email" id="email" placeholder="Email">
                </div>
                 <div class="half-box">
                    <label  for="nome">Nome</label>
                    <input type="text" name="name" id="name" placeholder="Digite seu Nome">
                </div>
                <div class="half-box">
                    <label  for="endereco">Endereço</label>
                    <input type="text" name="endereco" id="endereco" placeholder="Digite um Endereço">
                </div>
                <div class="half-box">
                    <label  for="CPF">CPF</label>
                    <input type="text" name="cpf" id="cpf" placeholder="Digite um CPF">
                </div>
                <div class="half-box">
                    <label  for="Tefefone">Telefone</label>
                    <input type="text" name="telefone" id="telefone" placeholder="Digite um Telefone">
                </div>
                 <div class="half-box">
                    <label  for="date_nascimento">Data de Nascimento</label>
                    <input type="date" name="date_nascimento" id="date" placeholder="Data de Nascimento">
                </div> 
                  <div class="half-box">
                     <input  type="submit" id="btn_submit" value="Registrar"> 
                  </div>  
       
            </form>   
          </div>
       </div>
    </body>
</html>
