package cds.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

public class ListPayeesResponseWrapper {

	private ResponseBankingPayeeList response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public ResponseBankingPayeeList getResponse(){
            return response;
	}
 
	public void setResponse(ResponseBankingPayeeList response){
            this.response=response;
	} 
}
