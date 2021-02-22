package com.arolla.legacy.testing.quotebot;

public class MockProposalCalculator implements ProposalCalculator {
    @Override
    public double calculate(double proposal, double timeFactor) {
        return proposal;
    }
}
