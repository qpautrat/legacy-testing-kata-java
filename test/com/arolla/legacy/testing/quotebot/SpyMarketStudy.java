package com.arolla.legacy.testing.quotebot;

public class SpyMarketStudy implements MarketStudy {
    private String blog;

    @Override
    public double averagePrice(String blog) {
        this.blog = blog;

        return 0;
    }

    public boolean averagePriceHasBeenCalledWith(String blog) {
        return blog.equals(this.blog);
    }
}
