package learning_java.book.chapter3.ChangeRegister.src.com.gmail.vitaliy184;

/**
 * Файл класса ChangeRegister.
 *
 * Описание задания:
 * Код ASCII символов нижнего регистра отличается от кода
 * соответствующих символов верхнего регистра на величину 32.
 * Следовательно, для преобразования строчной буквы в прописную
 * нужно уменьшить ее код на 32. Используйте это обстоятельство
 * для написания программы, осуществляющей ввод символов с клавиатуры.
 * При выводе результатов данная программа должна преобразовывать
 * строчные буквы в прописные, а прописные — в строчные.
 * Остальные символы не должны изменяться. Работа программы должна завершаться
 * после того, как пользователь введет с клавиатуры точку И наконец, сделайте так,
 * чтобы программа отображала число символов, для которых был изменен регистр.
 *
 * @author Виталий Магнум
 */
public class ChangeRegister {
    public static void main(String[] args) throws java.io.IOException {
        char letter;
        int count = 0;

        System.out.print("Введите символ (для выхода введите точку): ");

        do {
            letter = (char) System.in.read();

            if (letter >= 'a' & letter <= 'z') {
                letter -=32;
                count++;
                System.out.println(letter);
            }
            else if (letter >= 'A' & letter <= 'Z') {
                letter +=32;
                count++;
                System.out.println(letter);
            }
        } while (letter != '.');

        System.out.println("Всего призведено изменений регистра: " + count);
    }
}
