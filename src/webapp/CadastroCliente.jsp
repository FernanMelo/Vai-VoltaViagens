<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang = "pt">
    <head>
        <title>Form de Registro de validação</title>
        <link rel ="stylesheet" href="style.css">
    </head>
    <body class="body_cadastro">
        <div  id="principal_cadastro">
           <div class="containerCadastro" id="container_cadastro">
            <h1> Cadastro do Cliente</h1>
            <form action="cadastroClienteController" method="post" class="cadastroform">
              <div class="full-group">
                <div class="full-box">
                    <label  for="nome">Nome</label>
                    <input type="text" name="nome" id="nome" placeholder="Digite seu Nome">
                 </div>
                 <div class="full-box">
                    <label  for="endereco">Endereço</label>
                    <input type="text" name="endereco" id="endereco" placeholder="Digite Endereço">
                 </div>
                 <div class="full-box">
                    <label  for="cpf">CPF</label>
                    <input type="text" name="cpf" id="cpf" placeholder="CPF">
                </div>
                <div class="full-box">
                    <label  for="telefone">Telefone 1</label>
                    <input type="text" name="telefone1" id="telefone1" placeholder="Telefone Principal">
                </div>
                <div class="full-box">
                    <label  for="CPF">Telefone 2</label>
                    <input type="text" name="telefone2" id="telefone2" placeholder="Telefone Secundario">
                </div>
                <div class="full-box">
                    <label  for="email">Email</label>
                    <input type="text" name="email" id="email" placeholder="Digite um Email para o seu login">
                </div>
                 <div class="full-box">
                    <label  for="senha">Senha </label><label id="parameterSenha"  for="senha1" >Entre 4 à 10 caracteres (contendo letra maiucula e minuscula numeros e simbolos)
                    <input type="password" name="senha" id="password" placeholder="Digite uma senha">
                </div> 
                  <div class="full-box">
                     <input  type="submit" id="submit" value="Registrar" name="Salvar"> 
                  </div>  
                 </div>
                 <div class="full-box" >
               
                 <%
                     String mensagem = (String) request.getAttribute("mensagem");
                       if (mensagem != null)
                        out.print(mensagem);
                 %>
                 </div>    
            </form>   
          </div>
       </div>
    </body>
</html>