package cds.services;

import cds.model.ListScheduledPaymentsSpecificAccountsP;
import cds.model.ListScheduledPaymentsSpecificAccountsResponseWrapper;

public interface ListScheduledPaymentsSpecificAccountsI {

    public ListScheduledPaymentsSpecificAccountsResponseWrapper execute(ListScheduledPaymentsSpecificAccountsP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
