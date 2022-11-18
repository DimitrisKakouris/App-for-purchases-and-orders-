import java.util.ArrayList;
import java.util.*;
import java.io.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;  
import java.util.Scanner;

public class mainApp {
	
	public static  Scanner input =new Scanner(System.in);	
	public  static int choiceOfCategory ,choiceOfCategoryImageSound, choiceOfCategoryHomeApp, numberOfOrderFromUser, choiceModel, choiceOfBuy;
	
	//List for orders
	public static ArrayList<Appliances> devicesOrdered=new ArrayList();
		   
	//List of Orders and Sales	    
	static ArrayList<UserOrder> ord=new ArrayList();
	static ArrayList<UserSale> sl=new ArrayList();

	   public static void main(String[] args) {
						
			Scanner in =new Scanner(System.in);	
			System.out.println(" >>>>>>> Create Objects (Items) ...");
		
				//TV
				Appliances imgTV = new ImageSound(1,"Samsung-SM3",2020,"Samsung",1500,10,"LCD",55,"4K","HDMI-DVI-Composite");
				Appliances imgTV2 = new ImageSound(2,"Sony-BRAVIO",2019,"Sony",2000,15,"LED",60,"8K","HDMI-DVI");
				
				//BlueRay/DvD players
				Appliances imgDVD = new ImageSound(3,"BR-300",2020,"Hitachi",50,5,"Blue-ray","HD","BD-R");
				Appliances imgDVD2 = new ImageSound(4,"DVD-100",2020,"LG",25,3,"DVD","SD","DVD-RW");
				
				//Photo
				Appliances imgPhoto = new ImageSound(5,"GO-Pro-Hero",2018,"GO-Pro",300,23,"Action camera",30,"x20","x16",2);
				Appliances imgPhoto2 = new ImageSound(6,"GO-Pro-Hero3",2019,"GO-Pro",500,15,"Action camera and DSLR",60,"x40","x24",3);
				
				//Console
				Appliances game = new Gaming(7,"XBOX-ONE",2014,"Microsoft",100,12,"Xbox","AMD","AMD","Surround 5.1","500GB");
				Appliances game2 = new Gaming(8,"PS4-Pro",2017,"Sony",300,5,"PS4","AMD","AMD","Surround 7.1","1TB");
				
				//Fridge
				Appliances hoappFridge = new HomeApp(9,"GE-325",2018,"General-Electric",600,9,"Closet","A+","300lt","200lt");
				Appliances hoappFridge2 = new HomeApp(10,"CBN-320",2019,"Crowm",350,6,"2-Doors","A++","200lt","100lt");
				
				
				
				//WashingMachine
				Appliances hoappWashingMachine = new HomeApp(11,"WS-604",2020,"Pitsos",250,4,"B","5lt",1200);
				Appliances hoappWashingMachine2 = new HomeApp(12,"KT-450",2019,"Bosch",450,16,"A++","8lt",1600);
		
	
				System.out.println(" >>>>>>> Add Objects (Items) to ARRAYLIST...");
				
				 devicesOrdered.add(imgTV);
				 devicesOrdered.add(imgTV2);
				 devicesOrdered.add(imgDVD);
				 devicesOrdered.add(imgDVD2);
				 devicesOrdered.add(imgPhoto);
				 devicesOrdered.add(imgPhoto2);
				 devicesOrdered.add(game);
				 devicesOrdered.add(game2);
				 devicesOrdered.add(hoappFridge);
				 devicesOrdered.add(hoappFridge2);
				 devicesOrdered.add(hoappWashingMachine);
				 devicesOrdered.add(hoappWashingMachine2);
						    
				 UserSale usale;
				 UserOrder uorder;
				 
				 CreateFile();
		 	    
				 //User input
				PrintChoices();
				
				int choice=input.nextInt();
				
				choice =CheckTheInput(choice);
	    
	    
				//interface with the user
				while(true){
					
					if(choice==0){
						System.out.println("Thanks for using my program");
						CreateFile();
						PrintFile();						
						break;
					}
					else if(choice==1){
						//System.out.println(devicesOrdered.toString());
						PrintList();
						System.out.println("Choose the Category you want:");
						System.out.println("-1.ImageSound -2.Gaming -3.HomeApp");
						
						choiceOfCategory=input.nextInt();
						choiceOfCategory=CheckTheInputOfChoise1(choiceOfCategory);
						 
						 if(choiceOfCategory==1) {
							 System.out.println("Choose the Category you want:");
							 System.out.println("-1.TV -2.BlueRay/DvD players -3.Photo");
							 
							 choiceOfCategoryImageSound=input.nextInt();
							 choiceOfCategoryImageSound=CheckTheInputOfChoise1( choiceOfCategoryImageSound);							 
							 
							 if(choiceOfCategoryImageSound==1) {
								 MenuChoisesFromUser(imgTV,imgTV2);
							 }
							 else if(choiceOfCategoryImageSound==2) {								 
								 MenuChoisesFromUser(imgDVD,imgDVD2);								 
							 }
							 else {
								 MenuChoisesFromUser(imgPhoto,imgPhoto2);								 
							 }	 							 
						 }
						 else if(choiceOfCategory==2) {
							 MenuChoisesFromUser(game,game2);									 
						 }
						 else {
							 
							 System.out.println("Choose the Category you want:");
							 System.out.println("-1.Fridge -2.WashingMachine");
							 
							 choiceOfCategoryHomeApp=input.nextInt();
							
							 
							 if(choiceOfCategoryHomeApp==1) {
								 MenuChoisesFromUser(hoappFridge,hoappFridge2);
								 
							 }
							 else {
								 MenuChoisesFromUser(hoappWashingMachine,hoappWashingMachine2);
								 
							 }
							 
						 }		
						
					}
					else if(choice==2){
						
					System.out.println(ord.toString());
					CreateFileUserOrder();
					PrintFileOrder();
						
					}
					else if(choice==3){
						System.out.println(sl.toString());
						CreateFileUserSale();
						PrintFileSale();											
					}					
					System.out.println("You can choose again:");					 
					PrintChoices();
								
					choice=input.nextInt();
					choice = CheckTheInput(choice);				
				}//End while
	    		
	}
	
	
	public static void MenuChoisesFromUser(Appliances object1,Appliances object2) {
		
		 System.out.println("Choose the model:");
		 System.out.println("1." + object1.getModel() + " \n" + "2." +object2.getModel());
		 
		 System.out.println("Write your model:");
		 choiceModel=input.nextInt();
		 	
		 if(choiceModel==1) {
			 MenuChoisesFromUserToSelectTheProduct(object1);	 
		 }
		 else {
			 MenuChoisesFromUserToSelectTheProduct(object2);
		 }
	}
	
