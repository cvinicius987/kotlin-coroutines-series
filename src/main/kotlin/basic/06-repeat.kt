package basic

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

suspend fun main() {

    coroutines()
}

private suspend fun simple() {

    repeat(100_000) { // launch a lot of coroutines
        print(".")
    }
}

private suspend fun coroutines() = runBlocking{

    repeat(100_000) { // launch a lot of coroutines
        launch {
            delay(5000L)
            print(".")
        }
    }
}


private suspend fun threads(){

    repeat(100_000) { // launch a lot of coroutines
        thread {
            Thread.sleep(5000L)
            print(".")
        }
    }
}