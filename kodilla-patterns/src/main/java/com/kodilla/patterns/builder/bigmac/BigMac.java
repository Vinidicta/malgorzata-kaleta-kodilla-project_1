package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMac {
    private String roll;
    private String burgers;
    private String sauce;
    private List<String> ingredients;

    private BigMac(String roll, String burgers, String sauce, List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public static class BigMacBuilder {
        private String roll;
        private String burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigMacBuilder withStandardRoll() {
            this.roll = "standard";
            return this;
        }

        public BigMacBuilder withRollWithoutSesame() {
            this.roll = "without sesame";
            return this;
        }

        public BigMacBuilder withOneBurger() {
            this.burgers = "one";
            return this;
        }

        public BigMacBuilder withDoubleBurger() {
            this.burgers = "double";
            return this;
        }

        public BigMacBuilder withStandardSauce() {
            this.sauce = "standard";
            return this;
        }

        public BigMacBuilder withThousandIslandSauce() {
            this.sauce = "thousand island";
            return this;
        }

        public BigMacBuilder withBBQSauce() {
            this.sauce = "BBQ";
            return this;
        }

        public BigMacBuilder withLettuce() {
            this.ingredients.add("lettuce");
            return this;
        }

        public BigMacBuilder withOnion() {
            this.ingredients.add("onion");
            return this;
        }

        public BigMacBuilder withBacon() {
            this.ingredients.add("bacon");
            return this;
        }

        public BigMacBuilder withPickle() {
            this.ingredients.add("pickle");
            return this;
        }

        public BigMacBuilder withChiliPepper() {
            this.ingredients.add("chili pepper");
            return this;
        }

        public BigMacBuilder withMushroom() {
            this.ingredients.add("mushroom");
            return this;
        }

        public BigMacBuilder withShrimps() {
            this.ingredients.add("shrimps");
            return this;
        }

        public BigMacBuilder withCheese() {
            this.ingredients.add("cheese");
            return this;
        }

        public BigMac build() {
            if (roll == null) {
                throw new IllegalStateException("Roll not set");
            }
            if (burgers == null) {
                throw new IllegalStateException("Burgers not set");
            }
            if (sauce == null) {
                throw new IllegalStateException("Sauce not set");
            }
            return new BigMac(roll, burgers, sauce, ingredients);
        }
    }

    public String getRoll() {
        return roll;
    }

    public String getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "roll='" + roll + '\'' +
                ", burgers='" + burgers + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
