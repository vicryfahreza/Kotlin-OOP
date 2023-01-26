package data

open class Customer(var name: String, var type: String, var balance: Long) {
    constructor(name: String, type: String) : this(name, type, 0)
    constructor(name: String) : this(name, "Standard")
}

class PremiumCustomer : Customer{
    constructor(name: String) : super(name, "Premium")
    constructor(name: String, balance: Long) : super(name, "Premium", balance)
}

class ExecutiveCustomer(nama: String, balance: Long) : Customer(nama, "Executive", balance){
    constructor(name: String) : this(name, 0)
}
