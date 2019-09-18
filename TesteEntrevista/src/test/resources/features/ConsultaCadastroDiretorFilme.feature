# language: pt
# encoding: UTF-8
Funcionalidade: Cadastrar e Consultar

Esquema do Cenario: Cadastrar Diretor e Filme
	Dado que estou no 'Google Chrome' 
	E preencho o campo 'Busca' "<nome_diretor>" e "<nome_filme>"
	Quando clico no botão 'Consultar'
	Entao sistema apresenta a quantidade de resultado da busca
	
Exemplos:
|nome_diretor |nome_filme  |
|Anthony Russo|Vingadores 4|