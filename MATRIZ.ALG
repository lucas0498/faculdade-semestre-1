Algoritmo "Matriz"
// 
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/11/2022
Var
// Seção de Declarações das variáveis 
mat: vetor[1..3, 1..2] de Inteiro
l, c: Inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
para l <-  1 ate 3 faca
       para c <- 1 ate 2 faca
            Escreva("Digite o valor da posição[",l,",",c,"]: ")
            leia(mat[l,c])
       fimpara
fimpara
Para l <- 1 ate 3 faca
       para c <- 1 ate 2 faca
              Escreva(mat[l,c]:5)
       fimpara
       EscrevaL()
fimpara

Fimalgoritmo