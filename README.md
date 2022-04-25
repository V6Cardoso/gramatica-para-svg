# gramatica-para-svg
EC6 Compiladores Desafio 4

Gramática da linguagem:


Σ   ☞ Alfabeto da linguagem

n   ☞ Passos, etapas

ω   ☞ Axioma, condição inicial

δ   ☞ Angulo em graus (referência círculo trigonométrico)

pX  ☞ Regras de produção


Σ : F f + - [ ]


F: desenha para frente

f: vai para frente

+: gira sentido anti-horário

-: gira sentido horário

[: push posição

]: pop posição


Exemplo arquivo input.txt:

n : 6

ω : F-f-f

δ : 120

p1 : F -> F-f+F+f-F

p2 : f -> ff

Onde f minúsculo representa desenhar para frente e um ângulo inicial de -60 graus. Esse será o resultado:
<img width="788" alt="image" src="https://user-images.githubusercontent.com/59899335/165127246-20c1707b-2de8-49ae-8818-31f2b54797bc.png">

