<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br" >
    <head>
        <link rel="stylesheet" type="text/css"  href="style.css">
    </head>
    
  <body>
                
                 <header>
                 <div class="container">
                        
                    <div id="logo"> 
                        <img src="Imagens/logo Vai&VoltaViagens.png">
                    </div>
                    <div id="menu">
                        <a id="login" href="Login.jsp"> login<a/>
                        OU<a href="CadastroCliente.jsp"> Cadastre</a>
                        <a id="funcionarios" href="CadastroFuncionario.jsp"> Reservados Funcionarios</a>
                     </div>    
                  </div>
                   <% 
                       String mensagem = (String) request.getAttribute("mensagem");
                       if (mensagem != null)
                           out.print(mensagem);
                   %>
                 </header>
                       
                
             <div id="principal">
                 <form class="formBuscaPassagem" method="post" action="buscarModalController">
                    <div class="buscarpassagem" id="buscarpassagem" >
                    <h2 id="busca_passagem" class="control-label">BUSCAR PASSAGEM</h2>
                    </div>
                    <div  id="buscaPassagem" class="inputgroup">
                        <select  class="inputbutton" id="companhia" name="companhia" class="companhia">
                           <option value="">Companhia</option>
                           <option value="VaiVolta">VaiVolta</option>
                           <option value="JaVoltou">JaVoltou</option>
                        </select>
                        <select class="inputbutton" id="horaPartida" name="horaPartida" class="horaPartida">
                           <option value="">Hora da partida</option>
                           <option value="12:00">12:00</option>
                           <option value="13:00">13:00</option>
                           <option value="14:00">14:00</option>
                           <option value="15:00">15:00</option>
                           <option value="16:00">16:00</option>
                           <option value="17:00">17:00</option>
                        </select>
                        <select class="inputbutton" id="modal" name="modal" class="modal">
                           <option value="">Tipo do Modal</option>
                           <option value="Aviao">Avião</option>
                           <option value="Onibus">Onibus</option>
                        </select>
                        <select class="inputbutton" id="origem" name="origem" class="origem">
                           <option value="">Origem</option>
                           <option value="RS">Porto Alegre,RS</option>
                           <option value="Florianopolis,SC">Florianopolis,SC</option>
                           <option value="Curitiba,PR">Curitiba,PR</option>
                           <option value="SP">São Paulo,SP</option>
                           <option value="Rio de Janeiro,RJ">Rio de Janeiro,RJ</option>
                           <option value="Belo Horizonete,MG">Belo Horizonete,MG</option>
                           <option value="Vitoria,ES">Vitoria,ES</option>
                           <option value="Campo Grande,MS">Campo Grande,MS</option>
                           <option value="Cuiaba,MT">Cuiaba,MT</option>
                           <option value="Goiania,GO">Goiania,GO</option>
                           <option value="Brasilia,DF">Brasilia,DF</option>
                        </select>
                        <select class="inputbutton" id="destino" name="destino" class="destino">
                           <option value="">Destino</option>
                           <option value="Porto Alegre,RS">Porto Alegre,RS</option>
                           <option value="Florianopolis,SC">Florianopolis,SC</option>
                           <option value="Curitiba,PR">Curitiba,PR</option>
                           <option value="São Paulo,SP">São Paulo,SP</option>
                           <option value="Rio de Janeiro,RJ">Rio de Janeiro,RJ</option>
                           <option value="Belo Horizonete,MG">Belo Horizonete,MG</option>
                           <option value="Vitoria,ES">Vitoria,ES</option>
                           <option value="Campo Grande,MS">Campo Grande,MS</option>
                           <option value="Cuiaba,MT">Cuiaba,MT</option>
                           <option value="Goiania,GO">Goiania,GO</option>
                           <option value="Brasilia,DF">Brasilia,DF</option>
                        </select>
                           <input class="inputbutton" type="date" name="data" id="data" placeholder="Data de embarque"></input>
                           <input class="buscar" type="submit" name="Buscar" value="Buscar"> 
                     </div>
               </form>
            </div>
               
       
             <footer>Copyright 2022 Vai&VoltaViagens. All rights reserved</footer>
  </body>    

</html>