package kz.dehaliboch.repository

import kz.dehaliboch.comon.toToDo
import kz.dehaliboch.database.DatabaseManager
import kz.dehaliboch.entities.ToDo
import kz.dehaliboch.entities.ToDoDraft

class MySQLToDoRepository(private val databaseManager: DatabaseManager) : ToDoRepository {

    override fun getAllToDo(): List<ToDo> = databaseManager.getAllToDo().map { it.toToDo() }

    override fun getToDoById(id: Int): ToDo? {
        TODO("Not yet implemented")
    }

    override fun addToDo(toDoDraft: ToDoDraft): ToDo {
        TODO("Not yet implemented")
    }

    override fun removeToDo(id: Int): Boolean {
        TODO("Not yet implemented")
    }

    override fun update(id: Int, toDoDraft: ToDoDraft): Boolean {
        TODO("Not yet implemented")
    }
}