import Shape

class Square(_length: Double, _height: Double) : Shape ("Square") {
    val length = _length;
    val height =  _height;
    override fun printDimensions() {
        println("Length is "+length);
        println("Height is "+height);
    }

    override fun getArea(): Double {
        println("Area is "+(length*height));
        return 0.0;
    }
}