// imperative
// def approximateLoop(initialGuess: Double): Double = {
//     var guess = initialGuess
//     while (!isGoodEnough(guess))
//         guess = improve(guess)
//     guess
// }

// functional
// def approximate(guess: Double): Double = 
//     if (isGoodEnough(guess)) guess
//     else approximate(improve(guess))



// this is not a tail recursive
def boom(x: Int): Int =
    if (x == 0) throw new Exception("boom!")
    else boom(x - 1) + 1

// tail call optimization
def bang(x: Int): Int = 
    if (x == 0) throw new Exception("boom!")
    else bang(x - 1)

//boom(3)
bang(3)