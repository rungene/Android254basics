package basics

fun main() {



    fun fibonacci() = sequence {
        var terms = Pair(0, 1)

        // this sequence is infinite
        while (true) {
            yield(terms.first)
            terms = Pair(terms.second, terms.first + terms.second)
        }
    }
    println(fibonacci().take(10).toList())

}