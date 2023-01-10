
# Basic

## Coroutine Scope

Toda coroutine deve ser executada um Scope, a criação de um scope, acontece através dos builders.

### runBlocking

Builder para criação de coroutines, faz uma interligação entre o contexto bloqueante e não bloqueante, este builder irá bloquear a Thread corrente.
Este builder fica atrelado ao mais baixo nivel, onde podemos listar frameworks, metodos main de um processo background, etc.

### coroutineScope

Similar a runBlocking, esta cria um contexto onde poderão ser executadas varias coroutines, a diferença é não haver bloqueio da Thread corrente,
apenas uma suspenção liberando a Thread para outras tarefas, este metodo é o mais utilizado em sistemas corporativos.

### launch

Cria uma coroutine ao ser invocado, este bloco será executado de forma concorrente com o resto do código,
os processos irão trabalhar de forma independente.

### delay

Função que suspende a coroutine por um determinado periodo, a Thread na qual a coroutine esta rodando não será bloqueada.

### join

Este método é chamado a partir de um Job, ao ser invocado, o join() faz a Thread principal aguardar a coroutine terminar
para ele poder prosseguir.

### repeat function

Esta função é utilizada para executar um determinado trecho de código.
