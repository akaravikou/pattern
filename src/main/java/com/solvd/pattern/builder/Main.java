package com.solvd.pattern.builder;

public class Main {

    public static void main(String[] args) {
        Motorcycle motorcycle = Motorcycle.builder()
                .brand("Harley-Davidson")
                .model("Sportster")
                .engineCapacity(883)
                .releaseYear(2004)
                .condition("Good")
                .build();
    }
}

/*
 Паттерн Builder рекомендуется использовать, когда класс имеет большое количество однотипных параметров и трудно
запомнить их порядок и назначение. Благодаря паттерну Builder:
-код выглядит гораздо более читабельнее,
-при заполнении полей объекта параметры трудно перепутать,
-можно заполнять не все параметры класса.
 В данном случае мы создаем объект motorcycle и заполняем его поля, используя паттерн Builder.
 */
