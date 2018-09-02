package se.dala.mtgcard.model;

import se.dala.mtgcard.model.enums.Rarity;

import java.util.UUID;

public abstract class Card<T extends Card<T>> {
    private final UUID id;
    private Rarity rarity;
    private CardSet set;

    protected Card(UUID id) {
        this.id = id;
    }
}
