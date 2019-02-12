package consumidor.api.v1

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus

@Controller("/hello")
class HelloController {

    @Get(produces = MediaType.TEXT_PLAIN, uri = "/world/{nome}")
    String index(String nome) {
        return "Legal XX ${nome}!!"
    }
}