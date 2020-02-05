package org.vince.tictactoe

import org.vince.tictactoe.SquareType.*

class Game(var board: Array<SquareType> = Array(9) { EMPTY }) {
    constructor(board: String) : this(
            board.filter { it in arrayOf(' ', '_', 'X', 'O') }
                    .map {
                        when (it) {
                            ' ', '_' -> EMPTY
                            'X' -> CROSS
                            'O' -> NOUGHT
                            else -> throw IllegalStateException()
                        }
                    }.toTypedArray()
    )


    override fun toString(): String {
        return board.mapIndexed { index, value ->
            val str = when (value) {
                EMPTY -> " "
                CROSS -> "X"
                NOUGHT -> "O"
            }
            if (index % 3 == 2) {
                "$str\n------\n"
            } else {
                "$str|"
            }
        }.joinToString("")
    }

    operator fun get(coord: Coord): SquareType {
        val (x, y) = coord
        require(x in 0..2)
        require(y in 0..2)

        return board[x + y * 3]
    }

    internal fun checkWinner(coords: List<Coord>): Winner? {
        require(coords.size == 3)

        val uniqueValues = coords.map { this[it] }.toSet()
        return if (uniqueValues.size == 1 && uniqueValues.first() != EMPTY) {
            Winner(uniqueValues.first(), coords)
        } else {
            null
        }
    }

    val winner: Winner?
        get() {
            return (0..2).mapNotNull { x ->
                checkWinner((0..2).map { y -> x to y })
            }.firstOrNull()
                    ?: (0..2).mapNotNull { y ->
                        checkWinner((0..2).map { x -> x to y })
                    }.firstOrNull()
                    ?: checkWinner((0..2).map { i -> i to i })
                    ?: checkWinner((0..2).map { i -> i to 2 - i })
        }
}
