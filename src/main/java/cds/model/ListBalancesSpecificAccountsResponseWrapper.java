package cds.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

public class ListBalancesSpecificAccountsResponseWrapper {

	private ResponseBankingAccountsBalanceList response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public ResponseBankingAccountsBalanceList getResponse(){
            return response;
	}
 
	public void setResponse(ResponseBankingAccountsBalanceList response){
            this.response=response;
	} 
}
