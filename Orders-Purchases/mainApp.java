import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;  
import java.util.Scanner;

public class mainApp {
	
	public static  Scanner input =new Scanner(System.in);	
	public  static int choiceOfCategory ,choiceOfCategoryImageSound, choiceOfCategoryHomeApp, numberOfOrderFromUser, choiceModel, choiceOfBuy;
	
	  //List of Orders and Sales	    
	  static ArrayList<UserOrder> ord=new ArrayList();
	  static ArrayList<UserSale> sl=new ArrayList();

	  public static void main(String[] args) {
				
		Scanner in =new Scanner(System.in);
		
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
			
		 
		//List for orders
		 ArrayList<Appliances> devicesOrdered=new ArrayList();
			 
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
		 	    
		 //User input
	   	 PrintChoices();	    
	  	 int choice=input.nextInt();	    
	   	 choice =CheckTheInput(choice);
	        
	    //interface with the user
	    while(true){
	    	
	    	if(choice==0){
	    		System.out.println("Thanks for using my program");
	    		break;
	    	}
	    	else if(choice==1){
	    		System.out.println(devicesOrdered.toString());
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
	    	}
	    	else if(choice==3){
	    		System.out.println(sl.toString());	 	    		
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
}
