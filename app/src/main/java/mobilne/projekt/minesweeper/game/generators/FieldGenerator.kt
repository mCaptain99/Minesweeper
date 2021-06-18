package mobilne.projekt.minesweeper.game.generators

import mobilne.projekt.minesweeper.game.Field

interface FieldGenerator {
    fun generate(rows: Int, columns: Int, args: FieldGenerationArguments): Field
}

data class FieldGenerationArguments(
    val mines: Int
)
