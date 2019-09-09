package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAccountLienInitiateInputModelAccountLienInstanceRecord;
import org.bian.dto.BQAccountLienInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAccountLienInitiateInputModel
 */
public class BQAccountLienInitiateInputModel   {
  private BQAccountLienInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord corporateCurrentAccountFulfillmentArrangementInstanceRecord = null;

  private String corporateCurrentAccountFulfillmentArrangementInstanceReference = null;

  private Object accountLienInitiateActionRecord = null;

  private BQAccountLienInitiateInputModelAccountLienInstanceRecord accountLienInstanceRecord = null;


  /**
   * Get corporateCurrentAccountFulfillmentArrangementInstanceRecord
   * @return corporateCurrentAccountFulfillmentArrangementInstanceRecord
  **/

  public BQAccountLienInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord getCorporateCurrentAccountFulfillmentArrangementInstanceRecord() {
    return corporateCurrentAccountFulfillmentArrangementInstanceRecord;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementInstanceRecord(BQAccountLienInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord corporateCurrentAccountFulfillmentArrangementInstanceRecord) {
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
   * @return accountLienInitiateActionRecord
  **/

  public Object getAccountLienInitiateActionRecord() {
    return accountLienInitiateActionRecord;
  }

  public void setAccountLienInitiateActionRecord(Object accountLienInitiateActionRecord) {
    this.accountLienInitiateActionRecord = accountLienInitiateActionRecord;
  }


  /**
   * Get accountLienInstanceRecord
   * @return accountLienInstanceRecord
  **/

  public BQAccountLienInitiateInputModelAccountLienInstanceRecord getAccountLienInstanceRecord() {
    return accountLienInstanceRecord;
  }

  public void setAccountLienInstanceRecord(BQAccountLienInitiateInputModelAccountLienInstanceRecord accountLienInstanceRecord) {
    this.accountLienInstanceRecord = accountLienInstanceRecord;
  }


}

