package cds.services;

import cds.model.ListScheduledPaymentsP;
import cds.model.ListScheduledPaymentsResponseWrapper;

public interface ListScheduledPaymentsI {

    public ListScheduledPaymentsResponseWrapper execute(ListScheduledPaymentsP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
