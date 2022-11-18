
public class HomeApp extends Appliances{
	
	private  String EnergyClass;
	private String Type,Capacity,MaintenanceCapacity, FreezingCapacity;
	private int Turns, Sectionprint;
	private double discount =0.20;
	
	
	HomeApp(){
		
	}
	
	//Fridge
	HomeApp(int Code ,String NameModel,int YearModel,String NameConstructor ,int Price,int availablePieces,String Type,
			String EnergyClass,String MaintenanceCapacity,String FreezingCapacity){
		
		super(Code, NameModel, YearModel, NameConstructor , Price ,availablePieces);
		this.Type=Type;
		this.EnergyClass=EnergyClass;
		this.MaintenanceCapacity=MaintenanceCapacity;
		this.FreezingCapacity=FreezingCapacity;
		Sectionprint=1;
		
		
	}
	
	//WashingMachine
	HomeApp(int Code ,String NameModel,int YearModel,String NameConstructor ,int Price,int availablePieces,String EnergyClass,String Capacity,int Turns){
	super(Code, NameModel, YearModel, NameConstructor , Price,availablePieces);
	this.EnergyClass=EnergyClass;
	this.Capacity=Capacity;
	this.Turns=Turns;
	Sectionprint=2;
	}
	
	@Override
	public double getDiscount() {
		return discount;
	}
	
	
	@Override
	public int getAvailablePieces() {
		return availablePieces;
	}
	@Override
	public int getPrice() {
		return Price;
	}
	
	@Override
	public void setAvailablePieces(int availablePieces) {
		this.availablePieces=availablePieces;
	}
	

	public void setType(String Type) {
		this.Type=Type;
	}
	public String getType() {
		return Type;
	}
	
	public void setMaintenanceCapacity(String MaintenanceCapacity) {
		this.MaintenanceCapacity=MaintenanceCapacity;
	}
	public void setEnergyClass(String EnergyClass) {
		this.EnergyClass=EnergyClass;
	}
	public void setFreezingCapacity(String FreezingCapacity) {
		this.FreezingCapacity=FreezingCapacity;
	}
	public void setCapacity(String Capacity) {
		this.Capacity=Capacity;
	}
	public void setTurns(int Turns) {
		this.Turns=Turns;
	}
	public String getMaintenanceCapacity() {
        return MaintenanceCapacity;
   }
   public String getEnergyClass() {
       return EnergyClass;
   }
   public String getFreezingCapacity() {
       return FreezingCapacity;
   }
   public String getCapacity() {
       return Capacity;
   }
   public int  getTurns() {
       return Turns;
   }
	
   @Override
   public int getSectionprint() {
	   return Sectionprint;
   }
	
	
	
	@Override
	public String toString() {
		
		if(Sectionprint==1) {
			
			return super.toString() + " ,availablePieces:" + availablePieces + " ,Type:" +  Type + " ,EnergyClass: " + EnergyClass + " ,MaintenanceCapacity:" + MaintenanceCapacity + " ,FreezingCapacity:" + FreezingCapacity +"\n";
			
		}
		else {
		
			return super.toString()  + " ,availablePieces:" + availablePieces + " ,EnergyClass:" +  EnergyClass + " ,Capacity:" + Capacity + " ,Turns:" + Turns +"\n";
			
		}
	}

}
