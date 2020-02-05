package org.vince.tictactoe

import org.vince.tictactoe.SquareType.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull
import kotlin.test.assertTrue

class TestGame {
    private val testBoard = """
            |_XO
            |XOO
            |OX_""".trimMargin()

    private val winner = Winner(NOUGHT, listOf(
            0 to 2,
            1 to 1,
            2 to 0
    ))

    @Test
    fun `should load a game board`() {
        val game = Game(testBoard)

        assertTrue {
            arrayOf(
                    EMPTY, CROSS, NOUGHT,
                    CROSS, NOUGHT, NOUGHT,
                    NOUGHT, CROSS, EMPTY
            ) contentEquals game.board
        }
    }

    @Test
    fun `should get an item from board`() {
        val game = Game(testBoard)

        listOf(
                EMPTY to game[0 to 0],
                CROSS to game[1 to 0],
                NOUGHT to game[2 to 0],
                CROSS to game[0 to 1],
                NOUGHT to game[1 to 1],
                NOUGHT to game[2 to 1],
                NOUGHT to game[0 to 2],
                CROSS to game[1 to 2],
                EMPTY to game[2 to 2]
        ).forEach {
            val (expected, value) = it
            assertEquals(expected, value)
        }
    }

    @Test
    fun `should check winner in rows columns`() {
        val game = Game(testBoard)
        assertNull(game.checkWinner(listOf(
                0 to 0,
                1 to 0,
                2 to 0
        )))
        assertNull(game.checkWinner(listOf(
                0 to 0,
                0 to 1,
                0 to 2
        )))
        assertEquals(winner, game.checkWinner(listOf(
                0 to 2,
                1 to 1,
                2 to 0
        )))
    }

    @Test
    fun `should find the winner`(){
        var game = Game(testBoard)
        assertEquals(winner, game.winner)
    }

    @Test
    fun `should find no winner on empty game`(){
        val game = Game("""
            |___
            |___
            |___""".trimMargin())
        assertNull(game.winner)
    }
}
