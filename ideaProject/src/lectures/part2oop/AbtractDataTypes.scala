package lectures.part2oop

object AbtractDataTypes extends App {

  abstract class Animal {
    val creatureType: String = "Wild"
    def eat : Unit
  }

  class Dog extends Animal{
     override val creatureType: String = "Canine"
     def eat: Unit = println("crunch crunch")
  }

  trait Carnivore {
    def eat (animal: Animal): Unit
    def preferredMeal: String = "fresh meat"
  }

  trait ColdBlooded

  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String =  "croc"
    def eat: Unit = println("plain old croc")
    def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile

  croc.eat(dog)
  croc.eat

}
