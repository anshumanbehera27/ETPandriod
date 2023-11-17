package com.example.etpexam

// todo 1 create the Destinations
interface Destinations {

    val route:String
}
object Login:Destinations{
    override val route = "Login"
}
object Home:Destinations{
    override val route = "Home"
}