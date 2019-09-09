package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateCurrentAccountFulfillmentArrangementControlInputModelCorporateCurrentAccountFulfillmentArrangementControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCorporateCurrentAccountFulfillmentArrangementControlInputModel
 */
public class CRCorporateCurrentAccountFulfillmentArrangementControlInputModel   {
  private String corporateCurrentAccountServicingSessionReference = null;

  private String corporateCurrentAccountFulfillmentArrangementInstanceReference = null;

  private Object corporateCurrentAccountFulfillmentArrangementControlActionTaskRecord = null;

  private CRCorporateCurrentAccountFulfillmentArrangementControlInputModelCorporateCurrentAccountFulfillmentArrangementControlActionRequest corporateCurrentAccountFulfillmentArrangementControlActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return corporateCurrentAccountServicingSessionReference
  **/

  public String getCorporateCurrentAccountServicingSessionReference() {
    return corporateCurrentAccountServicingSessionReference;
  }

  public void setCorporateCurrentAccountServicingSessionReference(String corporateCurrentAccountServicingSessionReference) {
    this.corporateCurrentAccountServicingSessionReference = corporateCurrentAccountServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Corporate Current Account Fulfillment Arrangement instance 
   * @return corporateCurrentAccountFulfillmentArrangementInstanceReference
  **/

  public String getCorporateCurrentAccountFulfillmentArrangementInstanceReference() {
    return corporateCurrentAccountFulfillmentArrangementInstanceReference;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementInstanceReference(String corporateCurrentAccountFulfillmentArrangementInstanceReference) {
    this.corporateCurrentAccountFulfillmentArrangementInstanceReference = corporateCurrentAccountFulfillmentArrangementInstanceReference;
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
   * Get corporateCurrentAccountFulfillmentArrangementControlActionRequest
   * @return corporateCurrentAccountFulfillmentArrangementControlActionRequest
  **/

  public CRCorporateCurrentAccountFulfillmentArrangementControlInputModelCorporateCurrentAccountFulfillmentArrangementControlActionRequest getCorporateCurrentAccountFulfillmentArrangementControlActionRequest() {
    return corporateCurrentAccountFulfillmentArrangementControlActionRequest;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementControlActionRequest(CRCorporateCurrentAccountFulfillmentArrangementControlInputModelCorporateCurrentAccountFulfillmentArrangementControlActionRequest corporateCurrentAccountFulfillmentArrangementControlActionRequest) {
    this.corporateCurrentAccountFulfillmentArrangementControlActionRequest = corporateCurrentAccountFulfillmentArrangementControlActionRequest;
  }


}

