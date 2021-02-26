package com.arolla.legacy.testing.quotebot;

public class SpyProposalPublisher implements ProposalPublisher {
    public double proposal;

    public boolean publishHasBeenCalledWith(double proposal) {
        return this.proposal == proposal;
    }

    @Override
    public void publish(double proposal) {
        this.proposal = proposal;
    }
}
