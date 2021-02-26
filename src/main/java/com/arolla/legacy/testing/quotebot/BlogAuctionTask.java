package com.arolla.legacy.testing.quotebot;

import com.arolla.legacy.testing.thirdparty.quotebot.MarketStudyVendor;

import java.util.Calendar;
import java.util.Date;

public class BlogAuctionTask {

	private final MarketStudy marketStudy;
	private final ProposalPublisher proposalPublisher;
	private final ProposalCalculator proposalCalculator;

	public BlogAuctionTask() {
		marketStudy = new MarketStudyACL(new MarketStudyVendor());
		proposalPublisher = new ToRealAdsPlatform();
		proposalCalculator = BlogAuctionTask::basedOnToday;
	}

	public BlogAuctionTask(MarketStudy marketStudy, ProposalPublisher proposalPublisher, ProposalCalculator proposalCalculator) {
		this.marketStudy = marketStudy;
		this.proposalPublisher = proposalPublisher;
		this.proposalCalculator = proposalCalculator;
	}

	@SuppressWarnings("deprecation")
	public void PriceAndPublish(String blog, String mode) {
		double avgPrice = marketStudy.averagePrice(blog);
		// FIXME should actually be +2 not +1
		double proposal = avgPrice + 1;
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
		proposal = this.proposalCalculator.calculate(proposal, timeFactor);
		this.proposalPublisher.publish(proposal);
	}

	private static double basedOnToday(double proposal, double timeFactor) {
		proposal = proposal % 2 == 0 ? 3.14 * proposal : 3.15
				* timeFactor
				* (new Date().getTime() - new Date(2000, Calendar.JANUARY, 1)
						.getTime());
		return proposal;
	}
}
