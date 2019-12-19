package lectures.part2oop

object OOBasics extends App {

  val person = new Person("John", 26)
  println(person.age)
  person.greet("Daniel")
  person.greet()

  val author   = new Writer("Charles", "Dickens", 1812)
  val imposter = new Writer("Charles", "Dickens", 1812)
  val novel    = new Novel ("Great Expectations", 1861, author)
  println(novel.authorAge)
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(imposter))

  val counter = new Counter(0)
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(10).print
}

class Person (name: String, val /*val turns parameter into a class field*/age: Int) {
  val x = 2
  println(1+3)
  def greet(name: String): Unit = println(s"Hi, ${this.name} says Hi $name")

  def greet(): Unit = println(s"Hi, I am ${this.name}")

  //multiple constructors - must call another constructor

  def this(name: String) = this(name, 0) //initialise age to zero
  def this() = this("John Doe")
}

class Writer (val first_name: String, val last_name: String, val year: Int) {
  def fullname : String = first_name + " " + last_name
}

class Novel (val name: String, val year_of_release: Int, val author: Writer) {

  def authorAge = year_of_release - author.year
  def isWrittenBy(author: Writer) = author == this.author
  def copy(new_year_of_release: Int) : Novel = new Novel(name, new_year_of_release, author)

}

class Counter(val count: Int) {
  def inc = {
    println("Incrementing")
    new Counter(count + 1)
  } //immutability
  def dec = {
    println("Decrementing")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter = {
    if (n<=0) this
    else inc.inc(n-1)
  }
  def dec(n: Int): Counter = {
    if (n<=0) this
    else dec.dec(n-1)
  }

  def print = println(count)
}