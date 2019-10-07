package cds.services;

import cds.model.GetProductDetailP;
import cds.model.GetProductDetailResponseWrapper;

public interface GetProductDetailI {

    public GetProductDetailResponseWrapper execute(GetProductDetailP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
