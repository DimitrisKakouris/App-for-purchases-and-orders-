
public class Gaming extends Appliances {
	
	private  String Type,Cpu,Gpu,Sound,CapacityStorage;
	private  final double discount = 0.10;
	
	
	Gaming(){
		
	}
	
	//Console
	Gaming(int Code ,String NameModel,int YearModel,String NameConstructor ,int Price,int availablePieces ,String Type,
			String Cpu,String Gpu,String Sound,String CapacityStorage){
		
		super(Code, NameModel, YearModel, NameConstructor , Price ,availablePieces);
		this.Type=Type;
		this.Cpu=Cpu;
		this.Gpu=Gpu;
		this.Sound=Sound;
		this.CapacityStorage=CapacityStorage;
		
		
		
	}
	
	@Override
	public int getAvailablePieces() {
		return availablePieces;
	}
	
	@Override
	public void setAvailablePieces(int availablePieces) {
		this.availablePieces=availablePieces;
	}
	@Override
	public int getPrice() {
		return Price;
	}
	
	@Override
	public double getDiscount() {
		return discount;
	}
	
	
	public void setType(String Type) {
		this.Type=Type;
	}
	public void setCpu(String Cpu) {
		this.Cpu=Cpu;
	}
	public void setGpu(String Gpu) {
		this.Gpu=Gpu;
	}
	public void setSound(String Sound) {
		this.Sound=Sound;
	}
	public void setCapacityStorage(String CapacityStorage) {
		this.CapacityStorage=CapacityStorage;
	}
	  public String getType() {
	        return Type;
	    }
	    public String getCpu() {
	        return Cpu;
	    }
	    public String getGpu() {
	        return Gpu;
	    }
	    public String getSound() {
	        return Sound;
	    }
	    public String getCapacityStorage() {
	        return CapacityStorage;
	    }
	
	
	@Override
	public String toString() {
		
		return super.toString() + " ,availablePieces:" +  availablePieces + " ,Type:" + Type + " ,Cpu:" +  Cpu + " ,Gpu" + Gpu + " ,Sound:" + Sound + " ,CapacityStorage:" + CapacityStorage +"\n";
	}

}
