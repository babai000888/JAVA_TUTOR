package job4j.chapter_008.src.main.java.ru.job4j.tictactoe.logic;

public interface TicTacToe {

    void makeMove(Point point, Mark mark);

    Mark getMark(Point point);

    boolean isMovePossible();

    Mark checkWinner();

    int getTableSize();

    void newGame();
}
