package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateCurrentAccountFulfillmentArrangementRetrieveOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceAnalysis
 */
public class CRCorporateCurrentAccountFulfillmentArrangementRetrieveOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceAnalysis   {
  private String corporateCurrentAccountFulfillmentArrangementInstanceAnalysisData = null;

  private String corporateCurrentAccountFulfillmentArrangementInstanceAnalysisReportType = null;

  private Object corporateCurrentAccountFulfillmentArrangementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return corporateCurrentAccountFulfillmentArrangementInstanceAnalysisData
  **/

  public String getCorporateCurrentAccountFulfillmentArrangementInstanceAnalysisData() {
    return corporateCurrentAccountFulfillmentArrangementInstanceAnalysisData;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementInstanceAnalysisData(String corporateCurrentAccountFulfillmentArrangementInstanceAnalysisData) {
    this.corporateCurrentAccountFulfillmentArrangementInstanceAnalysisData = corporateCurrentAccountFulfillmentArrangementInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return corporateCurrentAccountFulfillmentArrangementInstanceAnalysisReportType
  **/

  public String getCorporateCurrentAccountFulfillmentArrangementInstanceAnalysisReportType() {
    return corporateCurrentAccountFulfillmentArrangementInstanceAnalysisReportType;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementInstanceAnalysisReportType(String corporateCurrentAccountFulfillmentArrangementInstanceAnalysisReportType) {
    this.corporateCurrentAccountFulfillmentArrangementInstanceAnalysisReportType = corporateCurrentAccountFulfillmentArrangementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return corporateCurrentAccountFulfillmentArrangementInstanceAnalysisReport
  **/

  public Object getCorporateCurrentAccountFulfillmentArrangementInstanceAnalysisReport() {
    return corporateCurrentAccountFulfillmentArrangementInstanceAnalysisReport;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementInstanceAnalysisReport(Object corporateCurrentAccountFulfillmentArrangementInstanceAnalysisReport) {
    this.corporateCurrentAccountFulfillmentArrangementInstanceAnalysisReport = corporateCurrentAccountFulfillmentArrangementInstanceAnalysisReport;
  }


}

