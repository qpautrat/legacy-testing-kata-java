package com.arolla.legacy.testing.quotebot;

public class SpyQuotePublisher implements QuotePublisherACL {
    private double proposal;

    @Override
    public void publish(double proposal)
    {
        this.proposal = proposal;
    }

    public boolean publishHasBeenCalledWith(double proposal) {
        return this.proposal == proposal;
    }
}
