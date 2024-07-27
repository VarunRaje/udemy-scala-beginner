package lectures.part1basic

object CBNvsCBV extends App {

  def callByValue(x: Long): Unit = {
    System.out.println("By Value = " + x)
    System.out.println("By Value = " + x)
  }

  def callByName(x: => Long): Unit = {
    System.out.println("By Name = " + x)
    System.out.println("By Name = " + x)
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()

  def evaluateFirst(x: Int, y: => Int) = {
    System.out.println(x)
  }

  evaluateFirst(34, infinite())

}
