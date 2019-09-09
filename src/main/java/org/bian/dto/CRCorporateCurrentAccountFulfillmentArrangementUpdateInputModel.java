package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateCurrentAccountFulfillmentArrangementUpdateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorporateCurrentAccountFulfillmentArrangementUpdateInputModel
 */
public class CRCorporateCurrentAccountFulfillmentArrangementUpdateInputModel   {
  private String corporateCurrentAccountServicingSessionReference = null;

  private String corporateCurrentAccountFulfillmentArrangementInstanceReference = null;

  private CRCorporateCurrentAccountFulfillmentArrangementUpdateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord corporateCurrentAccountFulfillmentArrangementInstanceRecord = null;

  private Object corporateCurrentAccountFulfillmentArrangementUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get corporateCurrentAccountFulfillmentArrangementInstanceRecord
   * @return corporateCurrentAccountFulfillmentArrangementInstanceRecord
  **/

  public CRCorporateCurrentAccountFulfillmentArrangementUpdateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord getCorporateCurrentAccountFulfillmentArrangementInstanceRecord() {
    return corporateCurrentAccountFulfillmentArrangementInstanceRecord;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementInstanceRecord(CRCorporateCurrentAccountFulfillmentArrangementUpdateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord corporateCurrentAccountFulfillmentArrangementInstanceRecord) {
    this.corporateCurrentAccountFulfillmentArrangementInstanceRecord = corporateCurrentAccountFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return corporateCurrentAccountFulfillmentArrangementUpdateActionTaskRecord
  **/

  public Object getCorporateCurrentAccountFulfillmentArrangementUpdateActionTaskRecord() {
    return corporateCurrentAccountFulfillmentArrangementUpdateActionTaskRecord;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementUpdateActionTaskRecord(Object corporateCurrentAccountFulfillmentArrangementUpdateActionTaskRecord) {
    this.corporateCurrentAccountFulfillmentArrangementUpdateActionTaskRecord = corporateCurrentAccountFulfillmentArrangementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

