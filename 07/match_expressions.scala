val firstArg = if (args.length > 0) args(0) else ""

firstArg match {
    case "salt" => println("pepper")
    case "chips" => println("salse")
    case "eggs" => println("bacon")
    case _ => println("huh?")
}

println("\n#### match with side effect ####\n")

val friend = 
    firstArg match {
        case "salt" => println("pepper")
        case "chips" => println("salse")
        case "eggs" => println("bacon")
        case _ => println("huh?")
    }

println(friend)