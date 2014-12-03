package DataService.FinanceDataService;

import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.AccountPO;
import PO.CashPO;
import PO.CollectionOrPaymentPO;
import ResultMessage.ResultMessage;

public interface FinanceDataService {
	public ResultMessage insertAccount(AccountPO account) throws RemoteException;
	public ResultMessage delet(AccountPO account) throws RemoteException;
	public ResultMessage update(AccountPO account) throws RemoteException;
	public ArrayList<Object> find(String keyword) throws RemoteException;
	public ResultMessage insertCollectionOrPaymentPO(CollectionOrPaymentPO payment) throws RemoteException ;
	public ResultMessage insertCash(CashPO cash) throws RemoteException ;
	public void finish() ;
	public ArrayList<Object> show() throws RemoteException ;
	public String getReceiptNumber(String typeOfReceipt) ;
}
