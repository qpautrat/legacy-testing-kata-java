package com.arolla.legacy.testing.quotebot;

public class ApplyMarginToMarketStudy implements MarketStudy {
    private final MarketStudy marketStudy;

    public ApplyMarginToMarketStudy(MarketStudy marketStudy) {
        this.marketStudy = marketStudy;
    }

    @Override
    public double averagePrice(String blog) {
        return this.marketStudy.averagePrice(blog) + 2;
    }
}
