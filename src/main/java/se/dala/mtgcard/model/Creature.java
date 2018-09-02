package se.dala.mtgcard.model;

import java.util.UUID;

public final class Creature extends Card {
    private final String power;
    private final String toughness;

    public Creature(UUID id, String power, String toughness) {
        super(id);
        this.power = power;
        this.toughness = toughness;
    }
}
