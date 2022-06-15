object FiboHO {
    def recursiveFibo(n:Int):Int = {
        if (n == 0) {
            0
        } else if (n == 1) {
            1
        } else if (n == 2) {
            1
        } else {
            (recursiveFibo(n - 1) + recursiveFibo(n - 2))
        }
    }
    def fiboHigherOrder(f: Int => AnyVal, n:Int):Unit ={
        for( i <- 0 to (n - 1)){
            println(f(i))
        }
    }

    def main(args: Array[String]):Unit = {
        println("Ingrese n: ")
        val temp = scala.io.StdIn.readInt()

        val fiboLambda = (f: Int => AnyVal, g: Int => AnyVal, n:Int) => f(g, n) 
        fiboLambda(fiboHigherOrder, recursiveFibo, temp)
        
    }   
}