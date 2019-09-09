package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateCurrentAccountFulfillmentArrangementControlOutputModel
 */
public class CRCorporateCurrentAccountFulfillmentArrangementControlOutputModel   {
  private String corporateCurrentAccountFulfillmentArrangementControlActionTaskReference = null;

  private Object corporateCurrentAccountFulfillmentArrangementControlActionTaskRecord = null;

  private String corporateCurrentAccountFulfillmentArrangementControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Corporate Current Account Fulfillment Arrangement instance control processing service call 
   * @return corporateCurrentAccountFulfillmentArrangementControlActionTaskReference
  **/

  public String getCorporateCurrentAccountFulfillmentArrangementControlActionTaskReference() {
    return corporateCurrentAccountFulfillmentArrangementControlActionTaskReference;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementControlActionTaskReference(String corporateCurrentAccountFulfillmentArrangementControlActionTaskReference) {
    this.corporateCurrentAccountFulfillmentArrangementControlActionTaskReference = corporateCurrentAccountFulfillmentArrangementControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return corporateCurrentAccountFulfillmentArrangementControlActionTaskRecord
  **/

  public Object getCorporateCurrentAccountFulfillmentArrangementControlActionTaskRecord() {
    return corporateCurrentAccountFulfillmentArrangementControlActionTaskRecord;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementControlActionTaskRecord(Object corporateCurrentAccountFulfillmentArrangementControlActionTaskRecord) {
    this.corporateCurrentAccountFulfillmentArrangementControlActionTaskRecord = corporateCurrentAccountFulfillmentArrangementControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return corporateCurrentAccountFulfillmentArrangementControlActionResponse
  **/

  public String getCorporateCurrentAccountFulfillmentArrangementControlActionResponse() {
    return corporateCurrentAccountFulfillmentArrangementControlActionResponse;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementControlActionResponse(String corporateCurrentAccountFulfillmentArrangementControlActionResponse) {
    this.corporateCurrentAccountFulfillmentArrangementControlActionResponse = corporateCurrentAccountFulfillmentArrangementControlActionResponse;
  }


}

