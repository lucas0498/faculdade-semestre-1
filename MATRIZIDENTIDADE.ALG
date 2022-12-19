Algoritmo "MatrizIdentidade"
//
//
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/11/2022
Var
   // Seção de Declarações das variáveis
   mID: vetor[1..3, 1..3] de Inteiro
   i,j: Inteiro
Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   Para i <- 1 ate 3 faca
      Para j <- 1 ate 3 faca
         Se(i = j) entao
            mID[i,j] <- 1
         senao
            mID[i,j]<-0
         FimSe
      FimPara
   FimPara
   Para i <- 1 ate 3 faca
          para j <- 1 ate 3 faca
                 Escreva(mID[i,j]:4)
          fimpara
          Escreval()
   fimPara

Fimalgoritmo