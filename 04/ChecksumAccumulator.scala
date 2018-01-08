import scala.collection.mutable

class ChecksumAccumulator {
    private var sum = 0
    def add(b: Byte): Unit = sum += b
    def checksum(): Int = return ~(sum & 0xFF) + 1
}

//###################################
// singleton

object ChecksumAccumulator {
    private val cache = mutable.Map.empty[String, Int]

    def calculate(s: String): Int = {
        if (cache.contains(s)) {
            println("from cache")
            cache(s)
        }
        else {
            val acc = new ChecksumAccumulator
            for (c <- s)
                acc.add(c.toByte)
            
            val checksum = acc.checksum()
            cache += (s -> checksum)
            
            checksum
        }
    }
}