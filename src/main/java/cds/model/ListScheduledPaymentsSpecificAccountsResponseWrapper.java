package cds.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

public class ListScheduledPaymentsSpecificAccountsResponseWrapper {

	private ResponseBankingScheduledPaymentsList response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public ResponseBankingScheduledPaymentsList getResponse(){
            return response;
	}
 
	public void setResponse(ResponseBankingScheduledPaymentsList response){
            this.response=response;
	} 
}
