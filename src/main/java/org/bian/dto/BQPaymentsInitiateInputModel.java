package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentsInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQPaymentsInitiateInputModelPaymentsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPaymentsInitiateInputModel
 */
public class BQPaymentsInitiateInputModel   {
  private BQPaymentsInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord corporateCurrentAccountFulfillmentArrangementInstanceRecord = null;

  private String corporateCurrentAccountFulfillmentArrangementInstanceReference = null;

  private Object paymentsInitiateActionRecord = null;

  private BQPaymentsInitiateInputModelPaymentsInstanceRecord paymentsInstanceRecord = null;


  /**
   * Get corporateCurrentAccountFulfillmentArrangementInstanceRecord
   * @return corporateCurrentAccountFulfillmentArrangementInstanceRecord
  **/

  public BQPaymentsInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord getCorporateCurrentAccountFulfillmentArrangementInstanceRecord() {
    return corporateCurrentAccountFulfillmentArrangementInstanceRecord;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementInstanceRecord(BQPaymentsInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord corporateCurrentAccountFulfillmentArrangementInstanceRecord) {
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
   * @return paymentsInitiateActionRecord
  **/

  public Object getPaymentsInitiateActionRecord() {
    return paymentsInitiateActionRecord;
  }

  public void setPaymentsInitiateActionRecord(Object paymentsInitiateActionRecord) {
    this.paymentsInitiateActionRecord = paymentsInitiateActionRecord;
  }


  /**
   * Get paymentsInstanceRecord
   * @return paymentsInstanceRecord
  **/

  public BQPaymentsInitiateInputModelPaymentsInstanceRecord getPaymentsInstanceRecord() {
    return paymentsInstanceRecord;
  }

  public void setPaymentsInstanceRecord(BQPaymentsInitiateInputModelPaymentsInstanceRecord paymentsInstanceRecord) {
    this.paymentsInstanceRecord = paymentsInstanceRecord;
  }


}

