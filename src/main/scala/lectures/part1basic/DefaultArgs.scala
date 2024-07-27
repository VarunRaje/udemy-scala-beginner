package lectures.part1basic

import scala.annotation.tailrec


object DefaultArgs extends App {

  @tailrec
  def tailRecFactorial(n: Int, accumulator: Int = 1): Int = {
    if(n <= 1) accumulator
    else tailRecFactorial(n-1, n*accumulator)
  }

  println(tailRecFactorial(8))

  def savePicture(format: String = "jpg", height: Int =1920, width: Int = 1080): Unit = {
    print("Save Picture")
  }

  /*
    1. Pass the leading aurgument
    2. Name the argument.
   */

  savePicture(height = 800)
  savePicture(width = 1000)
  savePicture(format = "bmp")
}
