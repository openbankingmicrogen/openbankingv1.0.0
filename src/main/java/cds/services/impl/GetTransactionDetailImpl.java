package cds.services.impl;
 
import java.util.*;
 
import cds.model.GetTransactionDetailP;
import cds.model.GetTransactionDetailResponseWrapper;
import cds.services.GetTransactionDetailI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class GetTransactionDetailImpl implements GetTransactionDetailI {
 
    private static final Log logger = LogFactory.getLog(GetTransactionDetailImpl.class);
   
    public GetTransactionDetailResponseWrapper reliable(GetTransactionDetailP pojo){ 
		//TODO
		return new GetTransactionDetailResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public GetTransactionDetailResponseWrapper execute(GetTransactionDetailP requestParams){
        //TODO
        return new GetTransactionDetailResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
