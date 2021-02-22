package com.arolla.legacy.testing.quotebot;

import com.arolla.legacy.testing.thirdparty.quotebot.MarketStudyVendor;
import com.arolla.legacy.testing.thirdparty.quotebot.QuotePublisher;

public class BlogAuctionTask {

	private final MarketStudy marketStudy;
	private final QuotePublisherACL quotePublisher;
	private final ProposalCalculator proposalCalculator;

	public static final int MARGIN = 2;

	public BlogAuctionTask() {
		this.marketStudy = new MarketStudyWithMargin(new MarketStudyVendorACL(new MarketStudyVendor()));
		this.quotePublisher = new QuotePublisherWrapper(QuotePublisher.INSTANCE);
		this.proposalCalculator = new ProposalCalculatorImpl();
	}

	public BlogAuctionTask(MarketStudy marketStudy, QuotePublisherACL quotePublisher, ProposalCalculator proposalCalculator) {
		this.marketStudy = marketStudy;
		this.quotePublisher = quotePublisher;
		this.proposalCalculator = proposalCalculator;
	}

	@SuppressWarnings("deprecation")
	public void PriceAndPublish(String blog, String mode) {
		double proposal = marketStudy.averagePrice(blog);
		double timeFactor = getTimeFactor(mode);
		proposal = this.proposalCalculator.calculate(proposal, timeFactor);
		this.quotePublisher.publish(proposal);
	}

	private double getTimeFactor(String mode) {
		double timeFactor = 1;
		if (mode.equals("SLOW")) {
			timeFactor = 2;
		}
		if (mode.equals("MEDIUM")) {
			timeFactor = 4;
		}
		if (mode.equals("FAST")) {
			timeFactor = 8;
		}
		if (mode.equals("ULTRAFAST")) {
			timeFactor = 13;
		}
		return timeFactor;
	}
}
