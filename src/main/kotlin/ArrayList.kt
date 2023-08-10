fun main(){

    val studentClass= arrayListOf<String>("A","B","C","D")

    //println(studentClass.get(2))
    studentClass.add("T")
    for (name in studentClass){
         println(name+"")
    }
    println()
    studentClass.remove("B")
    for (name in studentClass){

        println(name+"")
    }
    println()
    //delete index wise data
studentClass.removeAt(0)
    for (name in studentClass){
        println(name+"")
    }
    println()
    //delete all arrayListItems
    studentClass.removeAll(studentClass)
      for (name in studentClass){
          println(name+"")
    }
}