public class Main {
    public static void main(String[] args) {
        var dog =8.0;
    var cat=3.6;
    var paper=763789;
    System.out.println(dog);
    System.out.println(cat);
    System.out.println(paper);
    dog =dog+4;
    cat=cat+4;
    paper=paper+4;
    System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog =  dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7369;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend =  19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog =  3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var firstWeight =  78.2;
        var secondWeight =  82.7 ;
        var totalWeight = firstWeight + secondWeight;
        System.out.println("Общий вес двух спортсменов "  + totalWeight + " кг");
        var weightDifference= secondWeight - firstWeight;
        System.out.println("Разница в весе " + weightDifference + " кг");
        var overweight = (secondWeight-firstWeight)%totalWeight;
        System.out.println("Разница в весе " + overweight + " кг");
        var GeneralWorktime=640;
        var worktime=8;
        var NumberOfWorkers= GeneralWorktime/worktime;
        System.out.println("Всего работников в компании "+ NumberOfWorkers + " человек");
        NumberOfWorkers= NumberOfWorkers+94;
        var GeneralTime= NumberOfWorkers*worktime;
        System.out.println("Если в компании работает "+ NumberOfWorkers+ " то,всего часов работы может быть поделено между стотрудниками "+ GeneralTime);







    }
}