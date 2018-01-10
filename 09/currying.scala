def oldSum(x: Int, y: Int) = x + y

def curriedSum(x: Int)(y: Int) = x + y

println(curriedSum(3)(2))

// just illustration
// def first(x: Int) = (y: Int) => x + y
// val second = first(1)

val onePlus = curriedSum(1)_
val twoPlus = curriedSum(2)_

println(onePlus(2))
println(twoPlus(2))