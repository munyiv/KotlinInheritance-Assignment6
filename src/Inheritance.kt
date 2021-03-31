fun main(){
    var gari=Car("Subaru","Legacy","White",14)
    gari.carry(10)
    gari.identity()
   println( gari.calculateParkingFees(5))
    var baasi=Buss("Tesla","legacy","Blue",50)
    println(baasi.maxTripFare(500.50.toDouble()))
    println(baasi.maxTripFare(500.50.toDouble()*baasi.capacity))
}
open class Vehicles(var make:String,var model: String,var color: String,var capacity:Int) {
    fun carry(people: Int) {
        var exess = people - capacity
        if (people <= capacity) {
            println("carrying $people passengers")
        } else {
            println("Overcapacity by $exess passengers")
        }}
        fun identity() {
            println("I am a $color $make $model")

        }

        fun calculateParkingFees(hours: Int): Int {
            return hours * 20

        }

    }


class Car( make:String,  model:String,  color:String,  capacity:Int):Vehicles(make,model,color,capacity) {
}
class Buss(make: String, model: String, color: String, capacity: Int):Vehicles(make, model, color, capacity) {

    fun maxTripFare(fare:Double):Double{
        var b=0
        return b+fare

    }
}







