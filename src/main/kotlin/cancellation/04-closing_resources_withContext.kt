package cancellation

import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main()  = runBlocking{

    val job = launch { //Cria uma coroutine
        try {
            repeat(1000) { i ->
                println("job: I'm sleeping $i ...")
                delay(500L)
            }

        } finally {
            withContext(NonCancellable) {
                println("job: I'm running finally")
                delay(1000L)
                println("job: And I've just delayed for 1 sec because I'm non-cancellable")
            }
        }
    }

    delay(3000L) // Aplica um delay
    println("main: I'm tired of waiting!")
    job.cancelAndJoin() // Cancela o job e aguarda ser completado
    println("main: Now I can quit.")
}