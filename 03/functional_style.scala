// imperative style
/* def printArgs(args: Array[String]): Unit = {
    var i = 0
    while (i < args.length) {
        println(args(i))
        i += 1
    }
} */

// functional
/* def printArgs(args: Array[String]): Unit = {
    for (arg <- args)
        println(arg)
} */

// or
def printArgs(args: Array[String]): Unit = {
    args.foreach(println)
}


// purely functional
def formatArgs(args: Array[String]) = args.mkString("\n")

val res = formatArgs(Array("zero", "one", "two"))
assert(res == "zero\none\ntwo")
println(res)