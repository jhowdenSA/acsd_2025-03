package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GildedRoseTest {

    @Test
    public void test_if_given_name_persists_after_updating_quality() {
        // Arrange
        GildedRose sut = createGildedRoseWithItem(0, 0);

        // Act
        sut.updateQuality();

        // Assert
        assertEquals("foo", sut.items[0].name);
    }

    @Test
    public void test_if_quality_decreases_twice_as_fast_after_sellin_is_zero(){
        GildedRose sut = createGildedRoseWithItem(0, 10);

        sut.updateQuality();

        assertEquals(8,  sut.items[0].quality);
    }

    private static GildedRose createGildedRoseWithItem(int sellIn, int quality) {
        Item[] items = new Item[] { new Item("foo", sellIn, quality) };
        GildedRose sut = new GildedRose(items);
        return sut;
    }

    @Test
    public void test_if_quality_decreases_once_at_end_of_day(){
        GildedRose sut = createGildedRoseWithItem(5, 10);

        sut.updateQuality();

        assertEquals(9,  sut.items[0].quality);
    }

//    @Test
//    public void test_if_quality_is_not_greater_than_fifty(){
//        GildedRose sut = createGildedRoseWithItem(5, 100);
//        sut.updateQuality();
//        assertEquals( 50, sut.items[0].quality, "Quality should be less than 50");
//    }

}
