package com.arolla.legacy.testing.quotebot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApplyMarginToMarketStudyTest {

    @Test
    public void it_applies_margin_to_market_price() {
        // Arrange
        double expectedPriceFromMarketStudy = 10;
        double expectedAveragePrice = expectedPriceFromMarketStudy + ApplyMarginToMarketStudy.MARGIN;
        MarketStudy marketStudy = (blog) -> expectedPriceFromMarketStudy;
        String blog = "";
        ApplyMarginToMarketStudy marketStudyWithMargin = new ApplyMarginToMarketStudy(marketStudy);

        // Act
        double averagePrice = marketStudyWithMargin.averagePrice(blog);

        // Assert
        Assertions.assertEquals(
            expectedAveragePrice,
            averagePrice,
            () -> "Average price is " + averagePrice + " instead of " + expectedAveragePrice + ". Is margin applied correctly ? Did you ask from MarketStudyVendor ?"
        );
    }
}
