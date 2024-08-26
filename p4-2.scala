object PatternMatchingExample {
  def main(args: Array[String]): Unit = {
    // Check if there is at least one command line argument
    if (args.length > 0) {
      try {
        // Convert the first command line argument to an integer
        val number = args(0).toInt

        // Use pattern matching to handle different cases
        number match {
          case n if n <= 0 =>
            println("Negative/Zero is input")
          case n if n % 2 == 0 =>
            println("Even number is given")
          case _ =>
            println("Odd number is given")
        }
      } catch {
        case e: NumberFormatException =>
          println("Please provide a valid integer")
      }
    } else {
      println("Please provide an integer as a command line argument")
    }
  }
}
