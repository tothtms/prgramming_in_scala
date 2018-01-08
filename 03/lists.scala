/*
    A List() az immutable ezért lehet jobb mint a sima array
 */
val oneTwoThree = List(1, 2, 3)
val oneTwo = List(1, 2)
val threeFour = List(3, 4)
val oneTwoThreeFour = oneTwo ::: threeFour

println(oneTwo + " and " + threeFour + " were not mutated.")
println("thus, " + oneTwoThreeFour + " is a new list.")

//#############################
// :: hozzáad egy új element a lista elejére
val twoThree = List(2, 3)
val OneTwoThreeAppend = 1 :: twoThree
println(OneTwoThreeAppend)

//#############################
val oneTwoThreeNil = 1 :: 2 :: 3 :: Nil
println(oneTwoThreeNil)

//#############################
// néhány List() függvény

// create a new list
val empty = List()
val coolToolsRule = List("Cool", "tools", "rule")
val thrill = "will" :: "fill" :: "until" :: Nil

// két lista összefűzése
val concatenate = List("a", "b") ::: List("c", "d")

//1. result: until
println("1. " + thrill(2))

//2. Hány 4 hosszú elem van a listában?
println("2. " +
    thrill.count(s => s.length == 4)
)

//3. dobja az első két elemet a listából, 
// ténylegesen nem törlődik a listából (immutable)
println("3. " + thrill.drop(2))
//4. ez is dobja csak jobbról :D
println("4. " + thrill.dropRight(2))

//5. létezik-e a listában
println("5. " + 
    thrill.exists(s => s == "until")
)

//6. azokat adja vissza amelyek 4 hosszúak
println("6. " + 
    thrill.filter(s => s.length == 4)
)

//7. megnézi, hogy az összes elem l betűvel végződik-e
println("7. " + 
    thrill.forall(s => s.endsWith("l"))
)

//8. kiírjuk az elemeket
thrill.foreach(s => print("8. " + s))
//9. rövid forma
println()
print("9. ")
thrill.foreach(print)
println()

//10. az első elemet adja vissza
println("10. " + thrill.head)
//11. az utolsó elemet adja vissza
println("11. " + thrill.last)

//12. az utolsót kivéve visszaadja az összes elemet
println("12. " + thrill.init)

//13. üres-e a lista
println("13. " + thrill.isEmpty)

//14. lista hossza
println("14. " + thrill.length)

//15. az összes elemhez hozzáfűzi a y-t
println("15. " + 
    thrill.map(s => s + "y")
)

//16. egy sztringet csinál vesszővel elválasztva
println("16. " + 
    thrill.mkString(", ")
)

//17. azokat adja vissza amelyek 4 négy hosszúak
println("17. " + 
    thrill.filterNot(s => s.length == 4)
)

//18. visszafelé írja ki a listát
println("18. " + 
    thrill.reverse
)

//19. rendezés
println("19. " +
    thrill.sortWith((s, t) => s.charAt(0).toLower < t.charAt(0).toLower)
)

//20. az első elem kivételével az összes elemet visszadja
println("20. " +
    thrill.tail
)