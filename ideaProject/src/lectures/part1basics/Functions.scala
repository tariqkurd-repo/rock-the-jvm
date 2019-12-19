package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aRepeatedFunction(aString : String, n: Int): String = {
    if (n==1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello", 3))

  //WHEN YOU NEED LOOPS USE RECURSION

  def aFnwithsideeffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b
    aSmallerFunction(n, n-1)
  }

  /*

  1. a greeting fn for kids, (name, age) "Hi my name is xx and I am xx years old"
  2. Factorial function - product of all numbers up the parameter
  3. fibonnacci function  1 1 2 3 5 f(n)
  4. TEst if a number is prime

   */

  def greeting(name : String, age : Int): Unit = println("Hi my name is " + name + " and I am " + age + " years old")

  greeting("Bob", 56)

  def factorial(n: Int) : Int = {
    if (n>1) n*factorial(n-1) else return 1
  }
  println(factorial(5))
  println(factorial(4))
  println(factorial(3))
  println(factorial(2))
  println(factorial(1))

  def fibonacci(n: Int) : Int =
    if (n<=2) 1
    else fibonacci(n-1) + fibonacci(n-2)

  println(fibonacci(1))
  println(fibonacci(2))
  println(fibonacci(3))
  println(fibonacci(4))
  println(fibonacci(5))
  println(fibonacci(6))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t<=1) true
      else n % t != 0 && isPrimeUntil(t-1)
    isPrimeUntil(n/2)
  }

  println(isPrime(1))
  println(isPrime(2))
  println(isPrime(3))
  println(isPrime(4))
  println(isPrime(21))

}
