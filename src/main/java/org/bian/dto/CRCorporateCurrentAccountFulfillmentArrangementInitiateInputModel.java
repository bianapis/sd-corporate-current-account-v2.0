package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModel
 */
public class CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModel   {
  private String corporateCurrentAccountServicingSessionReference = null;

  private Object corporateCurrentAccountFulfillmentArrangementInitiateActionRecord = null;

  private String corporateCurrentAccountFulfillmentArrangementInstanceStatus = null;

  private CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord corporateCurrentAccountFulfillmentArrangementInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return corporateCurrentAccountFulfillmentArrangementInitiateActionRecord
  **/

  public Object getCorporateCurrentAccountFulfillmentArrangementInitiateActionRecord() {
    return corporateCurrentAccountFulfillmentArrangementInitiateActionRecord;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementInitiateActionRecord(Object corporateCurrentAccountFulfillmentArrangementInitiateActionRecord) {
    this.corporateCurrentAccountFulfillmentArrangementInitiateActionRecord = corporateCurrentAccountFulfillmentArrangementInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Corporate Current Account Fulfillment Arrangement instance (e.g. initialised, pending, active) 
   * @return corporateCurrentAccountFulfillmentArrangementInstanceStatus
  **/

  public String getCorporateCurrentAccountFulfillmentArrangementInstanceStatus() {
    return corporateCurrentAccountFulfillmentArrangementInstanceStatus;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementInstanceStatus(String corporateCurrentAccountFulfillmentArrangementInstanceStatus) {
    this.corporateCurrentAccountFulfillmentArrangementInstanceStatus = corporateCurrentAccountFulfillmentArrangementInstanceStatus;
  }


  /**
   * Get corporateCurrentAccountFulfillmentArrangementInstanceRecord
   * @return corporateCurrentAccountFulfillmentArrangementInstanceRecord
  **/

  public CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord getCorporateCurrentAccountFulfillmentArrangementInstanceRecord() {
    return corporateCurrentAccountFulfillmentArrangementInstanceRecord;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementInstanceRecord(CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord corporateCurrentAccountFulfillmentArrangementInstanceRecord) {
    this.corporateCurrentAccountFulfillmentArrangementInstanceRecord = corporateCurrentAccountFulfillmentArrangementInstanceRecord;
  }


}

