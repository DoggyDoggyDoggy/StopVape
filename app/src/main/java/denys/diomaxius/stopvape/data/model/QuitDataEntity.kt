package denys.diomaxius.stopvape.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate

@Entity(tableName = "quitdata")
data class QuitDataEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val date: LocalDate
)
