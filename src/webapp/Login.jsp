<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang = "pt">
    <head>
        <title>Form de Registro de validação</title>
        <link rel ="stylesheet" href="style.css">
    </head>
    <body class="body_login">
        <div class="container_login" id="container_login">
            <h1> Ja tem uma conta?</h1>
            <form id="form_login" name="form_login" method="post" action="loginController">
                  <div class="full-group">
                   <div class="full-box">
                      <label  for="userName"></label>
                      <input type="text" name="userName" id="userName" placeholder="Digite um usuario/login">
                   </div>
                   <div class="full-box">
                      <label  for="password"></label>
                      <input type="password" name="password" id="password" placeholder="Digite uma senha">
                   </div>
                   <input class="full-box" type="submit" name="Submit" value="Entrar"> 
                  </div> 
                <div>
                    <% 
            
                       String mensagem = (String) request.getAttribute("mensagem");
                       if (mensagem != null)
                           out.print(mensagem);
                    %>    
                </div>
            </form>
        </div>
    </body> 

</html>