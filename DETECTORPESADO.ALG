Algoritmo "detectorpesado"
// 
//  
// Descri??o   : Aqui voc? descreve o que o programa faz! (fun??o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/11/2022
Var
I: Inteiro
N, Pesado: Caractere
P, Mai: Real
Procedimento Topo()
Inicio
LimpaTela
EscrevaL("------------------------------------")
EscrevaL(" D E T E C T O R    D E     P E S A D O")
EscrevaL(" Maior peso ate agora: ", Mai, "Kg")
EscrevaL("------------------------------------")
FimProcedimento
Inicio
Topo()
Para I <- 1 ate 5 faca
Escreva("Digite o Nome: ")
leia (N)
escreva("Digite o peso: ")
leia (P)
se(P>Mai) entao
Mai <- P
Pesado <- N
FimSe
Topo()
FimPara
Topo
EscrevaL("A pessoa mais pesada at? agora foi ", Pesado, " com ",mai," quilos.")

Fimalgoritmo