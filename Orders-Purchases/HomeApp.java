
public class HomeApp extends Appliances{
	
	private final String EnergyClass;
	private String Type,Capacity,MaintenanceCapacity, FreezingCapacity;
	private int Turns, Sectionprint;
	private double discount =0.20;
	
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
