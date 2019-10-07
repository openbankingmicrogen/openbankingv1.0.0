package cds.services.impl;
 
import java.util.*;
 
import cds.model.GetPayeeDetailP;
import cds.model.GetPayeeDetailResponseWrapper;
import cds.services.GetPayeeDetailI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class GetPayeeDetailImpl implements GetPayeeDetailI {
 
    private static final Log logger = LogFactory.getLog(GetPayeeDetailImpl.class);
   
    public GetPayeeDetailResponseWrapper reliable(GetPayeeDetailP pojo){ 
		//TODO
		return new GetPayeeDetailResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public GetPayeeDetailResponseWrapper execute(GetPayeeDetailP requestParams){
        //TODO
        return new GetPayeeDetailResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
