package se.dala.mtgcard.model;

import se.dala.mtgcard.model.enums.Color;
import se.dala.mtgcard.model.enums.Rarity;

import java.util.*;

public final class Card {
    private final UUID id;
    private String name;
    private List<Color> colors;
    private Rarity rarity;

    protected Card(UUID id, String name, List<Color> colors, Rarity rarity) {
        this.id = id;
        this.name = name;
        this.colors = colors;
        this.rarity = rarity;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public List<Color> getColors() {
        return colors;
    }

    public Color setColor(Color newColor) {
        this.colors.add(newColor);
        return colors.get(colors.size());
    }

    public List<Color> setColors(List<Color> colors) {
        this.colors = colors;
        return colors;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public Rarity setRarity(Rarity rarity) {
        this.rarity = rarity;
        return rarity;
    }
}
