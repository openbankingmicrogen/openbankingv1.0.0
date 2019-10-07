package cds.services;

import cds.model.ListDirectDebitsP;
import cds.model.ListDirectDebitsResponseWrapper;

public interface ListDirectDebitsI {

    public ListDirectDebitsResponseWrapper execute(ListDirectDebitsP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
