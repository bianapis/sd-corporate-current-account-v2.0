package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateCurrentAccountFulfillmentArrangementInitiateOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorporateCurrentAccountFulfillmentArrangementInitiateOutputModel
 */
public class CRCorporateCurrentAccountFulfillmentArrangementInitiateOutputModel   {
  private String corporateCurrentAccountFulfillmentArrangementInstanceReference = null;

  private String corporateCurrentAccountFulfillmentArrangementInitiateActionReference = null;

  private Object corporateCurrentAccountFulfillmentArrangementInitiateActionRecord = null;

  private String corporateCurrentAccountFulfillmentArrangementInstanceStatus = null;

  private CRCorporateCurrentAccountFulfillmentArrangementInitiateOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord corporateCurrentAccountFulfillmentArrangementInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return corporateCurrentAccountFulfillmentArrangementInitiateActionReference
  **/

  public String getCorporateCurrentAccountFulfillmentArrangementInitiateActionReference() {
    return corporateCurrentAccountFulfillmentArrangementInitiateActionReference;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementInitiateActionReference(String corporateCurrentAccountFulfillmentArrangementInitiateActionReference) {
    this.corporateCurrentAccountFulfillmentArrangementInitiateActionReference = corporateCurrentAccountFulfillmentArrangementInitiateActionReference;
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

  public CRCorporateCurrentAccountFulfillmentArrangementInitiateOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord getCorporateCurrentAccountFulfillmentArrangementInstanceRecord() {
    return corporateCurrentAccountFulfillmentArrangementInstanceRecord;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementInstanceRecord(CRCorporateCurrentAccountFulfillmentArrangementInitiateOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord corporateCurrentAccountFulfillmentArrangementInstanceRecord) {
    this.corporateCurrentAccountFulfillmentArrangementInstanceRecord = corporateCurrentAccountFulfillmentArrangementInstanceRecord;
  }


}

