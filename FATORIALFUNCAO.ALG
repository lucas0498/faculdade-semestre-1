Algoritmo "FatorialFuncao"
// 
//  
// Descri??o   : Aqui voc? descreve o que o programa faz! (fun??o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/11/2022
Var
// Se??o de Declara??es das vari?veis 
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
// Se??o de Comandos, procedimento, fun??es, operadores, etc... 
 EscrevaL("Digite um numero:")
 leia(N)
 F<-Fatorial(N)
 Escreva("O fatorial de ",N," ? ",F)

Fimalgoritmo