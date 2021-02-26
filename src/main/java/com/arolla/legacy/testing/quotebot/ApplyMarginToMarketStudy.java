package com.arolla.legacy.testing.quotebot;

public class ApplyMarginToMarketStudy implements MarketStudy {
    public static final double MARGIN = 2;

    private final MarketStudy marketStudy;

    public ApplyMarginToMarketStudy(MarketStudy marketStudy) {
        this.marketStudy = marketStudy;
    }

    @Override
    public double averagePrice(String blog) {
        return this.marketStudy.averagePrice(blog) + ApplyMarginToMarketStudy.MARGIN;
    }
}
