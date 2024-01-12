package chapter2.example;

import chapter2.example.NyPizza.Size;
import chapter2.example.Pizza.Topping;

public class PizzaApplication {

    public static void main(String[] args) {

        NyPizza nyPizza = new NyPizza.Builder(Size.SMALL)
            .addTopping(Topping.SAUSAGE)
            .addTopping(Topping.ONION)
            .build();

        System.out.println(nyPizza);

        CalzonePizza calzonePizza = new CalzonePizza.Builder()
            .addTopping(Topping.HAM)
            .sauceInside()
            .build();

        System.out.println(calzonePizza);

    }

}
