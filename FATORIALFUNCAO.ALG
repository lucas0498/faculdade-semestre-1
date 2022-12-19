Algoritmo "FatorialFuncao"
// 
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/11/2022
Var
// Seção de Declarações das variáveis 
N, F:inteiro
Funcao Fatorial(V:inteiro):Inteiro
Var C:inteiro
R: Inteiro
Inicio
R<-1
 Para C<-1 ate  V faca
      R <- R*C
      FimPara
      Retorne R
FimFuncao
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
 EscrevaL("Digite um numero:")
 leia(N)
 F<-Fatorial(N)
 Escreva("O fatorial de ",N," é ",F)

Fimalgoritmo