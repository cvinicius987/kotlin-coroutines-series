package basic

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import printCoroutineThreadName

fun main() = runBlocking {

    launch { //inicia uma coroutine, que sera executa de forma assincrona
        delay(1000L)
        newSuspend("1-Teste")
    }

    newSuspend("2-Teste")

    println("3-Teste")
}

private suspend fun newSuspend(text:String) {
    println(text)
}
