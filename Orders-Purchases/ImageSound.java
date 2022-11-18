
public class ImageSound extends Appliances {
	
	private  String type;
	private String Ports,FormatReproduction,analysis,OpticalZoom,DigitalZoom;
	private  int ScreenDimension,megapixel,ScreenSize;
	public final double discount =0.25;
	
	
	
	int Sectionprint;
	
	ImageSound(){
		
	}
	
	
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
	
	public void setScreenDimension(int ScreenDimension) {
		this.ScreenDimension=ScreenDimension;
		
	}
	public void setPrice(int Price) {
		this.Price=Price;
		
	}
	public void setType(String type) {
		this.type=type;
		
	}
	public void setAnalysis(String analysis) {
		this.analysis=analysis;
		
	}
	public void setPorts(String Ports) {
		this.Ports=Ports;
		
	}
	public void setFormatReproduction(String FormatReproduction) {
		this.FormatReproduction=FormatReproduction;
		
	}
	public void setMegapixel(int megapixel) {
		this.megapixel=megapixel;
		
	}


	public void setOpticalZoom(String OpticalZoom) {
		this.OpticalZoom=OpticalZoom;
		
	}


	public void setDigitalZoom(String DigitalZoom) {
		this.DigitalZoom=DigitalZoom;
		
	}
	
	public void setScreenSize(int ScreenSize) {
		this.ScreenSize=ScreenSize;
	}
	public int getScreenDimension() {
        return ScreenDimension;
        
    }
   
    public String getType() {
        return type;
        
    }
    public String getAnalysis() {
        return analysis;
        
    }
    public String getPorts() {
        return Ports;
        
    }
    public String getFormatReproduction() {
        return FormatReproduction;
        
    }
    public int getMegapixel() {
        return megapixel;
        
    }

    public String getOpticalZoom() {
        return OpticalZoom;
        
    }

    public String getDigitalZoom() {
        return DigitalZoom;
        
    }
    
    public int getScreenSize() {
        return ScreenSize;
    }
	
    @Override
    public int getSectionprint() {
 	   return Sectionprint;
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
