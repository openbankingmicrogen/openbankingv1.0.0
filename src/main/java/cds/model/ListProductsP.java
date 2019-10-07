package cds.model;

import cds.model.ResponseBankingProductList;

public class ListProductsP {

    private String effective;
    private String updatedSince;
    private String brand;
    private String productCategory;
    private int page;
    private int pageSize;
    private String xV;
    private String xMinV;

    public ListProductsP() {

    }

    public ListProductsP(String effective,String updatedSince,String brand,String productCategory,int page,int pageSize,String xV,String xMinV) {
        this.effective = effective;
        this.updatedSince = updatedSince;
        this.brand = brand;
        this.productCategory = productCategory;
        this.page = page;
        this.pageSize = pageSize;
        this.xV = xV;
        this.xMinV = xMinV;
    }

    public String getEffective () {
        return effective;
    }

    public void setEffective (String effective) {
        this.effective = effective;
    }
    public String getUpdatedSince () {
        return updatedSince;
    }

    public void setUpdatedSince (String updatedSince) {
        this.updatedSince = updatedSince;
    }
    public String getBrand () {
        return brand;
    }

    public void setBrand (String brand) {
        this.brand = brand;
    }
    public String getProductCategory () {
        return productCategory;
    }

    public void setProductCategory (String productCategory) {
        this.productCategory = productCategory;
    }
    public int getPage () {
        return page;
    }

    public void setPage (int page) {
        this.page = page;
    }
    public int getPageSize () {
        return pageSize;
    }

    public void setPageSize (int pageSize) {
        this.pageSize = pageSize;
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
