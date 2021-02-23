package wstepoop.zajecia.abstrakcjeinterfejsy.zadanie7;

import java.util.Random;

public class EatingContest {

    public static void main(String[] args) {

        Eater[] contestants = new Eater[]{new Programmer(), new Crocodile(), new Vegan()};
        Food contestMeal;

        for (int i = 0; i < 100; i++) {
            contestMeal = randomFood();
            for (Eater contestant : contestants) {
                contestant.eat(contestMeal);
            }
        }

        Eater winnerByMeals = winnerByMealsEaten(contestants);
        Eater winnerByGrams = winnerByGramsEaten(contestants);

        System.out.println("Most meals eaten: " + winnerByMeals + " - " + winnerByMeals.getMealsEaten());
        System.out.println("Most grams eaten: " + winnerByGrams + " - " + winnerByGrams.getGramsEaten());
    }

    public static Food randomFood() {

        Random random = new Random();

        int weight = random.nextInt(1000) + 1;
        FoodType type = FoodType.getTypeByNumber(random.nextInt(4));
        String name = (weight < 500 ? "small " : "big ") + type + " meal";

        return new Food(name, type, weight);

    }

    public static Eater winnerByMealsEaten(Eater[] contestants) {
        Eater winner = null;
        for (Eater contestant : contestants) {
            if (winner == null) {
                winner = contestant;
            } else {
                if (winner.getMealsEaten() < contestant.getMealsEaten()) {
                    winner = contestant;
                }
            }
        }
        return winner;
    }

    public static Eater winnerByGramsEaten(Eater[] contestants) {
        Eater winner = null;
        for (Eater contestant : contestants) {
            if (winner == null) {
                winner = contestant;
            } else {
                if (winner.getGramsEaten() < contestant.getGramsEaten()) {
                    winner = contestant;
                }
            }
        }
        return winner;
    }

}
