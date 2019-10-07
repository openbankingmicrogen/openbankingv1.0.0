package cds.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

public class ListAccountsResponseWrapper {

	private ResponseBankingAccountList response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public ResponseBankingAccountList getResponse(){
            return response;
	}
 
	public void setResponse(ResponseBankingAccountList response){
            this.response=response;
	} 
}
