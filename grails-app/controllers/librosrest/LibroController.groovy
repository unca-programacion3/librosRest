package librosrest
import grails.rest.RestfulController

class LibroController extends RestfulController<Libro> {
  static responseFormats = ['json', 'xml']
     LibroController() {
           super(Libro)
     }

     def listLibrosPorPublic () {

       if (params.p) {
  	       respond Libro.findAllByPublicacionGreaterThanEquals(params.p)
       } else {
         respond([])
       }
     }

}
