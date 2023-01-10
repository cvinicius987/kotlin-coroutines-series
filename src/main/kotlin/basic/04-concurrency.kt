package basic

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking { //coroutine alto nivel
    newConcurrency()

    println("4-Fim da execucao")
}

private suspend fun newConcurrency() = coroutineScope{ //coroutine scope
    launch { //cria uma coroutine
        delay(3000L) //Delay de 3 segundos
        println("1-World")
    }

    launch { //cria uma coroutine
        delay(2000L) //Delay de 3 segundos
        println("2-World")
    }

    println("3-Hello")
}