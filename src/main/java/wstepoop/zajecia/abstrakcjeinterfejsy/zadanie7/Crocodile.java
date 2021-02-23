package wstepoop.zajecia.abstrakcjeinterfejsy.zadanie7;

public class Crocodile implements Eater {

    private int mealsEaten;
    private int gramsEaten;

    public Crocodile() {
        this.mealsEaten=0;
        this.gramsEaten=0;
    }

    @Override
    public void eat(Food food) {
        if (isMatchingFood(food)){
            mealsEaten++;
            gramsEaten+=food.getWeight();
        }else {
            System.out.println(getClass().getSimpleName() + " does not want " + food.getName());
        }
    }

    @Override
    public int getMealsEaten() {
        return mealsEaten;
    }

    @Override
    public int getGramsEaten() {
        return gramsEaten;
    }

    private boolean isMatchingFood(Food food){
        return food.type == FoodType.MEAT;
    }

    @Override
    public String toString() {
        return "Crocodile{}";
    }
}
