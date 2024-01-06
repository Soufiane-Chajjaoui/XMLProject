package com.example.merise.MCDToJaxB;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class MyBigDecimalAdapter extends XmlAdapter<String , BigDecimal> {
    @Override
    public BigDecimal unmarshal(String value) {
        // Implement custom logic to convert the XML value to BigDecimal
        BigDecimal convertedValue = new BigDecimal(value);

        // Apply additional validation based on XML Schema constraints
        validate(convertedValue);

        return convertedValue;
    }

    @Override
    public String marshal(BigDecimal value) {
        // Implement custom logic to convert the BigDecimal value to a String
        DecimalFormat df = new DecimalFormat("#.00");

        return df.format(value);
    }

    public void validate(BigDecimal value){

        BigDecimal minInclusive = new BigDecimal("10");
        BigDecimal maxInclusive = new BigDecimal("20");

        int totalDigits = 4 ;
        int fractionDigits = 2 ;

        if (value.compareTo(minInclusive) < 0 || value.compareTo(maxInclusive) > 0){
            throw new IllegalArgumentException("Value must be between 10 and 20 (inclusive).");
        }
        if (value.scale() > fractionDigits || value.precision() > totalDigits) {
            throw new IllegalArgumentException("Invalid totalDigits or fractionDigits.");
        }
    }
}
