# Spring-boot-skillbox-homework

## Описание

Реализовано консольное приложение «Учёт студентов». Интерфейс консольного приложения реализован с помощью стартера Spring Shell. 

## Цель работы

+ работа со стартерами Spring Boot;
+ настройка бинов через аннотации;
+ применение слушателей событий;
+ работа с Docker;
+ контейнеризация приложения.

## Запуск приложения в контейнере

Для запуска приложения необходимо собрать **.jar** файл с помощью **bootJar**. Далее необходимо создать докер образ с помощью команды
```
 docker build -t <имя образа> .
```

Далее необходимо запустить докер образ с флагом взаимодействия с контейнером
```
docker run --rm -it -e APP_INIT=<установка свойства> <имя образа>
```
## Свойства

Единственным свойством контейнера является разрешение начальной инициализации списка студентов APP_INIT. По умолчанию данное свойство равно true. Возможные значения: true/false

## Функционал приложения
Приложение поддерживает следующие команды:
+ Добавление студента
```
add --name <Имя> --ln <Фамилия> --age <Возраст>
```
При успешном добавлении студента выведется сообщение с его данными. Нельзя добавить двух студентов одинкавого возраста, одикового имении и фамилии.

+ Удаление студента
```
del --id <id студента>
```
При успешном удалении студента выведется сообщение с его id.

+ Вывести всех студентов на экран
```
print
```

+ Очистить список студентов
```
clearAll
```