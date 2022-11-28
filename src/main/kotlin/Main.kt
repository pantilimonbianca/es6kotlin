sealed class User(val id: String)


    data class Email( val idMail: String, val password: String) : User(idMail)
    data class Facebook( val idFacebook: String,  val password: String) : User(idFacebook )

    data class Google( val idGoogle: String,  val password: String) : User(idGoogle)

 fun log(user: User) {
     when (user) {
         is Email -> println("User: ${user.id}, password: ${user.password} ")
         is Facebook -> println("User: ${user.id}, password: ${user.password}")
         is Google -> println("User: ${user.id}, password: ${user.password}")
     }
 }

    fun main(){
       // val email= Email("pantilimonbianceie@gmail.com", "bvjfj")
        log(Email("pantilimonbianca00@gmail.com","casa"))
        log(Google("gina44", "montagna"))
        log(Facebook("gue4", "mamma"))
     //   val google = Google("gina44","irfj")
      //  val facebook = Facebook("gue4", "irfnrei")
     //   log(email)
     //   log(facebook)
     //   log(google)
    }

