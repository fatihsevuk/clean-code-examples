package com.fsoftdev.methods;

/**
 * This kata is published in the link bellow
 * https://github.com/emilybache/GildedRose-Refactoring-Kata
 *
 * Description of kata is in the link bellow
 * http://iamnotmyself.com/2011/02/14/refactor-this-the-gilded-rose-kata/
 *
 */

public class GildedRose {

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                decrementQualityForNormalItems(i);
            } else {
                updateQualityForItemsThatAgeWell(i);
            }

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                updateQualityForExpiredItems(i);
            }
        }
    }

    private void updateQualityForExpiredItems(int i) {
        if (!items[i].name.equals("Aged Brie")) {
            if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                decrementQualityForNormalItems(i);
            } else {
                items[i].quality = items[i].quality - items[i].quality;
            }
        } else {
            incrementQuality(i);
        }
    }

    private void updateQualityForItemsThatAgeWell(int i) {
        incrementQuality(i);
        if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (items[i].sellIn < 11) {
                incrementQuality(i);
            }

            if (items[i].sellIn < 6) {
                incrementQuality(i);
            }
        }
    }

    private void decrementQualityForNormalItems(int i) {
        if (items[i].quality > 0) {
            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].quality = items[i].quality - 1;
            }
        }
    }

    private void incrementQuality(int i) {
        if (items[i].quality < 50) {
            items[i].quality = items[i].quality + 1;
        }
    }


}
