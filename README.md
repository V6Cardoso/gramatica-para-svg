# gramatica-para-svg
EC6 Compiladores Desafio 4

<br>
<h3>Glosário da linguagem:</h3>


Σ   ☞ Alfabeto da linguagem

n   ☞ Passos, etapas

ω   ☞ Axioma, condição inicial

δ   ☞ Angulo em graus (referência círculo trigonométrico)

pX  ☞ Regras de produção


--------------------------------------------
<h3>Alfabeto aceito: F f + - [ ]</h3>
<br>

F: desenha para frente

f: vai para frente

+: gira sentido anti-horário

-: gira sentido horário

[: push posição

]: pop posição


--------------------------------------------
<h3>Exemplo arquivo input.txt:</h3>

n : 6

ω : F-f-f

δ : 120

p1 : F -> F-f+F+f-F

p2 : f -> ff

Onde f minúsculo representa desenhar para frente e um ângulo inicial de -60 graus.
<h3>Resultado dessa entrada:</h3>
<img width="788" alt="image" src="https://user-images.githubusercontent.com/59899335/165127246-20c1707b-2de8-49ae-8818-31f2b54797bc.png">

