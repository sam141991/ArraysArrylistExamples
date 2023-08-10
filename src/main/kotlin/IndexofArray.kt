fun main(){
    val classStudentNames= arrayOf<String>("kavya","Lacky","kirthi","Vani")

     for (name in classStudentNames){
         print(classStudentNames.indexOf(name)+1)
         println("."+name)
     }
    // we cont add extra member in array
    // classStudentNames[4]="vaishu"
    // Error it will get
    //overcome size of array size to use Arraylist
}