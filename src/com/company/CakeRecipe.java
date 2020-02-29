package com.company;

import javax.swing.JOptionPane;

public class CakeRecipe {
    String topping;
    String filling;
    String shape;

    CakeRecipe(String topping, String filling, String shape) {
        setTopping(topping);
        setFilling(filling);
        setShape(shape);
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public void describeCake () {
        String description = "This cake have a " + shape + " shape, delicious " + topping + " as topping, and is filled with " + filling + ".";
        JOptionPane.showMessageDialog(null, description);
    }
}
