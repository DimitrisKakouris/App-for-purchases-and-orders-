
public abstract  class Appliances {

	public int Code, YearModel, Price,availablePieces;
	public String NameModel, NameConstructor;
	public double discount;
	int Sectionprint;
	
	
	Appliances()
	{
	}
	
	
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
	public void setCode(int Code) {
		this.Code=Code;
	}
	public void setNameModel(String NameModel) {
		this.NameModel=NameModel;
	}
	public void setYearModel(int YearModel) {
		this.YearModel=YearModel;
	}
	public void setNameConstructor(String NameConstructor) {
		this.NameConstructor=NameConstructor;
	}
	public void setPrice(int Price) {
		this.Price=Price;
	}
	
	

    public int getCode() {
        return Code;
    }
    public String getNameModel() {
        return NameModel;
    }
    public int getYearModel() {
        return YearModel;
    }
    public String getNameConstructor() {
        return NameConstructor;
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


	public int getSectionprint() {
		return Sectionprint;
	}
	
	
		
		
	

	
}
