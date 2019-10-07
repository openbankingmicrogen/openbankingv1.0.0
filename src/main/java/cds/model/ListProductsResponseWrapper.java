package cds.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

public class ListProductsResponseWrapper {

	private ResponseBankingProductList response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public ResponseBankingProductList getResponse(){
            return response;
	}
 
	public void setResponse(ResponseBankingProductList response){
            this.response=response;
	} 
}
