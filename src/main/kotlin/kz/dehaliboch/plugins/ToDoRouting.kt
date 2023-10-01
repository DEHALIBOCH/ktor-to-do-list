package kz.dehaliboch.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kz.dehaliboch.comon.ID
import kz.dehaliboch.comon.TO_DO_PATH
import kz.dehaliboch.comon.TO_DO_PATH_BY_ID

fun Application.configureToDoRouting() {
    routing {

        get(TO_DO_PATH) {

        }

        get(TO_DO_PATH_BY_ID) {
            val id = call.parameters[ID]
            call.respondText("TO-DO list details for TO-DO #$id")
        }

        post(TO_DO_PATH) {

        }

        put(TO_DO_PATH_BY_ID) {

        }

        delete(TO_DO_PATH_BY_ID) {

        }
    }
}