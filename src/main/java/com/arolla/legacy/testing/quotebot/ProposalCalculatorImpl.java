package com.arolla.legacy.testing.quotebot;

import java.util.Calendar;
import java.util.Date;

public class ProposalCalculatorImpl implements ProposalCalculator {
    @Override
    public double calculate(double proposal, double timeFactor) {
        proposal = proposal % 2 == 0 ? 3.14 * proposal : 3.15
                * timeFactor
                * (new Date().getTime() - new Date(2000, Calendar.JANUARY, 1)
                .getTime());
        return proposal;
    }
}
