
public class ImageSound extends Appliances {
	
	private final String type;
	private String Ports,FormatReproduction,analysis,OpticalZoom,DigitalZoom;
	private  int ScreenDimension,megapixel,ScreenSize;
	public final double discount =0.25;
	
	
	
	int Sectionprint;
	
	
	//TV
	ImageSound(int Code ,String NameModel,int YearModel,String NameConstructor ,int Price,int availablePieces ,String type,int 
			ScreenDimension,String analysis,String Ports ){
		
			super(Code, NameModel, YearModel, NameConstructor , Price ,availablePieces);
			this.ScreenDimension=ScreenDimension;
			this.analysis=analysis;
			this.type=type;
			this.Ports=Ports;
			Sectionprint=1;
		
	}
	
	//BlueRay/DvD players
	ImageSound(int Code ,String NameModel,int YearModel,String NameConstructor,int Price,int availablePieces,String type,String analysis,String FormatReproduction){
		
		super(Code, NameModel, YearModel, NameConstructor , Price, availablePieces);
		this.type=type;
		this.analysis=analysis;
		this.FormatReproduction=FormatReproduction;
		Sectionprint=2;
	}
	
	
	
	//Photo
	ImageSound(int Code ,String NameModel,int YearModel,String NameConstructor,int Price,int availablePieces,String type,int megapixel,String OpticalZoom,String DigitalZoom ,int ScreenSize){
		
		super(Code, NameModel, YearModel, NameConstructor , Price, availablePieces);
		this.type=type;
		this.megapixel=megapixel;
		this.OpticalZoom=OpticalZoom;
		this.DigitalZoom=DigitalZoom;
		this.ScreenSize=ScreenSize;
		Sectionprint=3;
	}
	
	@Override
	public String getModel() {
		return NameModel;
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
	public void setAvailablePieces(int availablePieces) {
		this.availablePieces=availablePieces;
	}
	@Override
	public int getPrice() {
		return Price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		if(Sectionprint==1) {
		
			return super.toString() + " ,ScreenDimension:" +  ScreenDimension + " ,Analysis:" + analysis + " ,Ports:"  + Ports +"\n";
			
		}
		else if(Sectionprint==2) {
		
			return super.toString()  + " ,Analysis:" + analysis + " ,FormatReproduction:" + FormatReproduction +"\n";
			
		}
		else {
			return super.toString() +  " ,Megapixel:" + megapixel + " ,OpticalZoom:" + OpticalZoom + " ,DigitalZoom:" + DigitalZoom + " ,ScreenSize:" + ScreenSize +"\n";
		}
	}
	

}
