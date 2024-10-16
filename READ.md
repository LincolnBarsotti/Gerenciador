# API Java com MVC, Tomcat e Servlets (Desenvolvido em Colaboração com a Alura)

Este repositório contém uma API simples desenvolvida em Java como parte de um projeto de aprendizado em colaboração com a Alura. O projeto tem o objetivo de praticar conceitos de desenvolvimento web utilizando o padrão MVC (Model-View-Controller), o servidor Tomcat e Servlets.

## Tecnologias Utilizadas

- Java
- Servlets
- Tomcat
- MVC (Model-View-Controller) Architecture

## Descrição

Esta API foi criada como parte de um projeto da Alura para a prática de conceitos fundamentais de desenvolvimento web e para demonstrar a implementação do padrão MVC. A API é um exemplo básico de como estruturar uma aplicação web utilizando Servlets para lidar com requisições HTTP e o padrão MVC para separar as preocupações do modelo, da visualização e do controle.

## Estrutura do Projeto

Explicação da estrutura de diretórios do projeto:

- `src/`: Contém o código-fonte da aplicação.
  - `model/`: Classes de modelo.
  - `view/`: Páginas JSP para a interface do usuário.
  - `controller/`: Classes de controle (Servlets).
- `web/`: Recursos da interface do usuário.
  - `WEB-INF/`: Configurações do aplicativo.
    - `web.xml`: Configurações de servlet e outras configurações do aplicativo.

## Como Executar

1. Certifique-se de ter o Java JDK instalado.
2. Baixe e instale o servidor Apache Tomcat.
3. Clone este repositório: `git clone https://github.com/LincolnBarsotti/Java/WebProjects.git`
4. Navegue até o diretório do projeto: `cd gerenciador`
5. Copie o arquivo WAR gerado para o diretório `webapps/` do seu servidor Tomcat.
6. Inicie o servidor Tomcat.
7. Acesse a API em seu navegador: `http://localhost:8080/gerenciador/`

## Contribuições

Contribuições são bem-vindas! Se você encontrar problemas, bugs ou tiver melhorias para sugerir, sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Licença

Este projeto feito em conjuto da equipe Alura para fins estudantis.
