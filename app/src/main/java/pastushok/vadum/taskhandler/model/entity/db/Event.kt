package pastushok.vadum.taskhandler.model.entity.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import pastushok.vadum.taskhandler.model.db.DBConfig

@Entity(tableName = DBConfig.Event.TABLE_NAME)
data class Event(
    @ColumnInfo(name = DBConfig.Event.Columns.NAME) val name: String,
    @ColumnInfo(name = DBConfig.Event.Columns.DATE) val date: Long,
    @ColumnInfo(name = DBConfig.Event.Columns.REPEAT) val repeat: Long,
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = DBConfig.Event.Columns.ID) val id: Long = 0
)