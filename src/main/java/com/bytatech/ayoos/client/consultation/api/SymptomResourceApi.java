/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.bytatech.ayoos.client.consultation.api;

import com.bytatech.ayoos.client.consultation.model.SymptomDTO;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-16T08:48:40.336+05:30[Asia/Kolkata]")

@Api(value = "SymptomResource", description = "the SymptomResource API")
public interface SymptomResourceApi {

    @ApiOperation(value = "createSymptom", nickname = "createSymptomUsingPOST", notes = "", response = SymptomDTO.class, tags={ "symptom-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SymptomDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/symptoms",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<SymptomDTO> createSymptomUsingPOST(@ApiParam(value = "symptomDTO" ,required=true )  @Valid @RequestBody SymptomDTO symptomDTO);


    @ApiOperation(value = "deleteSymptom", nickname = "deleteSymptomUsingDELETE", notes = "", tags={ "symptom-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/symptoms/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteSymptomUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllSymptoms", nickname = "getAllSymptomsUsingGET", notes = "", response = SymptomDTO.class, responseContainer = "List", tags={ "symptom-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SymptomDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/symptoms",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<SymptomDTO>> getAllSymptomsUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getSymptom", nickname = "getSymptomUsingGET", notes = "", response = SymptomDTO.class, tags={ "symptom-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SymptomDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/symptoms/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<SymptomDTO> getSymptomUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchSymptoms", nickname = "searchSymptomsUsingGET", notes = "", response = SymptomDTO.class, responseContainer = "List", tags={ "symptom-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SymptomDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/symptoms",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<SymptomDTO>> searchSymptomsUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateSymptom", nickname = "updateSymptomUsingPUT", notes = "", response = SymptomDTO.class, tags={ "symptom-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SymptomDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/symptoms",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<SymptomDTO> updateSymptomUsingPUT(@ApiParam(value = "symptomDTO" ,required=true )  @Valid @RequestBody SymptomDTO symptomDTO);

}
