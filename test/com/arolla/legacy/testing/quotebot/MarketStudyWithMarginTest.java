package com.arolla.legacy.testing.quotebot;

import com.arolla.legacy.testing.thirdparty.quotebot.MarketStudyVendor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarketStudyWithMarginTest {

    @Test
    void it_adds_margin_to_average_price_on_the_market() {
        // Arrange
        StubMarketStudy marketStudyVendor = new StubMarketStudy();
        MarketStudyWithMargin marketStudyWithMargin = new MarketStudyWithMargin(marketStudyVendor);

        // Act
        String blog = "";
        double averagePrice = marketStudyWithMargin.averagePrice(blog);

        // Assert
        Assertions.assertEquals(12, averagePrice);
    }
}