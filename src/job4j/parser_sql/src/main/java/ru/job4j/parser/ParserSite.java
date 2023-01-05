package job4j.parser_sql.src.main.java.ru.job4j.parser;

import java.util.List;

public interface ParserSite {

    List<Vacancy> parsePage(int page);

    void fillVacanciesBody(List<Vacancy> vacancies);


}
