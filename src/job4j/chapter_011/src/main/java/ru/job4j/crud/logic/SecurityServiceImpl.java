package job4j.chapter_011.src.main.java.ru.job4j.crud.logic;

import ru.job4j.crud.model.Role;
import ru.job4j.crud.model.User;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Alexander Abramov (alllexe@mail.ru)
 * @version 1
 * @since 14.10.2019
 */
public class SecurityServiceImpl implements SecurityService {

    private final static SecurityServiceImpl INSTANCE = new SecurityServiceImpl();

    private SecurityServiceImpl() {
    }

    public static SecurityService getInstance() {
        return INSTANCE;
    }

    @Override
    public User getLoggedUser(HttpSession session) {
        return (User) session.getAttribute("loggedUser");
    }

    @Override
    public boolean hasEditRight(HttpSession session, User user) {
        User loggedUser = getLoggedUser(session);
        return loggedUser.isAdmin() || loggedUser.equals(user);
    }

    @Override
    public List<Role> getLoggedUserAvailableRoles(HttpSession session) {
        User loggedUser = getLoggedUser(session);
        List<Role> loggedUserAvailableRoles = new ArrayList<>();
        loggedUserAvailableRoles.add(loggedUser.getRole());
        return loggedUserAvailableRoles;
    }
}
