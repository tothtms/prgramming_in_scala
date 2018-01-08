class Rational(n: Int, d: Int) {
    
    require(d != 0)
    
    private val g = gcd(n.abs, d.abs)
    val numer: Int = n / g
    val denom: Int = d / g

    def this(n: Int) = this(n, 1) //auxiliary contructors, if you need multipe constructors

    override def toString = numer + "/" + denom

    def +(that: Rational): Rational = 
        new Rational(
            this.numer * that.denom + that.numer * this.denom,
            this.denom * that.denom
        )
    
    def +(i: Int): Rational =
        new Rational(numer + i * denom, denom)

    def -(that: Rational): Rational =
        new Rational(
            numer * that.denom - that.numer * denom,
            denom * that.denom
        )

    def -(i: Int): Rational = 
        new Rational (numer - i * denom, denom)

    def *(that: Rational): Rational = 
        new Rational(numer * that.numer, denom * that.denom)
    
    def *(i: Int): Rational = 
        new Rational(numer * i, denom)

    def /(that: Rational): Rational = 
        new Rational(numer * that.denom, denom * that.numer)

    def /(i: Int): Rational = 
        new Rational(numer, denom * i)

    def lessThan(that: Rational) = 
        this.numer * that.denom < that.numer * this.denom // self references
    
    private def gcd(a: Int, b: Int): Int =
        if (b == 0) a else gcd(b, a % b) 
}


val oneHalf = new Rational(1,2)
val twoThird = new Rational(2,3)

println(oneHalf + twoThird)
println(oneHalf lessThan twoThird)

//#### auxiliary ##########
val y = new Rational(3)
println(y)

//#### reduce #############
val n = new Rational(66, 42)
println(n)

//##### operators #########
val x = new Rational(1,2)
val y2 = new Rational(2,3)

println(x + y2)
println(x * y2)

//#### Overload ###########
println(j + k)
println(j + 5)