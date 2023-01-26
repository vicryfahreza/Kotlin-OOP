package app


fun validateRequest(request: Any){
    val clazz = request::class
    val properties = clazz.members

    // Kesalahan Teknis membersProperties tidak mau load

    // iterate satu satu, lalu cek annotation @NotBlank

}