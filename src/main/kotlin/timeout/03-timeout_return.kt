package timeout

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout

fun main() = runBlocking {

    //Determina que esta coroutine deve ter um tempo maximo de 3s
    //Retorna um valor em caso do fim do processamento dentro do tempo estipulado
    val result = withTimeout(3000) {
        repeat(5) { i ->
            println("Executando: $i ...")
            delay(500L)
        }
        "Feito...."
    }

    println("Resultado: $result")
}