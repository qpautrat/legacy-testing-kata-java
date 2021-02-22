package com.arolla.legacy.testing.quotebot;

public class StubMarketStudy implements MarketStudy {
    @Override
    public double averagePrice(String blog) {
        return 10;
    }
}
