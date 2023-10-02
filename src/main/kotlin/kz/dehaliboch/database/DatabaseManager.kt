package kz.dehaliboch.database

import kz.dehaliboch.comon.DatabaseConstants
import kz.dehaliboch.comon.toToDo
import kz.dehaliboch.entities.ToDoDraft
import org.ktorm.database.Database
import org.ktorm.dsl.delete
import org.ktorm.dsl.eq
import org.ktorm.dsl.insertAndGenerateKey
import org.ktorm.dsl.update
import org.ktorm.entity.firstOrNull
import org.ktorm.entity.sequenceOf
import org.ktorm.entity.toList

class DatabaseManager {

    // config
    private val hostname = "localhost"
    private val databaseName = "ktor_to_do"
    private val username = DatabaseConstants.USER_NAME
    private val password = DatabaseConstants.PASSWORD

    private val database: Database

    init {
        val jdbcUrl = "jdbc:mysql://$hostname:3306/$databaseName?user=$username&password=$password&useSSL=false"
        database = Database.connect(jdbcUrl)
    }

    fun getAllToDo() = database.sequenceOf(DBToDoTable).toList()

    fun getToDoById(id: Int) = database.sequenceOf(DBToDoTable).firstOrNull { it.id eq id }

    fun addToDo(toDoDraft: ToDoDraft) = (database.insertAndGenerateKey(DBToDoTable) {
        set(DBToDoTable.title, toDoDraft.title)
        set(DBToDoTable.done, toDoDraft.isDone)
    } as Int).let { insertedId -> toDoDraft.toToDo(insertedId) }

    fun updateToDo(id: Int, toDoDraft: ToDoDraft) = database.update(DBToDoTable) {
        set(DBToDoTable.title, toDoDraft.title)
        set(DBToDoTable.done, toDoDraft.isDone)
        where { it.id eq id }
    }.let { updatedRows -> updatedRows > 0 }

    fun removeToDo(id: Int) = database.delete(DBToDoTable) {
        it.id eq id
    }.let { deletedRows -> deletedRows > 0 }
}