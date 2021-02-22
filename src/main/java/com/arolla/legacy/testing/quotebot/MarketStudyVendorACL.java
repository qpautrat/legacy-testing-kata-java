package com.arolla.legacy.testing.quotebot;

import com.arolla.legacy.testing.thirdparty.quotebot.MarketStudyVendor;

public class MarketStudyVendorACL implements MarketStudy {

    private final MarketStudyVendor marketStudyVendor;

    public MarketStudyVendorACL(MarketStudyVendor marketStudyVendor) {
        this.marketStudyVendor = marketStudyVendor;
    }

    @Override
    public double averagePrice(String blog) {
        return marketStudyVendor.averagePrice(blog);
    }
}
