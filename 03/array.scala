/*
    Array[]() az mutable ezért ha lehet inkább List()
*/

val greetStrings = new Array[String](3)

greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world!\n"

for (i <- 0 to 2)
    print(greetStrings(i))

val greetStrings2 = new Array[String](3)
greetStrings2.update(0, "Hello")
greetStrings2.update(1, ", ")
greetStrings2.update(2, "world!\n")

for (i <- 0 to 2)
    print(greetStrings2(i))

//###############################
//Tömörebb, rövidebb tömb deklaráció

val numNames = Array("zero", "one", "two")
val numNames2 = Array.apply("zero", "one", "two")