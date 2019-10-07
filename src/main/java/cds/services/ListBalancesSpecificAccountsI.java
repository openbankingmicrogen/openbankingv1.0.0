package cds.services;

import cds.model.ListBalancesSpecificAccountsP;
import cds.model.ListBalancesSpecificAccountsResponseWrapper;

public interface ListBalancesSpecificAccountsI {

    public ListBalancesSpecificAccountsResponseWrapper execute(ListBalancesSpecificAccountsP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
