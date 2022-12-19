Algoritmo "MatrizPar"
//
//
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/11/2022
Var
   // Seção de Declarações das variáveis
   valores: vetor [1..3, 1..3] de inteiro
   l, c: inteiro
   TotPar: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   Para l<-1 ate 3 faca
      Para c<-1 ate 3 faca
         Escreva("Digite o valor da posição [",l,",",c,"]:")
         leia(valores[l,c])
      fimpara
   fimpara
   Escreval()
   Escreval("MATRIZ:")
   Escreval("---------------------")
   TotPar <- 0
   Para l <- 1 ate 3 faca
      para c <- 1 ate 3 faca
         se(valores[l,c]%2 = 0) entao
            escreva("{",valores[l,c]:2,"}")
            TotPar <- TotPar+1
            senao
            escreva(valores[l,c]:4)
         fimse

      fimpara
      escreval()
   fimpara
   Escreva("O total de pares é: ", TotPar)

Fimalgoritmo