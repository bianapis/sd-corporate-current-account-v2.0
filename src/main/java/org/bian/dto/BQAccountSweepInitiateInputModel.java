package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAccountSweepInitiateInputModelAccountSweepInstanceRecord;
import org.bian.dto.BQAccountSweepInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAccountSweepInitiateInputModel
 */
public class BQAccountSweepInitiateInputModel   {
  private BQAccountSweepInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord corporateCurrentAccountFulfillmentArrangementInstanceRecord = null;

  private String corporateCurrentAccountFulfillmentArrangementInstanceReference = null;

  private Object accountSweepInitiateActionRecord = null;

  private BQAccountSweepInitiateInputModelAccountSweepInstanceRecord accountSweepInstanceRecord = null;


  /**
   * Get corporateCurrentAccountFulfillmentArrangementInstanceRecord
   * @return corporateCurrentAccountFulfillmentArrangementInstanceRecord
  **/

  public BQAccountSweepInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord getCorporateCurrentAccountFulfillmentArrangementInstanceRecord() {
    return corporateCurrentAccountFulfillmentArrangementInstanceRecord;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementInstanceRecord(BQAccountSweepInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord corporateCurrentAccountFulfillmentArrangementInstanceRecord) {
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
   * @return accountSweepInitiateActionRecord
  **/

  public Object getAccountSweepInitiateActionRecord() {
    return accountSweepInitiateActionRecord;
  }

  public void setAccountSweepInitiateActionRecord(Object accountSweepInitiateActionRecord) {
    this.accountSweepInitiateActionRecord = accountSweepInitiateActionRecord;
  }


  /**
   * Get accountSweepInstanceRecord
   * @return accountSweepInstanceRecord
  **/

  public BQAccountSweepInitiateInputModelAccountSweepInstanceRecord getAccountSweepInstanceRecord() {
    return accountSweepInstanceRecord;
  }

  public void setAccountSweepInstanceRecord(BQAccountSweepInitiateInputModelAccountSweepInstanceRecord accountSweepInstanceRecord) {
    this.accountSweepInstanceRecord = accountSweepInstanceRecord;
  }


}

