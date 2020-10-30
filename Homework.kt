import kotlin.math.min


fun main() {
    val firstpoint: Point = Point()
    firstpoint.x = 1f
    firstpoint.y = 5f
    val secondpoint: Point = Point()
    secondpoint.x = 1f
    secondpoint.y = 5f

    //firstpoint.equals1(secondpoint)
    //println(firstpoint.movetoY())
    //println(secondpoint.toString())
    val f1: Fraction = Fraction(1f,2f)
    val f2: Fraction = Fraction(4f,12f)
    //println(f1.product(f2))
    //println(f1.division(f2))
    //println(f1.minimize())

    //println(f1.plus(f2))
    //println(f1.minus(f2))

}

class Point {
    var x:Float = 0f
    var y:Float = 0f

    override fun toString(): String {
        return "($x ; $y)"
    }
    fun equals1(other: Point){
        if(x == other.x && y == other.y) {

            return println("ეს ორი წერტილი ერთმანეთის ტოლია. ")

        }else{

            return println("ეს ორი წერტილი ერთმანეთის ტოლი არაა. ")

        }

    }

    fun movetoY(){
        x = -x
        if(x == -0f){
            x = 0f
            println("Y ღერძის მიმართ სიმეტრიული წერტილის მონაცემებია: ($x ; $y)")
        }else{
            return println("Y ღერძის მიმართ სიმეტრიული წერტილის მონაცემებია: ($x ; $y)")
        }

    }

}

class Fraction (n: Float, d: Float) {

    var numerator: Float = n
    var denominator: Float = d

    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if (numerator * other.numerator / denominator == other.numerator) {
                return true
            }
        }
        return false
    }


    fun product(other: Fraction) {
        numerator = numerator * other.numerator
        denominator = denominator * other.denominator


        return println("ამ ორი წილადის ნამრავლია: $numerator/$denominator")
    }

    fun division(other: Fraction) {

        numerator = numerator * other.denominator
        denominator = denominator * other.numerator

        return println("ამ ორი წილადის განაყოფია: $numerator/$denominator")
    }

    fun minimize() {


        val minNumber = min(denominator, numerator)
        for (x in minNumber.toInt() downTo 0) {
            if (denominator.toInt() % x == 0 && numerator.toInt() % x == 0) {
                denominator = denominator / x
                numerator = numerator / x
                break
            }
        }
        return println("$numerator/$denominator")

    }

    fun plus(other: Fraction): Fraction {
        val f3 : Fraction = Fraction(numerator, denominator)



        if (denominator == other.denominator) {
            f3.numerator = numerator + other.numerator
            f3.minimize()
            return f3

        } else {
            var n1 = numerator * other.denominator
            var n2 = other.numerator * denominator
            var d1 = denominator * other.denominator


            numerator = n1
            other.numerator = n2
            denominator = d1
            other.denominator = d1

            f3.numerator = numerator + other.numerator
            f3.denominator = denominator
            f3.minimize()
            return f3
        }


    }
    fun minus(other: Fraction): Fraction {
        val f3 : Fraction = Fraction(numerator, denominator)



        if (denominator == other.denominator) {
            f3.numerator = numerator - other.numerator
            f3.minimize()
            return f3

        } else {
            var n1 = numerator * other.denominator
            var n2 = other.numerator * denominator
            var d1 = denominator * other.denominator


            numerator = n1
            other.numerator = n2
            denominator = d1
            other.denominator = d1

            f3.numerator = numerator - other.numerator
            f3.denominator = denominator
            f3.minimize()
            return f3
        }


    }



}