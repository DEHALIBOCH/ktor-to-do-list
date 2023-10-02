package kz.dehaliboch.database

import kz.dehaliboch.comon.DatabaseConstants
import org.ktorm.database.Database
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

}