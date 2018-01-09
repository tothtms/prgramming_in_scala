var more = 1
val addMore = (x: Int) => x + more

println(
    addMore(10)
)

println("\n#### if change value ####\n")
more = 99

println(
    addMore(10)
)

println("\n#### capture the variable and not value ####\n")
val someNumbers = List(-11, -10, -5 , 0, 5, 10)
var sum = 0

    someNumbers.foreach(sum += _)

println(sum)