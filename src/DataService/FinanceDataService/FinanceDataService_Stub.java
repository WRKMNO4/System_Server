package DataService.FinanceDataService;

import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.AccountPO;
import PO.CashPO;
import PO.CollectionOrPaymentPO;
import ResultMessage.ResultMessage;

public class FinanceDataService_Stub implements FinanceDataService{

	@Override
	public ResultMessage insertAccount(AccountPO account) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("add success") ;
		return null; 
	}

	@Override
	public ResultMessage delet(AccountPO account) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("delet success") ;
		return null;
		
	}


	@Override
	public ArrayList<Object> find(String keyword) throws RemoteException {
		// TODO Auto-generated method stub
		if(keyword.equals("0001")){
			System.out.println("find success") ;
		}else{
			System.out.println("find fail") ;
		}
		return new ArrayList<Object>() ;
	}


	@Override
	public ResultMessage insertCollectionOrPaymentPO(CollectionOrPaymentPO payment) throws RemoteException {
		// TODO Auto-generated method stub
		return null ;

	}

	@Override
	public ResultMessage insertCash(CashPO cash) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("add success") ;
		return null ;
	}

	@Override
	public void finish() {
		// TODO Auto-generated method stub
		System.out.println("exit success") ;
	}

	@Override
	public ArrayList<Object> show() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getReceiptNumber(String typeOfReceipt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Object> showCollectionOrPayment() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Object> showCash() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage updateCollectionOrPayment(CollectionOrPaymentPO po)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage changeAccount(AccountPO account, double sum)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
