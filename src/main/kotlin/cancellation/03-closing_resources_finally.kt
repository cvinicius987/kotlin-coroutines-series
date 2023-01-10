package cancellation

import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main()  = runBlocking{

    val job = launch { //Cria uma coroutine
        try {
            repeat(1000) { i ->
                println("job: I'm sleeping $i ...")
                delay(500L)
            }

        } finally {
            println("job: I'm running finally")
        }
    }
    delay(3000L) // Aplica um delay
    println("main: I'm tired of waiting!")
    job.cancelAndJoin() // Cancela o job e aguarda ser completado
    println("main: Now I can quit.")
}