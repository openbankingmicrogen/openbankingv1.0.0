package cds.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

public class GetAccountDetailResponseWrapper {

	private ResponseBankingAccountById response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public ResponseBankingAccountById getResponse(){
            return response;
	}
 
	public void setResponse(ResponseBankingAccountById response){
            this.response=response;
	} 
}
