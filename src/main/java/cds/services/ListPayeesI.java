package cds.services;

import cds.model.ListPayeesP;
import cds.model.ListPayeesResponseWrapper;

public interface ListPayeesI {

    public ListPayeesResponseWrapper execute(ListPayeesP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
