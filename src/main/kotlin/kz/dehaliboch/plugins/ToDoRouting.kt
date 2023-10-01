package kz.dehaliboch.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kz.dehaliboch.comon.ID
import kz.dehaliboch.comon.TO_DO_PATH
import kz.dehaliboch.comon.TO_DO_PATH_BY_ID
import kz.dehaliboch.entities.ToDo

fun Application.configureToDoRouting() {
    routing {

        get(TO_DO_PATH) {
            call.respond(todoList)
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

val todoList = listOf(
    ToDo(1, "Сходить в магазин", false),
    ToDo(2, "Подготовить обед", false),
    ToDo(3, "Почистить дом", false),
    ToDo(4, "Прочитать книгу", false),
    ToDo(5, "Сделать уроки", false),
    ToDo(6, "Посмотреть фильм", false),
    ToDo(7, "Сходить в спортзал", false),
    ToDo(8, "Созвониться с другом", false),
    ToDo(9, "Подготовить презентацию", false),
    ToDo(10, "Посадить цветы", false)
)