package com.homework8.task2;

import com.homework8.Main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task2 {
    public final static LocalDate NOW_DATE = LocalDate.of(2019, 12, 10);

    public static void filterUsers() {
        User max = new User("max@gmail.com", LocalDate.of(2019, 12, 3), "GlobalLogic");
        User petro = new User("petro@gmail.com", LocalDate.of(2019, 11, 15), "SoftServe");
        User ivan = new User("ivan@gmail.com", LocalDate.of(2019, 11, 20), "SoftServe");
        User bogdan = new User("bogdan@gmail.com", LocalDate.of(2019, 11, 25), "SoftServe");
        User yura = new User("yura@gmail.com", LocalDate.of(2019, 12, 3), "Perfectial");
        User marik = new User("marik@gmail.com", LocalDate.of(2019, 12, 3), "GlobalLogic");

        List<User> userList = new ArrayList<>();
        userList.add(max);
        userList.add(petro);
        userList.add(ivan);
        userList.add(bogdan);
        userList.add(yura);
        userList.add(marik);

        Map<String, String> arr = userList.stream()
                .filter(user -> user.getLoginDate().equals(NOW_DATE.minusDays(7)))
                .collect(Collectors.toMap(User::getTeam,));
        System.out.println(arr);
    }
}
