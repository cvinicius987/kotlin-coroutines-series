package basic

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking{

    vehicles()

    println("Encerrando....")
}

private suspend fun vehicles() = coroutineScope{

    launch {
        println("1- Carro chegou....")
    }

    val job2 = launch {
        println("2- Permissao para abastecer....")
        delay(4000L)
    }

    job2.join()

    val job3 = launch {
        println("3-Abastecendo.......")
        delay(4000L)
    }

    launch {
        repeat(3){
            delay(1000L)
            println("4-Abastecendo ainda.......")
        }
    }

    job3.join()

    println("5- Abastecimento concluido....")

    val job6 = launch {
        println("6- Solicitacao de Pagamento do Abastecimento")
        delay(2000L)
    }

    job6.join()

    println("7- Pagamento concluido")

    launch {
        delay(2000L)
        println("8- Envia SMS confirmando pagamento")
    }

    println("9-Concluido")
}