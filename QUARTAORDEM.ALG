Algoritmo "QuartaOrdem"
//
//
// Descri??o   : Aqui voc? descreve o que o programa faz! (fun??o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/11/2022
Var
   // Se??o de Declara??es das vari?veis
   m: vetor[1..4,1..4] de Inteiro
   l,c,sDP, p2L, mai3C: Inteiro

Inicio
   // Se??o de Comandos, procedimento, fun??es, operadores, etc...
   sDP <- 0
   p2L <- 1
   mai3C <- 0
   Para l <- 1 ate 4 faca
      Para c <- 1 ate 4 faca
         Escreva("Digite o valor da posi??o [",l,",",c,"]: ")
         leia (m[l,c])
         se (l = c) entao
            sDP <- sDP + m[l,c]
         fimse
      fimpara
   fimpara

   Para l <- 1 ate 4 faca
      Para c <- 1 ate 4 faca
         Escreva(m[l,c]: 4)

      fimpara
      escreval()
   fimpara
   para c <- 1 ate 4 faca
      p2L <- p2L * m[2,c]
   fimpara
   para l <- 1 ate 4 faca
      se(m[l,3]>mai3C) entao
         mai3C<-m[l,3]
         fimse
   fimpara
      EscrevaL("A soma dos valores da diagonal principal ?: ",sDP)
      EscrevaL("O produto dos valores da segunda linha ?: ", p2L)
      EscrevaL("O maior valor da terceira coluna ?: ", mai3C)

Fimalgoritmo