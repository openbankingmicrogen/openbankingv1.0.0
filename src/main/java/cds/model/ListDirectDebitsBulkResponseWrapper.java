package cds.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

public class ListDirectDebitsBulkResponseWrapper {

	private ResponseBankingDirectDebitAuthorisationList response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public ResponseBankingDirectDebitAuthorisationList getResponse(){
            return response;
	}
 
	public void setResponse(ResponseBankingDirectDebitAuthorisationList response){
            this.response=response;
	} 
}
