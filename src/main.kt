fun main() {
    var place = "akirachix"
    var char = place[0]
    var char1 = place[2]
    var char2 = place[3]
    var result = "$char$char1$char2"
    println(result)


    var y = identity("Philip", 15)
    println(y)

    var feeling = "excited"
    println(feeling.length)

    var name = "Philip"
    if (name=="Philip"){
        print("That's me!")
    }else {print("I don't know who that is")



    }
}
fun identity(name:String,age:Int):String{
    var stmt="Hi my name is $name and I am $age years old"
    return stmt
}

