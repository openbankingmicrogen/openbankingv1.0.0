package cds.services;

import cds.model.ListBalanceP;
import cds.model.ListBalanceResponseWrapper;

public interface ListBalanceI {

    public ListBalanceResponseWrapper execute(ListBalanceP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
