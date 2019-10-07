package cds.services;

import cds.model.ListBalancesBulkP;
import cds.model.ListBalancesBulkResponseWrapper;

public interface ListBalancesBulkI {

    public ListBalancesBulkResponseWrapper execute(ListBalancesBulkP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
