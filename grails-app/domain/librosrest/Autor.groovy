package librosrest
import grails.rest.Resource

@Resource(uri='/autores') 
class Autor {

  String apellidoNombre

  String toString(){
    return this.apellidoNombre
  }
  static constraints = {
  }
}
