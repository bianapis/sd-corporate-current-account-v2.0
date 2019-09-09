package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateCurrentAccountFulfillmentArrangementRetrieveOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceReportRecord
 */
public class CRCorporateCurrentAccountFulfillmentArrangementRetrieveOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceReportRecord   {
  private String corporateCurrentAccountFulfillmentArrangementInstanceReportData = null;

  private String corporateCurrentAccountFulfillmentArrangementInstanceReportType = null;

  private Object corporateCurrentAccountFulfillmentArrangementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return corporateCurrentAccountFulfillmentArrangementInstanceReportData
  **/

  public String getCorporateCurrentAccountFulfillmentArrangementInstanceReportData() {
    return corporateCurrentAccountFulfillmentArrangementInstanceReportData;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementInstanceReportData(String corporateCurrentAccountFulfillmentArrangementInstanceReportData) {
    this.corporateCurrentAccountFulfillmentArrangementInstanceReportData = corporateCurrentAccountFulfillmentArrangementInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return corporateCurrentAccountFulfillmentArrangementInstanceReportType
  **/

  public String getCorporateCurrentAccountFulfillmentArrangementInstanceReportType() {
    return corporateCurrentAccountFulfillmentArrangementInstanceReportType;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementInstanceReportType(String corporateCurrentAccountFulfillmentArrangementInstanceReportType) {
    this.corporateCurrentAccountFulfillmentArrangementInstanceReportType = corporateCurrentAccountFulfillmentArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return corporateCurrentAccountFulfillmentArrangementInstanceReport
  **/

  public Object getCorporateCurrentAccountFulfillmentArrangementInstanceReport() {
    return corporateCurrentAccountFulfillmentArrangementInstanceReport;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementInstanceReport(Object corporateCurrentAccountFulfillmentArrangementInstanceReport) {
    this.corporateCurrentAccountFulfillmentArrangementInstanceReport = corporateCurrentAccountFulfillmentArrangementInstanceReport;
  }


}

