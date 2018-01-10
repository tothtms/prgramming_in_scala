def containsNeg(nums: List[Int]): Boolean = {
    var exists = false

    for (num <- nums)
        if (num < 0)
            exists = true

    exists
}

// CONCISE WAY .... HIGHER-ORDER FUNCTION

def containsNegHigherOrder(nums: List[Int]) = nums.exists(_ < 0)

val nums = List(1, 2, 4, 5)
val negNums = List(1, 2, -3, 4)

println(containsNeg(nums))
println(containsNeg(negNums))

println(containsNegHigherOrder(nums))
println(containsNegHigherOrder(negNums))