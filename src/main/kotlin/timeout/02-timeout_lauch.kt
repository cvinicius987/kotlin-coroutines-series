package timeout

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout

fun main() = runBlocking{

    //Determina que esta coroutine deve ter um tempo maximo de 3s
    //Como é lançado uma TimeoutCancellationException e uma coroutine paralela não é exibido o stack
    val job = launch {

        withTimeout(3000) {
            repeat(1000) { i ->
                println("Executando: $i ...")
                delay(500L)
            }
        }
    }

    println("Fim do processo....")
}