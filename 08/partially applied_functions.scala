def sum(a: Int, b: Int, c: Int) = a + b + c

println(sum(1, 2, 3))

//partially applied function
val a = sum _

println(a(1, 2, 3))

println(a.apply(1, 2, 3))

println("\n#### use in arguments ####\n")
val b = sum(1, _: Int, 3)
println(b(2))
println(b(5))