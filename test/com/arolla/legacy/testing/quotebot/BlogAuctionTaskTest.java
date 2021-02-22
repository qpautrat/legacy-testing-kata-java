package com.arolla.legacy.testing.quotebot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlogAuctionTaskTest {

    @Test
    public void it_prices_and_publishes_proposals()
    {
        // Arrange
        BlogAuctionTask blogAuctionTask = new BlogAuctionTask();
        String blog = "";
        String mode = "";

        // Act
        blogAuctionTask.PriceAndPublish(blog, mode);

        // Assert
        Assertions.assertTrue(false);
    }
}