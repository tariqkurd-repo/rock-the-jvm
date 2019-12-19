package lectures.part2oop

import scala.language.postfixOps

object methodNotations extends App {

  class Person (val name: String, val favouriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie==favouriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(nickname: String): Person = new Person(s"${this.name} ($nickname)", this.favouriteMovie)
    def unary_+ : Person = new Person(name, favouriteMovie, age+1)
    def unary_! : String = s"$name what the heck?!"
    def isAlive: Boolean = true
    def apply(): String = s"Hi my name is $name and I like $favouriteMovie"
    def apply(n: Int): String = s"$name watched $favouriteMovie $n times"
    def learns(thing: String) = s"$name is learning $thing"
    def learnsScala = this learns "scala" //postfix notation
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") //in-fix / operator notation needs a single parameter (syntactic sugar)

  //"operators" in Scala

  val tom = new Person("Tom", "Fight Club")
  println(mary + tom)
  println(mary+(tom))

  println(1 + 2)
  println(1.+(2)) //all operators are methods

  //prefix notation

  val x = -1
  val y = 1.unary_-
  // unary_ prefix only works with a few operators: - + ~ !
  println(!mary)
  println(mary.unary_!)

  //postfix notation
  println(mary.isAlive)
  println(mary isAlive)

  //apply

  println(mary.apply)
  println(mary()) //call the apply method

  println((mary + "the Rockstar").apply())
  println((mary + "the Rockstar")())

  println((+mary).age)
  println(mary learnsScala)
  println(mary(10))

}
