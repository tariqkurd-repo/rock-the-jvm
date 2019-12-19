package lectures.part1basics

object expressions extends App {

  val x = 1 + 2 //EXPRESSION
  println(x)

  println(2+3*4)

  println(1==x)

  println(!(1==x))
  //! && ||

  var aVariable = 2
  aVariable += 3 // -= /= *=
  println(aVariable)

  //instructions (DO) vs expressions (VALUE)

  //IF expression
  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3 //IF expression - returns a value
  println(aConditionedValue)
  println(if (aCondition) 5 else 3)
  println(1+3)

  var i = 0
  var aWhile = while (i<10) {
    println(i)
    i+=1
  }

  //NEVER WRITE THIS AGAIN
  //EVERYTHING IN SCALA is an expression

  val aWeirdValue = (aVariable = 3) //Unit == void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning

  // code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z>2) "hello" else "goodbye"
  }

  // 1. what is the difference between "hello world" avs println("hello world")
  // 2. what is the value os

  val someValue = {
    2 < 3
  }

  println(someValue)
  val someOtherValue = {
    if (someValue) 239 else 986
    42
  }
  println(someOtherValue)

}
