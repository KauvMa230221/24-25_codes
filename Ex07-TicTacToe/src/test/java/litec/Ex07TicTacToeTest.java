package litec;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

/**
 * jUnit4 demo test
 */
public class Ex07TicTacToeTest {


    public String gameBoardToString(char [][] board)
    {
        String builder = board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "\n" +
                "-+-+-\n" +
                board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "\n" +
                "-+-+-\n" +
                board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "\n";

        return builder;
    }

    public char[][] emptyGameBoard()
    {
        char[][] gameBoard = new char[3][3];
        for(int r = 0; r<3; r++)
        {
            for(int c = 0; c<3; c++)
            {
                gameBoard[r][c] = ' ';
            }
        }
        return gameBoard;
    }


    @Rule
    public Timeout globalTimeout = new Timeout(1000, TimeUnit.MILLISECONDS);    

    @Test
    public void tvTicTacToe_test_emtpyGameBoard()
    {
        TicTacToe game = new TicTacToe();
        assertEquals(gameBoardToString(emptyGameBoard()), game.toString());
    }

    @Test
    public void tvTicTacToe_test_printGameBoard1()
    {
        TicTacToe game = new TicTacToe();
        game.setMark(0,0,'x');
        char[][] gameBoard = emptyGameBoard();
        gameBoard[0][0] = 'x';
        assertEquals(gameBoardToString(gameBoard), game.toString());
    }

    @Test
    public void tvTicTacToe_test_printGameBoard2()
    {
        TicTacToe game = new TicTacToe();
        game.setMark(0,2,'x');
        char[][] gameBoard = emptyGameBoard();
        gameBoard[0][2] = 'x';
        assertEquals(gameBoardToString(gameBoard), game.toString());
    }

    @Test
    public void tvTicTacToe_test_printGameBoard3()
    {
        TicTacToe game = new TicTacToe();
        game.setMark(1,0,'x');
        char[][] gameBoard = emptyGameBoard();
        gameBoard[1][0] = 'x';
        assertEquals(gameBoardToString(gameBoard), game.toString());
    }

    @Test
    public void tvTicTacToe_test_printGameBoard4()
    {
        TicTacToe game = new TicTacToe();
        game.setMark(1,1,'x');
        char[][] gameBoard = emptyGameBoard();
        gameBoard[1][1] = 'x';
        assertEquals(gameBoardToString(gameBoard), game.toString());
    }

    @Test
    public void tvTicTacToe_test_gameBoardOutOfBounds()
    {
        TicTacToe game = new TicTacToe();
        assertTrue(game.setMark(0, 0, 'x'));
        assertTrue(game.setMark(2, 2, 'x'));
        assertFalse(game.setMark(-1, 1, 'x'));
        assertFalse(game.setMark(1, -1, 'x'));
        assertFalse(game.setMark(1, 3, 'x'));
        assertFalse(game.setMark(3, 1, 'x'));
    }

    @Test
    public void tvTicTacToe_test_gameBoardFieldFree()
    {
        TicTacToe game = new TicTacToe();
        game.setMark(0,0,'x');
        assertFalse(game.setMark(0,0,'o'));
        assertTrue(game.setMark(1,0,'o'));
        assertTrue(game.setMark(1,1,'x'));
        assertTrue(game.setMark(2,1,'o'));
        assertFalse(game.setMark(1,1,'x'));
    }

    @Test
    public void tvTicTacToe_test_gameBoardFieldWrongSign()
    {
        TicTacToe game = new TicTacToe();
        game.setMark(0,0,'x');
        assertFalse(game.setMark(0,0,'O'));
        assertFalse(game.setMark(1,1,'t'));
        assertFalse(game.setMark(1,1,' '));

    }

    @Test
    public void tvTicTacToe_test_winner1()
    {
        for(int i = 0; i<3; i++) {
            TicTacToe game = new TicTacToe();
            game.setMark(0, i, 'x');
            assertEquals(' ', game.winner());
            game.setMark(1, i, 'x');
            assertEquals(' ', game.winner());
            game.setMark(2, i, 'x');
            assertEquals('x', game.winner());
        }
    }

    @Test
    public void tvTicTacToe_test_winner2()
    {
        for(int i = 0; i<3; i++) {
            TicTacToe game = new TicTacToe();
            game.setMark(i, 0, 'o');
            assertEquals(' ', game.winner());
            game.setMark(i, 1, 'o');
            assertEquals(' ', game.winner());
            game.setMark(i, 2, 'o');
            assertEquals('o', game.winner());
        }
    }

    @Test
    public void tvTicTacToe_test_winner3()
    {
        TicTacToe game = new TicTacToe();
        game.setMark(0, 0, 'o');
        assertEquals(' ', game.winner());
        game.setMark(1, 1, 'o');
        assertEquals(' ', game.winner());
        game.setMark(2, 2, 'o');
        assertEquals('o', game.winner());
    }

    @Test
    public void tvTicTacToe_test_winner4()
    {
        TicTacToe game = new TicTacToe();
        game.setMark(0, 2, 'x');
        assertEquals(' ', game.winner());
        game.setMark(1, 1, 'x');
        assertEquals(' ', game.winner());
        game.setMark(2, 0, 'x');
        assertEquals('x', game.winner());
    }

    @Test
    public void tvTicTacToe_test_winner5()
    {
        TicTacToe game = new TicTacToe();
        game.setMark(0, 0, 'x');
        assertEquals(' ', game.winner());
        game.setMark(1, 1, 'o');
        assertEquals(' ', game.winner());
        game.setMark(0, 2, 'x');
        assertEquals(' ', game.winner());
        game.setMark(2, 2, 'o');
        assertEquals(' ', game.winner());
        game.setMark(0, 1, 'x');
        assertEquals('x', game.winner());
    }

    @Test
    public void tvTicTacToe_test_winner6()
    {
        TicTacToe game = new TicTacToe();
        game.setMark(0, 0, 'x');
        assertEquals(' ', game.winner());
        game.setMark(1, 1, 'o');
        assertEquals(' ', game.winner());
        game.setMark(0, 2, 'x');
        assertEquals(' ', game.winner());
        game.setMark(2, 1, 'o');
        assertEquals(' ', game.winner());
        game.setMark(2, 2, 'x');
        assertEquals(' ', game.winner());
        game.setMark(0, 1, 'o');
        assertEquals('o', game.winner());
    }

    @Test
    public void tvTicTacToe_test_boardFull()
    {
        TicTacToe game = new TicTacToe();
        game.setMark(0, 0, 'x');
        assertFalse(game.boardFull());
        game.setMark(0, 1, 'o');
        assertFalse(game.boardFull());
        game.setMark(0, 2, 'x');
        assertFalse(game.boardFull());
        game.setMark(1, 0, 'o');
        assertFalse(game.boardFull());
        game.setMark(1, 1, 'x');
        assertFalse(game.boardFull());
        game.setMark(1, 2, 'o');
        assertFalse(game.boardFull());
        game.setMark(2, 0, 'x');
        assertFalse(game.boardFull());
        game.setMark(2, 1, 'o');
        assertFalse(game.boardFull());
        game.setMark(2, 2, 'x');
        assertTrue(game.boardFull());
    }
}