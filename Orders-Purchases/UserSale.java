import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserSale {
	
	private String model, fullName;
	private static int CodeSale=0;
	private int id,finalCost;
	private long phoneNumber;
	LocalDateTime SaleDate;
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	
	
	public UserSale(String model, String fullName, long phonenumber2, LocalDateTime SaleDate, int finalCost) {
		
		this.model=model;
		this.fullName=fullName;
		this.phoneNumber=phonenumber2;
		this.SaleDate=SaleDate;
		this.finalCost=finalCost;
		CodeSale++;
		this.id=CodeSale;
	}

	public String toString() {
		return "Your Sale is:" + " CodeSale:" + id + " model:" +  model + " ,FullName:" + fullName + " ,PhoneNumber:" + phoneNumber + " ,SaleDate:" + dtf.format(SaleDate) + " ,FinalCost:" + finalCost  + "\n";
	}

}
