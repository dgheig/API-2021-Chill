package ch.heigvd.api.chill.domain.dgheig;

import ch.heigvd.api.chill.domain.IProduct;

import java.math.BigDecimal;

public class HotChocolate implements IProduct {

    public final static String NAME = "hot chocolate";
    public final static BigDecimal PRICE = new BigDecimal(6);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}