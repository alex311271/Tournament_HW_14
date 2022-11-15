# Турнир

## Задача
Разработать класс, управляющий турниром игроков

Каждый игрок описывается дата-классом *Player* c полями *id*, *name*, *strength* (сила).

Турнир описывается классом *Game* с методами:

- *register (Player player)* - метод регистрации игрока, если игрок не зарегистрирован, то он не сможет играть в турнире.
Зарегистрированные игроки сохраняются в поле класса *Game* в виде списка

- *round (String playerName1, String playerName2)* - метод соревнования между двуия игроками.
Если хотя бы один из игроков не зарегистрирован, должно выкинутся исключение *NotRegisteredException* - необходимо создать для него класс.
Игроки передаются методу через имя - полную информацию об игроке нужно найти в коллекции зарегестрированных игроков.
Выиграет тот игрок, у которого больше *strength* (сила), если сила щдинакова, то будет ничья.
Метод должен возвращать одно число - 0 в случае ничьи, 
1 в случае победы первого игрока и 2 в случае победы второго игрока.

Написать на класс *Game* тесты, покрыв 100% по branch.


# Турнир: ускорение

## Задача
Создать ветку *fast*. В этой ветке доработать прошлую задачу, 
заменив коллекцию списка игроков на *HashMap* для быстрого поиска
информации об игроке по его имени.

