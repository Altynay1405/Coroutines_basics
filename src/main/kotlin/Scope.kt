import kotlinx.coroutines.*

/*Scope -
Provides lifecycle methods for coroutines	allow us to start and stop coroutines*/

/*GlobalScope.launch { } - the scope of the coroutine is the lifecycle of the entire application
runBlocking - creates a scope and runs a coroutine in a blocking way
coroutineScope { } - creates a new scope	does not complete until all children coroutines complete*/



fun main() {
    println("Program execution will now block")
    runBlocking {
        launch {
            delay(1000L)
            println("Task from runBlocking 1000 L")
        }

        GlobalScope.launch {
            delay(500L)
            println("Task from GlobalScope 500L")
        }

        coroutineScope {
            launch {
                delay(1500L)
                println("Task from coroutineScope 1500L")
            }
        }

    }

    println("Program execution now continue")
}