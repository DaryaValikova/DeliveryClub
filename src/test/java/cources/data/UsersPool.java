package cources.data;

import java.util.ArrayList;
import java.util.List;

public class UsersPool {
    private static final String USER_1 = "dashikej@yandex.ru";
    private static final String USER_2 = "valikov.jr@yandex.ru";

    private List<String> users = new ArrayList<>();

    private UsersPool() {
        users.add(USER_1);
        users.add(USER_2);
    }

    public String poolUsers() {
        if (users.size() == 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return poolUsers();
        }
        String pollUsers = users.get(users.size() - 1);
        users.remove(pollUsers);
        return pollUsers;
    }

    public void releaseUsers(String user){
        users.add(user);
    }

    public static final UsersPool instance = new UsersPool();


}
