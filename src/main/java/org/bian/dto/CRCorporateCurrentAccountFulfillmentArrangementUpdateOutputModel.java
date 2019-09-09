package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateCurrentAccountFulfillmentArrangementUpdateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorporateCurrentAccountFulfillmentArrangementUpdateOutputModel
 */
public class CRCorporateCurrentAccountFulfillmentArrangementUpdateOutputModel   {
  private CRCorporateCurrentAccountFulfillmentArrangementUpdateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord corporateCurrentAccountFulfillmentArrangementInstanceRecord = null;

  private String corporateCurrentAccountFulfillmentArrangementUpdateActionTaskReference = null;

  private Object corporateCurrentAccountFulfillmentArrangementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return corporateCurrentAccountFulfillmentArrangementUpdateActionTaskReference
  **/

  public String getCorporateCurrentAccountFulfillmentArrangementUpdateActionTaskReference() {
    return corporateCurrentAccountFulfillmentArrangementUpdateActionTaskReference;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementUpdateActionTaskReference(String corporateCurrentAccountFulfillmentArrangementUpdateActionTaskReference) {
    this.corporateCurrentAccountFulfillmentArrangementUpdateActionTaskReference = corporateCurrentAccountFulfillmentArrangementUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

