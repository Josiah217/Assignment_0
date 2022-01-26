import Shape

class Circle(_raduis: Double) : Shape ("Circle") {
    val raduis = _raduis;

    override fun printDimensions() {
        println("Radius is "+raduis);
    }

    override fun getArea(): Double {
        println("Area is "+(raduis*3.14));
        return 0.0;
    }
}