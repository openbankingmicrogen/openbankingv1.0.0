package cds.model;

import cds.model.ResponseBankingProductById;

public class GetProductDetailP {

    private String productId;
    private String xV;
    private String xMinV;

    public GetProductDetailP() {

    }

    public GetProductDetailP(String productId,String xV,String xMinV) {
        this.productId = productId;
        this.xV = xV;
        this.xMinV = xMinV;
    }

    public String getProductId () {
        return productId;
    }

    public void setProductId (String productId) {
        this.productId = productId;
    }
    public String getXV () {
        return xV;
    }

    public void setXV (String xV) {
        this.xV = xV;
    }
    public String getXMinV () {
        return xMinV;
    }

    public void setXMinV (String xMinV) {
        this.xMinV = xMinV;
    }

}
