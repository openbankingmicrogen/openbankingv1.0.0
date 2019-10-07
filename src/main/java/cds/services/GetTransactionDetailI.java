package cds.services;

import cds.model.GetTransactionDetailP;
import cds.model.GetTransactionDetailResponseWrapper;

public interface GetTransactionDetailI {

    public GetTransactionDetailResponseWrapper execute(GetTransactionDetailP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
