package cds.api;

import cds.model.CommonDiscoveryStatus;
import cds.model.ResponseDiscoveryOutagesList;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import cds.services.GetStatusI;
import cds.model.GetStatusP;
import cds.model.GetStatusResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import cds.services.GetOutagesI;
import cds.model.GetOutagesP;
import cds.model.GetOutagesResponseWrapper;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-07T02:03:35.302Z")

@Controller
public class DiscoveryApiController implements DiscoveryApi {

	@Autowired
	GetOutagesI getOutagesI;


	@Autowired
	GetStatusI getStatusI;


    private static final Logger log = LoggerFactory.getLogger(DiscoveryApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DiscoveryApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ResponseDiscoveryOutagesList> getOutages(@ApiParam(value = "Version of the API end point requested by the client. Must be set to a positive integer. The data holder should respond with the highest supported version between [x-min-v](#request-headers) and [x-v](#request-headers). If the value of [x-min-v](#request-headers) is equal to or higher than the value of [x-v](#request-headers) then the [x-min-v](#request-headers) header should be treated as absent. If all versions requested are not supported then the data holder should respond with a 406 Not Acceptable. See [HTTP Headers](#request-headers)" ,required=true) @RequestHeader(value="x-v", required=true) String xV,@ApiParam(value = "Minimum version of the API end point requested by the client. Must be set to a positive integer if provided. The data holder should respond with the highest supported version between [x-min-v](#request-headers) and [x-v](#request-headers). If all versions requested are not supported then the data holder should respond with a 406 Not Acceptable." ) @RequestHeader(value="x-min-v", required=false) String xMinV) {
        
        GetOutagesResponseWrapper res  = getOutagesI.execute(new GetOutagesP(xV, xMinV));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
}

    public ResponseEntity<CommonDiscoveryStatus> getStatus(@ApiParam(value = "Version of the API end point requested by the client. Must be set to a positive integer. The data holder should respond with the highest supported version between [x-min-v](#request-headers) and [x-v](#request-headers). If the value of [x-min-v](#request-headers) is equal to or higher than the value of [x-v](#request-headers) then the [x-min-v](#request-headers) header should be treated as absent. If all versions requested are not supported then the data holder should respond with a 406 Not Acceptable. See [HTTP Headers](#request-headers)" ,required=true) @RequestHeader(value="x-v", required=true) String xV,@ApiParam(value = "Minimum version of the API end point requested by the client. Must be set to a positive integer if provided. The data holder should respond with the highest supported version between [x-min-v](#request-headers) and [x-v](#request-headers). If all versions requested are not supported then the data holder should respond with a 406 Not Acceptable." ) @RequestHeader(value="x-min-v", required=false) String xMinV) {
        
        GetStatusResponseWrapper res  = getStatusI.execute(new GetStatusP(xV, xMinV));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
	} 
}
