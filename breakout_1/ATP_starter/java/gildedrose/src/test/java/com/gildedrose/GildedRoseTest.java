package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GildedRoseTest {

    @Test
    public void update_item_does_not_change_item_namegit pull() {
        // Arrange
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose sut = new GildedRose(items);

        // Act
        sut.updateQuality();

        // Assert
        assertEquals("foo", sut.items[0].name);
    }
}
