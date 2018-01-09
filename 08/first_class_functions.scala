var increase = (x: Int) => x + 1

println(increase(10))

var increase2 = (x: Int) => {
    println("We")
    println("are")
    println("here!")
    x + 1
}

println(increase2(10))

val numbers = List(1, 2, 3, 4, 5, 6)
println(numbers)

println(
    numbers.filter((x: Int) => x % 2 == 0) 
)