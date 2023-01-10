package basic

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking { //Escopo

    launch { // Inicia uma nova coroutine e continua o processo
        delay(1000L) // (non-blocking delay) por 1 segundo (tempo em milisegundos)

        println("World")
    }

    println("Hello")
}
