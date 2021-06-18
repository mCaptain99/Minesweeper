package mobilne.projekt.minesweeper.game.moves

import mobilne.projekt.minesweeper.forEachEightNeighbor
import mobilne.projekt.minesweeper.game.Board

class ChordMove(val row: Int, val column: Int) : Move {
    override fun execute(board: Board, changeSet: Board.ChangeSet) {
        if (!board.isRevealed(row, column)) return
        board.forEachEightNeighbor(row, column) { row, column ->
            if (!board.isFlagged(row, column)) changeSet.reveal(row, column)
        }
    }
}
