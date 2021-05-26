import java.util.*

fun main() {
selectContainer(2)
selectContainer(5)
    selectContainer(8)
    nationality("Kenyan")
    nationality("Ugandan")
    nationality("Tanzanian")
    nationality("Ethiopian")
    nationality()
    numbers()
    nums()
    operation()
    values()
    value()


}
    fun selectContainer(litres: Int) {
        when (litres) {
            in 1..3 -> println("Pour the water into a bottle")
            in 4..7 -> println("Pour the water into a bucket")
            in 8..9 -> println("Pour the water into a big bucket")
            else -> println("Pour the water into a jerrycan")
        }
    }
fun nationality(nationality:String){

   if(nationality=="Kenyan"){
        println("Have you ever been in Nairobi")
    }
    else if(nationality=="Ugandan"){
        println("Have you ever been in Kampala")
    }
    else if (nationality=="Tanzanian"){
        println("Have you ever been in Arusha")
    }
    else{
        println("Have you ever been in East Africa")
    }
}
fun nationality (){
   var nationality="Rwandese"
    when (nationality){
       "Ugandan"->println("Have you ever been in Kampala")
        "Kenyan"->println("Have you ever been in Nairobi")
         "Rwandese"->println("Have you ever been in Kigali")
        else->println("Have you ever been in East Africa")
    }
}
fun operatotors(operators:String){
   var a=12
var b=6

    println("Enter operator either +, -, * or /")
    val operator = readLine()

    when (operators) {
      "+" -> println("$a + $b = ${a + b}")
        "-" -> println("$a - $b = ${a - b}")
        "*" -> println("$a * $b = ${a * b}")
        "/" -> println("$a / $b = ${a / b}")
        else -> println("$operators is invalid")
    }

}
open class Animal(var color:String){
    fun eat(){
        println("Animal eating")
    }
}
fun numbers(){
    //we use arrayOf method to create an array of lists
    var nums= arrayOf(1,2,3,4,5,6,7,8)
    println(Arrays.toString(nums))
//We use Arrays' toString() method to print the contents of the array.
    var number =(3..12).toList().toTypedArray()
    println(Arrays.toString(number))
//In this line, we create an array from a range of numbers.
    var num3 = IntArray(5,{i -> i *2 + 3})
    println(Arrays.toString(num3))
    var avg=nums.average()
    println("the average is $avg")

    var values =nums.count()
    println("there are $values elements")

    var total =nums.sum()
    println("the sum of the values is $total")

    var maxValue= nums.max()
    println("the maximum value is $maxValue")

    var minValue = nums.min()
    println("the minimum value is $maxValue")
}
fun nums(){//iterator performs the same function as for loop
    var numbers = arrayOf(1,2,3,4,5,6,7)
    var it:Iterator<Int> = numbers.iterator()
    while(it.hasNext()){
        var e= it.next()
        println("$e")
    }
}
//arrays with two dimensions
fun operation(){

    var array= arrayOf(intArrayOf(1,2),
    intArrayOf(3,4,5),
    intArrayOf(5,6,7,8))
    println(Arrays.deepToString(array))
}
//arrays filtering
fun values(){
    var number= arrayOf(1,2,3,4,5,6,7,8)
    number.filter { e -> e> 0}.forEach { e -> println("$e")}
}
fun value(){
    var elements= intArrayOf(1,2,3,4,5,6,7,8,9)
    var firstEven =elements.find { it%2==0 }
    println("the first even value is: $firstEven")

    var lastEven= elements.find { it%2 ==0 }
    println("the last even value is: $lastEven")
    //reduction method in kotlin is used to calculate a product in an array
    var total= elements.reduce { product, next -> product*next  }
    println(total)
    //All() method is used to if the element i a given arrays meets a given condition given i.e if all the element in an array are ll odd or even elements

    var hasAllEvens =elements.all { it% 2 ==0 }
    if (hasAllEvens){
        println("The array contains only even values")
    }
    else{
        println("The array contains both even and old values ")
    }
    //Any () method it return true if any elements in a given array meets a given condition
    var isEven=elements.any { it% 2 ==0 }
    if (isEven){
        println("The array contains even values")
    }
    else{
        println("Te array does not contain even values")
    }
}









