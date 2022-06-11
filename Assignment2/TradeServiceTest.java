package com.citiustech.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;

import trade.Region;
import trade.RegionalDao;
import trade.RegionalDaoManager;
import trade.TradeService;

public class TradeServiceTest {

	// LONDON:121456903
	// NEWYORK : 12232140
	// TOKYO : 12345678

	@Mock
	private TradeService td = new TradeService();

	@Test
	public void getRegionShouldBeTrue() {

		boolean region;

		region = (Region.TOKYO).equals(td.getTradeRegion(123456903));
		region = (Region.NEWYORK).equals(td.getTradeRegion(12236547));
		region = (Region.LONDON).equals(td.getTradeRegion(121456903));

	}
	


}
