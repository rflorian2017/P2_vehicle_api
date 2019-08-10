package com.udacity.pricing;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.udacity.pricing.service.PriceException;
import com.udacity.pricing.service.PricingService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PricingControllerTest {
	@Test
    public void getPrice() throws PriceException {
        // Test Price Service returns price of a given Vehicle
        Assert.assertNotNull(PricingService.getPrice(1L));
    }
}
