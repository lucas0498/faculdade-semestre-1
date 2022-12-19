Algoritmo "ParOuImpar"
// 
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/11/2022
Var
// Seção de Declarações das variáveis 
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
// Seção de Comandos, procedimento, funções, operadores, etc... 
 Escreva("Digite um numero: ")
 Leia (N)
 R <- ParImpar(N)
 Escreval("O numero ",N," é um valor: ", R)

Fimalgoritmo