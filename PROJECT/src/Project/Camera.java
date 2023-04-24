package Project;
import java.util.Scanner;
public class Camera {

	private static Scanner scan;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		String hpNum;
		String email;
		String camera="";
		String acs="";
		String deliveryTo = "";
		int warranty;
		double priceCam = 0;
		double priceAcs = 0;
		double priceWty = 0;
		double total;
		double deliveryFee=0;
		double protectionFee;
		int discount = 0;
		int menuChoice;
		int cameraChoice;
		int typeChoice;
		int brandChoice;
		int priceChoice;
		char protectionC;
		char buyCam;
		char buyAcs;
		int camC = 0;
		int acsC;
		int deliC;
		int numCam = 0;
		int numAcs = 0;
		double totCam = 0;
		double totAcs = 0;
		char keepGoing = 'N';
		
		scan = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		name = scan.next();
		System.out.print("Please enter your contact number: ");
		hpNum = scan.next();
		System.out.print("Please enter your email: ");
		email = scan.next();
		
		System.out.println(" 	              _____             ");
		System.out.println("  	     ___     / [X] \\    _____    ");
		System.out.println("	 __.|___|.__/_______\\__-LLLLL-__");
		System.out.println("	/                               \\");
		System.out.println("	|===============================|");
		System.out.println("	|            .-'''-.     [__]   |");
		System.out.println("	|           /.\"\"\"\"\".\\           |");
		System.out.println("	|          // /\" \"\\ \\\\_)        |");
		System.out.println("	|          \\\\ \\___/ //          |");
		System.out.println("	|           \\`.___.'/           |");
		System.out.println("	|============`-...-' ===========|");
		System.out.println("	\\@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/");
		System.out.println();
		System.out.println("########## WELCOME TO THE SHOTKIT SHOP ##########");
		System.out.println();
		
		
		do {
			
		System.out.println("---------------------MENU------------------------");
		System.out.println("1 Cameras Description List");
		System.out.println("2 Accessories List");
		System.out.println("3 Delivery and Warranty List");
		System.out.println("4 Discount / Free Gift List");
		System.out.println("5 To Buy");
		System.out.println("6 Exit");
		System.out.print("Please select a menu option: ");
		menuChoice = scan.nextInt();
		System.out.println("");
		
		switch(menuChoice)
		{
		case 1:
			System.out.println("===================CAMERA LISTS====================");
			System.out.println("What you consider when purchasing a camera?");
			System.out.println("1 Camera's Type");
			System.out.println("2 Camera's Brand");
			System.out.println("3 Camera's Price");
			System.out.print("Please select an option: ");
			cameraChoice = scan.nextInt();
			System.out.println();
			
			switch(cameraChoice)
			{
			case 1: 
				System.out.println("----------------Camera's Type-----------------");
				System.out.println("1 Compact camera");
				System.out.println("2 Mirrorless camera");
				System.out.println("3 Digital single-lens reflex camera(DSLR)");
				System.out.print("Please select an option: ");
				typeChoice = scan.nextInt();
				System.out.println();
				
				switch(typeChoice)
				{
				case 1:
					System.out.println("******************* Compact Type Camera ********************");
					System.out.println("////////////////////////////////////////////////////////////");
					cam1(priceCam);
					cam12(priceCam);
					cam14(priceCam);
					System.out.println();
					
					keepGoing = keepGoingMethod(keepGoing);
					System.out.println();
					break;

				case 2:

					System.out.println("***************** Mirrorless Type Camera *******************");
					System.out.println("////////////////////////////////////////////////////////////");
					cam2(priceCam);
					cam3(priceCam);
					cam8(priceCam);
					cam9(priceCam);
					cam10(priceCam);
					cam11(priceCam);
					cam13(priceCam);
					cam15(priceCam);
					
					keepGoing = keepGoingMethod(keepGoing);
					System.out.println();
					break;
					
				case 3:

					System.out.println("******************** DSLR Type Camera **********************");
					System.out.println("////////////////////////////////////////////////////////////");
					cam4(priceCam);
					cam5(priceCam);			
					cam6(priceCam);
					cam7(priceCam);
					
					keepGoing = keepGoingMethod(keepGoing);
					System.out.println();
					break;
					
				default: 
					System.out.println("Invalid number! Please try again. Thank you~");
					keepGoing = keepGoingMethod(keepGoing);
					System.out.println();

				}
				break;
				
			case 2:
				System.out.println("--------------Camera's Brand---------------");
				System.out.println("1 Canon");
				System.out.println("2 Nikon");
				System.out.println("3 FujiFilm");
				System.out.println("4 Sony");
				System.out.println("5 Leica");	
				System.out.print("Please select an option: ");
				brandChoice = scan.nextInt();
				System.out.println();
				
				switch(brandChoice)
				{
				case 1:

					System.out.println("************************** CANON ***************************");
					System.out.println("////////////////////////////////////////////////////////////");
					cam1(priceCam);
					cam2(priceCam);
					cam3(priceCam);
					cam4(priceCam);
					keepGoing = keepGoingMethod(keepGoing);
					System.out.println();
					break;
					
				case 2:
					
					System.out.println("************************** NIKON ***************************");
					System.out.println("////////////////////////////////////////////////////////////");
					cam5(priceCam);
					cam6(priceCam);
					cam7(priceCam);
					
					keepGoing = keepGoingMethod(keepGoing);
					System.out.println();
					break;
					
				case 3:

					System.out.println("************************ FUJIFILM **************************");
					System.out.println("////////////////////////////////////////////////////////////");
					cam8(priceCam);
					cam9(priceCam);
					cam10(priceCam);
					
					keepGoing = keepGoingMethod(keepGoing);
					System.out.println();
					break;
					
				case 4:
					
					System.out.println("************************** SONY ****************************");
					System.out.println("////////////////////////////////////////////////////////////");
					cam11(priceCam);
					cam12(priceCam);
					cam13(priceCam);
					
					keepGoing = keepGoingMethod(keepGoing);
					System.out.println();
					break;
					
				case 5:
					
					System.out.println("************************** LEICA ***************************");
					System.out.println("////////////////////////////////////////////////////////////");
					cam14(priceCam);
					cam15(priceCam);
					
					keepGoing = keepGoingMethod(keepGoing);
					System.out.println();
					break;
					
				default: 
					System.out.println("Invalid number! Please try again. Thank you~");
					keepGoing = keepGoingMethod(keepGoing);
					System.out.println();
				}
			
				break;
			case 3:
				System.out.println("--------------Camera's Price---------------");
				System.out.println("1 RM1500 - RM3000");
				System.out.println("2 RM3001 - RM5000");
				System.out.println("3 RM5001 - RM10000");
				System.out.println("4 More than RM10001");
				System.out.print("Please select an option: ");
				priceChoice = scan.nextInt();
				System.out.println();
				
				switch(priceChoice)
				{
				case 1:
					
					System.out.println("********************* RM1500 ~ RM3000 **********************");
					System.out.println("////////////////////////////////////////////////////////////");
					cam1(priceCam);
					cam2(priceCam);
					cam8(priceCam);
					cam5(priceCam);
					cam3(priceCam);
					cam11(priceCam);
					
					keepGoing = keepGoingMethod(keepGoing);
					System.out.println();
					break;
					
				case 2:
					
					System.out.println("********************* RM3001 ~ RM5000 **********************");
					System.out.println("////////////////////////////////////////////////////////////");
					cam12(priceCam);
					cam9(priceCam);
					cam4(priceCam);
					
					keepGoing = keepGoingMethod(keepGoing);
					System.out.println();
					break;

				case 3:
				
					System.out.println("********************* RM5001 ~ RM10000 *********************");
					System.out.println("////////////////////////////////////////////////////////////");
					cam6(priceCam);
					cam13(priceCam);
					cam10(priceCam);
					cam7(priceCam);
					
					keepGoing = keepGoingMethod(keepGoing);
					System.out.println();
					break;
					
				case 4:
					
					System.out.println("******************** More than RM10001 *********************");
					System.out.println("////////////////////////////////////////////////////////////");
					cam14(priceCam);
					cam15(priceCam);
					
					keepGoing = keepGoingMethod(keepGoing);
					System.out.println();
					break;
					
				default: 
					System.out.println("Invalid number! Please try again. Thank you~");
					keepGoing = keepGoingMethod(keepGoing);
					System.out.println();
				}
				break;
			}
			break;
		case 2:
			
			printAcsList ();
			keepGoing = keepGoingMethod(keepGoing);
			System.out.println();
			break;
			
		case 3:
			
			printDeliWtyList();
			keepGoing = keepGoingMethod(keepGoing);
			System.out.println();
			break;
			
		case 4:

			System.out.println("================== GIFT & DISCOUNT ====================");
			System.out.println();
			System.out.println("1. Camera price exceed RM 2000");
			freeGift2000();
			System.out.println(" - 10% Discount for other Accessories");
			System.out.println();
		
			System.out.println("2. Camera price exceed RM 3500");
			freeGift3500();
			System.out.println(" - 15% Discount for other Accessories");
			System.out.println();
		
			System.out.println("3. Camera price exceed RM 5000");
			freeGift5000();
			System.out.println(" - 20% Discount for other Accessories");
			System.out.println("=======================================================");
			
			keepGoing = keepGoingMethod(keepGoing);
			System.out.println();
			break;
		
		case 5:
			
			String nameCamera [] = new String[15];
			nameCamera[0] = "Canon G7X Mark II";
			nameCamera[1] = "Canon M200";
			nameCamera[2] = "Sony A6000";
			nameCamera[3] = "Nikon D5600 DX";
			nameCamera[4] = "Canon M50";
			nameCamera[5] = "FujiFilm X-A7";
			nameCamera[6] = "FujiFilm X-T30";
			nameCamera[7] = "Sony A6400";
			nameCamera[8] = "Canon 90D";
			nameCamera[9] = "Nikon D750";
			nameCamera[10] = "FujiFilm X100V";
			nameCamera[11] = "Sony A7 III";
			nameCamera[12] = "Nikon D850";
			nameCamera[13] = "Leica Q2";
			nameCamera[14] = "Leica M10";
	
			System.out.print("Do you want to buy camera(s)?(Y/N): ");
			buyCam = scan.next().charAt(0);
			System.out.println();
			
			if (buyCam == 'Y' || buyCam == 'y')
			{
			buyCamList();
			numCam = numCamMethod(numCam);
			for (int x=0; x<numCam; x++)
			{
			if (buyCam=='Y'|| buyCam=='y')
			{
				
				System.out.print("Please enter the code number of camera you want to buy(1-15): ");
				camC  = scan.nextInt();
				System.out.println("////////////////////////////////////////////////////////////");
				
				if (camC == 1)
				{
					priceCam = cam1(priceCam);

				}
				else if (camC == 2)
				{
					priceCam = cam2(priceCam);
				}
				else if (camC == 3)
				{
					priceCam = cam11(priceCam);
				}
				else if (camC == 4)
				{
					priceCam = cam5(priceCam);
				}		
				else if (camC == 5)
				{
					priceCam = cam3(priceCam);
				}
				else if (camC == 6)
				{
					priceCam = cam9(priceCam);
				}
				else if (camC == 7)
				{
					priceCam = cam8(priceCam);
				}
				else if (camC == 8)
				{
					priceCam = cam12(priceCam);
				}	
				else if (camC == 9)
				{
					priceCam = cam4(priceCam);
				}
				else if (camC == 10)
				{
					priceCam = cam6(priceCam);
				}
				else if (camC == 11)
				{
					priceCam = cam10(priceCam);
				}
				else if (camC == 12)
				{
					priceCam = cam13(priceCam);
				}
				else if (camC == 13)
				{
					priceCam = cam7(priceCam);
				}
				else if (camC == 14)
				{
					priceCam = cam14(priceCam);
				}
				else if (camC == 15)
				{
					priceCam = cam15(priceCam);
				}
				
				totCam = totCam + priceCam;
				System.out.println();
			}
			}
			
			}

			System.out.print("Do you wants to buy an accessories?(Y/N) : ");
			buyAcs = scan.next().charAt(0);
			System.out.println();
			
			
			if(buyAcs == 'Y' || buyAcs == 'y')
			{
			buyAcsList();
			
			numAcs = numAcsMethod(numAcs);
			for (int y=0; y<numAcs; y++)
			{
				
			if (buyAcs == 'Y' || buyAcs=='y')
			{
				String[] nameAcs = new String[11];
				nameAcs[0] = "Memory Card SanDisk Extreme 32GB";
				nameAcs[1] = "Memory Card SanDisk Extreme 64GB";
				nameAcs[2] = "Memory Card SanDisk Extreme 128GB";
				nameAcs[3] = "Tripod";
				nameAcs[4] = "Battery";
				nameAcs[5] = "Camera Strap";
				nameAcs[6] = "Camera Bag";
				nameAcs[7] = "Cleaning Kit";
				nameAcs[8] = "Wide Angle Lens(24mm-35mm)";
				nameAcs[9] = "Standard Lens(35mm-85mm)";
				nameAcs[10] = "Short Telephoto Lens(85mm-200mm)";
				
				double[] priceAcsArray = new double[11];
				priceAcsArray[0] = 32.9;
				priceAcsArray[1] = 61.9;
				priceAcsArray[2] = 119;
				priceAcsArray[3] = 75.5;
				priceAcsArray[4] = 99;
				priceAcsArray[5] = 39.9;
				priceAcsArray[6] = 79.9;
				priceAcsArray[7] = 30.9;
				priceAcsArray[8] = 249;
				priceAcsArray[9] = 349;
				priceAcsArray[10] = 549;
				
				System.out.print("Please enter the code number of accessory you want to buy(1-11): ");
				acsC  = scan.nextInt();
				
				if (acsC == 1)
				{
					acs = nameAcs[0];
					priceAcs = priceAcsArray[0];
				}
				else if (acsC == 2)
				{
					acs = nameAcs[1];
					priceAcs = priceAcsArray[1];
				}
				else if (acsC == 3)
				{
					acs = nameAcs[2];
					priceAcs = priceAcsArray[2];
				}
				else if (acsC == 4)
				{
					acs = nameAcs[3];
					priceAcs = priceAcsArray[3];
				}
				else if (acsC == 5)
				{
					acs = nameAcs[4];
					priceAcs = priceAcsArray[4];
				}
				else if (acsC == 6)
				{
					acs = nameAcs[5];
					priceAcs = priceAcsArray[5];
				}
				else if (acsC == 7)
				{
					acs = nameAcs[6];
					priceAcs = priceAcsArray[6];
				}
				else if (acsC == 8)
				{
					acs = nameAcs[7];
					priceAcs = priceAcsArray[7];
				}
				else if (acsC == 9)
				{
					acs = nameAcs[8];
					priceAcs = priceAcsArray[8];
				}
				else if (acsC == 10)
				{
					acs = nameAcs[9];
					priceAcs = priceAcsArray[9];
				}
				else if (acsC == 11)
				{
					acs = nameAcs[10];
					priceAcs = priceAcsArray[10];
				}
				
				else
				{
					System.out.println("Invalid number! Please try again~");
					keepGoing = keepGoingMethod(keepGoing);
				}
				
				totAcs = totAcs + priceAcs;
				System.out.println("Accessory: "+ acs);
				System.out.printf("Accessory's Price: RM%.2f\n", priceAcs);
				System.out.println();
				
			}
			}
			System.out.printf("Total Accessories Price: RM%.2f\n", totAcs);
			System.out.println();
			}
			buyDeliWtyList();
			System.out.print("Please enter the code number of delivery you prefer(1-3):");
			deliC = scan.nextInt();
			
			if (deliC == 1)
			{
				deliveryTo = "West Malaysia";
				deliveryFee = 6.9;
			}
			else if(deliC == 2)
			{
				deliveryTo = "East Malaysia";
				deliveryFee = 11.9;
			}
			else if(deliC == 3)
			{
				deliveryTo = "Overseas";
				deliveryFee = 20.9;
			}
			else 
			{
				System.out.println("Invalid number! Please try again~");
				keepGoing = keepGoingMethod(keepGoing);
				
			}
			System.out.println("Delivery Type: "+ deliveryTo);
			System.out.printf("Delivery Fee: RM%.2f\n", deliveryFee);
			System.out.println();
			
			System.out.print("Do you want to add-on Electronics Protection?(Y/N): ");
			protectionC = scan.next().charAt(0);
			
			if (protectionC == 'Y' || protectionC == 'y')
				protectionFee = 150.20;
			else
				protectionFee = 0;
			
			System.out.printf("Protection Fee: RM%.2f\n", protectionFee);
			System.out.println();
			
			System.out.print("Add-on Warranty (Years) max=3	: ");
			warranty = scan.nextInt();
			
			if (warranty == 0)
			{
				priceWty =0;
				System.out.println("Warranty: "+ warranty + "years");
				System.out.printf("Warranty Fee: RM%.2f", priceWty);
			}
			else if (warranty == 1)
			{
				priceWty = 50;
				System.out.println("Warranty: "+ warranty + "years");
				System.out.printf("Warranty Fee: RM%.2f", priceWty);
			}
			else if (warranty == 2)
			{	
				priceWty = 110;
				System.out.println("Warranty: "+ warranty + "years");
				System.out.printf("Warranty Fee: RM%.2f", priceWty);
			}
			else if (warranty == 3)
			{
				priceWty = 150;
				System.out.println("Warranty: "+ warranty + "years");
				System.out.printf("Warranty Fee: RM%.2f", priceWty);
			}
			else
			{
				System.out.println("Sorry~ The warranty can only add-on for 3 years in maximum");
				System.out.println("Please try again~");
				keepGoing = keepGoingMethod(keepGoing);
			}
			
			if (priceCam > 5000)
				discount = 20;
			else if (priceCam > 3500)
				discount = 15;
			else if (priceCam > 2000)
				discount = 10;
			
		
			total = totCam + deliveryFee + protectionFee + priceWty + totAcs*((100-discount)/100);
			
			System.out.println("");
			System.out.println("_____________________________________________________________________");
			System.out.println("                  WELCOME TO THE SHOTKIT SHOP ^.^                    ");
			System.out.println("                             INVOICE                                 ");
			System.out.println("_____________________________________________________________________");
			System.out.println("SHOTKIT SHOP" + "					" +java.time.LocalDate.now());
			System.out.println("06-2862660");
			System.out.println("shotkit@gmail.com");
			System.out.println("");
			System.out.println("Mr/Mrs " +name);
			System.out.println(hpNum);
			System.out.println(email);
			System.out.println();
			System.out.println("Number of camera                              : " + numCam);
			System.out.println("Number of accessories                         : " + numAcs);
			System.out.println("Add-on Warranty                               : " + warranty + "years");
			System.out.println();
			
			System.out.printf("Total camera(s) price                         : RM %.2f\n", totCam);
			System.out.printf("Total accessories's price                     : RM %.2f\n", totAcs);
			System.out.println("Discount for add-on accessories               : " + discount +"%");
			System.out.println();
			System.out.printf("Delivery Fee                                  : RM %.2f\n", deliveryFee);
			System.out.printf("Electronics Protection Fee                    : RM %.2f\n", protectionFee);
			System.out.printf("Warranty Price                                : RM %.2f\n", priceWty);
			System.out.println("_____________________________________________________________________");
			System.out.printf("Total                                         : RM %.2f\n", total);
			System.out.println("_____________________________________________________________________");
			System.out.println();
			
			System.out.printf("You'll get %d sets of free gifts below!: \n", numCam);
			if (totCam > 5000)
			{
				freeGift5000();
			}
			else if (totCam > 3500)
			{
				freeGift3500();
			}
			else if (totCam > 2000)
			{
				freeGift2000();
			}
			
			
			System.out.println();
			System.out.println("Thank you very much! See you again ~");
			keepGoing = 'N';
			break;
		
		case 6: 
			System.out.println("Thank you very much! See you again ~");
			keepGoing = 'N';
			break;
			
		default: 
			System.out.println("Please enter the number between 1 - 6 ~ Thank you");
			keepGoing = keepGoingMethod(keepGoing);
		}
		
		} while (keepGoing == 'Y' || keepGoing == 'y');
		
	}
	public static double cam1 (double priceCam)
	{
		System.out.println("Brand		: Canon");
		System.out.println("Camera		: G7X_Mark_II");
		System.out.println("Price		: RM 1779");
		System.out.println("Features	: - Versatile Zoom Range");
		System.out.println("		: - Robust Body");
		System.out.println("		: - Good in LowLight");
		System.out.println("		: - Great Image Quality");
		System.out.println("		: - 20.1 Megapixel CMOS sensor ");
		System.out.println("		: - New DIGIC 7 Imaging Processor");
		System.out.println("Weight		: 302g");
		System.out.println("Type		: Compact");
		System.out.println("////////////////////////////////////////////////////////////");
		priceCam = 1779;
		
		return priceCam;
	}
	
	public static double cam2 (double priceCam)
	{
		System.out.println("Brand		: Canon");
		System.out.println("Camera		: M200");
		System.out.println("Price		: RM 1999");
		System.out.println("Features	: - cost effective");
		System.out.println("		: - Easy to use");
		System.out.println("		: - novice camera");
		System.out.println("		: - 24.1MP APS-C CMOS Sensor");
		System.out.println("		: - DIGIC 8 Image Processor");
		System.out.println("		: - Weight: 262g");
		System.out.println("Weight		: 262g");
		System.out.println("Type		: Mirrorless");
		System.out.println("////////////////////////////////////////////////////////////");
		priceCam = 1999;
		return priceCam;
	}
	
	public static double cam3 (double priceCam)
	{
		System.out.println("Brand		: Canon");
		System.out.println("Camera		: M50");
		System.out.println("Price		: RM 2949");
		System.out.println("Features	: - Compact");
		System.out.println("		: - Easy to use");
		System.out.println("		: - Built-in Electronic Viewfinder");
		System.out.println("		: - Fast & Accurate");
		System.out.println("		: - 24.1Megapixel APS-C CMOS sensor ");
		System.out.println("		: - DIGIC 8 Image Processor");
		System.out.println("		: - Weight: 387g");
		System.out.println("Type		: Mirrorless");
		System.out.println("////////////////////////////////////////////////////////////");
		priceCam = 2949;
		return priceCam;
	}
	
	public static double cam4 (double priceCam)
	{
		System.out.println("Brand		: Canon");
		System.out.println("Camera		: 90D");
		System.out.println("Price		: RM 4599");
		System.out.println("Features	: - Great Image Quality");
		System.out.println("		: - High-speed Continuous Shooting");
		System.out.println("		: - Multi-controller Customization");
		System.out.println("		: - Versatile");
		System.out.println("		: - 32.5 Megapixel CMOS (APS-C) sensor");
		System.out.println("		: - DIGIC 8 image processor");
		System.out.println("		: - Weight: 701g");
		System.out.println("Type		: DSLR");
		System.out.println("////////////////////////////////////////////////////////////");
		priceCam = 4599;
		return priceCam;
	}
	
	public static double cam5 (double priceCam)
	{
		System.out.println("Brand		: Nikon");
		System.out.println("Camera		: D5600 DX");
		System.out.println("Price		: RM 2229");
		System.out.println("Features	: - Exceptional Image Quality");
		System.out.println("		: - Intuitive Controls");
		System.out.println("		: - Great Battery Life");
		System.out.println("		: - SnapBridge");
		System.out.println("		: - 24.2MP DX format CMOS sensor");
		System.out.println("		: - Ex peed 4 image processor");
		System.out.println("		: - Weight: 465g");
		System.out.println("Type		: DSLR");
		System.out.println("////////////////////////////////////////////////////////////");
		priceCam = 2229;
		return priceCam;
	}
	
	public static double cam6 (double priceCam)
	{
		System.out.println("Brand		: Nikon");
		System.out.println("Camera		: D750");
		System.out.println("Price		: RM 5090");
		System.out.println("Features	: - Vari-angle LCD Display");
		System.out.println("		: - Compact & Lightweight");
		System.out.println("		: - Powerful 51-point AF");
		System.out.println("		: - HD Video Capabilities");
		System.out.println("		: - 24.3 Megapixel CMOS image sensor");
		System.out.println("		: - expeed 4 image processor");
		System.out.println("		: - Weight: 750g");
		System.out.println("Type		: DSLR");
		System.out.println("////////////////////////////////////////////////////////////");
		priceCam = 5090;
		return priceCam;
	}
	
	public static double cam7 (double priceCam)
	{
		System.out.println("Brand		: Nikon");
		System.out.println("Camera		: D850");
		System.out.println("Price		: RM 9099");
		System.out.println("Features	: - Extraordinary Resolution");
		System.out.println("		: - Outstanding Battery Performance");
		System.out.println("		: -Tilting Touchscreen");
		System.out.println("		: - Outstanding Dynamic Range");
		System.out.println("		: - 45.7 megapixels of extraordinary resolution");
		System.out.println("		: - back side illuminated (BSI) full frame image sensor");
		System.out.println("		: - Weight: 915g");
		System.out.println("Type		: DSLR");
		System.out.println("////////////////////////////////////////////////////////////");
		priceCam = 9099;
		return priceCam;
	}
	
	public static double cam8 (double priceCam)
	{
		System.out.println("Brand		: FujiFilm");
		System.out.println("Camera		: X-T30");
		System.out.println("Price		: RM 3379");
		System.out.println("Features	: - Great Value for Money");
		System.out.println("		: - Robust Body");
		System.out.println("		: - Amazing Autofocus");
		System.out.println("		: - Excellent Image Quality");
		System.out.println("		: - Improved Low-Light Perfomance");
		System.out.println("		: - 26.1MP BSI APS-C X-Trans CMOS 4 image sensor");
		System.out.println("		: - X-Processor 4 quad-core CPU");
		System.out.println("Weight		: 383g");
		System.out.println("Type		: Compact");
		System.out.println("////////////////////////////////////////////////////////////");
		priceCam = 3379;
		return priceCam;
	}
	
	public static double cam9 (double priceCam)
	{
		System.out.println("Brand		: FujiFilm");
		System.out.println("Camera		: X-A7");
		System.out.println("Price		: RM 2999");
		System.out.println("Features	: - Film mode");
		System.out.println("		: - retro look");
		System.out.println("		: - HD picture quality");
		System.out.println("		: - 24.2 Megapixel APS-C CMOS sensor");
		System.out.println("		: - Weight: 271g");
		System.out.println("Type		: Mirrorless");
		System.out.println("////////////////////////////////////////////////////////////");
		priceCam = 2999;
		return priceCam;
	}
	
	public static double cam10 (double priceCam)
	{
		System.out.println("Brand		: FujiFilm");
		System.out.println("Camera		: X100V");
		System.out.println("Price		: RM 5899");
		System.out.println("Features	: - Iconic Design");
		System.out.println("		: - Amazing Lens Quality");
		System.out.println("		: - Hybrid Viewfinder");
		System.out.println("		: - Compact size");
		System.out.println("		: - 26.1MP X-Trans CMOS 4 sensor");
		System.out.println("		: - X-Processor 4 Image Processor");
		System.out.println("		: - Weight: 478g");
		System.out.println("Type		: Mirrorless");
		System.out.println("////////////////////////////////////////////////////////////");
		priceCam = 5899;
		return priceCam;
	}
	
	public static double cam11 (double priceCam)
	{
		System.out.println("Brand		: Sony");
		System.out.println("Camera		: A6000");
		System.out.println("Price		: RM 2199");
		System.out.println("Features	: - Hybrid AF");
		System.out.println("		: - Tilting LCD");
		System.out.println("		: - Up to 11 FPS Continuous Shooting");
		System.out.println("		: - Compact");
		System.out.println("		: - 24.2MP full frame image sensor");
		System.out.println("		: - BIONZ X Image Processor");
		System.out.println("		: - Weight: 344g");
		System.out.println("Type		: Mirrorless");
		System.out.println("////////////////////////////////////////////////////////////");
		priceCam = 2199;
		return priceCam;
	}
	
	public static double cam12 (double priceCam)
	{
		System.out.println("Brand		: Sony");
		System.out.println("Camera		: A6400");
		System.out.println("Price		: RM 3899");
		System.out.println("Features	: - Tracking focus");
		System.out.println("		: - Metal body");
		System.out.println("		: - strong battery life");
		System.out.println("		: - 24MP APS-C sensor");
		System.out.println("		: - New Bionz X processor");
		System.out.println("		: - Weight: 396g");
		System.out.println("Type		: Mirrorless");
		System.out.println("////////////////////////////////////////////////////////////");
		priceCam = 3899;
		return priceCam;
	}
	
	public static double cam13 (double priceCam)
	{
		System.out.println("Brand		: Sony");
		System.out.println("Camera		: A7 III");
		System.out.println("Price		: RM 8588.90");
		System.out.println("Features	: - AF supports A-mount Lenses");
		System.out.println("		: - New Sensor, Evolved Processor");
		System.out.println("		: - Continuous Shooting");
		System.out.println("		: - 693 Phase-detection");
		System.out.println("		: - Advanced 24.2MP BSI full frame Image Sensor w/ 1.8X readout speed");
		System.out.println("		: - BIONZ X Image Processor ");
		System.out.println("		: - Weight: 650g");
		System.out.println("Type		: Mirrorless");
		System.out.println("////////////////////////////////////////////////////////////");
		priceCam = 8588.9;
		return priceCam;
	}
	
	public static double cam14 (double priceCam)
	{
		System.out.println("Brand		: Leica");
		System.out.println("Camera		: Q2");
		System.out.println("Price		: RM 25260");
		System.out.println("Features	: - Ultimate Image Quality");
		System.out.println("		: - Beautiful Design");
		System.out.println("		: - Best EVF/Screen");
		System.out.println("		: - 47.3 Megapixel full frame sensor");
		System.out.println("Weight		: 718g");
		System.out.println("Type		: Compact");
		System.out.println("////////////////////////////////////////////////////////////");
		priceCam = 25260;
		return priceCam;
	}
	
	public static double cam15 (double priceCam)
	{
		System.out.println("Brand		: Leica");
		System.out.println("Camera		: M10");
		System.out.println("Price		: RM 27352");
		System.out.println("Features	: - pared-down physical design");
		System.out.println("		: - Rear LCD monitor");
		System.out.println("		: - slimmest camera body");
		System.out.println("		: - 24MP Full-Frame CMOS Sensor");
		System.out.println("		: - Leica Maestro II Image Processor");
		System.out.println("		: - Weight: 660g");
		System.out.println("Type		: Mirrorless");
		System.out.println("////////////////////////////////////////////////////////////");
		priceCam = 27352;
		return priceCam;
	}
	
	public static char keepGoingMethod (char keepGoing)
	{
		System.out.print("Do you want to keep going?(Y/N): ");
		keepGoing = scan.next().charAt(0);
		
		return keepGoing;
	}
	
	public static int numCamMethod (int numCam)
	{
		System.out.print("How many camera you want to buy?: ");
		numCam = scan.nextInt();
		return numCam;
	}
	
	public static int numAcsMethod(int numAcs)
	{
		System.out.print("How many accessories you want to buy?: ");
		numAcs = scan.nextInt();
		
		return numAcs;
	}
	
	public static void printAcsList ()
	{
		System.out.println("===================ACCESSORIES=============================PRICE========");
		System.out.println("1. Memory Card SanDisk Extreme 32GB 90 Mb/s Card	: RM 32.90");
		System.out.println("2. Memory Card SanDisk Extreme 64GB 90 Mb/s Card	: RM 61.90");
		System.out.println("3. Memory Card SanDisk Extreme 128GB 90 Mb/s Card	: RM 119.00");
		System.out.println("4. Tripod						: RM 75.50");
		System.out.println("5. Battery						: RM 99.00");
		System.out.println("6. Camera Strap						: RM 39.90");
		System.out.println("7. Camera Bag						: RM 79.90");
		System.out.println("8. Cleaning Kit						: RM 30.90");
		System.out.println("9. Wide Angle Lens(24mm-35mm)				: RM 249.00");
		System.out.println("10. Standard Lens(35mm-85mm)				: RM 349.00");
		System.out.println("11. Short Telephoto Lens(85mm-200mm)			: RM 549.00");
		System.out.println("========================================================================");
	}
	
	public static void printDeliWtyList()
	{
		System.out.println("===========DELIVERY FEE==================PRICE=========");
		System.out.println("	West Malaysia 		||	RM 6.90	");
		System.out.println(" 	East MAlaysia		||	RM 11.90");
		System.out.println(" 	Overseas		||	RM 20.90");
		System.out.println("	Electronics Protection 	||	RM 150.20");
		System.out.println("=======================================================");
		System.out.println();
	
		System.out.println("=======ADD-ON WARRANTY====================PRICE========");
		System.out.println("	  1 Year		||	  RM 50");
		System.out.println("   	  2 Years		||	  RM 110");
		System.out.println("   	  3 Years		||	  RM 150");
		System.out.println("=======================================================");
		System.out.println("# Manufacturer warranty --> 1 year");
		System.out.println();
	}
	
	public static void freeGift2000()
	{
		System.out.println(" - 32GB Memory Card");
		System.out.println(" - Camera Strap");
	}
	
	public static void freeGift3500()
	{
		System.out.println(" - 32GB Memory Card");
		System.out.println(" - Camera Strap");
		System.out.println(" - Camera Bag");
		System.out.println(" - Cleaning Kit");
	}
	
	public static void freeGift5000()
	{
		System.out.println(" - 32GB Memory Card");
		System.out.println(" - Camera Strap");
		System.out.println(" - Camera Bag");
		System.out.println(" - Cleaning Kit");
		System.out.println(" - Tripod");
		System.out.println(" - Battery");
	}
	
	public static void buyCamList()
	{
		System.out.println("=====================PRICE LISTS=====================");
		System.out.println("   Camera                                Price");
		System.out.println("-------------------------------------------------");
		System.out.println("1. Canon G7X Mark II                   : RM 1779");
		System.out.println("2. Canon M200                          : RM 1999");
		System.out.println("3. Sony A6000                          : RM 2199");
		System.out.println("4. Nikon D5600 DX                      : RM 2229");
		System.out.println("5. Canon M50                           : RM 2949");
		System.out.println("6. FujiFilm X-A7                       : RM 2999");
		System.out.println("7. FujiFilm X-T30                      : RM 3379");
		System.out.println("8. Sony A6400                          : RM 3899");
		System.out.println("9. Canon 90D                           : RM 4599");
		System.out.println("10. Nikon D750                         : RM 5090");
		System.out.println("11. FujiFilm X100V                     : RM 5899");
		System.out.println("12. Sony A7 III                        : RM 8588.90");
		System.out.println("13. Nikon D850                         : RM 9099");
		System.out.println("14. Leica Q2                           : RM 25260");
		System.out.println("15. Leica M10                          : RM 27352");
		System.out.println("=====================================================");
	}
	
	public static void buyAcsList()
	{
		System.out.println("=====================ACCESSORIES=====================");
		System.out.println("   Accessories                           Price");
		System.out.println("-----------------------------------------------------");
		System.out.println("1. Memory Card SanDisk Extreme 32GB    : RM 32.90");
		System.out.println("2. Memory Card SanDisk Extreme 64GB    : RM 61.90");
		System.out.println("3. Memory Card SanDisk Extreme 128GB   : RM 119.00");
		System.out.println("4. Tripod                              : RM 75.50");
		System.out.println("5. Battery                             : RM 99.00");
		System.out.println("6. Camera Strap                        : RM 39.90");
		System.out.println("7. Camera Bag                          : RM 79.90");
		System.out.println("8. Cleaning Kit                        : RM 30.90");
		System.out.println("9. Wide Angle Lens(24mm-35mm)          : RM 249.00");
		System.out.println("10. Standard Lens(35mm-85mm)           : RM 349.00");
		System.out.println("11. Short Telephoto Lens(85mm-200mm)   : RM 549.00");
		System.out.println("=====================================================");
	}
	
	public static void buyDeliWtyList()
	{
		System.out.println("====================DELIVERY FEE=====================");
		System.out.println("   Delivery Fee                          Price ");
		System.out.println("-----------------------------------------------------");
		System.out.println("1. West Malaysia                         RM 6.90	");
		System.out.println("2. East MAlaysia                         RM 11.90");
		System.out.println("3. Overseas                              RM 20.90");
		System.out.println("   Electronics Protection                RM 150.20");
		
		System.out.println("======================WARRANTY=======================");		
		System.out.println("   Add-On Warranty                       Price   ");
		System.out.println("-----------------------------------------------------");
		System.out.println("1. 1 Year                                RM 50");
		System.out.println("2. 2 Years                               RM 110");
		System.out.println("3. 3 Years                               RM 150");
		System.out.println("=====================================================");
		System.out.println("Protection Fee: RM150.20");
		System.out.println("# Manufacturer warranty --> 1 year");
	}

}
