package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAccountLienInitiateOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits;
import org.bian.dto.CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * BQAccountLienInitiateOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord
 */
public class BQAccountLienInitiateOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord   {
  private String entitlementOptionDefinition = null;

  private String restrictionOptionDefinition = null;

  private BQAccountLienInitiateOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits = null;

  private CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The definition of an applicable entitlement option 
   * @return entitlementOptionDefinition
  **/

  public String getEntitlementOptionDefinition() {
    return entitlementOptionDefinition;
  }

  public void setEntitlementOptionDefinition(String entitlementOptionDefinition) {
    this.entitlementOptionDefinition = entitlementOptionDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The definition of an applicable restriction option 
   * @return restrictionOptionDefinition
  **/

  public String getRestrictionOptionDefinition() {
    return restrictionOptionDefinition;
  }

  public void setRestrictionOptionDefinition(String restrictionOptionDefinition) {
    this.restrictionOptionDefinition = restrictionOptionDefinition;
  }


  /**
   * Get positionLimits
   * @return positionLimits
  **/

  public BQAccountLienInitiateOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits getPositionLimits() {
    return positionLimits;
  }

  public void setPositionLimits(BQAccountLienInitiateOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits) {
    this.positionLimits = positionLimits;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


}

