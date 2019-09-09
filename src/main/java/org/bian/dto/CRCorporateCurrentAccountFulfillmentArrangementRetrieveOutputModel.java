package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateCurrentAccountFulfillmentArrangementRetrieveOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRCorporateCurrentAccountFulfillmentArrangementRetrieveOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord;
import org.bian.dto.CRCorporateCurrentAccountFulfillmentArrangementRetrieveOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCorporateCurrentAccountFulfillmentArrangementRetrieveOutputModel
 */
public class CRCorporateCurrentAccountFulfillmentArrangementRetrieveOutputModel   {
  private CRCorporateCurrentAccountFulfillmentArrangementRetrieveOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord corporateCurrentAccountFulfillmentArrangementInstanceRecord = null;

  private String corporateCurrentAccountFulfillmentArrangementRetrieveActionTaskReference = null;

  private Object corporateCurrentAccountFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String corporateCurrentAccountFulfillmentArrangementRetrieveActionResponse = null;

  private CRCorporateCurrentAccountFulfillmentArrangementRetrieveOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceReportRecord corporateCurrentAccountFulfillmentArrangementInstanceReportRecord = null;

  private CRCorporateCurrentAccountFulfillmentArrangementRetrieveOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceAnalysis corporateCurrentAccountFulfillmentArrangementInstanceAnalysis = null;


  /**
   * Get corporateCurrentAccountFulfillmentArrangementInstanceRecord
   * @return corporateCurrentAccountFulfillmentArrangementInstanceRecord
  **/

  public CRCorporateCurrentAccountFulfillmentArrangementRetrieveOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord getCorporateCurrentAccountFulfillmentArrangementInstanceRecord() {
    return corporateCurrentAccountFulfillmentArrangementInstanceRecord;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementInstanceRecord(CRCorporateCurrentAccountFulfillmentArrangementRetrieveOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord corporateCurrentAccountFulfillmentArrangementInstanceRecord) {
    this.corporateCurrentAccountFulfillmentArrangementInstanceRecord = corporateCurrentAccountFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Corporate Current Account Fulfillment Arrangement instance retrieve service call 
   * @return corporateCurrentAccountFulfillmentArrangementRetrieveActionTaskReference
  **/

  public String getCorporateCurrentAccountFulfillmentArrangementRetrieveActionTaskReference() {
    return corporateCurrentAccountFulfillmentArrangementRetrieveActionTaskReference;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementRetrieveActionTaskReference(String corporateCurrentAccountFulfillmentArrangementRetrieveActionTaskReference) {
    this.corporateCurrentAccountFulfillmentArrangementRetrieveActionTaskReference = corporateCurrentAccountFulfillmentArrangementRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return corporateCurrentAccountFulfillmentArrangementRetrieveActionTaskRecord
  **/

  public Object getCorporateCurrentAccountFulfillmentArrangementRetrieveActionTaskRecord() {
    return corporateCurrentAccountFulfillmentArrangementRetrieveActionTaskRecord;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementRetrieveActionTaskRecord(Object corporateCurrentAccountFulfillmentArrangementRetrieveActionTaskRecord) {
    this.corporateCurrentAccountFulfillmentArrangementRetrieveActionTaskRecord = corporateCurrentAccountFulfillmentArrangementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return corporateCurrentAccountFulfillmentArrangementRetrieveActionResponse
  **/

  public String getCorporateCurrentAccountFulfillmentArrangementRetrieveActionResponse() {
    return corporateCurrentAccountFulfillmentArrangementRetrieveActionResponse;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementRetrieveActionResponse(String corporateCurrentAccountFulfillmentArrangementRetrieveActionResponse) {
    this.corporateCurrentAccountFulfillmentArrangementRetrieveActionResponse = corporateCurrentAccountFulfillmentArrangementRetrieveActionResponse;
  }


  /**
   * Get corporateCurrentAccountFulfillmentArrangementInstanceReportRecord
   * @return corporateCurrentAccountFulfillmentArrangementInstanceReportRecord
  **/

  public CRCorporateCurrentAccountFulfillmentArrangementRetrieveOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceReportRecord getCorporateCurrentAccountFulfillmentArrangementInstanceReportRecord() {
    return corporateCurrentAccountFulfillmentArrangementInstanceReportRecord;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementInstanceReportRecord(CRCorporateCurrentAccountFulfillmentArrangementRetrieveOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceReportRecord corporateCurrentAccountFulfillmentArrangementInstanceReportRecord) {
    this.corporateCurrentAccountFulfillmentArrangementInstanceReportRecord = corporateCurrentAccountFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get corporateCurrentAccountFulfillmentArrangementInstanceAnalysis
   * @return corporateCurrentAccountFulfillmentArrangementInstanceAnalysis
  **/

  public CRCorporateCurrentAccountFulfillmentArrangementRetrieveOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceAnalysis getCorporateCurrentAccountFulfillmentArrangementInstanceAnalysis() {
    return corporateCurrentAccountFulfillmentArrangementInstanceAnalysis;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementInstanceAnalysis(CRCorporateCurrentAccountFulfillmentArrangementRetrieveOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceAnalysis corporateCurrentAccountFulfillmentArrangementInstanceAnalysis) {
    this.corporateCurrentAccountFulfillmentArrangementInstanceAnalysis = corporateCurrentAccountFulfillmentArrangementInstanceAnalysis;
  }


}

