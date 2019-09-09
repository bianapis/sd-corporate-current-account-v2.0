package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordDateType;
import org.bian.dto.CRCorporateCurrentAccountFulfillmentArrangementInitiateOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits;

import javax.validation.Valid;
  
/**
 * CRCorporateCurrentAccountFulfillmentArrangementInitiateOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord
 */
public class CRCorporateCurrentAccountFulfillmentArrangementInitiateOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord   {
  private String productInstanceReference = null;

  private String corporateCurrentAccountNumber = null;

  private String accountCurrency = null;

  private String entitlementOptionDefinition = null;

  private String entitlementOptionSetting = null;

  private String restrictionOptionDefinition = null;

  private String restrictionOptionSetting = null;

  private CRCorporateCurrentAccountFulfillmentArrangementInitiateOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits = null;

  private CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the corporate current account product instance 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The associated account number in any suitable format (e.g. IBAN) 
   * @return corporateCurrentAccountNumber
  **/

  public String getCorporateCurrentAccountNumber() {
    return corporateCurrentAccountNumber;
  }

  public void setCorporateCurrentAccountNumber(String corporateCurrentAccountNumber) {
    this.corporateCurrentAccountNumber = corporateCurrentAccountNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: The primary account currency 
   * @return accountCurrency
  **/

  public String getAccountCurrency() {
    return accountCurrency;
  }

  public void setAccountCurrency(String accountCurrency) {
    this.accountCurrency = accountCurrency;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The setting for the entitlement option 
   * @return entitlementOptionSetting
  **/

  public String getEntitlementOptionSetting() {
    return entitlementOptionSetting;
  }

  public void setEntitlementOptionSetting(String entitlementOptionSetting) {
    this.entitlementOptionSetting = entitlementOptionSetting;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The setting for the restriction option 
   * @return restrictionOptionSetting
  **/

  public String getRestrictionOptionSetting() {
    return restrictionOptionSetting;
  }

  public void setRestrictionOptionSetting(String restrictionOptionSetting) {
    this.restrictionOptionSetting = restrictionOptionSetting;
  }


  /**
   * Get positionLimits
   * @return positionLimits
  **/

  public CRCorporateCurrentAccountFulfillmentArrangementInitiateOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits getPositionLimits() {
    return positionLimits;
  }

  public void setPositionLimits(CRCorporateCurrentAccountFulfillmentArrangementInitiateOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits) {
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