	public static void MenuChoisesFromUserToSelectTheProduct(Appliances object) {
		
		 System.out.println(object.toString());
		 System.out.println("The number of Available Pieces are: " + object.getAvailablePieces() );
		 System.out.println(("Enter the number you want to order:"));
		
		 numberOfOrderFromUser=input.nextInt();
		 
		 if(object.getAvailablePieces()-numberOfOrderFromUser>=0) {
			 object.setAvailablePieces(object.getAvailablePieces()-numberOfOrderFromUser);
			 Checkout(object, numberOfOrderFromUser,1); 
			 
		 }
		 else {		
			 System.out.println("Not enough products availble,Would you like to order them: \n" + "1.Yes" + "\n" +  "2.No"  );						 
			 choiceOfBuy=input.nextInt();
			 
			 if( choiceOfBuy==1) {				
				 Checkout(object,numberOfOrderFromUser,2); 
			 }
			 else {
				 System.out.println("Thank you for your Time");
			 }			 
		 }
	}
	
	
	public static void Checkout(Appliances object ,int  numberOfOrderFromUser,int availability) {
		
		Scanner in =new Scanner(System.in);
				
		String FullnameOfUser;
		System.out.println("Give me your Full Name:");
		FullnameOfUser=in.nextLine();
		
		long phonenumber;
		System.out.println("Give me your Phonenumber:");
		phonenumber=in.nextLong();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime DeliveryDate= LocalDateTime.now().plusDays(10);
		  
		   
		int cost = (int) (object.getPrice() - (object.getPrice()*object.getDiscount()));
		   
		System.out.println("The price of your model is: " + object.getPrice() + " and with the discount of this product the price has become : "  + cost );
		   
		int finalCost=cost*numberOfOrderFromUser;
		   
		System.out.println(("The final cost of your order is " +  finalCost + "\n" ));
		   
		   if(availability==2) {		   
			   UserOrder uorder = new UserOrder(object.getModel(),FullnameOfUser,phonenumber,now,DeliveryDate,finalCost,"Pending");		   
			   ord.add(uorder);      
		   }
		   else {
			   UserSale us = new UserSale(object.getModel(),FullnameOfUser,phonenumber,now,finalCost);
			   sl.add(us);
			   }		
	}
	
	
	
