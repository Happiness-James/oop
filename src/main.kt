fun main(){
var person = Human("Happiness",23,56.7)
    person.eat(5)
    println(person.weight)
    person.Speak("Never give up on a bad day")
    person.birthday()
    var information = User("Gesare","James","happyjames@gmail.com","0723456812","gesare45-7" )
    println(information.lastName)
    println(information.passWord)
}
class Human(var name: String, var age: Int,var weight: Double){
fun eat(foodWeight: Int){
    weight+=foodWeight
println("I am eating $foodWeight kgs of food")
}
    fun Speak(speech: String){
        println(speech)
    }
    fun birthday(){
        age++
        println(age)
    }

}
data class User(val firstName: String, val lastName: String, val email: String, val phoneNumber: String, val passWord: String)
{

}