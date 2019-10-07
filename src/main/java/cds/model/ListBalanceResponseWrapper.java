package cds.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

public class ListBalanceResponseWrapper {

	private ResponseBankingAccountsBalanceById response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public ResponseBankingAccountsBalanceById getResponse(){
            return response;
	}
 
	public void setResponse(ResponseBankingAccountsBalanceById response){
            this.response=response;
	} 
}
