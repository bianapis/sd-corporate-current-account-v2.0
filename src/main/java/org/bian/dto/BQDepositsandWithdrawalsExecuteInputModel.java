package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceFeesExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * BQDepositsandWithdrawalsExecuteInputModel
 */
public class BQDepositsandWithdrawalsExecuteInputModel   {
  private String corporateCurrentAccountFulfillmentArrangementInstanceReference = null;

  private String depositsandWithdrawalsInstanceReference = null;

  private Object depositsandWithdrawalsExecuteActionTaskRecord = null;

  private BQServiceFeesExecuteInputModelExecuteRecordType executeRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return depositsandWithdrawalsExecuteActionTaskRecord
  **/

  public Object getDepositsandWithdrawalsExecuteActionTaskRecord() {
    return depositsandWithdrawalsExecuteActionTaskRecord;
  }

  public void setDepositsandWithdrawalsExecuteActionTaskRecord(Object depositsandWithdrawalsExecuteActionTaskRecord) {
    this.depositsandWithdrawalsExecuteActionTaskRecord = depositsandWithdrawalsExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public BQServiceFeesExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(BQServiceFeesExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

