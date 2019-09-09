package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIssuedDeviceInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQIssuedDeviceInitiateInputModel
 */
public class BQIssuedDeviceInitiateInputModel   {
  private BQIssuedDeviceInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord corporateCurrentAccountFulfillmentArrangementInstanceRecord = null;

  private String corporateCurrentAccountFulfillmentArrangementInstanceReference = null;

  private Object issuedDeviceInitiateActionRecord = null;

  private BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecord issuedDeviceInstanceRecord = null;


  /**
   * Get corporateCurrentAccountFulfillmentArrangementInstanceRecord
   * @return corporateCurrentAccountFulfillmentArrangementInstanceRecord
  **/

  public BQIssuedDeviceInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord getCorporateCurrentAccountFulfillmentArrangementInstanceRecord() {
    return corporateCurrentAccountFulfillmentArrangementInstanceRecord;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementInstanceRecord(BQIssuedDeviceInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord corporateCurrentAccountFulfillmentArrangementInstanceRecord) {
    this.corporateCurrentAccountFulfillmentArrangementInstanceRecord = corporateCurrentAccountFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Corporate Current Account Fulfillment Arrangement instance 
   * @return corporateCurrentAccountFulfillmentArrangementInstanceReference
  **/

  public String getCorporateCurrentAccountFulfillmentArrangementInstanceReference() {
    return corporateCurrentAccountFulfillmentArrangementInstanceReference;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementInstanceReference(String corporateCurrentAccountFulfillmentArrangementInstanceReference) {
    this.corporateCurrentAccountFulfillmentArrangementInstanceReference = corporateCurrentAccountFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return issuedDeviceInitiateActionRecord
  **/

  public Object getIssuedDeviceInitiateActionRecord() {
    return issuedDeviceInitiateActionRecord;
  }

  public void setIssuedDeviceInitiateActionRecord(Object issuedDeviceInitiateActionRecord) {
    this.issuedDeviceInitiateActionRecord = issuedDeviceInitiateActionRecord;
  }


  /**
   * Get issuedDeviceInstanceRecord
   * @return issuedDeviceInstanceRecord
  **/

  public BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecord getIssuedDeviceInstanceRecord() {
    return issuedDeviceInstanceRecord;
  }

  public void setIssuedDeviceInstanceRecord(BQIssuedDeviceInitiateInputModelIssuedDeviceInstanceRecord issuedDeviceInstanceRecord) {
    this.issuedDeviceInstanceRecord = issuedDeviceInstanceRecord;
  }


}

