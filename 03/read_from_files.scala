import scala.io.Source

def widthOfLength(s: String) = s.length

// if (args.length > 0) {
//     for (line <- Source.fromFile(args(0).getLines()))
//         println(line.length + " " + line)
// }
// else
//     Console.err.println("Plese enter filename")


// if (args.length > 0) {
//     var maxWidth = 0
//     for (line <- Source.fromFile(args(0).getLines())) {
//         println(line.length + " " + line)
//         maxWidth = maxWidth.max(widthOfLength(line))
//     }
// }
// else
//     Console.err.println("Plese enter filename")

// if (args.length > 0) {
//     val lines = Source.fromFile(args(0)).getLines().toList
//     val longestLine = lines.reduceLeft(
//         (a, b) => if (a.length > b.length) a else b
//     )
//     val maxWidth = widthOfLength(longestLine)

//     for (line <- lines) {
//         println(line.length + " " + line)
//     }

//     println("\n########### statisztika ################\n")
//     println("maxWidth: " + maxWidth)
//     println("longestLine: " + longestLine)
// }
// else
//     Console.err.println("Please enter filename")

if (args.length > 0) {
    val lines = Source.fromFile(args(0)).getLines().toList
    val longestLine = lines.reduceLeft(
        (a, b) => if (a.length > b.length) a else b
    )
    val maxWidth = widthOfLength(longestLine)

    for (line <- lines) {
        val numSpaces = maxWidth - widthOfLength(line)
        val padding = " " * numSpaces
        println(padding + line.length + " " + line)
    }

    println("\n########### statisztika ################\n")
    println("maxWidth: " + maxWidth)
    println("longestLine: " + longestLine)
}
else
    Console.err.println("Please enter filename")