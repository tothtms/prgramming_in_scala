println("\n#### continue and break ####\n")

var i = 0
var foundIt = false

while (i < args.length && !false) {
    if (!args(i).startsWith("-")) { // continue
        if (args(i).endsWith(".scala"))
            foundIt = true // break
    }

    i = i + 1
}
println("Found it: " + foundIt)


println("\n#### recursive ####\n")
def searchFrom(i: Int): Int = 
    if (i >= args.length) -1
    else if (args(i).startsWith("-")) searchFrom(i + 1)
    else if (args(i).endsWith(".scala")) i
    else searchFrom(i + 1)

println(searchFrom(0))
