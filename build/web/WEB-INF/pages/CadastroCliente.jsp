<%-- 
    Document   : CadastroCliente
    Created on : 26 de jul de 2022, 18:19:33
    Author     : filty
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang = "pt">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form de Registro de validação</title>
        <link rel ="stylesheet" href="style.css">
    </head>
    <body>
        <div  id="principal_cadastro">
           <div id="container_cadastro">
            <h1> Cadastro do Cliente</h1>
            <form action="cadastroCliente" method="get" class="CadastroClienteform">
                <div class="half-box">
                    <label  for="nome">Nome</label>
                    <input type="text" name="nome" id="nome" placeholder="Digite seu Nome">
                 </div>
                 <div class="half-box">
                    <label  for="endereco">Endereço</label>
                    <input type="text" name="endereco" id="endereco" placeholder="Digite Endereço">
                 </div>
                 <div class="half-box">
                    <label  for="cpf">CPF</label>
                    <input type="text" name="cpf" id="cpf" placeholder="CPF">
                </div>
                <div class="half-box">
                    <label  for="telefone">Telefone 1</label>
                    <input type="text" name="telefone1" id="telefone1" placeholder="Telefone Principal">
                </div>
                <div class="half-box">
                    <label  for="CPF">Telefone 2</label>
                    <input type="text" name="telefone2" id="telefone2" placeholder="Telefone Secundario">
                </div>
                <div class="half-box">
                    <label  for="email">Email</label>
                    <input type="text" name="email" id="email" placeholder="Digite um Email para o seu login">
                </div>
                 <div class="half-box">
                    <label  for="senha">Senha </label><label id="parameterSenha"  for="senha1" >Entre 6 à 10 caracteres (contendo numeros e simbolos)</label>
                    <input type="password" name="senha" id="password" placeholder="Digite uma senha">
                </div> 
                  <div class="half-box">
                     <input  type="submit" id="btn_submit" value="Registrar" name="Salvar"> 
                  </div>  
       
            </form>   
          </div>
       </div>
    </body>
</html>
