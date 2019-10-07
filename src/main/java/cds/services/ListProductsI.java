package cds.services;

import cds.model.ListProductsP;
import cds.model.ListProductsResponseWrapper;

public interface ListProductsI {

    public ListProductsResponseWrapper execute(ListProductsP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
