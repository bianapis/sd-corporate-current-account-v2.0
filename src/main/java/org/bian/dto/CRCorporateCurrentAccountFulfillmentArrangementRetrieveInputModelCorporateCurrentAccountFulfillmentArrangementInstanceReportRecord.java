package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorporateCurrentAccountFulfillmentArrangementRetrieveInputModelCorporateCurrentAccountFulfillmentArrangementInstanceReportRecord
 */
public class CRCorporateCurrentAccountFulfillmentArrangementRetrieveInputModelCorporateCurrentAccountFulfillmentArrangementInstanceReportRecord   {
  private String corporateCurrentAccountFulfillmentArrangementInstanceReportReference = null;

  private String corporateCurrentAccountFulfillmentArrangementInstanceReportType = null;

  private String corporateCurrentAccountFulfillmentArrangementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return corporateCurrentAccountFulfillmentArrangementInstanceReportReference
  **/

  public String getCorporateCurrentAccountFulfillmentArrangementInstanceReportReference() {
    return corporateCurrentAccountFulfillmentArrangementInstanceReportReference;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementInstanceReportReference(String corporateCurrentAccountFulfillmentArrangementInstanceReportReference) {
    this.corporateCurrentAccountFulfillmentArrangementInstanceReportReference = corporateCurrentAccountFulfillmentArrangementInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return corporateCurrentAccountFulfillmentArrangementInstanceReportParameters
  **/

  public String getCorporateCurrentAccountFulfillmentArrangementInstanceReportParameters() {
    return corporateCurrentAccountFulfillmentArrangementInstanceReportParameters;
  }

  public void setCorporateCurrentAccountFulfillmentArrangementInstanceReportParameters(String corporateCurrentAccountFulfillmentArrangementInstanceReportParameters) {
    this.corporateCurrentAccountFulfillmentArrangementInstanceReportParameters = corporateCurrentAccountFulfillmentArrangementInstanceReportParameters;
  }


}

