fun main() {
    val naruto: Hero = Hero()
    naruto.name = "Наруто Узумаки"
    naruto.hp = 350
    naruto.mp = 120
    naruto.role = "Хокаге"
    naruto.gender = "Мужской"
    println("Name: ${naruto.name}\nGender: ${naruto.gender}\nRole: ${naruto.role}\nHP: ${naruto.hp}\nMP: ${naruto.mp}")
    naruto.sayHello()
    naruto
    val suzuke: Hero = Hero()
    suzuke.name = "Саске  Учиха"
    suzuke.hp = 300
    suzuke.mp = 100
    suzuke.role = "Шиноби-отступник"
    suzuke.gender = "Мужской"
    println("Name: ${suzuke.name}\nGender: ${suzuke.gender}\nRole: ${suzuke.role}\nHP: ${suzuke.hp}\nMP: ${suzuke.mp}")
    val hero = Hero()
    print("Введите имя героя: ")
    hero.name = readln()
    print("Введите пол героя: ")
    hero.gender = readln()
    print("Введите класс героя: ")
    hero.role = readln()
    print("Введите здоровье героя: ")
    hero.hp = readln().toInt()
    print("Введите ману героя: ")
    hero.mp = readln().toInt()
    print("Введите уровень героя: ")
    hero.level = readln().toInt()
    print("Введите стихию героя: ")
    hero.element = readln()
    println("Name: ${hero.name}\nGender: ${hero.gender}\nRole: ${hero.role}\nHP: ${hero.hp}\nMP: ${hero.mp}\nLevel: ${hero.level}\nElement:${hero.element}")
    val enemy = Enemy()
    enemy.name = "Враг"
    enemy.hp = 50
    println("Name: ${enemy.name}\nHP: ${enemy.hp}")
    val hero1 = Hero(name = "артур", hp=100)
    println("герой жив? ${hero1.isAlive()}")




}