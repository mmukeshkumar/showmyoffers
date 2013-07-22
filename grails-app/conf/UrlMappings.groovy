class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		//"/"(view:"/index")
		
		"/"(controller: "offerSlurper/", action: "list")
		
		"500"(view:'/error')
	}
}