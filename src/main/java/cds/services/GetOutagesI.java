package cds.services;

import cds.model.GetOutagesP;
import cds.model.GetOutagesResponseWrapper;

public interface GetOutagesI {

    public GetOutagesResponseWrapper execute(GetOutagesP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
