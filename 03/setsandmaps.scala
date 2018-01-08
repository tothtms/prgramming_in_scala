import scala.collection.mutable
/*
    A set az lehet mutable vagy immutable.
*/

// immutable set
var jetSet = Set("boeing", "airbus")
jetSet += "lear"

println(jetSet)
println(jetSet.contains("cessna"))

var movieSet = mutable.Set("hitch", "poltergeist")
movieSet += "shrek"

println(movieSet)

//###############################
// MAP

val treasureMap = mutable.Map[Int, String]()
treasureMap += (1 -> "go to island.")
treasureMap += (2 -> "find big x on ground")
treasureMap += (3 -> "dig.")

println(treasureMap)

val romanNumeral = Map(1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V")
println(romanNumeral(4))