import java.util.Scanner

fun main(args: Array<String>) {
    println("Hello World!")
    val reader = Scanner(System.`in`)

    println("Enter the square height: ")
    var val1 = reader.nextDouble()
    println("Enter the square length: ")
    var val2 = reader.nextDouble()

    var firstShape = Square(val1, val2)

    println("Enter the circle radius: ")
    val1= reader.nextDouble()

    var secondShape = Circle(val1)

    println("Enter side 1 of the triangle: ")
    val1 = reader.nextDouble()
    println("Enter side 2 of the triangle: ")
    val2 = reader.nextDouble()
    println("Enter side 3 of the triangle: ")
    var val3 = reader.nextDouble()

    var thirdShape = Triangle(val1,val2,val3)

    println("Enter the Equilateral Triangle side: ")
    val1= reader.nextDouble()

    var fourthShape = EquilateralTriangle(val1)

    firstShape.getName();
    firstShape.printDimensions();
    firstShape.getArea();

    secondShape.getName();
    secondShape.printDimensions();
    secondShape.getArea();

    thirdShape.getName();
    thirdShape.printDimensions();
    thirdShape.getArea();

    fourthShape.getName();
    fourthShape.printDimensions();
    fourthShape.getArea();


}