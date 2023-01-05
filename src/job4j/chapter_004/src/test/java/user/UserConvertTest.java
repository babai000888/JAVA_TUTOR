package job4j.chapter_004.src.test.java.user;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class UserConvertTest {

    @Test
    public void process() {
        User user1 = new User(1, "Ivan", "Moscow");
        User user2 = new User(2, "Vovan", "Moscow");
        User user3 = new User(3, "Tolyan", "Moscow");
        List<User> users = List.of(user1, user2, user3);
        Map<Integer, User> actual = new UserConvert().process(users);
        Map<Integer, User> expetced = Map.of(
        1, user1,
        2, user2,
        3, user3);
        assertThat(actual, is(expetced));
    }
}
