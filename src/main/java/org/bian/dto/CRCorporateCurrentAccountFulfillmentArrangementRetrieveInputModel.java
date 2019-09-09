package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateCurrentAccountFulfillmentArrangementRetrieveInputModelCorporateCurrentAccountFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRCorporateCurrentAccountFulfillmentArrangementRetrieveInputModelCorporateCurrentAccountFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCorporateCurrentAccountFulfillmentArrangementRetrieveInputModel
 */
public class CRCorporateCurrentAccountFulfillmentArrangementRetrieveInputModel   {
  private Object corporateCurrentAccountFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String corporateCurrentAccountFulfillmentArrangementRetrieveActionRequest = null;

  private CRCorporateCurrentAccountFulfillmentArrangementRetrieveInputModelCorporateCurrentAccountFulfillmentArrangementInstanceReportRecord corporateCurrentAccountFulfillmentArrangementInstanceReportRecord = null;

  private CRCorporateCurrentAccountFulfillmentArrangementRetrieveInputModelCorporateCurrentAccountFulfillmentArrangementInstanceAnalysis corporateCurrentAccountFulfillmentArrangementInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return corporateCurrentAccountFulfillmentArrangementRetrieveActionRequest
  **/

  public String getCorporateCurrentAccountFulfillmentArrangementRetrieveActionRequest() {
    return corporateCurrentAccountFulfillmentArrangementRetrieveActionRequest;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementRetrieveActionRequest(String corporateCurrentAccountFulfillmentArrangementRetrieveActionRequest) {
    this.corporateCurrentAccountFulfillmentArrangementRetrieveActionRequest = corporateCurrentAccountFulfillmentArrangementRetrieveActionRequest;
  }


  /**
   * Get corporateCurrentAccountFulfillmentArrangementInstanceReportRecord
   * @return corporateCurrentAccountFulfillmentArrangementInstanceReportRecord
  **/

  public CRCorporateCurrentAccountFulfillmentArrangementRetrieveInputModelCorporateCurrentAccountFulfillmentArrangementInstanceReportRecord getCorporateCurrentAccountFulfillmentArrangementInstanceReportRecord() {
    return corporateCurrentAccountFulfillmentArrangementInstanceReportRecord;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementInstanceReportRecord(CRCorporateCurrentAccountFulfillmentArrangementRetrieveInputModelCorporateCurrentAccountFulfillmentArrangementInstanceReportRecord corporateCurrentAccountFulfillmentArrangementInstanceReportRecord) {
    this.corporateCurrentAccountFulfillmentArrangementInstanceReportRecord = corporateCurrentAccountFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get corporateCurrentAccountFulfillmentArrangementInstanceAnalysis
   * @return corporateCurrentAccountFulfillmentArrangementInstanceAnalysis
  **/

  public CRCorporateCurrentAccountFulfillmentArrangementRetrieveInputModelCorporateCurrentAccountFulfillmentArrangementInstanceAnalysis getCorporateCurrentAccountFulfillmentArrangementInstanceAnalysis() {
    return corporateCurrentAccountFulfillmentArrangementInstanceAnalysis;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementInstanceAnalysis(CRCorporateCurrentAccountFulfillmentArrangementRetrieveInputModelCorporateCurrentAccountFulfillmentArrangementInstanceAnalysis corporateCurrentAccountFulfillmentArrangementInstanceAnalysis) {
    this.corporateCurrentAccountFulfillmentArrangementInstanceAnalysis = corporateCurrentAccountFulfillmentArrangementInstanceAnalysis;
  }


}

