package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordAssociations;
import org.bian.dto.CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordDateType;
import org.bian.dto.CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordLinkedAccounts;
import org.bian.dto.CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits;

import javax.validation.Valid;
  
/**
 * CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord
 */
public class CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord   {
  private String customerReference = null;

  private String bankBranchLocationReference = null;

  private String accountType = null;

  private String accountCurrency = null;

  private String taxReference = null;

  private String entitlementOptionSetting = null;

  private String restrictionOptionSetting = null;

  private CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordAssociations associations = null;

  private CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordLinkedAccounts linkedAccounts = null;

  private CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits = null;

  private CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the account primary party/owner 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Bank branch associated with the account for booking purposes 
   * @return bankBranchLocationReference
  **/

  public String getBankBranchLocationReference() {
    return bankBranchLocationReference;
  }

  public void setBankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of corporate current account (e.g. corporate, small business) 
   * @return accountType
  **/

  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference identifier linking the account to appropriate tax handling 
   * @return taxReference
  **/

  public String getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(String taxReference) {
    this.taxReference = taxReference;
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
   * Get associations
   * @return associations
  **/

  public CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordAssociations getAssociations() {
    return associations;
  }

  public void setAssociations(CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordAssociations associations) {
    this.associations = associations;
  }


  /**
   * Get linkedAccounts
   * @return linkedAccounts
  **/

  public CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordLinkedAccounts getLinkedAccounts() {
    return linkedAccounts;
  }

  public void setLinkedAccounts(CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordLinkedAccounts linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
  }


  /**
   * Get positionLimits
   * @return positionLimits
  **/

  public CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits getPositionLimits() {
    return positionLimits;
  }

  public void setPositionLimits(CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits) {
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

