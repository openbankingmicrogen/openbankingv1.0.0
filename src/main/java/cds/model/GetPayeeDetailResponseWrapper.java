package cds.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

public class GetPayeeDetailResponseWrapper {

	private ResponseBankingPayeeById response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public ResponseBankingPayeeById getResponse(){
            return response;
	}
 
	public void setResponse(ResponseBankingPayeeById response){
            this.response=response;
	} 
}
