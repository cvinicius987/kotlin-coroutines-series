import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.GlobalScope.coroutineContext

fun printCoroutineThreadName(text:String):Unit = println("""
    (Thread: ${Thread.currentThread().name} | Coroutine: ${coroutineContext[CoroutineName.Key]}) - $text
""".trimIndent())
