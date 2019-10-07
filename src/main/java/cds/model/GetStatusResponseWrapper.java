package cds.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

public class GetStatusResponseWrapper {

	private CommonDiscoveryStatus response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public CommonDiscoveryStatus getResponse(){
            return response;
	}
 
	public void setResponse(CommonDiscoveryStatus response){
            this.response=response;
	} 
}
