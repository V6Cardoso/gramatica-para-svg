# gramatica-para-svg
EC6 Compiladores Desafio 4

<br>
<h3>Gramática da linguagem:</h3>


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

<br>

<h2>Exemplos de input.txt:</h2>

<h3>Sierpinski triangle</h3>

n : 6

ω : F-f-f

δ : 120

p1 : F -> F-f+F+f-F

p2 : f -> ff

Onde f minúsculo representa desenhar para frente e um ângulo inicial de -60 graus.
<h4>Resultado</h4>
<img width="788" alt="image" src="https://user-images.githubusercontent.com/59899335/165127246-20c1707b-2de8-49ae-8818-31f2b54797bc.png">

--------------------------------------------
<h3>Dragon curve</h3>

n : 10

ω : F

δ : -90

p1 : F -> F+f

p2 : f -> F-f

Onde f minúsculo representa desenhar para frente e um ângulo inicial de -90 graus.
<h3>Resultado</h3>
<img width="756" alt="image" src="https://user-images.githubusercontent.com/59899335/165141675-68c48107-8739-491a-ba38-ef35c2740720.png">


--------------------------------------------
<h3>Fractal plant</h3>

n : 5

ω : f

δ : 25

p1 : F -> FF

p2 : f ->  F+[[f]-f]-F[-Ff]+f

Onde o ângulo inicial é de -65 graus.
<h3>Resultado</h3>
<img width="746" alt="image" src="https://user-images.githubusercontent.com/59899335/165145107-d3a7ca1f-bf31-4572-9936-04aa9d12cc86.png">




