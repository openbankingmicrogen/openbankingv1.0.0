package cds.services;

import cds.model.ListScheduledPaymentsBulkP;
import cds.model.ListScheduledPaymentsBulkResponseWrapper;

public interface ListScheduledPaymentsBulkI {

    public ListScheduledPaymentsBulkResponseWrapper execute(ListScheduledPaymentsBulkP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
