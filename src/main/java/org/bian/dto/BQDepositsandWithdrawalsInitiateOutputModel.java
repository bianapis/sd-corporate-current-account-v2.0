package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositsandWithdrawalsInitiateOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDepositsandWithdrawalsInitiateOutputModel
 */
public class BQDepositsandWithdrawalsInitiateOutputModel   {
  private BQDepositsandWithdrawalsInitiateOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord corporateCurrentAccountFulfillmentArrangementInstanceRecord = null;

  private String depositsandWithdrawalsInstanceReference = null;

  private String depositsandWithdrawalsInitiateActionReference = null;

  private Object depositsandWithdrawalsInitiateActionRecord = null;

  private String depositsandWithdrawalsInstanceStatus = null;


  /**
   * Get corporateCurrentAccountFulfillmentArrangementInstanceRecord
   * @return corporateCurrentAccountFulfillmentArrangementInstanceRecord
  **/

  public BQDepositsandWithdrawalsInitiateOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord getCorporateCurrentAccountFulfillmentArrangementInstanceRecord() {
    return corporateCurrentAccountFulfillmentArrangementInstanceRecord;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementInstanceRecord(BQDepositsandWithdrawalsInitiateOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord corporateCurrentAccountFulfillmentArrangementInstanceRecord) {
    this.corporateCurrentAccountFulfillmentArrangementInstanceRecord = corporateCurrentAccountFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Deposits and Withdrawals instance 
   * @return depositsandWithdrawalsInstanceReference
  **/

  public String getDepositsandWithdrawalsInstanceReference() {
    return depositsandWithdrawalsInstanceReference;
  }

  public void setDepositsandWithdrawalsInstanceReference(String depositsandWithdrawalsInstanceReference) {
    this.depositsandWithdrawalsInstanceReference = depositsandWithdrawalsInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return depositsandWithdrawalsInitiateActionReference
  **/

  public String getDepositsandWithdrawalsInitiateActionReference() {
    return depositsandWithdrawalsInitiateActionReference;
  }

  public void setDepositsandWithdrawalsInitiateActionReference(String depositsandWithdrawalsInitiateActionReference) {
    this.depositsandWithdrawalsInitiateActionReference = depositsandWithdrawalsInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return depositsandWithdrawalsInitiateActionRecord
  **/

  public Object getDepositsandWithdrawalsInitiateActionRecord() {
    return depositsandWithdrawalsInitiateActionRecord;
  }

  public void setDepositsandWithdrawalsInitiateActionRecord(Object depositsandWithdrawalsInitiateActionRecord) {
    this.depositsandWithdrawalsInitiateActionRecord = depositsandWithdrawalsInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Deposits and Withdrawals instance (e.g. initialised, pending, active) 
   * @return depositsandWithdrawalsInstanceStatus
  **/

  public String getDepositsandWithdrawalsInstanceStatus() {
    return depositsandWithdrawalsInstanceStatus;
  }

  public void setDepositsandWithdrawalsInstanceStatus(String depositsandWithdrawalsInstanceStatus) {
    this.depositsandWithdrawalsInstanceStatus = depositsandWithdrawalsInstanceStatus;
  }


}

