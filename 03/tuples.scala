/*
    A tuple az immutable és tartalmazhat különböző típusú elemeket.
    A típus számít az elemek számától, ha két elemű akkor Tuple2[elemek típusa], viszont
    ha pl 6 elemű akkor Tuple6[elemek típusa] típus lesz.
 */

val pair = (99, "luftballons")

// nem lehet úgy hivatkozni az elemekre mint a listáknál.
// a tuple indexe NEM 0-tól hanem 1-től KEZDŐDIK
println(pair._1)
println(pair._2)