class CarConstructor (var brand: String, var model: String, var year: Int)

fun main() {
    val c1 = CarConstructor("Ford", "Mustang", 1969)
    val c2 = CarConstructor("BMW", "X5", 1999)
    val c3 = CarConstructor("Tesla", "Model S", 2020)

    println(c1.brand + c2.model + c3.year)
}