package mobilne.projekt.minesweeper.game.moves

import mobilne.projekt.minesweeper.game.Board

interface Move {
    enum class Type {
        Reveal,
        Flag,
        RemoveFlag
    }

    fun execute(board: Board, changeSet: Board.ChangeSet)
}
