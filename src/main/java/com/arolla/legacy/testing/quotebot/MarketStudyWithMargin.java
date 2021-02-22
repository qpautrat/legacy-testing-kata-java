package com.arolla.legacy.testing.quotebot;

import com.arolla.legacy.testing.thirdparty.quotebot.MarketStudyVendor;

public class MarketStudyWithMargin implements MarketStudy {
    public static final int MARGIN = 2;
    private final MarketStudy marketStudy;

    public MarketStudyWithMargin(MarketStudy marketStudy) {
        this.marketStudy = marketStudy;
    }

    @Override
    public double averagePrice(String blog) {
        return this.marketStudy.averagePrice(blog) + MARGIN;
    }
}
