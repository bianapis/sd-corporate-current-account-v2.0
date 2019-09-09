package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateCurrentAccountFulfillmentArrangementRetrieveInputModelCorporateCurrentAccountFulfillmentArrangementInstanceAnalysis
 */
public class CRCorporateCurrentAccountFulfillmentArrangementRetrieveInputModelCorporateCurrentAccountFulfillmentArrangementInstanceAnalysis   {
  private String corporateCurrentAccountFulfillmentArrangementInstanceAnalysisReference = null;

  private String corporateCurrentAccountFulfillmentArrangementInstanceAnalysisReportType = null;

  private String corporateCurrentAccountFulfillmentArrangementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return corporateCurrentAccountFulfillmentArrangementInstanceAnalysisReference
  **/

  public String getCorporateCurrentAccountFulfillmentArrangementInstanceAnalysisReference() {
    return corporateCurrentAccountFulfillmentArrangementInstanceAnalysisReference;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementInstanceAnalysisReference(String corporateCurrentAccountFulfillmentArrangementInstanceAnalysisReference) {
    this.corporateCurrentAccountFulfillmentArrangementInstanceAnalysisReference = corporateCurrentAccountFulfillmentArrangementInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return corporateCurrentAccountFulfillmentArrangementInstanceAnalysisParameters
  **/

  public String getCorporateCurrentAccountFulfillmentArrangementInstanceAnalysisParameters() {
    return corporateCurrentAccountFulfillmentArrangementInstanceAnalysisParameters;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementInstanceAnalysisParameters(String corporateCurrentAccountFulfillmentArrangementInstanceAnalysisParameters) {
    this.corporateCurrentAccountFulfillmentArrangementInstanceAnalysisParameters = corporateCurrentAccountFulfillmentArrangementInstanceAnalysisParameters;
  }


}

