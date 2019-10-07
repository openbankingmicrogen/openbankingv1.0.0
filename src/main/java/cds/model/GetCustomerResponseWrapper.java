package cds.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

public class GetCustomerResponseWrapper {

	private ResponseCommonCustomer response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public ResponseCommonCustomer getResponse(){
            return response;
	}
 
	public void setResponse(ResponseCommonCustomer response){
            this.response=response;
	} 
}
