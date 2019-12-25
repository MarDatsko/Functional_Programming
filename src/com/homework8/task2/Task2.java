package com.homework8.task2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task2 {
    public final static LocalDate NOW_DATE = LocalDate.of(2019, 12, 10);
    List<User> userList = new ArrayList<>();

    public Task2() {
        fillUsersList();
    }

    private void fillUsersList() {
        User max = new User("max@gmail.com", LocalDate.of(2019, 12, 3), "GlobalLogic");
        User petro = new User("petro@gmail.com", LocalDate.of(2019, 11, 15), "SoftServe");
        User ivan = new User("ivan@gmail.com", LocalDate.of(2019, 11, 20), "SoftServe");
        User bogdan = new User("bogdan@gmail.com", LocalDate.of(2019, 11, 25), "SoftServe");
        User yura = new User("yura@gmail.com", LocalDate.of(2019, 12, 3), "Perfectial");
        User marik = new User("marik@gmail.com", LocalDate.of(2019, 12, 3), "GlobalLogic");
        userList.add(max);
        userList.add(petro);
        userList.add(ivan);
        userList.add(bogdan);
        userList.add(yura);
        userList.add(marik);
    }

    public void filterUsers() {
        Map<String, List<String>> arr = userList.stream()
                .filter(user -> user.getLoginDate().equals(NOW_DATE.minusDays(7)))
                .collect(Collectors.groupingBy(User::getTeam, Collectors.mapping(User::getEmail, Collectors.toList())));
        System.out.println("\n" + arr);
    }
}
