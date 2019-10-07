package cds.model;

import cds.model.ResponseDiscoveryOutagesList;

public class GetOutagesP {

    private String xV;
    private String xMinV;

    public GetOutagesP() {

    }

    public GetOutagesP(String xV,String xMinV) {
        this.xV = xV;
        this.xMinV = xMinV;
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
