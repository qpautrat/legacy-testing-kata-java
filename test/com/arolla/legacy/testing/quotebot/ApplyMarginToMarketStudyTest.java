package com.arolla.legacy.testing.quotebot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApplyMarginToMarketStudyTest {

    @Test
    public void it_applies_margin_to_market_price() {
        // Arrange
        MarketStudy marketStudyVendor = (blog) -> 10;
        String blog = "";
        ApplyMarginToMarketStudy marketStudyWithMargin = new ApplyMarginToMarketStudy(marketStudyVendor);
        double expectedAveragePrice = 12;

        // Act
        double averagePrice = marketStudyWithMargin.averagePrice(blog);

        // Assert
        Assertions.assertEquals(expectedAveragePrice, averagePrice, () -> "Average price is " + averagePrice + " instead of " + expectedAveragePrice + ". Is margin applied correctly ?");
    }
}
