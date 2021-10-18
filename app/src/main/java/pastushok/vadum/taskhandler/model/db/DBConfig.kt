package pastushok.vadum.taskhandler.model.db

object DBConfig {

    const val DB_VERSION = 1
    const val DB_NAME = "task_handler_db"

    object Event {
        const val TABLE_NAME = "events"

        object Columns{
            const val NAME = "name"
            const val DATE = "date"
            const val TIME_START = "time_start"
            const val TIME_END = "time_end"
            const val REPEAT = "repeat"
            const val ID = "id"
        }

    }

}