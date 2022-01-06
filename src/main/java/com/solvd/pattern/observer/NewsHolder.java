package com.solvd.pattern.observer;

import java.util.*;

public class NewsHolder {

    private static final Map<Type, List<User>> listeners = new HashMap<>();

    public NewsHolder() {
        Arrays.stream(Type.values())
                .forEach(type -> listeners.put(type, new ArrayList<>()));
    }

    public void subscribe(Type type, User user) {
        List<User> users = listeners.get(type);
        users.add(user);
    }

    public void unsubscribe(Type type, User user) {
        List<User> users = listeners.get(type);
        users.remove(user);
    }

    public void notify(Type type, String message) {
        List<User> users = listeners.get(type);
        users.forEach(user -> user.getNews(message));
    }
}
