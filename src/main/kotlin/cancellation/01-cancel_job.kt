package cancellation

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking{

    val job = launch {
        repeat(5000){
            println("Executando........")

            delay(500)
        }
    }

    delay(3000)

    job.cancel() //Cancela a coroutine job

    println("Fim do processo")
}