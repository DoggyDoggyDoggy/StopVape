package denys.diomaxius.stopvape.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import denys.diomaxius.stopvape.data.dao.QuitDataDao
import denys.diomaxius.stopvape.data.model.QuitDataEntity

@Database(
    entities = [QuitDataEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class VapeDatabase : RoomDatabase(){
    companion object {
        const val NAME = "VAPE_DB"
    }

    abstract fun quitDataDao(): QuitDataDao
}