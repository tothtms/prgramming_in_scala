println("\n#### collections ####\n")

val filesHere = (new java.io.File("../04/")).listFiles

for (file <- filesHere)
    println(file)


println("\n#### ranges ####\n")

for (i <- 1 to 4)
    println("\"to\" iteration " + i)

for (i <- 1 until 4)
    println("\"until\" iteration " + i)


println("\n#### filtering ####\n")

for (file <- filesHere if file.getName.startsWith("F"))
    println(file)

println("")

for (file <- filesHere
    if file.isFile
    if file.getName.startsWith("C")
) println(file)


println("\n#### nested iteration ####\n")

def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines().toList

// def grep(pattern: String) =
//     for (
//         file <- filesHere
//         if file.getName().endsWith(".scala"); line <- fileLines(file)
//         if line.trim.matches(pattern)
//     ) println(file + ": " + line.trim)

// mid-stream variable bindings
// the previous code repeats the line.trim expression
def grep(pattern: String) =
    for (
        file <- filesHere
        if file.getName().endsWith(".scala");
        line <- fileLines(file);
        trimmed = line.trim
        if trimmed.matches(pattern)
    ) println(file + ": " + trimmed)

grep(".*g.*")


println("\n#### producing a new collection ####\n")

def scalaFiles = 
    for {
        file <- filesHere
        if file.getName.endsWith(".scala")
    } yield file

def forLineLengths = 
    for {
        file <- filesHere
        if file.getName().endsWith(".scala");
        line <- fileLines(file);
        trimmed = line.trim
        if trimmed.matches(".*for.*")
    } yield trimmed.length

println(scalaFiles.mkString("\n"))
println(forLineLengths.mkString("\n"))