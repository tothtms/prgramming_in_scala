import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException
import java.net.URL
import java.net.MalformedURLException

println("\n#### throwing exception ####\n")

val n = 2
val half = 
    if (n % 2 == 0)
        n / 2
    else
        throw new RuntimeException("maybe next time")


println("\n#### catching exception ####\n")

try {
    val f = new FileReader("input.txt")
} catch {
    case ex: FileNotFoundException => println("FileNotFoundException")
    case ex: IOException => println("IOException")
}


println("\n#### finally clause ####\n")

val file = new FileReader("exception_with_try.scala")
try {
    //do something
} finally {
    println("finally")
    file.close()
}


println("\n#### yielding value ####\n")

def urlFor (path: String) = 
    try {
        new URL(path)
        println("yes")
    } catch {
        case e: MalformedURLException =>
            new URL("http://www.scala-lang.org")
            println("MalformedURLException")
    }

urlFor("abc")