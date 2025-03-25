package denys.diomaxius.stopvape.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import denys.diomaxius.stopvape.data.model.QuitDataEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface QuitDataDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertQuitData(quitData: QuitDataEntity)

    @Query("SELECT * FROM quitdata")
    fun getAllQuitData() : Flow<List<QuitDataEntity>>
}