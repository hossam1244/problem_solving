package grokking_algorithms.binary_search

fun main() {
    print(binarySearch())
}


fun binarySearch(): Int? {
    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    var low = array.first()
    var high = array.last()
    val item = 3

    while (low <= high) {
        val mid = (low + high) / 2
        val guess = array[mid]
        if (guess == item)
            return mid
        if (guess > item) high = mid - 1
        else low = mid + 1
    }
    return null
}