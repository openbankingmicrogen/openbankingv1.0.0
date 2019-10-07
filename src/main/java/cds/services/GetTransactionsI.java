package cds.services;

import cds.model.GetTransactionsP;
import cds.model.GetTransactionsResponseWrapper;

public interface GetTransactionsI {

    public GetTransactionsResponseWrapper execute(GetTransactionsP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
