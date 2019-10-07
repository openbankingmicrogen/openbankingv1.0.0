package cds.services;

import cds.model.GetPayeeDetailP;
import cds.model.GetPayeeDetailResponseWrapper;

public interface GetPayeeDetailI {

    public GetPayeeDetailResponseWrapper execute(GetPayeeDetailP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
