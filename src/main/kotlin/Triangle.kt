import Shape
import kotlin.math.sqrt

open class Triangle(_1side: Double, _2side: Double, _3side: Double) : Shape ("triangle") {
    val side1 = _1side;
    val side2 = _2side;
    val side3 = _3side;
    val S = (side1+side2+side3)/2;

    override fun printDimensions() {
        println("Side 1 is "+side1);
        println("Side 2 is "+side2);
        println("Side 3 is "+side3);

    }

    override fun getArea(): Double {
        println("Area is "+ sqrt(S*(S-side1)*(S-side2)*(S-side3)));
        return 0.0;
    }
}