<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang = "pt">
    <head>
        <title>Form de Registro de validação</title>
        <link rel ="stylesheet" href="style.css">
    </head>
    <body class="body_cadastro">
        <div  id="principal_cadastro">
           <div class="containerCadastro" id="container_cadastro">
            <h1> Cadastro do Funcionario</h1>
            <form action="cadastroFuncionarioController" method="post" class="cadastroform">
               <div class="full-group">
                 <div class="full-box">
                     <select type="text" id="cargo" name="cargo">
                     <option value="">Selecione seu Cargo</option><option value="ADMModal">ADMModal</option><option value="GerenteVendas">GerenteVendas</option>
                     </select>
                 </div>
                 <div class="full-box">
                    <label  for="nome">Nome</label>
                    <input type="text" name="nome" id="nome" placeholder="Digite seu Nome">
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