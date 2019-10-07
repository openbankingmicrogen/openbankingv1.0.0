package cds.model;

import org.springframework.util.MultiValueMap;

import org.springframework.util.LinkedMultiValueMap;

public class GetOutagesResponseWrapper {

	private ResponseDiscoveryOutagesList response;

        public MultiValueMap<String, String> getHeaders(){
            final MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
            return map;
	}

	public void setHeaders(){
            
	}
 
	public ResponseDiscoveryOutagesList getResponse(){
            return response;
	}
 
	public void setResponse(ResponseDiscoveryOutagesList response){
            this.response=response;
	} 
}
