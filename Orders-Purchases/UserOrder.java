import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserOrder {
	
	private String model, FullName, OrderStatus;
	private static int codeOrder=0;
	private int FinalCost, id;
	private long PhoneNumber;
	LocalDateTime deliveryDate, OrderDate;
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	
	
	public UserOrder(String model, String FullName, long PhoneNumber ,LocalDateTime OrderDate,LocalDateTime deliveryDate,int FinalCost,String OrderStatus ){
		this.model=model;
		this.FullName=FullName;
		this.PhoneNumber=PhoneNumber;
		this.OrderDate=OrderDate;
		this.deliveryDate=deliveryDate;
		this.FinalCost=FinalCost;
		this.OrderStatus=OrderStatus;
		codeOrder++;
		this.id=codeOrder;
		
		
	}
	
	
	
	public String getModel() {
        return model;
   }
   public String getFullName() {
       return FullName;
   }
   public long getPhoneNumber() {
       return PhoneNumber;
   }
   public LocalDateTime getOrderDate() {
       return OrderDate;
   }
   public LocalDateTime getDeliveryDate() {
       return deliveryDate;
   }
   public int  getFinalCost() {
       return FinalCost;
   }   
   public String  getOrderStatus() {
       return OrderStatus;
   }
	
	
	
	
	
	public String toString() {
		return "Your order is:" + " codeOrder:" +id + " model:" +  model + " ,FullName:" + FullName + " ,PhoneNumber:" + PhoneNumber + " ,OrderDate:" + dtf.format(OrderDate) + " ,ArrivalDate:" + dtf.format(deliveryDate) + " ,FinalCost:" + FinalCost + " ,OrderStatus:" + OrderStatus + "\n";
	}
	
	

}
