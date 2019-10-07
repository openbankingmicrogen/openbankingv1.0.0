package cds.services;

import cds.model.GetCustomerP;
import cds.model.GetCustomerResponseWrapper;

public interface GetCustomerI {

    public GetCustomerResponseWrapper execute(GetCustomerP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
