package com.arolla.legacy.testing.quotebot;

import com.arolla.legacy.testing.thirdparty.quotebot.MarketStudyVendor;

public class MarketStudyACL implements MarketStudy {
    private final MarketStudyVendor marketStudyVendor;

    public MarketStudyACL(MarketStudyVendor marketStudyVendor) {
        this.marketStudyVendor = marketStudyVendor;
    }

    @Override
    public double averagePrice(String blog) {
        return this.marketStudyVendor.averagePrice(blog);
    }
}
