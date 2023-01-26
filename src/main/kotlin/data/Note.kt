package data

class Note(title: String){
    var title: String = title
        get() {
            println("Getter Declaration")
            return field
        }
        set(value) {
            println("Setter Declaration")
            if(value.isNotBlank()){
                field = value
            }else{
                println("Invalid Value!!")
            }
        }
}

class BigNote(val title: String){
    val bigTitle: String
        get() = title.toUpperCase()
}
