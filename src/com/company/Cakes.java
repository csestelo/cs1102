package com.company;

public class Cakes {
    static public void main (String[] args) {
        CakeRecipe roundedStrawberryCake = new CakeRecipe("strawberry", "marshmallow", "rounded");
        CakeRecipe squareBelgianChocolateCake = new CakeRecipe("Belgian Chocolate", "condensed milk", "square");
        CakeRecipe rectangularBananaCake = new CakeRecipe("Banana in syrup", "condensed milk", "rectangular");


        roundedStrawberryCake.describeCake();
        squareBelgianChocolateCake.describeCake();
        rectangularBananaCake.describeCake();
    }
}
