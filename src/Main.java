public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight =  160.9;
        System.out.println(firstBoxer);
        System.out.println(secondBoxer);
        System.out.println(totalWeight);
        System.out.println("Вес первого боксёра " + firstBoxer + " кг!");
        System.out.println("Вес второго боксёра " + secondBoxer + " кг!");
        System.out.println("Общий вес бойцов " + totalWeight + " кг!");

        System.out.println("Разница в весе бойцов " + (secondBoxer - firstBoxer) + " кг!"  );
        var overload = (secondBoxer) % firstBoxer;
        System.out.println(overload);
        System.out.println("Разница в весе бойцов " + overload + " кг!" );

        var workes = (640 / 8);
        System.out.println(workes);
        System.out.println("Всего работников в компании " + workes + " человек");

        var workesTwo = (80 + 94);
        System.out.println(workesTwo);
        var openingHours = (174 * 8);
        System.out.println(openingHours);
        System.out.println("Если в компании работает " + workesTwo + " человек, то всего " + openingHours + " часов работы всего может быть поделено между сотрудниками");

    }
}