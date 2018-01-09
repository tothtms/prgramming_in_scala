val numbers = List(1, 2, 3, 4, 5, 6)

// println(
//     numbers.filter((x: Int) => x % 2 == 0) 
// )

println(
    numbers.filter(_ % 2 == 0)
)