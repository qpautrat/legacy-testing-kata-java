package com.arolla.legacy.testing.quotebot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BlogAuctionTaskTest
{
    @Test
    public void it_prices_and_publishes_proposal()
    {
        // Arrange
        SpyMarketStudy marketStudy = new SpyMarketStudy();
        SpyQuotePublisher quotePublisher = new SpyQuotePublisher();
        MockProposalCalculator proposalCalculator = new MockProposalCalculator();
        BlogAuctionTask blogAuctionTask = new BlogAuctionTask(marketStudy, quotePublisher, proposalCalculator);
        String blog = "";
        String mode = "";

        // Act
        blogAuctionTask.PriceAndPublish(blog, mode);

        // Assert
        Assertions.assertTrue(marketStudy.averagePriceHasBeenCalledWith(""));
        Assertions.assertTrue(quotePublisher.publishHasBeenCalledWith(0));
    }
}