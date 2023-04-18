public class Main {
    public static void main(String[] args) {
        var box = 5;
        System.out.println(box);
        // Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper +4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        // Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        // Задача 6
        var boxerFirst = 78.2;
        var boxerSecond = 82.7;
        var totalWeight = boxerFirst + boxerSecond;
        System.out.println("Общий вес бойцов " + totalWeight + " кг");
        var generalDifference1 = boxerSecond - boxerFirst;
        System.out.println("Разница между весами бойцов " + generalDifference1 + " кг");
        // Задача 7
        var generalDifference2 = boxerSecond % boxerFirst;
        System.out.println("Разница между весами бойцов " + generalDifference2 + " кг");
        // Задача 8.1
        var totalTime = 640;
        var individualTime = 8;
        var numberEmployees = totalTime / individualTime;
        System.out.println("Всего работников в компании - " + numberEmployees + " человек");
        // Задача 8.2
        var newEmployees = 94;
        numberEmployees = numberEmployees + newEmployees;
        individualTime = totalTime / numberEmployees;
        System.out.println("Если в компании работает " + numberEmployees + " человека, то всего " + individualTime + " часа работы может быть поделено между сотрудниками");
    }
}