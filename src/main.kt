import jdk.jfr.DataAmount

fun main() {
    greetJane("jane")
    nums(9)
    hasVisitedCapital("Tanzanian")
    println(passwword("sinisa"))
    println(passwword("sinisa22"))
    println(passwword("sinisa20222"))
    println(passwword("password"))
    boxes(5)

    var a= CurrentAccount("GH362","KCB43",20000)
    a.deposit(10000.0)
    a.withdraw(5000.0)
    a.details()

    var p=SavingsAccount("GH362","KCB43",20000,2)
    p.withdraw(2000.0)

    (sentence("banana"))
var retWord = words("banana")
    println(retWord)

    var phone= Mobile("Samsung","A52",5689)
    println(phone)
    var person= Name("Dominic","Wafula",24)
    println(person.firstName.toString()+ " "+person.lastName+ " "+person.age)

    val subject=5
    println(subject::class.simpleName)
    val marks=47.5
    println(marks::class.simpleName)
    val name=true
    println(name::class.simpleName)

}

fun greetJane(name: String) {
    if (name == "Jane") {
        println("Hello Jane")
    } else {
        println("Who are you?")
    }
}

fun nums(nums: Int) {
    if ((nums % 2) == 0) {
        println("even")
    } else {
        println("odd")
    }
}

fun hasVisitedCapital(nationality: String) {
    when (nationality) {
        "Kenyan" -> println("Have you ever been to Nairobi?")
        "Ugandan" -> println("Have you ever been to Kampala?")
        "Tanzanian" -> println("Have you ever been to Dodoma?")
        else -> println("Have you ever been to East Africa?")
    }

}

fun passwword(passwords: String): Boolean {
    if (passwords.length >= 8 && passwords.length <= 16 && passwords != "passwords") {
        return true
    }
    return false
}

fun languages(words: Array<String>) {
    val languages = arrayListOf("Kswahili", "English", "Luganda", "Nyarandwa")
    println(languages)
}

fun boxes(nums: Int) {
    for (nums in 1..20) {
        if ((nums % 2) != 0)
            println(nums * nums)
    }
}

//fun multiply() {
//    for (nums in 1..1000)
//}

open class CurrentAccount(var accountNumber:String,var accountName:String,var balance:Int){
    fun deposit(amount:Double){
        var w=amount+balance
        println(w)
    }

   open fun withdraw(amount: Double){
        var y=balance-amount
        println(y)
    }

    fun details(){
        println("Account number $accountNumber with balance $balance is operated by $accountName")
    }
}

class SavingsAccount(accountNumber:String,accountName: String,balance: Int,var withdrawals:Int):CurrentAccount(accountNumber,accountName,balance){
    override fun withdraw(amount: Double) {
       // super.withdraw(amount)
        var b=2
        if (withdrawals<4){
            b+=withdrawals
            println(b)
        }
        else{
            println("Cannot withdraw")
        }
    }
}

fun sentence(word:String):String{
    word.forEachIndexed {index,c->
        if ((index%2) ==0){
            println(c)
        }

    }
return  word
}

fun words(word: String): String{
    var k= word.filterIndexed { index, name -> index%2==0 }
    return k
}

data class Mobile(var mobile:String,var model:String,var MRP:Int)

data class Name(var firstName:String,var lastName:String,var age:Int)



