Algoritmo "ParImpar"
// 
//  
// Descri??o   : Aqui voc? descreve o que o programa faz! (fun??o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/11/2022
Var
// Se??o de Declara??es das vari?veis 
N: Inteiro
Procedimento ParImpar(V:inteiro)
Inicio

Se(V%2 = 0) entao
EscrevaL("O n?mero ", V, " ? par!")
SeNao
EscrevaL("O n?mero ", V, " ? impar!")
FimSe
FimProcedimento
Inicio
// Se??o de Comandos, procedimento, fun??es, operadores, etc... 
 Escreva("Digite um numero: ")
 Leia (N)
 ParImpar(N)
EscrevaL("O valor de V ? ", V)
EscrevaL("O valor de N ? ", N)
Fimalgoritmo