Algoritmo "Fibonacci"
// 
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/11/2022
Var
// Seção de Declarações das variáveis 
C,T1,T2,T3: Inteiro
Procedimento ProximoFibonacci(var A, B:Inteiro)
var C: inteiro
inicio
C := A + B
Escreva(C)
A := B
B := C
fimprocedimento
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
T1 <- 0
Escreva(T1)
T2 <- 1
Escreva(T2)
Para C := 3 ate 100 faca
ProximoFibonacci(T1, T2)
FimPara
Fimalgoritmo