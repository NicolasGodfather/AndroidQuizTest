package com.nico.quiz;

/**
 * Created by Nicolas on 27.02.2017.
 */

public class Data
{
    /*
Формат зранимых данных=
	1. img1= 	Картинка 1
	2. img2= 	Картинка 2
	3. img3= 	Картинка 3
	4. img4= 	Картинка 4
	5. answer= 	"П"равильный ответ
*/
    public static String img1;
    public static String img2;
    public static String img3;
    public static String img4;
    public static String desc_win; // разгадка
    public static String answer; // число ответа

    public final String[] rightAnswers = new String[]{
            "Правильно!",
            "Абсолютно верно!",
            "Восхитительно!",
            "У Вас опять получилось!",
            "Вы молодец, правильно!",
            "Уровень пройден!",
            "Поздравляем!",
            "Победа!",
            "Вы быстро справились с этим уровнем",
            "Правильно, Вам кто-то подсказывал?",
            "Невероятно, Вы прошли!",
            "Вперед! У Вас хорошо получается!",
            "Отлично.",
            "Все верно",
            "Очень хорошо",
            "Хороший темп"
    };

    public final static String[][] gameData = {
            {
                    img1 = "img/game/1.1.jpg",
                    img2 = "img/game/1.2.jpg",
                    img3 = "img/game/1.3.jpg",
                    img4 = "img/game/1.4.jpg",
                    desc_win = " Тигр не домашнее животное.",
                    answer = "4"
            },
            {
                    img1 = "img/game/2.1.jpg",
                    img2 = "img/game/2.2.jpg",
                    img3 = "img/game/2.3.jpg",
                    img4 = "img/game/2.4.jpg",
                    desc_win = " У мотоцикла 2 колеса.",
                    answer = "2"
            },
            {
                    img1 = "img/game/3.1.jpg",
                    img2 = "img/game/3.2.jpg",
                    img3 = "img/game/3.3.jpg",
                    img4 = "img/game/3.4.jpg",
                    desc_win = " Диван мягкий.",
                    answer = "1"
            },
            {
                    img1 = "img/game/4.1.jpg",
                    img2 = "img/game/4.2.jpg",
                    img3 = "img/game/4.3.jpg",
                    img4 = "img/game/4.4.jpg",
                    desc_win = " Дельфин - млекопитающие.",
                    answer = "3"
            },
            {
                    img1 = "img/game/5.1.jpg",
                    img2 = "img/game/5.2.jpg",
                    img3 = "img/game/5.3.jpg",
                    img4 = "img/game/5.4.jpg",
                    desc_win = " Лимон кислый.",
                    answer = "3"
            },
            {
                    img1 = "img/game/6.1.jpg",
                    img2 = "img/game/6.2.jpg",
                    img3 = "img/game/6.3.jpg",
                    img4 = "img/game/6.4.jpg",
                    desc_win = " Паровоз ездит не на бензине.",
                    answer = "1"
            },
            {
                    img1 = "img/game/7.1.jpg",
                    img2 = "img/game/7.2.jpg",
                    img3 = "img/game/7.3.jpg",
                    img4 = "img/game/7.4.jpg",
                    desc_win = " Собака не из кошачих.",
                    answer = "4"
            },
            {
                    img1 = "img/game/8.1.jpg",
                    img2 = "img/game/8.2.jpg",
                    img3 = "img/game/8.3.jpg",
                    img4 = "img/game/8.4.jpg",
                    desc_win = " Курица птица и ее молоко не пьют.",
                    answer = "2"
            },
            {
                    img1 = "img/game/9.1.jpg",
                    img2 = "img/game/9.2.jpg",
                    img3 = "img/game/9.3.jpg",
                    img4 = "img/game/9.4.jpg",
                    desc_win = " Верблюд не живет в холоде.",
                    answer = "4"
            },
            {
                    img1 = "img/game/10.1.jpg",
                    img2 = "img/game/10.2.jpg",
                    img3 = "img/game/10.3.jpg",
                    img4 = "img/game/10.4.jpg",
                    desc_win = " Газель не плотоядная.",
                    answer = "4"
            },
            {
                    img1 = "img/game/11.1.jpg",
                    img2 = "img/game/11.2.jpg",
                    img3 = "img/game/11.3.jpg",
                    img4 = "img/game/11.4.jpg",
                    desc_win = " Механическим часам не нужно электричество.",
                    answer = "1"
            },
            {
                    img1 = "img/game/12.1.jpg",
                    img2 = "img/game/12.2.jpg",
                    img3 = "img/game/12.3.jpg",
                    img4 = "img/game/12.4.jpg",
                    desc_win = " Бразилия не находится в европе.",
                    answer = "1"
            },
            {
                    img1 = "img/game/13.1.jpg",
                    img2 = "img/game/13.2.jpg",
                    img3 = "img/game/13.3.jpg",
                    img4 = "img/game/13.4.jpg",
                    desc_win = " Топор изначально не является оружием.",
                    answer = "3"
            },
            {
                    img1 = "img/game/14.1.jpg",
                    img2 = "img/game/14.2.jpg",
                    img3 = "img/game/14.3.jpg",
                    img4 = "img/game/14.4.jpg",
                    desc_win = " Занятие серфингом является отдыхом, а не работой.",
                    answer = "2"
            },
            {
                    img1 = "img/game/15.1.jpg",
                    img2 = "img/game/15.2.jpg",
                    img3 = "img/game/15.3.jpg",
                    img4 = "img/game/15.4.jpg",
                    desc_win = " Кукуруза не животного происхождения.",
                    answer = "4"
            },
            {
                    img1 = "img/game/16.1.jpg",
                    img2 = "img/game/16.2.jpg",
                    img3 = "img/game/16.3.jpg",
                    img4 = "img/game/16.4.jpg",
                    desc_win = " Горы природного происхождения.",
                    answer = "2"
            },
            {
                    img1 = "img/game/17.1.jpg",
                    img2 = "img/game/17.2.jpg",
                    img3 = "img/game/17.3.jpg",
                    img4 = "img/game/17.4.jpg",
                    desc_win = " Существование динозавров доказано.",
                    answer = "1"
            },
            {
                    img1 = "img/game/18.1.jpg",
                    img2 = "img/game/18.2.jpg",
                    img3 = "img/game/18.3.jpg",
                    img4 = "img/game/18.4.jpg",
                    desc_win = " Фонтан - дело рук человека.",
                    answer = "3"
            },
            {
                    img1 = "img/game/19.1.jpg",
                    img2 = "img/game/19.2.jpg",
                    img3 = "img/game/19.3.jpg",
                    img4 = "img/game/19.4.jpg",
                    desc_win = " Кирпич потонет в воде.",
                    answer = "2"
            },
            {
                    img1 = "img/game/20.1.jpg",
                    img2 = "img/game/20.2.jpg",
                    img3 = "img/game/20.3.jpg",
                    img4 = "img/game/20.4.jpg",
                    desc_win = " Золото не горит.",
                    answer = "3"
            },
            {
                    img1 = "img/game/21.1.jpg",
                    img2 = "img/game/21.2.jpg",
                    img3 = "img/game/21.3.jpg",
                    img4 = "img/game/21.4.jpg",
                    desc_win = " Карандаш не испускает свет.",
                    answer = "4"
            },
            {
                    img1 = "img/game/22.1.jpg",
                    img2 = "img/game/22.2.jpg",
                    img3 = "img/game/22.3.jpg",
                    img4 = "img/game/22.4.jpg",
                    desc_win = " Гвоздь - не инструмент.",
                    answer = "3"
            },
            {
                    img1 = "img/game/23.1.jpg",
                    img2 = "img/game/23.2.jpg",
                    img3 = "img/game/23.3.jpg",
                    img4 = "img/game/23.4.jpg",
                    desc_win = " Велосипед работает на мышечной тяге.",
                    answer = "1"
            },
            {
                    img1 = "img/game/24.1.jpg",
                    img2 = "img/game/24.2.jpg",
                    img3 = "img/game/24.3.jpg",
                    img4 = "img/game/24.4.jpg",
                    desc_win = " 313 - нечетное число.",
                    answer = "2"
            },
            {
                    img1 = "img/game/26.1.jpg",
                    img2 = "img/game/26.2.jpg",
                    img3 = "img/game/26.3.jpg",
                    img4 = "img/game/26.4.jpg",
                    desc_win = " Юла не является источником информации.",
                    answer = "3"
            },
            {
                    img1 = "img/game/27.1.jpg",
                    img2 = "img/game/27.2.jpg",
                    img3 = "img/game/27.3.jpg",
                    img4 = "img/game/27.4.jpg",
                    desc_win = " Туалет - не жилое помещение.",
                    answer = "2"
            },
            {
                    img1 = "img/game/28.1.jpg",
                    img2 = "img/game/28.2.jpg",
                    img3 = "img/game/28.3.jpg",
                    img4 = "img/game/28.4.jpg",
                    desc_win = " Радий - радиактивный элемент.",
                    answer = "4"
            },
            {
                    img1 = "img/game/29.1.jpg",
                    img2 = "img/game/29.2.jpg",
                    img3 = "img/game/29.3.jpg",
                    img4 = "img/game/29.4.jpg",
                    desc_win = " Петр I не является писателем.",
                    answer = "2"
            },
            {
                    img1 = "img/game/30.1.jpg",
                    img2 = "img/game/30.2.jpg",
                    img3 = "img/game/30.3.jpg",
                    img4 = "img/game/30.4.jpg",
                    desc_win = " Кактус - не дерево.",
                    answer = "1"
            },
            {
                    img1 = "img/game/31.1.jpg",
                    img2 = "img/game/31.2.jpg",
                    img3 = "img/game/31.3.jpg",
                    img4 = "img/game/31.4.jpg",
                    desc_win = " Теннисная ракетка - не средство связи.",
                    answer = "1"
            },
            {
                    img1 = "img/game/32.1.jpg",
                    img2 = "img/game/32.2.jpg",
                    img3 = "img/game/32.3.jpg",
                    img4 = "img/game/32.4.jpg",
                    desc_win = " Спицами нельзя писать.",
                    answer = "4"
            },
            {
                    img1 = "img/game/33.1.jpg",
                    img2 = "img/game/33.2.jpg",
                    img3 = "img/game/33.3.jpg",
                    img4 = "img/game/33.4.jpg",
                    desc_win = " О мягкую игрушку нельзя обжечься.",
                    answer = "3"
            },
            {
                    img1 = "img/game/34.1.jpg",
                    img2 = "img/game/34.2.jpg",
                    img3 = "img/game/34.3.jpg",
                    img4 = "img/game/34.4.jpg",
                    desc_win = " Маска не является средством защиты.",
                    answer = "4"
            },
            {
                    img1 = "img/game/36.1.jpg",
                    img2 = "img/game/36.2.jpg",
                    img3 = "img/game/36.3.jpg",
                    img4 = "img/game/36.4.jpg",
                    desc_win = " Бег - не экстремальный вид спорта.",
                    answer = "2"
            },
            {
                    img1 = "img/game/37.1.jpg",
                    img2 = "img/game/37.2.jpg",
                    img3 = "img/game/37.3.jpg",
                    img4 = "img/game/37.4.jpg",
                    desc_win = " Ананас - это не стереотип о России.",
                    answer = "2"
            },
            {
                    img1 = "img/game/38.1.jpg",
                    img2 = "img/game/38.2.jpg",
                    img3 = "img/game/38.3.jpg",
                    img4 = "img/game/38.4.jpg",
                    desc_win = " Деловой костюм не явлется формой какой-то определнной профессии.",
                    answer = "1"
            },
            {
                    img1 = "img/game/39.1.jpg",
                    img2 = "img/game/39.2.jpg",
                    img3 = "img/game/39.3.jpg",
                    img4 = "img/game/39.4.jpg",
                    desc_win = " Мухомор - не съедобный гриб.",
                    answer = "3"
            },
            {
                    img1 = "img/game/40.1.jpg",
                    img2 = "img/game/40.2.jpg",
                    img3 = "img/game/40.3.jpg",
                    img4 = "img/game/40.4.jpg",
                    desc_win = " Кактус нельзя найти в лесу.",
                    answer = "3"
            },
            {
                    img1 = "img/game/41.1.jpg",
                    img2 = "img/game/41.2.jpg",
                    img3 = "img/game/41.3.jpg",
                    img4 = "img/game/41.4.jpg",
                    desc_win = " Мольберт не используется для строительства домов.",
                    answer = "4"
            },
            {
                    img1 = "img/game/42.1.jpg",
                    img2 = "img/game/42.2.jpg",
                    img3 = "img/game/42.3.jpg",
                    img4 = "img/game/42.4.jpg",
                    desc_win = " Машина не может передвигаться по воде.",
                    answer = "2"
            },
            {
                    img1 = "img/game/43.1.jpg",
                    img2 = "img/game/43.2.jpg",
                    img3 = "img/game/43.3.jpg",
                    img4 = "img/game/43.4.jpg",
                    desc_win = " Радио изобрели не в Китае.",
                    answer = "3"
            },
            {
                    img1 = "img/game/44.1.jpg",
                    img2 = "img/game/44.2.jpg",
                    img3 = "img/game/44.3.jpg",
                    img4 = "img/game/44.4.jpg",
                    desc_win = " Паровоз изобрели и использовали еще в 19 веке.",
                    answer = "1"
            },
            {
                    img1 = "img/game/45.1.jpg",
                    img2 = "img/game/45.2.jpg",
                    img3 = "img/game/45.3.jpg",
                    img4 = "img/game/45.4.jpg",
                    desc_win = " VI - это римское число 6.",
                    answer = "2"
            },
            {
                    img1 = "img/game/46.1.jpg",
                    img2 = "img/game/46.2.jpg",
                    img3 = "img/game/46.3.jpg",
                    img4 = "img/game/46.4.jpg",
                    desc_win = " Пингвин - не млекопитающие, а птица.",
                    answer = "1"
            },
            {
                    img1 = "img/game/47.1.jpg",
                    img2 = "img/game/47.2.jpg",
                    img3 = "img/game/47.3.jpg",
                    img4 = "img/game/47.4.jpg",
                    desc_win = " Нунчаки не являются музыкальным инструментом.",
                    answer = "3"
            },
            {
                    img1 = "img/game/48.1.jpg",
                    img2 = "img/game/48.2.jpg",
                    img3 = "img/game/48.3.jpg",
                    img4 = "img/game/48.4.jpg",
                    desc_win = " При помощи линейки нельзя отмерять интервалы времени.",
                    answer = "2"
            },
            {
                    img1 = "img/game/49.1.jpg",
                    img2 = "img/game/49.2.jpg",
                    img3 = "img/game/49.3.jpg",
                    img4 = "img/game/49.4.jpg",
                    desc_win = " Брусок дерева не съедобный.",
                    answer = "4"
            },
            {
                    img1 = "img/game/50.1.jpg",
                    img2 = "img/game/50.2.jpg",
                    img3 = "img/game/50.3.jpg",
                    img4 = "img/game/50.4.jpg",
                    desc_win = " Лиса - не грызун.",
                    answer = "4"
            },
            {
                    img1 = "img/game/51.1.jpg",
                    img2 = "img/game/51.2.jpg",
                    img3 = "img/game/51.3.jpg",
                    img4 = "img/game/51.4.jpg",
                    desc_win = " Очки нужны для коррекции зрения, а не для увеличения изображения.",
                    answer = "1"
            },
            {
                    img1 = "img/game/52.1.jpg",
                    img2 = "img/game/52.2.jpg",
                    img3 = "img/game/52.3.jpg",
                    img4 = "img/game/52.4.jpg",
                    desc_win = " Нету официальных гонок связанных с тракторами.",
                    answer = "3"
            },
            {
                    img1 = "img/game/53.1.jpg",
                    img2 = "img/game/53.2.jpg",
                    img3 = "img/game/53.3.jpg",
                    img4 = "img/game/53.4.jpg",
                    desc_win = " Паутина никак не связана с пчелами.",
                    answer = "4"
            },
            {
                    img1 = "img/game/54.1.jpg",
                    img2 = "img/game/54.2.jpg",
                    img3 = "img/game/54.3.jpg",
                    img4 = "img/game/54.4.jpg",
                    desc_win = " Полицейский не является управляющим транспортного средства.",
                    answer = "2"
            },
            {
                    img1 = "img/game/55.1.jpg",
                    img2 = "img/game/55.2.jpg",
                    img3 = "img/game/55.3.jpg",
                    img4 = "img/game/55.4.jpg",
                    desc_win = " Токарь - не деятель культуры.",
                    answer = "1"
            },
            {
                    img1 = "img/game/56.1.jpg",
                    img2 = "img/game/56.2.jpg",
                    img3 = "img/game/56.3.jpg",
                    img4 = "img/game/56.4.jpg",
                    desc_win = " Волков не употребляют в пищу.",
                    answer = "2"
            },
            {
                    img1 = "img/game/57.1.jpg",
                    img2 = "img/game/57.2.jpg",
                    img3 = "img/game/57.3.jpg",
                    img4 = "img/game/57.4.jpg",
                    desc_win = " Пароход не летает.",
                    answer = "1"
            },
            {
                    img1 = "img/game/58.1.jpg",
                    img2 = "img/game/58.2.jpg",
                    img3 = "img/game/58.3.jpg",
                    img4 = "img/game/58.4.jpg",
                    desc_win = " На стуле не спят.",
                    answer = "4"
            },
            {
                    img1 = "img/game/59.1.jpg",
                    img2 = "img/game/59.2.jpg",
                    img3 = "img/game/59.3.jpg",
                    img4 = "img/game/59.4.jpg",
                    desc_win = " Молоток - не садовой инструмент.",
                    answer = "3"
            },
            {
                    img1 = "img/game/60.1.jpg",
                    img2 = "img/game/60.2.jpg",
                    img3 = "img/game/60.3.jpg",
                    img4 = "img/game/60.4.jpg",
                    desc_win = " В боксе не используется мяч.",
                    answer = "3"
            },
            {
                    img1 = "img/game/61.1.jpg",
                    img2 = "img/game/61.2.jpg",
                    img3 = "img/game/61.3.jpg",
                    img4 = "img/game/61.4.jpg",
                    desc_win = " Фотоаппарат не связан со звуком.",
                    answer = "1"
            },
            {
                    img1 = "img/game/62.1.jpg",
                    img2 = "img/game/62.2.jpg",
                    img3 = "img/game/62.3.jpg",
                    img4 = "img/game/62.4.jpg",
                    desc_win = " Стол не предназначен для долгого хранения вещей.",
                    answer = "4"
            },
            {
                    img1 = "img/game/63.1.jpg",
                    img2 = "img/game/63.2.jpg",
                    img3 = "img/game/63.3.jpg",
                    img4 = "img/game/63.4.jpg",
                    desc_win = " Монополия - не азартная игра.",
                    answer = "3"
            },
            {
                    img1 = "img/game/65.1.jpg",
                    img2 = "img/game/65.2.jpg",
                    img3 = "img/game/65.3.jpg",
                    img4 = "img/game/65.4.jpg",
                    desc_win = " Музыкальная колонка не является устройством ввода.",
                    answer = "1"
            },
            {
                    img1 = "img/game/66.1.jpg",
                    img2 = "img/game/66.2.jpg",
                    img3 = "img/game/66.3.jpg",
                    img4 = "img/game/66.4.jpg",
                    desc_win = " Баран не ассоциируется с пиратами.",
                    answer = "4"
            },
            {
                    img1 = "img/game/67.1.jpg",
                    img2 = "img/game/67.2.jpg",
                    img3 = "img/game/67.3.jpg",
                    img4 = "img/game/67.4.jpg",
                    desc_win = " Ножом не едят.",
                    answer = "3"
            },
            {
                    img1 = "img/game/68.1.jpg",
                    img2 = "img/game/68.2.jpg",
                    img3 = "img/game/68.3.jpg",
                    img4 = "img/game/68.4.jpg",
                    desc_win = " Печь не используется для охлаждения.",
                    answer = "2"
            },
            {
                    img1 = "img/game/69.1.jpg",
                    img2 = "img/game/69.2.jpg",
                    img3 = "img/game/69.3.jpg",
                    img4 = "img/game/69.4.jpg",
                    desc_win = " У радио нет двухсторонней связи.",
                    answer = "1"
            },
            {
                    img1 = "img/game/70.1.jpg",
                    img2 = "img/game/70.2.jpg",
                    img3 = "img/game/70.3.jpg",
                    img4 = "img/game/70.4.jpg",
                    desc_win = " Плотина не работает за счет силы ветра.",
                    answer = "3"
            },
            {
                    img1 = "img/game/71.1.jpg",
                    img2 = "img/game/71.2.jpg",
                    img3 = "img/game/71.3.jpg",
                    img4 = "img/game/71.4.jpg",
                    desc_win = " Барабан - это не струнный инструмент.",
                    answer = "4"
            },
            {
                    img1 = "img/game/72.1.jpg",
                    img2 = "img/game/72.2.jpg",
                    img3 = "img/game/72.3.jpg",
                    img4 = "img/game/72.4.jpg",
                    desc_win = " Автомобиль - это не общественный транспорт.",
                    answer = "2"
            },
            {
                    img1 = "img/game/73.1.jpg",
                    img2 = "img/game/73.2.jpg",
                    img3 = "img/game/73.3.jpg",
                    img4 = "img/game/73.4.jpg",
                    desc_win = " Балгарский перец - это овощ.",
                    answer = "3"
            },
            {
                    img1 = "img/game/74.1.jpg",
                    img2 = "img/game/74.2.jpg",
                    img3 = "img/game/74.3.jpg",
                    img4 = "img/game/74.4.jpg",
                    desc_win = " Солнце - это звезда.",
                    answer = "4"
            },
            {
                    img1 = "img/game/75.1.jpg",
                    img2 = "img/game/75.2.jpg",
                    img3 = "img/game/75.3.jpg",
                    img4 = "img/game/75.4.jpg",
                    desc_win = " Суши - это не европейское блюдо.",
                    answer = "3"
            },
            {
                    img1 = "img/game/76.1.jpg",
                    img2 = "img/game/76.2.jpg",
                    img3 = "img/game/76.3.jpg",
                    img4 = "img/game/76.4.jpg",
                    desc_win = " Коку колу не пьют горячей.",
                    answer = "1"
            },
            {
                    img1 = "img/game/77.1.jpg",
                    img2 = "img/game/77.2.jpg",
                    img3 = "img/game/77.3.jpg",
                    img4 = "img/game/77.4.jpg",
                    desc_win = " Только кукла является игрушкой для девочек.",
                    answer = "2"
            },
            {
                    img1 = "img/game/78.1.jpg",
                    img2 = "img/game/78.2.jpg",
                    img3 = "img/game/78.3.jpg",
                    img4 = "img/game/78.4.jpg",
                    desc_win = " Золото не из углеродов.",
                    answer = "1"
            },
            {
                    img1 = "img/game/80.1.jpg",
                    img2 = "img/game/80.2.jpg",
                    img3 = "img/game/80.3.jpg",
                    img4 = "img/game/80.4.jpg",
                    desc_win = " Орел - не медлительное животное.",
                    answer = "2"
            },
            {
                    img1 = "img/game/81.1.jpg",
                    img2 = "img/game/81.2.jpg",
                    img3 = "img/game/81.3.jpg",
                    img4 = "img/game/81.4.jpg",
                    desc_win = " Меч не используется для защиты",
                    answer = "4"
            },
            {
                    img1 = "img/game/82.1.jpg",
                    img2 = "img/game/82.2.jpg",
                    img3 = "img/game/82.3.jpg",
                    img4 = "img/game/82.4.jpg",
                    desc_win = " Катание на сноуборде не ассоциируется с новым годом.",
                    answer = "2"
            },
            {
                    img1 = "img/game/83.1.jpg",
                    img2 = "img/game/83.2.jpg",
                    img3 = "img/game/83.3.jpg",
                    img4 = "img/game/83.4.jpg",
                    desc_win = " Большой теннис - это не командная игра.",
                    answer = "3"
            },
            {
                    img1 = "img/game/84.1.jpg",
                    img2 = "img/game/84.2.jpg",
                    img3 = "img/game/84.3.jpg",
                    img4 = "img/game/84.4.jpg",
                    desc_win = " Золотом обычно не расплачиваются в магазинах.",
                    answer = "2"
            },
            {
                    img1 = "img/game/85.1.jpg",
                    img2 = "img/game/85.2.jpg",
                    img3 = "img/game/85.3.jpg",
                    img4 = "img/game/85.4.jpg",
                    desc_win = " Триумфальная арка не находится в Англии.",
                    answer = "1"
            },
            {
                    img1 = "img/game/86.1.jpg",
                    img2 = "img/game/86.2.jpg",
                    img3 = "img/game/86.3.jpg",
                    img4 = "img/game/86.4.jpg",
                    desc_win = " Хлопья - это не молочный продукт.",
                    answer = "1"
            },
            {
                    img1 = "img/game/87.1.jpg",
                    img2 = "img/game/87.2.jpg",
                    img3 = "img/game/87.3.jpg",
                    img4 = "img/game/87.4.jpg",
                    desc_win = " Только страус не летает.",
                    answer = "4"
            },
            {
                    img1 = "img/game/88.1.jpg",
                    img2 = "img/game/88.2.jpg",
                    img3 = "img/game/88.3.jpg",
                    img4 = "img/game/88.4.jpg",
                    desc_win = " Подсолнух не является фруктом.",
                    answer = "2"
            },
            {
                    img1 = "img/game/89.1.jpg",
                    img2 = "img/game/89.2.jpg",
                    img3 = "img/game/89.3.jpg",
                    img4 = "img/game/89.4.jpg",
                    desc_win = " Шахматы - это не активная игра.",
                    answer = "4"
            },
            {
                    img1 = "img/game/90.1.jpg",
                    img2 = "img/game/90.2.jpg",
                    img3 = "img/game/90.3.jpg",
                    img4 = "img/game/90.4.jpg",
                    desc_win = " У льва нету ни пятен, ни полос.",
                    answer = "3"
            },
            {
                    img1 = "img/game/91.1.jpg",
                    img2 = "img/game/91.2.jpg",
                    img3 = "img/game/91.3.jpg",
                    img4 = "img/game/91.4.jpg",
                    desc_win = " Зубная щетка не имеет отношения к волосам.",
                    answer = "1"
            },
            {
                    img1 = "img/game/92.1.jpg",
                    img2 = "img/game/92.2.jpg",
                    img3 = "img/game/92.3.jpg",
                    img4 = "img/game/92.4.jpg",
                    desc_win = " Мозг - это не орган чувств.",
                    answer = "4"
            },
            {
                    img1 = "img/game/93.1.jpg",
                    img2 = "img/game/93.2.jpg",
                    img3 = "img/game/93.3.jpg",
                    img4 = "img/game/93.4.jpg",
                    desc_win = " При игре в шахматы не используются кубики.",
                    answer = "2"
            },
            {
                    img1 = "img/game/94.1.jpg",
                    img2 = "img/game/94.2.jpg",
                    img3 = "img/game/94.3.jpg",
                    img4 = "img/game/94.4.jpg",
                    desc_win = " Крокодил - не млекопитающее.",
                    answer = "3"
            },
            {
                    img1 = "img/game/95.1.jpg",
                    img2 = "img/game/95.2.jpg",
                    img3 = "img/game/95.3.jpg",
                    img4 = "img/game/95.4.jpg",
                    desc_win = " Тигра нельзя встретить в пустыне.",
                    answer = "3"
            },
            {
                    img1 = "img/game/96.1.jpg",
                    img2 = "img/game/96.2.jpg",
                    img3 = "img/game/96.3.jpg",
                    img4 = "img/game/96.4.jpg",
                    desc_win = " В баскетболе не используются ракетки.",
                    answer = "1"
            },
            {
                    img1 = "img/game/97.1.jpg",
                    img2 = "img/game/97.2.jpg",
                    img3 = "img/game/97.3.jpg",
                    img4 = "img/game/97.4.jpg",
                    desc_win = " Фейерверк - это не природное явление.",
                    answer = "4"
            },
            {
                    img1 = "img/game/98.1.jpg",
                    img2 = "img/game/98.2.jpg",
                    img3 = "img/game/98.3.jpg",
                    img4 = "img/game/98.4.jpg",
                    desc_win = " Джокер не является добрым супергероем.",
                    answer = "2"
            },
            {
                    img1 = "img/game/99.1.jpg",
                    img2 = "img/game/99.2.jpg",
                    img3 = "img/game/99.3.jpg",
                    img4 = "img/game/99.4.jpg",
                    desc_win = " Только в футболе не играют мячом руками.",
                    answer = "1"
            },
            {
                    img1 = "img/game/100.1.jpg",
                    img2 = "img/game/100.2.jpg",
                    img3 = "img/game/100.3.jpg",
                    img4 = "img/game/100.4.jpg",
                    desc_win = " Машина имеет 4 колеса.",
                    answer = "3"
            }/*,
            {
                    img1 = "img/game/101.1.jpg",
                    img2 = "img/game/101.2.jpg",
                    img3 = "img/game/101.3.jpg",
                    img4 = "img/game/101.4.jpg",
                    desc_win = " На овцах не ездят верхом",
                    answer = "1"
            },
            {
                    img1 = "img/game/102.1.jpg",
                    img2 = "img/game/102.2.jpg",
                    img3 = "img/game/102.3.jpg",
                    img4 = "img/game/102.4.jpg",
                    desc_win = " Корабль не может летать",
                    answer = "4"
            },
            {
                    img1 = "img/game/103.1.jpg",
                    img2 = "img/game/103.2.jpg",
                    img3 = "img/game/103.3.jpg",
                    img4 = "img/game/103.4.jpg",
                    desc_win = " Шерсть (пух) свиней не используют",
                    answer = "1"
            },
            {
                    img1 = "img/game/104.1.jpg",
                    img2 = "img/game/104.2.jpg",
                    img3 = "img/game/104.3.jpg",
                    img4 = "img/game/104.4.jpg",
                    desc_win = " Отвертка не предназначена для разрушения",
                    answer = "1"
            },
            {
                    img1 = "img/game/105.1.jpg",
                    img2 = "img/game/105.2.jpg",
                    img3 = "img/game/105.3.jpg",
                    img4 = "img/game/105.4.jpg",
                    desc_win = " Гамак не вешается внутри помещения",
                    answer = "1"
            },
            {
                    img1 = "img/game/106.1.jpg",
                    img2 = "img/game/106.2.jpg",
                    img3 = "img/game/106.3.jpg",
                    img4 = "img/game/106.4.jpg",
                    desc_win = " Треугольник — это плоская фигура",
                    answer = "2"
            },
            {
                    img1 = "img/game/107.1.jpg",
                    img2 = "img/game/107.2.jpg",
                    img3 = "img/game/107.3.jpg",
                    img4 = "img/game/107.4.jpg",
                    desc_win = " Циркуль не предназначен для рисования",
                    answer = "3"
            },
            {
                    img1 = "img/game/108.1.jpg",
                    img2 = "img/game/108.2.jpg",
                    img3 = "img/game/108.3.jpg",
                    img4 = "img/game/108.4.jpg",
                    desc_win = " Спортивного земледелия не существует",
                    answer = "3"
            },
            {
                    img1 = "img/game/109.1.jpg",
                    img2 = "img/game/109.2.jpg",
                    img3 = "img/game/109.3.jpg",
                    img4 = "img/game/109.4.jpg",
                    desc_win = " Камень не является состоянием воды",
                    answer = "4"
            },
            {
                    img1 = "img/game/110.1.jpg",
                    img2 = "img/game/110.2.jpg",
                    img3 = "img/game/110.3.jpg",
                    img4 = "img/game/110.4.jpg",
                    desc_win = " Лягушка не является ядовитой",
                    answer = "2"
            },
            {
                    img1 = "img/game/111.1.jpg",
                    img2 = "img/game/111.2.jpg",
                    img3 = "img/game/111.3.jpg",
                    img4 = "img/game/111.4.jpg",
                    desc_win = " Пожарный не работает в цирке",
                    answer = "2"
            },
            {
                    img1 = "img/game/112.1.jpg",
                    img2 = "img/game/112.2.jpg",
                    img3 = "img/game/112.3.jpg",
                    img4 = "img/game/112.4.jpg",
                    desc_win = " Только шляпа является головным убором",
                    answer = "4"
            },
            {
                    img1 = "img/game/113.1.jpg",
                    img2 = "img/game/113.2.jpg",
                    img3 = "img/game/113.3.jpg",
                    img4 = "img/game/113.4.jpg",
                    desc_win = " Все кроме жука носорога жалят (кусают)",
                    answer = "1"
            },
            {
                    img1 = "img/game/114.1.jpg",
                    img2 = "img/game/114.2.jpg",
                    img3 = "img/game/114.3.jpg",
                    img4 = "img/game/114.4.jpg",
                    desc_win = " Каток не используется для строительства домов",
                    answer = "3"
            },
            {
                    img1 = "img/game/115.1.jpg",
                    img2 = "img/game/115.2.jpg",
                    img3 = "img/game/115.3.jpg",
                    img4 = "img/game/115.4.jpg",
                    desc_win = " Надувные замки не располагают во дворах",
                    answer = "2"
            },
            {
                    img1 = "img/game/116.1.jpg",
                    img2 = "img/game/116.2.jpg",
                    img3 = "img/game/116.3.jpg",
                    img4 = "img/game/116.4.jpg",
                    desc_win = " Лосей не держат как домашних животных",
                    answer = "1"
            },
            {
                    img1 = "img/game/117.1.jpg",
                    img2 = "img/game/117.2.jpg",
                    img3 = "img/game/117.3.jpg",
                    img4 = "img/game/117.4.jpg",
                    desc_win = " Дети не носят пистолеты в школу",
                    answer = "3"
            },
            {
                    img1 = "img/game/118.1.jpg",
                    img2 = "img/game/118.2.jpg",
                    img3 = "img/game/118.3.jpg",
                    img4 = "img/game/118.4.jpg",
                    desc_win = " Созвездие не находится в солнечной системе",
                    answer = "4"
            },
            {
                    img1 = "img/game/119.1.jpg",
                    img2 = "img/game/119.2.jpg",
                    img3 = "img/game/119.3.jpg",
                    img4 = "img/game/119.4.jpg",
                    desc_win = " Альберт Эйнштейн не был писателем",
                    answer = "4"
            },
            {
                    img1 = "img/game/120.1.jpg",
                    img2 = "img/game/120.2.jpg",
                    img3 = "img/game/120.3.jpg",
                    img4 = "img/game/120.4.jpg",
                    desc_win = " Лимон кислый",
                    answer = "4"
            },
            {
                    img1 = "img/game/121.1.jpg",
                    img2 = "img/game/121.2.jpg",
                    img3 = "img/game/121.3.jpg",
                    img4 = "img/game/121.4.jpg",
                    desc_win = " На картинке пума, а не лев.",
                    answer = "1"
            },
            {
                    img1 = "img/game/122.1.jpg",
                    img2 = "img/game/122.2.jpg",
                    img3 = "img/game/122.3.jpg",
                    img4 = "img/game/122.4.jpg",
                    desc_win = " Калоши не являются обувью для похода на торжественные мероприятия",
                    answer = "2"
            },
            {
                    img1 = "img/game/123.1.jpg",
                    img2 = "img/game/123.2.jpg",
                    img3 = "img/game/123.3.jpg",
                    img4 = "img/game/123.4.jpg",
                    desc_win = " Клубника растет не на дереве",
                    answer = "3"
            },
            {
                    img1 = "img/game/124.1.jpg",
                    img2 = "img/game/124.2.jpg",
                    img3 = "img/game/124.3.jpg",
                    img4 = "img/game/124.4.jpg",
                    desc_win = " Монитор не хранитель информации",
                    answer = "4"
            },
            {
                    img1 = "img/game/125.1.jpg",
                    img2 = "img/game/125.2.jpg",
                    img3 = "img/game/125.3.jpg",
                    img4 = "img/game/125.4.jpg",
                    desc_win = " Печатная машинка не делает копии автоматически",
                    answer = "1"
            },
            {
                    img1 = "img/game/126.1.jpg",
                    img2 = "img/game/126.2.jpg",
                    img3 = "img/game/126.3.jpg",
                    img4 = "img/game/126.4.jpg",
                    desc_win = " Цветение сакуры — это не стихийное бедствие",
                    answer = "3"
            },
            {
                    img1 = "img/game/127.1.jpg",
                    img2 = "img/game/127.2.jpg",
                    img3 = "img/game/127.3.jpg",
                    img4 = "img/game/127.4.jpg",
                    desc_win = " Таксист не является военным",
                    answer = "4"
            },
            {
                    img1 = "img/game/128.1.jpg",
                    img2 = "img/game/128.2.jpg",
                    img3 = "img/game/128.3.jpg",
                    img4 = "img/game/128.4.jpg",
                    desc_win = " На этой картинке изображенная худая спортсменка",
                    answer = "3"
            },
            {
                    img1 = "img/game/129.1.jpg",
                    img2 = "img/game/129.2.jpg",
                    img3 = "img/game/129.3.jpg",
                    img4 = "img/game/129.4.jpg",
                    desc_win = " Цирк не является храмом",
                    answer = "4"
            },
            {
                    img1 = "img/game/130.1.jpg",
                    img2 = "img/game/130.2.jpg",
                    img3 = "img/game/130.3.jpg",
                    img4 = "img/game/130.4.jpg",
                    desc_win = " На картинке изображен доктор, а не повар",
                    answer = "2"
            },
            {
                    img1 = "img/game/131.1.jpg",
                    img2 = "img/game/131.2.jpg",
                    img3 = "img/game/131.3.jpg",
                    img4 = "img/game/131.4.jpg",
                    desc_win = " Бакенбарды отличаются от усов",
                    answer = "2"
            },
            {
                    img1 = "img/game/132.1.jpg",
                    img2 = "img/game/132.2.jpg",
                    img3 = "img/game/132.3.jpg",
                    img4 = "img/game/132.4.jpg",
                    desc_win = " Бокал для вина не подходит для горячих напитков",
                    answer = "4"
            },
            {
                    img1 = "img/game/133.1.jpg",
                    img2 = "img/game/133.2.jpg",
                    img3 = "img/game/133.3.jpg",
                    img4 = "img/game/133.4.jpg",
                    desc_win = " Муравьед не является приматом",
                    answer = "1"
            },
            {
                    img1 = "img/game/134.1.jpg",
                    img2 = "img/game/134.2.jpg",
                    img3 = "img/game/134.3.jpg",
                    img4 = "img/game/134.4.jpg",
                    desc_win = " Свиньи не дикие животные",
                    answer = "3"
            },
            {
                    img1 = "img/game/135.1.jpg",
                    img2 = "img/game/135.2.jpg",
                    img3 = "img/game/135.3.jpg",
                    img4 = "img/game/135.4.jpg",
                    desc_win = " Иероглифы обозначают целое слово, а не букву",
                    answer = "4"
            },
            {
                    img1 = "img/game/136.1.jpg",
                    img2 = "img/game/136.2.jpg",
                    img3 = "img/game/136.3.jpg",
                    img4 = "img/game/136.4.jpg",
                    desc_win = " Парик — это не национальный головной убор",
                    answer = "1"
            },
            {
                    img1 = "img/game/137.1.jpg",
                    img2 = "img/game/137.2.jpg",
                    img3 = "img/game/137.3.jpg",
                    img4 = "img/game/137.4.jpg",
                    desc_win = " Печатная машинка не предназначена для математических расчетов",
                    answer = "1"
            },
            {
                    img1 = "img/game/138.1.jpg",
                    img2 = "img/game/138.2.jpg",
                    img3 = "img/game/138.3.jpg",
                    img4 = "img/game/138.4.jpg",
                    desc_win = " Дым не является паром",
                    answer = "2"
            },
            {
                    img1 = "img/game/139.1.jpg",
                    img2 = "img/game/139.2.jpg",
                    img3 = "img/game/139.3.jpg",
                    img4 = "img/game/139.4.jpg",
                    desc_win = " Ваза хрупкая",
                    answer = "3"
            },
            {
                    img1 = "img/game/140.1.jpg",
                    img2 = "img/game/140.2.jpg",
                    img3 = "img/game/140.3.jpg",
                    img4 = "img/game/140.4.jpg",
                    desc_win = " На других фото изображены башни",
                    answer = "1"
            },
            {
                    img1 = "img/game/141.1.jpg",
                    img2 = "img/game/141.2.jpg",
                    img3 = "img/game/141.3.jpg",
                    img4 = "img/game/141.4.jpg",
                    desc_win = " Пицца — это не десерт",
                    answer = "2"
            },
            {
                    img1 = "img/game/142.1.jpg",
                    img2 = "img/game/142.2.jpg",
                    img3 = "img/game/142.3.jpg",
                    img4 = "img/game/142.4.jpg",
                    desc_win = " Инженер не работает руками",
                    answer = "2"
            },
            {
                    img1 = "img/game/143.1.jpg",
                    img2 = "img/game/143.2.jpg",
                    img3 = "img/game/143.3.jpg",
                    img4 = "img/game/143.4.jpg",
                    desc_win = " Деревянный сундук делается не из нефти",
                    answer = "1"
            },
            {
                    img1 = "img/game/144.1.jpg",
                    img2 = "img/game/144.2.jpg",
                    img3 = "img/game/144.3.jpg",
                    img4 = "img/game/144.4.jpg",
                    desc_win = " Остальные картинки — это простой хлеб разных народов",
                    answer = "3"
            },
            {
                    img1 = "img/game/145.1.jpg",
                    img2 = "img/game/145.2.jpg",
                    img3 = "img/game/145.3.jpg",
                    img4 = "img/game/145.4.jpg",
                    desc_win = " Полицейские не являются военными",
                    answer = "2"
            },
            {
                    img1 = "img/game/146.1.jpg",
                    img2 = "img/game/146.2.jpg",
                    img3 = "img/game/146.3.jpg",
                    img4 = "img/game/146.4.jpg",
                    desc_win = " Душ не является видом бани",
                    answer = "4"
            },
            {
                    img1 = "img/game/147.1.jpg",
                    img2 = "img/game/147.2.jpg",
                    img3 = "img/game/147.3.jpg",
                    img4 = "img/game/147.4.jpg",
                    desc_win = " Стакан хрупкий",
                    answer = "4"
            },
            {
                    img1 = "img/game/148.1.jpg",
                    img2 = "img/game/148.2.jpg",
                    img3 = "img/game/148.3.jpg",
                    img4 = "img/game/148.4.jpg",
                    desc_win = " Стоматология — это лечение, а не косметическая процедура",
                    answer = "1"
            },
            {
                    img1 = "img/game/149.1.jpg",
                    img2 = "img/game/149.2.jpg",
                    img3 = "img/game/149.3.jpg",
                    img4 = "img/game/149.4.jpg",
                    desc_win = " Камертон нужен только для настройки инструментов",
                    answer = "1"
            },
            {
                    img1 = "img/game/151.1.jpg",
                    img2 = "img/game/151.2.jpg",
                    img3 = "img/game/151.3.jpg",
                    img4 = "img/game/151.4.jpg",
                    desc_win = " Прищепка не канцелярская принадлежность",
                    answer = "4"
            },
            {
                    img1 = "img/game/152.1.jpg",
                    img2 = "img/game/152.2.jpg",
                    img3 = "img/game/152.3.jpg",
                    img4 = "img/game/152.4.jpg",
                    desc_win = " Дверная ручка не для привлечения внимания",
                    answer = "4"
            },
            {
                    img1 = "img/game/153.1.jpg",
                    img2 = "img/game/153.2.jpg",
                    img3 = "img/game/153.3.jpg",
                    img4 = "img/game/153.4.jpg",
                    desc_win = " Транспорт на золотой тяге еще не изобрели",
                    answer = "2"
            },
            {
                    img1 = "img/game/154.1.jpg",
                    img2 = "img/game/154.2.jpg",
                    img3 = "img/game/154.3.jpg",
                    img4 = "img/game/154.4.jpg",
                    desc_win = " На первом фото изображен хоккеист,а не космонавт",
                    answer = "1"
            },
            {
                    img1 = "img/game/155.1.jpg",
                    img2 = "img/game/155.2.jpg",
                    img3 = "img/game/155.3.jpg",
                    img4 = "img/game/155.4.jpg",
                    desc_win = " Гаечный ключ — это не труба",
                    answer = "1"
            },
            {
                    img1 = "img/game/156.1.jpg",
                    img2 = "img/game/156.2.jpg",
                    img3 = "img/game/156.3.jpg",
                    img4 = "img/game/156.4.jpg",
                    desc_win = " Это часть мотоцикла, а не машины",
                    answer = "4"
            },
            {
                    img1 = "img/game/157.1.jpg",
                    img2 = "img/game/157.2.jpg",
                    img3 = "img/game/157.3.jpg",
                    img4 = "img/game/157.4.jpg",
                    desc_win = " Дайвинг — это подводный вид спорта",
                    answer = "2"
            },
            {
                    img1 = "img/game/158.1.jpg",
                    img2 = "img/game/158.2.jpg",
                    img3 = "img/game/158.3.jpg",
                    img4 = "img/game/158.4.jpg",
                    desc_win = " Мыло не подходит для удаления волос",
                    answer = "3"
            },
            {
                    img1 = "img/game/159.1.jpg",
                    img2 = "img/game/159.2.jpg",
                    img3 = "img/game/159.3.jpg",
                    img4 = "img/game/159.4.jpg",
                    desc_win = " Противогаз не защищает от ударов",
                    answer = "2"
            },
            {
                    img1 = "img/game/160.1.jpg",
                    img2 = "img/game/160.2.jpg",
                    img3 = "img/game/160.3.jpg",
                    img4 = "img/game/160.4.jpg",
                    desc_win = " Скрепка — это канцтовары",
                    answer = "4"
            },
            {
                    img1 = "img/game/161.1.jpg",
                    img2 = "img/game/161.2.jpg",
                    img3 = "img/game/161.3.jpg",
                    img4 = "img/game/161.4.jpg",
                    desc_win = " Транспортир нужен для измерения углов",
                    answer = "3"
            },
            {
                    img1 = "img/game/162.1.jpg",
                    img2 = "img/game/162.2.jpg",
                    img3 = "img/game/162.3.jpg",
                    img4 = "img/game/162.4.jpg",
                    desc_win = " На фото изображена пасмурная погода",
                    answer = "1"
            },
            {
                    img1 = "img/game/163.1.jpg",
                    img2 = "img/game/163.2.jpg",
                    img3 = "img/game/163.3.jpg",
                    img4 = "img/game/163.4.jpg",
                    desc_win = " Это не чайные принадлежности",
                    answer = "3"
            },
            {
                    img1 = "img/game/164.1.jpg",
                    img2 = "img/game/164.2.jpg",
                    img3 = "img/game/164.3.jpg",
                    img4 = "img/game/164.4.jpg",
                    desc_win = " Тюлень — это не грызун",
                    answer = "2"
            },
            {
                    img1 = "img/game/165.1.jpg",
                    img2 = "img/game/165.2.jpg",
                    img3 = "img/game/165.3.jpg",
                    img4 = "img/game/165.4.jpg",
                    desc_win = " Фото не макросъемка",
                    answer = "4"
            },
            {
                    img1 = "img/game/166.1.jpg",
                    img2 = "img/game/166.2.jpg",
                    img3 = "img/game/166.3.jpg",
                    img4 = "img/game/166.4.jpg",
                    desc_win = " Школа не является местом (способом) заключения",
                    answer = "4"
            },
            {
                    img1 = "img/game/167.1.jpg",
                    img2 = "img/game/167.2.jpg",
                    img3 = "img/game/167.3.jpg",
                    img4 = "img/game/167.4.jpg",
                    desc_win = " Ящерицы не прыгают",
                    answer = "1"
            },
            {
                    img1 = "img/game/168.1.jpg",
                    img2 = "img/game/168.2.jpg",
                    img3 = "img/game/168.3.jpg",
                    img4 = "img/game/168.4.jpg",
                    desc_win = " Ведро — не место для долгого хранения жидкостей",
                    answer = "2"
            },
            {
                    img1 = "img/game/169.1.jpg",
                    img2 = "img/game/169.2.jpg",
                    img3 = "img/game/169.3.jpg",
                    img4 = "img/game/169.4.jpg",
                    desc_win = " Это логотип автомобильной компании, а не герб государства",
                    answer = "4"
            },
            {
                    img1 = "img/game/170.1.jpg",
                    img2 = "img/game/170.2.jpg",
                    img3 = "img/game/170.3.jpg",
                    img4 = "img/game/170.4.jpg",
                    desc_win = " Подарок не имеет прямого отношения к победе",
                    answer = "1"
            },
            {
                    img1 = "img/game/171.1.jpg",
                    img2 = "img/game/171.2.jpg",
                    img3 = "img/game/171.3.jpg",
                    img4 = "img/game/171.4.jpg",
                    desc_win = " Машина никак не зависит от ветра",
                    answer = "3"
            },
            {
                    img1 = "img/game/172.1.jpg",
                    img2 = "img/game/172.2.jpg",
                    img3 = "img/game/172.3.jpg",
                    img4 = "img/game/172.4.jpg",
                    desc_win = " Папоротник не является останком",
                    answer = "4"
            },
            {
                    img1 = "img/game/173.1.jpg",
                    img2 = "img/game/173.2.jpg",
                    img3 = "img/game/173.3.jpg",
                    img4 = "img/game/173.4.jpg",
                    desc_win = " Баржа не закреплена на земле",
                    answer = "2"
            },
            {
                    img1 = "img/game/174.1.jpg",
                    img2 = "img/game/174.2.jpg",
                    img3 = "img/game/174.3.jpg",
                    img4 = "img/game/174.4.jpg",
                    desc_win = " Кабан — это дикое животное",
                    answer = "2"
            },
            {
                    img1 = "img/game/175.1.jpg",
                    img2 = "img/game/175.2.jpg",
                    img3 = "img/game/175.3.jpg",
                    img4 = "img/game/175.4.jpg",
                    desc_win = " Пистолет не связан со сбором грибов",
                    answer = "1"
            },
            {
                    img1 = "img/game/176.1.jpg",
                    img2 = "img/game/176.2.jpg",
                    img3 = "img/game/176.3.jpg",
                    img4 = "img/game/176.4.jpg",
                    desc_win = " Огород — не средство защиты владений",
                    answer = "3"
            },
            {
                    img1 = "img/game/177.1.jpg",
                    img2 = "img/game/177.2.jpg",
                    img3 = "img/game/177.3.jpg",
                    img4 = "img/game/177.4.jpg",
                    desc_win = " Чистка зубов — это не способ закалки",
                    answer = "4"
            },
            {
                    img1 = "img/game/178.1.jpg",
                    img2 = "img/game/178.2.jpg",
                    img3 = "img/game/178.3.jpg",
                    img4 = "img/game/178.4.jpg",
                    desc_win = " Вешалка с одеждой не находится на кухне",
                    answer = "3"
            },
            {
                    img1 = "img/game/179.1.jpg",
                    img2 = "img/game/179.2.jpg",
                    img3 = "img/game/179.3.jpg",
                    img4 = "img/game/179.4.jpg",
                    desc_win = " В шахматах выигрыш никогда не зависит от удачи ",
                    answer = "4"
            },
            {
                    img1 = "img/game/180.1.jpg",
                    img2 = "img/game/180.2.jpg",
                    img3 = "img/game/180.3.jpg",
                    img4 = "img/game/180.4.jpg",
                    desc_win = " Бирка у домашнего скота нужна не для красоты",
                    answer = "2"
            },
            {
                    img1 = "img/game/181.1.jpg",
                    img2 = "img/game/181.2.jpg",
                    img3 = "img/game/181.3.jpg",
                    img4 = "img/game/181.4.jpg",
                    desc_win = " Лимон — кислый",
                    answer = "1"
            },
            {
                    img1 = "img/game/182.1.jpg",
                    img2 = "img/game/182.2.jpg",
                    img3 = "img/game/182.3.jpg",
                    img4 = "img/game/182.4.jpg",
                    desc_win = " Клоун — это не магический персонаж",
                    answer = "1"
            },
            {
                    img1 = "img/game/183.1.jpg",
                    img2 = "img/game/183.2.jpg",
                    img3 = "img/game/183.3.jpg",
                    img4 = "img/game/183.4.jpg",
                    desc_win = " Жилет рабочего только отражает свет",
                    answer = "4"
            },
            {
                    img1 = "img/game/184.1.jpg",
                    img2 = "img/game/184.2.jpg",
                    img3 = "img/game/184.3.jpg",
                    img4 = "img/game/184.4.jpg",
                    desc_win = " У usb низкое безопасное напряжение ",
                    answer = "2"
            },
            {
                    img1 = "img/game/185.1.jpg",
                    img2 = "img/game/185.2.jpg",
                    img3 = "img/game/185.3.jpg",
                    img4 = "img/game/185.4.jpg",
                    desc_win = " Это медаль, а не монета",
                    answer = "2"
            },
            {
                    img1 = "img/game/186.1.jpg",
                    img2 = "img/game/186.2.jpg",
                    img3 = "img/game/186.3.jpg",
                    img4 = "img/game/186.4.jpg",
                    desc_win = " Это туристы, а не работники",
                    answer = "3"
            },
            {
                    img1 = "img/game/187.1.jpg",
                    img2 = "img/game/187.2.jpg",
                    img3 = "img/game/187.3.jpg",
                    img4 = "img/game/187.4.jpg",
                    desc_win = " Этот самолет гражданский, а не военный",
                    answer = "3"
            },
            {
                    img1 = "img/game/188.1.jpg",
                    img2 = "img/game/188.2.jpg",
                    img3 = "img/game/188.3.jpg",
                    img4 = "img/game/188.4.jpg",
                    desc_win = " Песочные часы не могут разбудить",
                    answer = "1"
            },
            {
                    img1 = "img/game/189.1.jpg",
                    img2 = "img/game/189.2.jpg",
                    img3 = "img/game/189.3.jpg",
                    img4 = "img/game/189.4.jpg",
                    desc_win = " На остальных картинках изображены раковины",
                    answer = "1"
            },
            {
                    img1 = "img/game/190.1.jpg",
                    img2 = "img/game/190.2.jpg",
                    img3 = "img/game/190.3.jpg",
                    img4 = "img/game/190.4.jpg",
                    desc_win = " Китайские палочки предназначены для еды",
                    answer = "4"
            },
            {
                    img1 = "img/game/191.1.jpg",
                    img2 = "img/game/191.2.jpg",
                    img3 = "img/game/191.3.jpg",
                    img4 = "img/game/191.4.jpg",
                    desc_win = " Микимаус — это герой не советского мультфильма",
                    answer = "2"
            },
            {
                    img1 = "img/game/192.1.jpg",
                    img2 = "img/game/192.2.jpg",
                    img3 = "img/game/192.3.jpg",
                    img4 = "img/game/192.4.jpg",
                    desc_win = " Степлер необходим для скрепления материалов",
                    answer = "1"
            },
            {
                    img1 = "img/game/193.1.jpg",
                    img2 = "img/game/193.2.jpg",
                    img3 = "img/game/193.3.jpg",
                    img4 = "img/game/193.4.jpg",
                    desc_win = " Байкал — это не континент",
                    answer = "3"
            },
            {
                    img1 = "img/game/194.1.jpg",
                    img2 = "img/game/194.2.jpg",
                    img3 = "img/game/194.3.jpg",
                    img4 = "img/game/194.4.jpg",
                    desc_win = " Игрушка неваляшка работает не по принципу гироскопа",
                    answer = "2"
            },
            {
                    img1 = "img/game/195.1.jpg",
                    img2 = "img/game/195.2.jpg",
                    img3 = "img/game/195.3.jpg",
                    img4 = "img/game/195.4.jpg",
                    desc_win = " Кроссовки — это одежда, а не спортивный снаряд",
                    answer = "4"
            },
            {
                    img1 = "img/game/196.1.jpg",
                    img2 = "img/game/196.2.jpg",
                    img3 = "img/game/196.3.jpg",
                    img4 = "img/game/196.4.jpg",
                    desc_win = " Это угощение, а не украшение",
                    answer = "3"
            },
            {
                    img1 = "img/game/197.1.jpg",
                    img2 = "img/game/197.2.jpg",
                    img3 = "img/game/197.3.jpg",
                    img4 = "img/game/197.4.jpg",
                    desc_win = " Дрова — это не банная принадлежность",
                    answer = "4"
            },
            {
                    img1 = "img/game/198.1.jpg",
                    img2 = "img/game/198.2.jpg",
                    img3 = "img/game/198.3.jpg",
                    img4 = "img/game/198.4.jpg",
                    desc_win = " Мазайка — это не головоломка",
                    answer = "4"
            },
            {
                    img1 = "img/game/199.1.jpg",
                    img2 = "img/game/199.2.jpg",
                    img3 = "img/game/199.3.jpg",
                    img4 = "img/game/199.4.jpg",
                    desc_win = " Продуктовые весы не относятся к правосудию",
                    answer = "3"
            },
            {
                    img1 = "img/game/200.1.jpg",
                    img2 = "img/game/200.2.jpg",
                    img3 = "img/game/200.3.jpg",
                    img4 = "img/game/200.4.jpg",
                    desc_win = " У бегомота нету рогов.",
                    answer = "1"
            }*/
    };
}
