package cds.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

public class GetProductDetailResponseWrapper {

	private ResponseBankingProductById response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public ResponseBankingProductById getResponse(){
            return response;
	}
 
	public void setResponse(ResponseBankingProductById response){
            this.response=response;
	} 
}
