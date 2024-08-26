object InventoryManagement {

  // Arrays to store item names and quantities
  var itemNames: Array[String] = Array("Apples", "Bananas", "Oranges", "Milk")
  var itemQuantities: Array[Int] = Array(10, 20, 15, 5)

  // Function to display the inventory
  def displayInventory(): Unit = {
    println("Current Inventory:")
    for (i <- itemNames.indices) {
      println(s"${itemNames(i)}: ${itemQuantities(i)} units")
    }
  }

  // Function to restock an item
  def restockItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index != -1) {
      itemQuantities(index) += quantity
      println(s"$quantity units of $itemName have been added. New quantity: ${itemQuantities(index)}")
    } else {
      println(s"Item '$itemName' does not exist in the inventory.")
    }
  }

  // Function to sell an item
  def sellItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index != -1) {
      if (itemQuantities(index) >= quantity) {
        itemQuantities(index) -= quantity
        println(s"$quantity units of $itemName have been sold. Remaining quantity: ${itemQuantities(index)}")
      } else {
        println(s"Not enough quantity of $itemName to sell. Available quantity: ${itemQuantities(index)}")
      }
    } else {
      println(s"Item '$itemName' does not exist in the inventory.")
    }
  }

  def main(args: Array[String]): Unit = {
    // Display the initial inventory
    displayInventory()

    // Restock an item
    restockItem("Bananas", 10)

    // Attempt to restock a non-existing item
    restockItem("Chocolate", 10)

    // Sell an item
    sellItem("Apples", 5)

    // Attempt to sell more than available
    sellItem("Oranges", 20)

    // Attempt to sell a non-existing item
    sellItem("Bread", 5)

    // Display the updated inventory
    displayInventory()
  }
}
