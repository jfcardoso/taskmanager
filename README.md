# Aplicativo Task Manager v. 1.0
- Desenvolvimento de uma aplicação simples de gerenciamento de projetos que permite a inclusão, atualização e exclusão de novas tarefas necessárias em um projeto.
- Projeto Desenvolvido no curso de Lógica III - Programa Start by Capgemini

## Nome da aplicação:
	- Task Manager
## Descrição: 
	- Aplicação de gerenciamento de projetos que permite a inclusão, atualização e exclusão de novas tarefas necessárias em um projeto.
## Objetivo: 
	- Auxiliar na organização das tarefas presentes em um projeto por meio de uma interface gráfica amigável e intuitiva.
## Entidades:
	* Projeto
		- id (alto increment);
		- Nome;
		- Descrição;
		- Data de Criação;
		- Data de Atualização.
	* Tarefa
		- id (pk, auto-increment);
		- project_id (fk);
		- Nome;
		- Descrição;
		- Status;
		- Tags (melhoria futura);
		- Observações;
		- Prazo;
		- Data de Criação;
		- Data de Atualização.
	* Tag (melhoria futura)	
		- Nome;
		- Cor;
		- Data de Criação;
		- Data de Atualização.

## Requisitos Funcionais:
	* Permitir cadastrar novo projeto;
	* Permitir buscar um projeto específico;
	* Permitir editar um projeto;
	* Permitir excluir um projeto específico;

	* Permitir cadastrar nova tarefa;
	* Permitir buscar uma tarefa específica;
	* Permitir editar uma tarefa;
	* Permitir excluir uma tarefa específica;
	
	(Melhoria futura)
	* Permitir cadastrar nova tag;
	* Permitir buscar uma tag específica;
	* Permitir editar uma tag específica;
	* Permitir excluir uma tag específica;

## Regras de Negócio:
	* O sistema não contará com um sistema de login;
	* Não haverá um conceito de usuário;
	* Toda tarefa deve pertencer a um projeto;
	* Não poderá haver tags repetidas numa mesma tarefa; (melhoria futura)
	* As tarefas devem ser filtradas por tag. (melhoria futura)

## Tecnologias Utilizadas:
 	* Java
	* MySQL
	* Xampp

 - Para startar o projeto, através da ferramenta Xampp,é preciso:
    - 1º Startar o Apache(Ficará verde se for bem sucedido);
    - 2º Iniciar o MYSQL (Ficará verde se for bem sucedido); 
    	
	 

