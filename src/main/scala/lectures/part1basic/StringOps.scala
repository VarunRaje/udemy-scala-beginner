package lectures.part1basic

object StringOps extends App {

  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))
  println(str.substring(7,11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.length)

  val aNumberString = "2"
  println(aNumberString.toInt)

  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))

  val age = 12
  val name = "Varun"

  // s interpolator
  val greeting  = s"Hello My name is $name and I am $age years old."
  val anotherGreeting  = s"Hello My name is $name and I will be turning ${age+1} years old."

  println(anotherGreeting)

  //f interpolator
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per min."

  println(myth)

  //raw interpolator
  println(raw"This is \n new line")
  val escaped = "This is \n new line"
  println(raw"$escaped")



}
