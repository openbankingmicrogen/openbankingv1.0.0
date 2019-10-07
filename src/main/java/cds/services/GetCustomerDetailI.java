package cds.services;

import cds.model.GetCustomerDetailP;
import cds.model.GetCustomerDetailResponseWrapper;

public interface GetCustomerDetailI {

    public GetCustomerDetailResponseWrapper execute(GetCustomerDetailP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
