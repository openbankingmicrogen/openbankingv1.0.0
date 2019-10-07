package cds.services;

import cds.model.ListDirectDebitsBulkP;
import cds.model.ListDirectDebitsBulkResponseWrapper;

public interface ListDirectDebitsBulkI {

    public ListDirectDebitsBulkResponseWrapper execute(ListDirectDebitsBulkP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
