//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var d=20
    var e=9.0
    println(d+e)
    println(d-e)
    println(d*e)
    println(d/e)
    println(d%e)
    area(6,8)

    var name="Nana"
    var age=20
    var number="0727725360"
    var weight=56
    var citizen="Kenyan"
    println(name)
    println(age)
    println(number)
    println(weight)
    println("Kenyan")
    myName("Rehema")

    println(sentence("Jemimah"))

}
fun area(num1:Int, num2:Int):Int{
    var area=num1 * num2
    println(area)
    return (area)
}
fun myName(name:String){
    if(name=="Rehema"){
        println("That's me")
    }
    else{
        println("I do not know who that is")
    }
}
fun sentence(name:String):String{
    return(name.slice(2..5))
}