	public static int    CheckTheInput(int choice) {
		
		 while(choice<0 || choice>3) {
		    	System.out.println("Please give the number between 0 to 3");
		    	choice=input.nextInt();		    	
		    }
		 return choice;
		
	}
	
	public static int   CheckTheInputOfChoise1(int choice) {
		
		 while(choice<1 || choice>3) {
		    	System.out.println("Please give the number between 1 to 3");
		    	choice=input.nextInt();
		    }
		 return choice;
		
	}
			
	
	public static void PrintChoices() {
		
		System.out.println("----------------------------------------");
		System.out.println("Give the number of choice you want: \n");
	    System.out.println("#1 - Overview of all available devices ");
	    System.out.println("#2 - Review of all orders");
	    System.out.println("#3 - Review of all Sales");
	    System.out.println("#0 - Exit");
	    System.out.println("---------------------------------------- \n");
	    System.out.println("Choise:");
		
	}
	
	

	
	public static void PrintList (){
		System.out.println("---- Printing List... ----");
		for (Appliances product:devicesOrdered)
			System.out.println(product);
	}
	
	public static void PrintFile(){
		
		System.out.println("---- Printing File... ----");
		
		try{
			
			BufferedReader reader = new BufferedReader(new FileReader(new File("products.txt")));
			String line = reader.readLine();
			while (line!=null){
				System.out.println(line);
				line = reader.readLine();
			}//dvd
			reader.close();
				
		}//try
			
		catch (IOException e) {
			System.err.println("Error writing file.");
		}	
	} // PrintFile	

	public static void PrintFileOrder(){
	
		System.out.println("---- Printing File... ----");
		
		try{
			
			BufferedReader reader = new BufferedReader(new FileReader(new File("productsOrder.txt")));
			String line = reader.readLine();
			while (line!=null){
				System.out.println(line);
				line = reader.readLine();
			}//dvd
			reader.close();
				
		}//try
			
		catch (IOException e) {
			System.err.println("Error writing file.");
		}	
	} // PrintFile	


