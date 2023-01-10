package basic

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking { //coroutine scope de alto nivel (main ou frameworks)
    newSuspendCoroutineScope()
}

private suspend fun newSuspendCoroutineScope() = coroutineScope{ //Inicia um coroutine Scope de nivel de codigo
    launch { //Cria uma coroutine
        println("World")
    }

    println("Hello")
}