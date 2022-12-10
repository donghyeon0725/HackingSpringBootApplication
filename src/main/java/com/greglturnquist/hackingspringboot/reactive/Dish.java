package com.greglturnquist.hackingspringboot.reactive;

public class Dish {
    private final String description;
    private boolean delivered = false;

    Dish(String description) {
        this.description = description;
    }

    public static Dish deliver(Dish dish) {
        Dish deliveredDish = new Dish(dish.description);
        deliveredDish.delivered = true;
        return deliveredDish;
    }

    public String getDescription() {
        return description;
    }

    public Dish setDelivered(boolean delivered) {
        this.delivered = delivered;
        return this;
    }

    public boolean isDelivered() {
        return delivered;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "description='" + description + '\'' +
                ", delivered=" + delivered +
                '}';
    }
}
