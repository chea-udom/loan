package com.springboot.loan.utils;

import com.springboot.loan.models.CustomerModel;
import com.springboot.loan.models.DealerModel;
import com.springboot.loan.models.PersonModel;

public class PersonUtils {
    private static final String CUSTOMER_PREFIX = "cus";
    private static final String DEALER_PREFIX = "cus";

    public static String getPrefix(PersonModel person) {
        String prefix = "";
        if (person instanceof CustomerModel) {
            prefix = CUSTOMER_PREFIX;
        } else if (person instanceof DealerModel) {
            prefix = DEALER_PREFIX;
        }
        return prefix;
    }
}
