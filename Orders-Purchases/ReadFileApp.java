import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.*;
import java.io.*;


public class ReadFileApp {
	
	
	public ArrayList<Appliances> devicesOrdered=new ArrayList();;

	public void ReadFile(){
		
		BufferedReader reader = null;
		Appliances product = null;
        String line;
		System.out.println("\n >>>>>>> Adding Objects (Items) from File to List ...");
        try {
			reader = new BufferedReader(new FileReader(new File("ImageSoundText.txt")));
            line = reader.readLine();
            while (line != null) {
                if (line.trim().equals("Product")) {
                    line = reader.readLine();
                    if (line.trim().equals("{")) {
                        line = reader.readLine();
                        if (line.trim().startsWith("Item ")) {
                            if (line.trim().substring(5).trim().equals("TV")) {
                                product = new ImageSound();
                                line = reader.readLine();
                                if (line.trim().startsWith("Code "))
                                    product.setCode(Integer.parseInt(line.substring(5).trim()));
                                line = reader.readLine();
                                if (line.trim().startsWith("NameModel"))
                                    product.setNameModel(line.trim().substring(10).trim());
                                line = reader.readLine();
                                if (line.trim().startsWith("YearModel "))
                                   product.setYearModel(Integer.parseInt(line.substring(10).trim()));
                                line = reader.readLine();
                                if (line.trim().startsWith("NameConstructor "))
                                    product.setNameConstructor(line.trim().substring(10).trim());
                                line = reader.readLine();
                                if (line.trim().startsWith("Price "))
                                    product.setPrice(Integer.parseInt(line.substring(6).trim()));
                                line = reader.readLine();
                                if (line.trim().startsWith("availablePieces "))
                                    product.setAvailablePieces(Integer.parseInt(line.substring(16).trim()));
                                line = reader.readLine();
                                if (line.trim().startsWith("type "))
                                	 ((ImageSound) product).setType(line.substring(5).trim());
                                line = reader.readLine();
                                if (line.trim().startsWith("ScreenDimension "))
                                	 ((ImageSound) product).setScreenDimension(Integer.parseInt(line.substring(16).trim()));
                                line = reader.readLine();
                                if (line.trim().startsWith("analysis "))
                               	 ((ImageSound) product).setAnalysis(line.substring(9).trim());
                               line = reader.readLine();
                               if (line.trim().startsWith("Ports "))
                                 	 ((ImageSound) product).setPorts(line.substring(6).trim());
                                 line = reader.readLine();
                               if (line.trim().equals("}"))
                                	devicesOrdered.add(product);
                                
							} // DVD
							else if (line.trim().substring(5).trim().equals("DVD")) {
								product = new ImageSound();
                                line = reader.readLine();
                                if (line.trim().startsWith("Code "))
                                    product.setCode(Integer.parseInt(line.substring(5).trim()));
                                line = reader.readLine();
                                if (line.trim().startsWith("NameModel"))
                                    product.setNameModel(line.trim().substring(10).trim());
                                line = reader.readLine();
                                if (line.trim().startsWith("YearModel "))
                                   product.setYearModel(Integer.parseInt(line.substring(10).trim()));
                                line = reader.readLine();
                                if (line.trim().startsWith("NameConstructor "))
                                    product.setNameConstructor(line.trim().substring(10).trim());
                                line = reader.readLine();
                                if (line.trim().startsWith("Price "))
                                    product.setPrice(Integer.parseInt(line.substring(6).trim()));
                                line = reader.readLine();
                                if (line.trim().startsWith("availablePieces "))
                                    product.setAvailablePieces(Integer.parseInt(line.substring(16).trim()));
                                line = reader.readLine();
                                if (line.trim().startsWith("type "))
                               	 ((ImageSound) product).setType(line.substring(5).trim());
                               line = reader.readLine();
                               if (line.trim().startsWith("analysis "))
                               	 ((ImageSound) product).setAnalysis(line.substring(9).trim());
                               line = reader.readLine();
                               if (line.trim().startsWith("FormatReproduction "))
                                 	 ((ImageSound) product).setFormatReproduction(line.substring(19).trim());
                                 line = reader.readLine();
                                if (line.trim().equals("}"))
                                	devicesOrdered.add(product);
                            }//DVD
                         //Photo
						else if (line.trim().substring(5).trim().equals("Photo")) {
							product = new ImageSound();
                            line = reader.readLine();
                            if (line.trim().startsWith("Code "))
                                product.setCode(Integer.parseInt(line.substring(5).trim()));
                            line = reader.readLine();
                            if (line.trim().startsWith("NameModel"))
                                product.setNameModel(line.trim().substring(10).trim());
                            line = reader.readLine();
                            if (line.trim().startsWith("YearModel "))
                               product.setYearModel(Integer.parseInt(line.substring(10).trim()));
                            line = reader.readLine();
                            if (line.trim().startsWith("NameConstructor "))
                                product.setNameConstructor(line.trim().substring(10).trim());
                            line = reader.readLine();
                            if (line.trim().startsWith("Price "))
                                product.setPrice(Integer.parseInt(line.substring(6).trim()));
                            line = reader.readLine();
                            if (line.trim().startsWith("availablePieces "))
                                product.setAvailablePieces(Integer.parseInt(line.substring(16).trim()));
                            line = reader.readLine();
                            if (line.trim().startsWith("type "))
                           	 ((ImageSound) product).setType(line.substring(5).trim());
                           line = reader.readLine();
                           if (line.trim().startsWith("megapixel "))
                           	 ((ImageSound) product).setMegapixel(Integer.parseInt(line.substring(10).trim()));
                           line = reader.readLine();
                           if (line.trim().startsWith("OpticalZoom "))
                             	 ((ImageSound) product).setOpticalZoom(line.substring(12).trim());
                             line = reader.readLine();
                             if (line.trim().startsWith("DigitalZoom "))
                             	 ((ImageSound) product).setDigitalZoom(line.substring(12).trim());
                             line = reader.readLine();
                             if (line.trim().startsWith("ScreenSize "))
                             	 ((ImageSound) product).setScreenSize(Integer.parseInt(line.substring(11).trim()));
                             line = reader.readLine();
                            if (line.trim().equals("}"))
                            	devicesOrdered.add(product);
                        }//Console
						else if (line.trim().substring(5).trim().equals("Console")) {
							product = new Gaming();
                            line = reader.readLine();
                            if (line.trim().startsWith("Code "))
                                product.setCode(Integer.parseInt(line.substring(5).trim()));
                            line = reader.readLine();
                            if (line.trim().startsWith("NameModel"))
                                product.setNameModel(line.trim().substring(10).trim());
                            line = reader.readLine();
                            if (line.trim().startsWith("YearModel "))
                               product.setYearModel(Integer.parseInt(line.substring(10).trim()));
                            line = reader.readLine();
                            if (line.trim().startsWith("NameConstructor "))
                                product.setNameConstructor(line.trim().substring(10).trim());
                            line = reader.readLine();
                            if (line.trim().startsWith("Price "))
                                product.setPrice(Integer.parseInt(line.substring(6).trim()));
                            line = reader.readLine();
                            if (line.trim().startsWith("availablePieces "))
                                product.setAvailablePieces(Integer.parseInt(line.substring(16).trim()));
                            line = reader.readLine();
                            if (line.trim().startsWith("type "))
                           	 ((Gaming) product).setType(line.substring(5).trim());
                           line = reader.readLine();
                           if (line.trim().startsWith("Cpu "))
                           	 ((Gaming) product).setCpu(line.substring(4).trim());
                           line = reader.readLine();
                           if (line.trim().startsWith("Gpu "))
                             	 ((Gaming) product).setGpu(line.substring(4).trim());
                             line = reader.readLine();
                             if (line.trim().startsWith("Sound "))
                             	 ((Gaming) product).setSound(line.substring(12).trim());
                             line = reader.readLine();
                             if (line.trim().startsWith("CapacityStorage "))
                             	 ((Gaming) product).setCapacityStorage(line.substring(16).trim());
                             line = reader.readLine();
                            if (line.trim().equals("}"))
                            	devicesOrdered.add(product);
                        }//Console
                          //Fridge
						else if (line.trim().substring(5).trim().equals("Fridge")) {
							product = new HomeApp();
                            line = reader.readLine();
                            if (line.trim().startsWith("Code "))
                                product.setCode(Integer.parseInt(line.substring(5).trim()));
                            line = reader.readLine();
                            if (line.trim().startsWith("NameModel"))
                                product.setNameModel(line.trim().substring(10).trim());
                            line = reader.readLine();
                            if (line.trim().startsWith("YearModel "))
                               product.setYearModel(Integer.parseInt(line.substring(10).trim()));
                            line = reader.readLine();
                            if (line.trim().startsWith("NameConstructor "))
                                product.setNameConstructor(line.trim().substring(10).trim());
                            line = reader.readLine();
                            if (line.trim().startsWith("Price "))
                                product.setPrice(Integer.parseInt(line.substring(6).trim()));
                            line = reader.readLine();
                            if (line.trim().startsWith("availablePieces "))
                                product.setAvailablePieces(Integer.parseInt(line.substring(16).trim()));
                            line = reader.readLine();
                            if (line.trim().startsWith("type "))
                           	 ((HomeApp) product).setType(line.substring(5).trim());
                           line = reader.readLine();
                           if (line.trim().startsWith("EnergyClass "))
                           	 ((HomeApp) product).setEnergyClass(line.substring(12).trim());
                           line = reader.readLine();
                           if (line.trim().startsWith("MaintenanceCapacity "))
                             	 ((HomeApp) product).setMaintenanceCapacity(line.substring(20).trim());
                             line = reader.readLine();
                             if (line.trim().startsWith("FreezingCapacity "))
                             	 ((HomeApp) product).setFreezingCapacity(line.substring(17).trim());
                             line = reader.readLine();
                            if (line.trim().equals("}"))
                            	devicesOrdered.add(product);
                        }//Fridge
                          //WashingMachine
						else if (line.trim().substring(5).trim().equals("WashingMachine")) {
							product = new HomeApp();
                            line = reader.readLine();
                            if (line.trim().startsWith("Code "))
                                product.setCode(Integer.parseInt(line.substring(5).trim()));
                            line = reader.readLine();
                            if (line.trim().startsWith("NameModel"))
                                product.setNameModel(line.trim().substring(10).trim());
                            line = reader.readLine();
                            if (line.trim().startsWith("YearModel "))
                               product.setYearModel(Integer.parseInt(line.substring(10).trim()));
                            line = reader.readLine();
                            if (line.trim().startsWith("NameConstructor "))
                                product.setNameConstructor(line.trim().substring(10).trim());
                            line = reader.readLine();
                            if (line.trim().startsWith("Price "))
                                product.setPrice(Integer.parseInt(line.substring(6).trim()));
                            line = reader.readLine();
                            if (line.trim().startsWith("availablePieces "))
                                product.setAvailablePieces(Integer.parseInt(line.substring(16).trim()));
                            line = reader.readLine();
                            if (line.trim().startsWith("type "))
                           	 ((HomeApp) product).setType(line.substring(5).trim());
                           line = reader.readLine();
                           if (line.trim().startsWith("EnergyClass "))
                           	 ((HomeApp) product).setEnergyClass(line.substring(12).trim());
                           line = reader.readLine();
                           if (line.trim().startsWith("Capacity "))
                             	 ((HomeApp) product).setCapacity(line.substring(9).trim());
                             line = reader.readLine();
                             if (line.trim().startsWith("Turns "))
                             	 ((HomeApp) product).setTurns(Integer.parseInt(line.substring(6).trim()));
                             line = reader.readLine();
                            if (line.trim().equals("}"))
                            	devicesOrdered.add(product);
                        }//WashingMachine
                            
                            
                        } //Item
                    }
                } //Product
				line = reader.readLine();
				
			}//while
			reader.close();
			
		} //try

		catch (IOException e) {
            System.out.println	("Error reading line ...");
		}
	
	} 
}
