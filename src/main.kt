fun main(){
    var menuSelect = 0
    while (menuSelect != 1 or 2 or 3 or 4) {
        println("Choose which shape you want to find the area of.")
        println("1) Circle")
        println("2) Square")
        println("3) Triangle")
        println("4) Rectangle")
        var menuSelect = readLine()!!.toInt()
        if (menuSelect == 1) {
            println("Enter the radius of the circle.")
            var rad = readLine()!!.toDouble()

            //Creating function which calculates area and returns it
            fun circle(rad: Double): Double {
                var area = 0.00
                area = (3.14 * ((rad * rad)))
                return area
            }
            // Calling the function
            var area = circle(rad)
            //Print result
            println("${area} is the area of the circle.")
        }
        if (menuSelect == 2) {
            println("Enter the length of the sides.")
            var length = readLine()!!.toDouble()
            fun square(length: Double): Double {
                var area = 0.00
                area = (length * length)
                return area
            }

            var area = square(length)
            println("${area} is the area of the square.")
        }
        if (menuSelect == 3) {
            println("Enter the base of the triangle.")
            var base = readLine()!!.toDouble()
            println("Enter the height of the triangle.")
            var height = readLine()!!.toDouble()
            fun triangle(base: Double, height: Double): Double {
                var area = 0.00
                area = ((base * height) / 2)
                return area
            }

            var area = triangle(base, height)
            println("${area} is the area of the triangle.")
        }
        if (menuSelect == 4) {
            println("Enter the width of the rectangle.")
            var width = readLine()!!.toDouble()
            println("Enter the height of the rectangle.")
            var height = readLine()!!.toDouble()
            fun rectangle(width: Double, height: Double): Double {
                var area = 0.00
                area = (width * height)
                return area
            }

            var area = rectangle(width, height)
            println("${area} is the area of the rectangle.")
        }
    }

}
