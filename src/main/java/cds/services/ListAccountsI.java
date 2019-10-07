package cds.services;

import cds.model.ListAccountsP;
import cds.model.ListAccountsResponseWrapper;

public interface ListAccountsI {

    public ListAccountsResponseWrapper execute(ListAccountsP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
