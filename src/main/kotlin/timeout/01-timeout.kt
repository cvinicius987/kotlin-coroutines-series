package timeout

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout

fun main() = runBlocking{

    //Determina que esta coroutine deve ter um tempo maximo de 3s
    //Lança uma TimeoutCancellationException
    withTimeout(3000) {
        repeat(1000) { i ->
            println("Executando: $i ...")
            delay(500L)
        }
    }

    //Não executa essa println devido a lançamento da exception na execução corrente
    println("Fim do processo....")
}