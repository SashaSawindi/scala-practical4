object StringFormatter {

  // Method to convert a string to upper case
  def toUpper(str: String): String = str.toUpperCase

  // Method to convert a string to lower case
  def toLower(str: String): String = str.toLowerCase

  // Method to format a string using a passed function
  def formatNames(name: String)(formatFunc: String => String): String = {
    formatFunc(name)
  }

  def main(args: Array[String]): Unit = {
    // Test inputs and formatting as per the given output
    println(formatNames("Benny")(toUpper))         // BENNY
    println(formatNames("Niroshan")(name => {
      val (firstPart, secondPart) = name.splitAt(2)
      firstPart.toUpperCase + secondPart.toLowerCase
    }))                                            // NIroshan
    println(formatNames("Saman")(toLower))         // saman
    println(formatNames("Kumara")(name => {
      val (firstPart, lastPart) = name.splitAt(name.length - 1)
      firstPart.toLowerCase + lastPart.toUpperCase
    }))                                            // KumarA
  }
}
