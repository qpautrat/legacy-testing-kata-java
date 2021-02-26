package com.arolla.legacy.testing.quotebot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlogAuctionTaskTest {

    @Test
    public void it_prices_and_publishes_proposals()
    {
        // Arrange
        SpyProposalPublisher spyProposalPublisher = new SpyProposalPublisher();
        StubMarketStudy stubMarketStudy = new StubMarketStudy();
        BlogAuctionTask blogAuctionTask = new BlogAuctionTask(stubMarketStudy, spyProposalPublisher, (proposalBase, timeFactor) -> proposalBase);
        String blog = "";
        String mode = "";
        double expectedProposal = 11;

        // Act
        blogAuctionTask.PriceAndPublish(blog, mode);

        // Assert
        Assertions.assertTrue(spyProposalPublisher.publishHasBeenCalledWith(expectedProposal), () -> "published with " + spyProposalPublisher.proposal + " instead of " + expectedProposal);
    }
}