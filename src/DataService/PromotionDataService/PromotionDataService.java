package DataService.PromotionDataService;

import PO.PromotionPO;
import ResultMessage.ResultMessage;

public interface PromotionDataService {
		public ResultMessage addPackage(PromotionPO po);
		public ResultMessage addGift(PromotionPO po);
		public ResultMessage addVoucher(PromotionPO po);
		public ResultMessage delete(PromotionPO po); 
	
}