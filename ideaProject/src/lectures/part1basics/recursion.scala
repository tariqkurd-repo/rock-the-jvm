package lectures.part1basics

import scala.annotation.tailrec

object recursion extends App {

  def factorial(n: Int): Int = {
    if (n<=1) 1
    else {
      println("Computing factorial of " + n + " - I first need " + (n-1))
      val result = n * factorial(n-1)
      println("Computed factorial of " + n)
      result
    }
  }

  println(factorial(10))
  //println(factorial(5000))

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x<=1) accumulator
      else factHelper(x-1, x * accumulator)

    factHelper(n, 1)
  }

  println(anotherFactorial(10))
  println(anotherFactorial(5000))

  def aRepeatedFunction(aString : String, n: Int, currentString: String): String = {
    if (n==1) currentString
    else aRepeatedFunction(aString, n-1, currentString+aString)
  }

  println(aRepeatedFunction("bob", 3, "horse"))

  def isPrime(n: Int): Boolean = {
    @tailrec def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t<=1) true
      else isPrimeTailrec(t-1, n%t!=0 && isStillPrime)
    isPrimeTailrec(n/2, true)
  }

  println(isPrime(10))
  println(isPrime(37))

  def fibonacci(n: Int) : Int = {

    def fiboTailrec(i: Int, last: Int, nextToLast: Int): Int =
      if (i >= n) last
      else fiboTailrec(i + 1, last + nextToLast, last)

    if (n <= 2) 1
    else fiboTailrec(2, 1, 1)
  }
}
