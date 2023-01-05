package job4j.chapter_008.src.main.java.ru.job4j.calculator;

public interface ArithmeticOperation {

    Double execute(Double hold, Double input);

    CalculatorInputType nextInputType();
}
