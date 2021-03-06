package PO;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author hutao
 *
 */
public class SendCommodityPO implements Serializable{
	public long goodsPOId;
	public String customerPOName;
	public int num;
	public double price;
	public int checked;
	public Date date;
	
	public SendCommodityPO() {}
	public SendCommodityPO(SendCommodityPO po) {
		this.goodsPOId = po.goodsPOId;
		this.customerPOName = po.customerPOName;
		this.num = po.num;
		this.price = po.price;
		this.checked = po.checked;
		this.date = po.date;
	}

	public static final int UNCHECKED = 0;
	public static final int PASS = 1;
	public static final int CANCEL= 2;
	public static final int FINISH = 3;

}
