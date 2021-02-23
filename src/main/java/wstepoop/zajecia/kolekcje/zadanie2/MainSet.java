package wstepoop.zajecia.kolekcje.zadanie2;

import java.util.Set;
import java.util.TreeSet;

public class MainSet {

    public static void main(String[] args) {

        Set<Figure> figureSet = new TreeSet<>();

        figureSet.add(new Square(2));
        figureSet.add(new Square(4));
        figureSet.add(new Square(6));
        figureSet.add(new Square(8));
        figureSet.add(new Square(2));
        figureSet.add(new Square(4));
        figureSet.add(new Square(6));
        figureSet.add(new Rectangle(2,2));
        figureSet.add(new Rectangle(2,4));
        figureSet.add(new Rectangle(2,6));
        figureSet.add(new Rectangle(2,8));
        figureSet.add(new Rectangle(2,2));
        figureSet.add(new Rectangle(2,4));
        figureSet.add(new Rectangle(2,6));

        for (Figure figure : figureSet) {
            System.out.println(figure);
        }

    }

}
