Algoritmo "ParOuImpar"
// 
//  
// Descri??o   : Aqui voc? descreve o que o programa faz! (fun??o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/11/2022
Var
// Se??o de Declara??es das vari?veis 
N: Inteiro
R: Caractere
Funcao ParImpar(V:Inteiro):Caractere
Inicio
      Se (V%2 = 0) entao
      Retorne("Par")
      senao
      Retorne("Impar")
      FimSe
FimFuncao
Inicio
// Se??o de Comandos, procedimento, fun??es, operadores, etc... 
 Escreva("Digite um numero: ")
 Leia (N)
 R <- ParImpar(N)
 Escreval("O numero ",N," ? um valor: ", R)

Fimalgoritmo