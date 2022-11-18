
public abstract  class Appliances {

	public int Code, YearModel, Price,availablePieces;
	public String NameModel, NameConstructor;
	public double discount;
	
	
	Appliances(int Code ,String NameModel,int YearModel,String NameConstructor ,int Price,int availablePieces){
		this.Code=Code;
		this.NameModel=NameModel;
		this.YearModel=YearModel;
		this.NameConstructor=NameConstructor;
		this.Price=Price;
		this.availablePieces=availablePieces;
		
	}
	
	
	public String toString() {
		
		return  "Code:" + Code + " ,NameModel:" +  NameModel +" ,YearModel:" + YearModel + " ,NameConstructor:" + NameConstructor + " ,Price:" + Price + " ,AvailablePieces:" +availablePieces;
		
		
	}
	
	
	public void setAvailablePieces(int availablePieces) {
		this.availablePieces=availablePieces;
	}
	
	public int getAvailablePieces() {
		return availablePieces;
	}
	
	public int getPrice() {
		return Price;
	}


	public  double getDiscount() {
		return discount;
	}
	
	public String getModel() {
		return NameModel;
	}
	
	
		
		
	

	
}
