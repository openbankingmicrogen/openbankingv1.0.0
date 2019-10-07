package cds.services;

import cds.model.GetAccountDetailP;
import cds.model.GetAccountDetailResponseWrapper;

public interface GetAccountDetailI {

    public GetAccountDetailResponseWrapper execute(GetAccountDetailP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
