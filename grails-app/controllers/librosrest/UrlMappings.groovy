package librosrest

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')

        "/libros"(resources: "libro") {
	         collection {
              "/listLibrosPorPublic"(controller: "libro", action: "listLibrosPorPublic")
	         }
         }

    }
}
