Algoritmo "Matriz"
// 
//  
// Descri??o   : Aqui voc? descreve o que o programa faz! (fun??o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/11/2022
Var
// Se??o de Declara??es das vari?veis 
mat: vetor[1..3, 1..2] de Inteiro
l, c: Inteiro

Inicio
// Se??o de Comandos, procedimento, fun??es, operadores, etc... 
para l <-  1 ate 3 faca
       para c <- 1 ate 2 faca
            Escreva("Digite o valor da posi??o[",l,",",c,"]: ")
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