/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CorporateCurrentAccountApiServiceImpl implements CorporateCurrentAccountApiService {

	public SDCorporateCurrentAccountActivateOutputModel activate(SDCorporateCurrentAccountActivateInputModel request){
		return JsonReader.read("activate-SDCorporateCurrentAccountActivateOutputModel.json",new TypeReference<SDCorporateCurrentAccountActivateOutputModel>(){});
	}
	
	public SDCorporateCurrentAccountConfigureOutputModel configure(String sdReferenceId, SDCorporateCurrentAccountConfigureInputModel request){
		return JsonReader.read("configure-SDCorporateCurrentAccountConfigureOutputModel.json",new TypeReference<SDCorporateCurrentAccountConfigureOutputModel>(){});
	}
	
	public CRCorporateCurrentAccountFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRCorporateCurrentAccountFulfillmentArrangementControlInputModel request){
		return JsonReader.read("control-CRCorporateCurrentAccountFulfillmentArrangementControlOutputModel.json",new TypeReference<CRCorporateCurrentAccountFulfillmentArrangementControlOutputModel>(){});
	}
	
	public BQAccountLienExchangeOutputModel exchangeAccountlien(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAccountLienExchangeInputModel request){
		return JsonReader.read("exchange-BQAccountLienExchangeOutputModel.json",new TypeReference<BQAccountLienExchangeOutputModel>(){});
	}
	
	public BQPaymentsExchangeOutputModel exchangePayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentsExchangeInputModel request){
		return JsonReader.read("exchange-BQPaymentsExchangeOutputModel.json",new TypeReference<BQPaymentsExchangeOutputModel>(){});
	}
	
	public BQAccountSweepExecuteOutputModel executeAccountsweep(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAccountSweepExecuteInputModel request){
		return JsonReader.read("execute-BQAccountSweepExecuteOutputModel.json",new TypeReference<BQAccountSweepExecuteOutputModel>(){});
	}
	
	public BQDepositsandWithdrawalsExecuteOutputModel executeDepositsandwithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDepositsandWithdrawalsExecuteInputModel request){
		return JsonReader.read("execute-BQDepositsandWithdrawalsExecuteOutputModel.json",new TypeReference<BQDepositsandWithdrawalsExecuteOutputModel>(){});
	}
	
	public BQPaymentsExecuteOutputModel executePayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentsExecuteInputModel request){
		return JsonReader.read("execute-BQPaymentsExecuteOutputModel.json",new TypeReference<BQPaymentsExecuteOutputModel>(){});
	}
	
	public BQServiceFeesExecuteOutputModel executeServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesExecuteInputModel request){
		return JsonReader.read("execute-BQServiceFeesExecuteOutputModel.json",new TypeReference<BQServiceFeesExecuteOutputModel>(){});
	}
	
	public SDCorporateCurrentAccountFeedbackOutputModel feedback(String sdReferenceId, SDCorporateCurrentAccountFeedbackInputModel request){
		return JsonReader.read("feedback-SDCorporateCurrentAccountFeedbackOutputModel.json",new TypeReference<SDCorporateCurrentAccountFeedbackOutputModel>(){});
	}
	
	public CRCorporateCurrentAccountFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModel request){
		return JsonReader.read("initiate-CRCorporateCurrentAccountFulfillmentArrangementInitiateOutputModel.json",new TypeReference<CRCorporateCurrentAccountFulfillmentArrangementInitiateOutputModel>(){});
	}
	
	public BQAccountLienInitiateOutputModel initiateAccountlien(String sdReferenceId, String crReferenceId, BQAccountLienInitiateInputModel request){
		return JsonReader.read("initiate-BQAccountLienInitiateOutputModel.json",new TypeReference<BQAccountLienInitiateOutputModel>(){});
	}
	
	public BQAccountSweepInitiateOutputModel initiateAccountsweep(String sdReferenceId, String crReferenceId, BQAccountSweepInitiateInputModel request){
		return JsonReader.read("initiate-BQAccountSweepInitiateOutputModel.json",new TypeReference<BQAccountSweepInitiateOutputModel>(){});
	}
	
	public BQDepositsandWithdrawalsInitiateOutputModel initiateDepositsandwithdrawals(String sdReferenceId, String crReferenceId, BQDepositsandWithdrawalsInitiateInputModel request){
		return JsonReader.read("initiate-BQDepositsandWithdrawalsInitiateOutputModel.json",new TypeReference<BQDepositsandWithdrawalsInitiateOutputModel>(){});
	}
	
	public BQIssuedDeviceInitiateOutputModel initiateIssueddevice(String sdReferenceId, String crReferenceId, BQIssuedDeviceInitiateInputModel request){
		return JsonReader.read("initiate-BQIssuedDeviceInitiateOutputModel.json",new TypeReference<BQIssuedDeviceInitiateOutputModel>(){});
	}
	
	public BQPaymentsInitiateOutputModel initiatePayments(String sdReferenceId, String crReferenceId, BQPaymentsInitiateInputModel request){
		return JsonReader.read("initiate-BQPaymentsInitiateOutputModel.json",new TypeReference<BQPaymentsInitiateOutputModel>(){});
	}
	
	public BQServiceFeesInitiateOutputModel initiateServicefees(String sdReferenceId, String crReferenceId, BQServiceFeesInitiateInputModel request){
		return JsonReader.read("initiate-BQServiceFeesInitiateOutputModel.json",new TypeReference<BQServiceFeesInitiateOutputModel>(){});
	}
	
	public BQIssuedDeviceRequestOutputModel requestIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIssuedDeviceRequestInputModel request){
		return JsonReader.read("request-BQIssuedDeviceRequestOutputModel.json",new TypeReference<BQIssuedDeviceRequestOutputModel>(){});
	}
	
	public CRCorporateCurrentAccountFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCorporateCurrentAccountFulfillmentArrangementRetrieveOutputModel.json",new TypeReference<CRCorporateCurrentAccountFulfillmentArrangementRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQAccountLienRetrieveOutputModel retrieveAccountlien(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAccountLienRetrieveOutputModel.json",new TypeReference<BQAccountLienRetrieveOutputModel>(){});
	}
	
	public BQAccountSweepRetrieveOutputModel retrieveAccountsweep(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAccountSweepRetrieveOutputModel.json",new TypeReference<BQAccountSweepRetrieveOutputModel>(){});
	}
	
	public BQDepositsandWithdrawalsRetrieveOutputModel retrieveDepositsandwithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQDepositsandWithdrawalsRetrieveOutputModel.json",new TypeReference<BQDepositsandWithdrawalsRetrieveOutputModel>(){});
	}
	
	public BQInterestRetrieveOutputModel retrieveInterest(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQInterestRetrieveOutputModel.json",new TypeReference<BQInterestRetrieveOutputModel>(){});
	}
	
	public BQIssuedDeviceRetrieveOutputModel retrieveIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQIssuedDeviceRetrieveOutputModel.json",new TypeReference<BQIssuedDeviceRetrieveOutputModel>(){});
	}
	
	public BQPaymentsRetrieveOutputModel retrievePayments(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPaymentsRetrieveOutputModel.json",new TypeReference<BQPaymentsRetrieveOutputModel>(){});
	}
	
	public BQServiceFeesRetrieveOutputModel retrieveServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQServiceFeesRetrieveOutputModel.json",new TypeReference<BQServiceFeesRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCorporateCurrentAccountRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCorporateCurrentAccountRetrieveOutputModel.json",new TypeReference<SDCorporateCurrentAccountRetrieveOutputModel>(){});
	}
	
	public CRCorporateCurrentAccountFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCorporateCurrentAccountFulfillmentArrangementUpdateInputModel request){
		return JsonReader.read("update-CRCorporateCurrentAccountFulfillmentArrangementUpdateOutputModel.json",new TypeReference<CRCorporateCurrentAccountFulfillmentArrangementUpdateOutputModel>(){});
	}
	
	public BQAccountLienUpdateOutputModel updateAccountlien(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAccountLienUpdateInputModel request){
		return JsonReader.read("update-BQAccountLienUpdateOutputModel.json",new TypeReference<BQAccountLienUpdateOutputModel>(){});
	}
	
	public BQAccountSweepUpdateOutputModel updateAccountsweep(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAccountSweepUpdateInputModel request){
		return JsonReader.read("update-BQAccountSweepUpdateOutputModel.json",new TypeReference<BQAccountSweepUpdateOutputModel>(){});
	}
	
	public BQDepositsandWithdrawalsUpdateOutputModel updateDepositsandwithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDepositsandWithdrawalsUpdateInputModel request){
		return JsonReader.read("update-BQDepositsandWithdrawalsUpdateOutputModel.json",new TypeReference<BQDepositsandWithdrawalsUpdateOutputModel>(){});
	}
	
	public BQIssuedDeviceUpdateOutputModel updateIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIssuedDeviceUpdateInputModel request){
		return JsonReader.read("update-BQIssuedDeviceUpdateOutputModel.json",new TypeReference<BQIssuedDeviceUpdateOutputModel>(){});
	}
	
	public BQPaymentsUpdateOutputModel updatePayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentsUpdateInputModel request){
		return JsonReader.read("update-BQPaymentsUpdateOutputModel.json",new TypeReference<BQPaymentsUpdateOutputModel>(){});
	}
	
}
