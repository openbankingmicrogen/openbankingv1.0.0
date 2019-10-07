package cds.services;

import cds.model.GetStatusP;
import cds.model.GetStatusResponseWrapper;

public interface GetStatusI {

    public GetStatusResponseWrapper execute(GetStatusP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
