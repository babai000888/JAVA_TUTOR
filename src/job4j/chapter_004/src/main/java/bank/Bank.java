package job4j.chapter_004.src.main.java.bank;

import java.util.*;

/**
 * Банк.
 * @author Alexander Abramov (alllexe@mail.ru)
 * @version 1
 * @since 27.02.2019
 */
public class Bank {

    private final Map<User, List<Account>> userAccounts = new HashMap<>();

    /**
     * Добавляет нового пользователя в коллекцию пользователей и счетов.
     * @param user добавляемый пользователь.
     */
    public void addUser(User user) {
        userAccounts.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Удаляет пользователя из коллекции пользователей и счетов
     * @param user пользователь для удаления
     */
    public void deleteUser(User user) {
        userAccounts.remove(user);
    }

    /**
     * Добавляет новый счет пользователю
     * @param passport пароль пользователя
     * @param account счет для добавления
     */
    public void addAccountToUser(String passport, Account account) {
        List<Account> accounts = getUserAccounts(passport);
        if (accounts != null) {
            accounts.add(account);
            this.userAccounts.put(new User(passport), accounts);
        }
    }

    /**
     * Удалить счет у пользователя
     * @param passport пароль пользователя
     * @param account счет для удаления
     */
    public void deleteAccountFromUser(String passport, Account account) {
        List<Account> accounts = getUserAccounts(passport);
        if (accounts != null) {
            accounts.remove(account);
            this.userAccounts.put(new User(passport), accounts);
        }
    }

    /**
     * Получить список счетов пользователя
     * @param passport пароль пользователя
     * @return список счетов пользователя
     */
    public List<Account> getUserAccounts(String passport) {
        return this.userAccounts.entrySet().stream()
                .filter(u->u.getKey().equals(new User(passport)))
                .findFirst()
                .map(Map.Entry::getValue)
                .orElse(null);
        // return this.userAccounts.get(new User(passport));
    }

    /**
     * метод для перечисления денег с одного счета, на другой
     * @param srcPassport пароль пользователя отправителя
     * @param srcRequisite реквизиты отправителя
     * @param destPassport пароль пользователя получателя
     * @param dstRequisite реквизиты получателя
     * @param amount сумма перевода
     * @return перевод прошел успешно
     */
    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String dstRequisite, double amount) {
        boolean transferSuccess = false;
        List<Account> srcAccounts = getUserAccounts(srcPassport);
        List<Account> destAccounts = getUserAccounts(destPassport);
        if ((srcAccounts != null) && (destAccounts != null)) {
            Account srcAccount = getAccountByRequisites(srcAccounts, srcRequisite);
            Account destAccount = getAccountByRequisites(destAccounts, dstRequisite);
            if (srcAccount != null && destAccount != null && srcAccount.getValue() >= amount) {
                srcAccount.setValue(srcAccount.getValue() - amount);
                destAccount.setValue(destAccount.getValue() + amount);
                transferSuccess = true;
            }
        }
        return transferSuccess;
    }

    private Account getAccountByRequisites(List<Account> accounts, String requisite) {
        return accounts.stream().filter(s->s.getRequisites().equals(requisite)).findFirst().orElse(null);
    }


}