	public static void PrintFileSale(){
	
		System.out.println("---- Printing File... ----");
		
		try{
			
			BufferedReader reader = new BufferedReader(new FileReader(new File("productsSale.txt")));
			String line = reader.readLine();
			while (line!=null){
				System.out.println(line);
				line = reader.readLine();
			}//dvd
			reader.close();
				
		}//try
			
		catch (IOException e) {
			System.err.println("Error writing file.");
		}	
	} // PrintFile	
	public static void CreateFile () {
			
			System.out.println(" >>>>>>> Write data from ARRAYLIST to FILE...");
			
			FileWriter writer = null;

			try	{
				writer = new FileWriter(new File("products.txt"));
			
				for (Appliances product:devicesOrdered)

					if (product instanceof ImageSound) {
						if(product.getSectionprint()==1) {
						writer.write ("Product"+"\n"+"{"+"\n"+"\t"+"Item TV "
									+"\n"+"\t"+"Code "+ product.getCode()
									+ "\n"+"\t"+"NameModel "+ product.getNameModel()
									+ "\n"+"\t"+"YearModel "	+ product.getYearModel()
									+ "\n"+"\t"+"NameConstructor  "	+ product.getNameConstructor()
									+ "\n"+"\t"+"Price " + product.getPrice()
									+ "\n"+"\t"+"availablePieces " + product.getAvailablePieces()
									+ "\n"+"\t"+"type " + ((ImageSound) product).getType()
									+ "\n"+"\t"+"ScreenDimension " + ((ImageSound) product).getScreenDimension()
									+ "\n"+"\t"+"analysis " + ((ImageSound) product).getAnalysis()
									+ "\n"+"\t"+"Ports " + ((ImageSound) product).getPorts()
									
									+ "\n"+"}"+"\n");
					}
						else if(product.getSectionprint()==2) {
							writer.write ("Product"+"\n"+"{"+"\n"+"\t"+"Item DVD "
									+"\n"+"\t"+"Code "+ product.getCode()
									+ "\n"+"\t"+"NameModel "+ product.getNameModel()
									+ "\n"+"\t"+"YearModel "	+ product.getYearModel()
									+ "\n"+"\t"+"NameConstructor  "	+ product.getNameConstructor()
									+ "\n"+"\t"+"Price " + product.getPrice()
									+ "\n"+"\t"+"availablePieces " + product.getAvailablePieces()
									+ "\n"+"\t"+"type " + ((ImageSound) product).getType()
									+ "\n"+"\t"+"analysis " + ((ImageSound) product).getAnalysis()
									+ "\n"+"\t"+"FormatReproduction " + ((ImageSound) product).getFormatReproduction()
									+ "\n"+"}"+"\n");
					}//
						else {
							
							writer.write ("Product"+"\n"+"{"+"\n"+"\t"+"Item Photo "
									+"\n"+"\t"+"Code "+ product.getCode()
									+ "\n"+"\t"+"NameModel "+ product.getNameModel()
									+ "\n"+"\t"+"YearModel "	+ product.getYearModel()
									+ "\n"+"\t"+"NameConstructor  "	+ product.getNameConstructor()
									+ "\n"+"\t"+"Price " + product.getPrice()
									+ "\n"+"\t"+"availablePieces " + product.getAvailablePieces()
									+ "\n"+"\t"+"type " + ((ImageSound) product).getType()
									+ "\n"+"\t"+"megapixel " + ((ImageSound) product).getMegapixel()
									+ "\n"+"\t"+"OpticalZoom " + ((ImageSound) product).getOpticalZoom()
									+ "\n"+"\t"+"DigitalZoom " + ((ImageSound) product).getDigitalZoom()
									+ "\n"+"\t"+"ScreenSize " + ((ImageSound) product).getScreenSize()
									+ "\n"+"}"+"\n");
					}													
					}
						else if (product instanceof Gaming) {
							writer.write ("Product"+"\n"+"{"+"\n"+"\t"+"Item Conslone "
									+"\n"+"\t"+"Code "+ product.getCode()
									+ "\n"+"\t"+"NameModel "+ product.getNameModel()
									+ "\n"+"\t"+"YearModel "	+ product.getYearModel()
									+ "\n"+"\t"+"NameConstructor  "	+ product.getNameConstructor()
									+ "\n"+"\t"+"Price " + product.getPrice()
									+ "\n"+"\t"+"availablePieces " + product.getAvailablePieces()
									+ "\n"+"\t"+"type " + ((Gaming) product).getType()
									+ "\n"+"\t"+"Cpu " + ((Gaming) product).getCpu()
									+ "\n"+"\t"+"Gpu " + ((Gaming) product).getGpu()
									+ "\n"+"\t"+"Sound " + ((Gaming) product).getSound()
									+ "\n"+"\t"+"CapacityStorage " + ((Gaming) product).getCapacityStorage()
									+ "\n"+"}"+"\n");									

					}//
						else if (product instanceof HomeApp) {
							if(product.getSectionprint()==1) {
							writer.write ("Product"+"\n"+"{"+"\n"+"\t"+"Item Fridge "+"\n"+"\t"				
									+"Code "+ product.getCode()
									+ "\n"+"\t"+"NameModel "+ product.getNameModel()
									+ "\n"+"\t"+"YearModel "	+ product.getYearModel()
									+ "\n"+"\t"+"NameConstructor  "	+ product.getNameConstructor()
									+ "\n"+"\t"+"Price " + product.getPrice()
									+ "\n"+"\t"+"availablePieces " + product.getAvailablePieces()
									+ "\n"+"\t"+"type " + ((HomeApp) product).getType()
									+ "\n"+"\t"+"EnergyClass " + ((HomeApp) product).getEnergyClass()
									+ "\n"+"\t"+"MaintenanceCapacity " + ((HomeApp) product).getMaintenanceCapacity()
									+ "\n"+"\t"+"FreezingCapacity " + ((HomeApp) product).getFreezingCapacity()
									+ "\n"+"}"+"\n");
						}
						else {
							writer.write ("Product"+"\n"+"{"+"\n"+"\t"+"Item WashingMachine "+"\n"+"\t"				
									+"Code "+ product.getCode()
									+ "\n"+"\t"+"NameModel "+ product.getNameModel()
									+ "\n"+"\t"+"YearModel "	+ product.getYearModel()
									+ "\n"+"\t"+"NameConstructor  "	+ product.getNameConstructor()
									+ "\n"+"\t"+"Price " + product.getPrice()
									+ "\n"+"\t"+"availablePieces " + product.getAvailablePieces()
									+ "\n"+"\t"+"EnergyClass " + ((HomeApp) product).getEnergyClass()
									+ "\n"+"\t"+"Capacity " + ((HomeApp) product).getCapacity()
									+ "\n"+"\t"+"Turns " + ((HomeApp) product).getTurns()
									
									+ "\n"+"}"+"\n");	
						}
					}				
					writer.close();
					
				}//try
				
				catch (IOException e) {
					System.err.println("Error writing file.");
				}		
	}



