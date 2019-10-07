package cds.exception;

import java.util.HashMap;
import java.util.Map;

import cds.exception.ApiExceptionResponse;
import cds.exception.ErrorStatusCode;
import cds.model.*;

public class MetaData {

	public static final Map<String,Map<ErrorStatusCode, ApiExceptionResponse>> apiExceptions;
	
	static {		
		apiExceptions = new HashMap<String,Map<ErrorStatusCode, ApiExceptionResponse>>();

		Map<ErrorStatusCode, ApiExceptionResponse> responses; 
		try {
		
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(422),ApiExceptionResponse.getInstance(422,ResponseErrorList.class,"The request was well formed but was unable to be processed due to business logic specific to the request"));
		 
		 apiExceptions.put("listBalancesSpecificAccounts",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(422),ApiExceptionResponse.getInstance(422,ResponseErrorList.class,"The request was well formed but was unable to be processed due to business logic specific to the request"));
		 
		 apiExceptions.put("listDirectDebitsSpecificAccounts",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(422),ApiExceptionResponse.getInstance(422,ResponseErrorList.class,"The request was well formed but was unable to be processed due to business logic specific to the request"));
		 
		 apiExceptions.put("listScheduledPaymentsSpecificAccounts",responses);
		 
		
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
}
