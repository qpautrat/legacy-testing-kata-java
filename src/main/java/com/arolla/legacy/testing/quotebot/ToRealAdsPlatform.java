package com.arolla.legacy.testing.quotebot;

import com.arolla.legacy.testing.thirdparty.quotebot.QuotePublisher;

public class ToRealAdsPlatform implements ProposalPublisher {
    @Override
    public void publish(double proposal) {
        QuotePublisher.INSTANCE.publish(proposal);
    }
}
