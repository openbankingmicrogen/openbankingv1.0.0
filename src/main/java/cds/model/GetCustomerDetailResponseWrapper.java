package cds.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

public class GetCustomerDetailResponseWrapper {

	private ResponseCommonCustomerDetail response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public ResponseCommonCustomerDetail getResponse(){
            return response;
	}
 
	public void setResponse(ResponseCommonCustomerDetail response){
            this.response=response;
	} 
}
