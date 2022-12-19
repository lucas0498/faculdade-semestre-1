Algoritmo "ParImpar"
// 
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/11/2022
Var
// Seção de Declarações das variáveis 
N: Inteiro
Procedimento ParImpar(V:inteiro)
Inicio

Se(V%2 = 0) entao
EscrevaL("O número ", V, " é par!")
SeNao
EscrevaL("O número ", V, " é impar!")
FimSe
FimProcedimento
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
 Escreva("Digite um numero: ")
 Leia (N)
 ParImpar(N)
EscrevaL("O valor de V é ", V)
EscrevaL("O valor de N é ", N)
Fimalgoritmo