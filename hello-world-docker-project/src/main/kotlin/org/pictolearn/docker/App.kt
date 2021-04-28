package org.pictolearn.docker

class App {
    val greeting: String
        get() {
            return "Hello world."
        }
}

fun main(args: Array<String>) {
    for (index in 0..99) {
        println(App().greeting)
        Thread.sleep(1000L)
    }
}
