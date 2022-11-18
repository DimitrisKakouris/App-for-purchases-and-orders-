import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserOrder {
	
	private String model, FullName, OrderStatus;
	private static int codeOrder=0;
	private int FinalCost, id;
	private long PhoneNumber;
	LocalDateTime ArrivalDate, OrderDate;
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	
	
	public UserOrder(String model, String FullName, long PhoneNumber ,LocalDateTime OrderDate,LocalDateTime deliveryDate,int FinalCost,String OrderStatus ){
		this.model=model;
		this.FullName=FullName;
		this.PhoneNumber=PhoneNumber;
		this.OrderDate=OrderDate;
		this.ArrivalDate=deliveryDate;
		this.FinalCost=FinalCost;
		this.OrderStatus=OrderStatus;
		codeOrder++;
		this.id=codeOrder;
		
		
	}
	
	
	public String toString() {
		return "Your order is:" + " codeOrder:" +id + " model:" +  model + " ,FullName:" + FullName + " ,PhoneNumber:" + PhoneNumber + " ,OrderDate:" + dtf.format(OrderDate) + " ,ArrivalDate:" + dtf.format(ArrivalDate) + " ,FinalCost:" + FinalCost + " ,OrderStatus:" + OrderStatus + "\n";
	}
	
	

}
