package org.example

//fun main() {
//    val listWithDuplicates = listOf(1, 2, 2, 3, 4, 4, 5)
//    val uniqueList = UniqueList(listWithDuplicates)
//
//    val listWithDuplicates2 = listOf("Apple", "Banana", "Cherry",
//        "Banana", "Cherry","Banana", "Cherry")
//    val uniqueList2 = UniqueList(listWithDuplicates2)
//
//    println("Unikalne elementy: $uniqueList")
//    println("Unikalne elementy: $uniqueList2")
//}


class UniqueList<T>(private val elements: List<T>) : Iterable<T> {
    // Używamy zbioru do przechowywania unikalnych elementów
    private val uniqueElements = elements.toSet()

    // Implementacja metody iterator() z interfejsu Iterable
    override fun iterator(): Iterator<T> {
        return uniqueElements.iterator()
    }

    // Dodatkowe metody, które mogą być przydatne
    fun contains(element: T): Boolean {
        return uniqueElements.contains(element)
    }


    // Funkcja pomocnicza do wyświetlania zawartości
    override fun toString(): String {
        return uniqueElements.toString()
    }
}