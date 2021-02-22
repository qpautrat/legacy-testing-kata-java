package com.arolla.legacy.testing.quotebot;

import com.arolla.legacy.testing.thirdparty.quotebot.QuotePublisher;

public class QuotePublisherWrapper implements QuotePublisherACL {
    private final QuotePublisher quotePublisher;

    public QuotePublisherWrapper(QuotePublisher quotePublisher) {
        this.quotePublisher = quotePublisher;
    }

    @Override
    public void publish(double proposal) {
        this.quotePublisher.publish(proposal);
    }
}