	static void CreateFileUserSale () {
	
		System.out.println(" >>>>>>> Write data from ARRAYLIST to FILE...");
		
		FileWriter writer = null;

		try	{
			writer = new FileWriter(new File("productsSale.txt"));
		
			for (UserSale product:sl)

				 
				writer.write ("Product"+"\n"+"{"+"\n"+"\t"+"Item TV "
					+"\n"+"\t"+"Model "+  product.getModel()
					+ "\n"+"\t"+"FullnameOfUser "+ product.getFullName()
					+ "\n"+"\t"+"phonenumber "	+ product.getPhoneNumber()
					+ "\n"+"\t"+"SaleDate " + product.getSaleDate()
					+ "\n"+"\t"+"finalCost " + product.getFinalCost()	
					+ "\n"+"}"+"\n");
					
				writer.close();
			
		}//try		
		catch (IOException e) {
			System.err.println("Error writing file.");
		}
					
	
	}

	public static void CreateFileUserOrder () {
		
		System.out.println(" >>>>>>> Write data from ARRAYLIST to FILE...");
		
		FileWriter writer = null;

		try	{
			writer = new FileWriter(new File("productsOrder.txt"));
		
			for (UserOrder product:ord)			 
				writer.write ("Product"+"\n"+"{"+"\n"+"\t"+"Item TV "
					+"\n"+"\t"+"Model "+  product.getModel()
					+ "\n"+"\t"+"FullnameOfUser "+ product.getFullName()
					+ "\n"+"\t"+"phonenumber "	+ product.getPhoneNumber()
					+ "\n"+"\t"+"Order Date  "	+ product.getOrderDate()
					+ "\n"+"\t"+"Delvery Date  "	+ product.getDeliveryDate()
					+ "\n"+"\t"+"finalCost " + product.getFinalCost()	
					+ "\n"+"}"+"\n");					
			writer.close();		
		}//try		
		catch (IOException e) {
			System.err.println("Error writing file.");
		}
		
	}

}



	
	
		


