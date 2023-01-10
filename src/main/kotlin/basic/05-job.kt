package basic

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking{

    usingManyJoins()
}

private suspend fun usingJoin() = coroutineScope{

    val job = launch {
        delay(2000L)
        println("1-World!")
    }

    println("2-Hello")
    job.join()
    println("3-Done")
}

private suspend fun usingManyJoins() = coroutineScope{

    val job = launch {
        delay(2000L)
        println("1-World!")
    }

    val job2 = launch {
        delay(4000L)
        println("2-World!")
    }

    println("3-Hello")
    job.join() // Ira aguardar até a coroutine job terminar o processo
    println("4-Done")
}
