package mx.edu.itson.popcornfactory

/**
 * Eduardo Talavera Ramos - 00000245244
 * 13/02/2025
 * Pelicula hereda los atributos de contenido
 */
class Pelicula
(
    titulo: String,
    image: Int,
    header: Int,
    sinopsis: String,
    var seats: ArrayList<Cliente>
) : Contenido(titulo, image, header, sinopsis)
