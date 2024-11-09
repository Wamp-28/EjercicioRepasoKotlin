class EstudianteLogica {

    var cedula: String = ""

    var nombre: String = ""

    var direccion: String = ""

    var edad:Int = 0

    constructor()
    constructor(cedula: String, nombre: String, direccion: String, edad: Int) {
        this.cedula = cedula
        this.nombre = nombre
        this.direccion = direccion
        this.edad = edad
    }

    override fun toString(): String {
        return "EstudianteLogica(cedula='$cedula', nombre='$nombre', direccion='$direccion', edad=$edad)"
    }

    fun mayorEdad(edad:Int): Boolean{
        return edad>=18
    }



}