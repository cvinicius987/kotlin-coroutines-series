
# Kotlin Coroutines

Uma coroutine é um processo computacional que direciona um bloco ou função para trabalhar de forma concorrente.

Na sua execução, uma coroutine não é atribuida a uma Thread em específico, ela pode ter início em um Thread e concluir o seu processo em outra.

Toda coroutine só pode ser iniciada em um *CoroutineScope*, este irá controlar todo o seu ciclo de vida.

## Conteúdo

* [Básico](src/main/kotlin/basic/README.md)
* [Suspend Functions](src/main/kotlin/suspend_functions/README.md)
* [Cancelamento de Coroutines](src/main/kotlin/cancellation/README.md)
* [Timeout](src/main/kotlin/timeout/README.md)
