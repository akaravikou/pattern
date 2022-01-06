package com.solvd.pattern.observer;

public class Main {

    public static void main(String[] args) {
        NewsHolder newsHolder = new NewsHolder();

        newsHolder.subscribe(Type.NEWS_FEED, new User("Anton", "Karavikou"));

        newsHolder.subscribe(Type.PRIVATE_MESSAGE, new User("Alexander", "Alexandro"));

        newsHolder.notify(Type.NEWS_FEED, "We have good news...");
        newsHolder.notify(Type.PRIVATE_MESSAGE, "We have wonderful news!!!");
    }
}

/*
 Паттерн Observer определяет зависимость типа «один ко многим» между объектами таким образом, что при изменении
состояния одного объекта все зависящие от него оповещаются об этом и автоматически обновляются.
 В данном примере мы подписываем двух пользователей, которые буду получать новости различными способами о изменении
состояния объекта.
*/
