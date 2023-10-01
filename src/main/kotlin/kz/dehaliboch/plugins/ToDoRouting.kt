package kz.dehaliboch.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kz.dehaliboch.comon.ID
import kz.dehaliboch.comon.TO_DO_PATH
import kz.dehaliboch.comon.TO_DO_PATH_BY_ID
import kz.dehaliboch.repository.InMemoryToDoRepository
import kz.dehaliboch.repository.ToDoRepository

fun Application.configureToDoRouting() {
    routing {

        val toDoRepository: ToDoRepository = InMemoryToDoRepository()

        get(TO_DO_PATH) {
            call.respond(toDoRepository.getAllToDo())
        }

        get(TO_DO_PATH_BY_ID) {
            val id = call.parameters[ID]?.toIntOrNull()

            if (id == null) {
                call.respond(
                    HttpStatusCode.BadRequest,
                    "id need to be a number"
                )
                return@get
            }

            val toDo = toDoRepository.getToDoById(id)

            if (toDo == null) {
                call.respond(
                    HttpStatusCode.NotFound,
                    "Found no To-Do for provided id #$id"
                )
                return@get
            }

            call.respond(toDo)
        }

        post(TO_DO_PATH) {

        }

        put(TO_DO_PATH_BY_ID) {

        }

        delete(TO_DO_PATH_BY_ID) {

        }
    }
}
