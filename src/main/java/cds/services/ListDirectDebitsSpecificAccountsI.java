package cds.services;

import cds.model.ListDirectDebitsSpecificAccountsP;
import cds.model.ListDirectDebitsSpecificAccountsResponseWrapper;

public interface ListDirectDebitsSpecificAccountsI {

    public ListDirectDebitsSpecificAccountsResponseWrapper execute(ListDirectDebitsSpecificAccountsP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
