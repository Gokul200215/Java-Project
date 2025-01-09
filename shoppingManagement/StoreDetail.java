package shoppingManagement;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StoreDetail {
	static int CstmId = 1;

	static int availDress = 12;
	static int availShirt = 2;
	static int availPhant = 2;
	static int availTraditional = 2;
	static int availTop = 2;
	static int availSkirt = 2;
	static int availSaree = 2;

	static List<Customer> PurcDetails = new ArrayList<Customer>();

	static void allocatedDress(Customer c) {
		Scanner sc = new Scanner(System.in);
		switch (c.getPrefDress()) {
		case 1:
			if (availShirt > 0) {
				System.out.println("MRP : 620\nDiscount : 10%\nTotal Amount : 558");
				int discount = (int) (620 * 0.9);
				System.out.print("Payment : ");
				int amt = sc.nextInt();
				if (amt == discount) {
					c.setAllocatedDress("Shirt");
					availShirt--;
					System.out.println("Purchased Sucessfully\nOrderId: " + CstmId);
					c.setPaidAmt(amt);
					System.out.println(c.getLd().now().withNano(0));
					c.setLd(LocalDateTime.now().withNano(0));
					c.setRntm(LocalDateTime.now().plusSeconds(100));
				} else {
					System.out.println("Invalid Amount");
				}
			} else {
				System.out.println("Out of Stock");
			}
			break;
		case 2:
			if (availPhant > 0) {
				System.out.println("MRP : 750\n10% Discount : 10%\nTotal Amount: 675");
				int discount = (int) (720 * 0.9);
				System.out.print("Payment : ");
				int amt = sc.nextInt();
				if (amt == discount) {
					c.setAllocatedDress("Phant");
					availPhant--;
					System.out.println("Purchased Sucessfully\nOrderId: " + CstmId);
					c.setPaidAmt(amt);
					System.out.println(c.getLd().now().withNano(0));
					c.setLd(LocalDateTime.now().withNano(0));
					c.setRntm(LocalDateTime.now().plusSeconds(100));
				} else {
					System.out.println("Invalid Amount");
				}
			} else {
				System.out.println("Out of Stock");
			}
			break;
		case 3:
			if (availTraditional > 0) {
				System.out.print("MRP : 1330\nDiscount : 10%\nTotal Amount: 1197");
				int discount = (int) (1330 * 0.9);
				System.out.print("Payment : ");
				int amt = sc.nextInt();
				if (amt == discount) {
					c.setAllocatedDress("TRADITIONAL");
					availTraditional--;
					System.out.println("Purchased Sucessfully\nOrderId: " + CstmId);
					c.setPaidAmt(amt);
					System.out.println(c.getLd().now().withNano(0));
					c.setLd(LocalDateTime.now().withNano(0));
					c.setRntm(LocalDateTime.now().plusSeconds(100));
				} else {
					System.out.println("Invalid Amount");
				}
			} else {
				System.out.println("Out of Stock");
			}
			break;
		case 4:
			if (availTop > 0) {
				System.out.println("MRP : 680\nDiscount : 10%\nTotal Amount: 612");
				int discount = (int) (680 * 0.9);
				System.out.print("Payment : ");
				int amt = sc.nextInt();
				if (amt == discount) {
					c.setAllocatedDress("Top");
					availTop--;
					System.out.println("Purchased Sucessfully\nOrderId: " + CstmId);
					c.setPaidAmt(amt);
					System.out.println(c.getLd().now().withNano(0));
					c.setLd(LocalDateTime.now().withNano(0));
					c.setRntm(LocalDateTime.now().plusSeconds(100));
				} else {
					System.out.println("Invalid Amount");
				}
			} else {
				System.out.println("Out of Stock");
			}
			break;
		case 5:
			if (availSkirt > 0) {
				System.out.println("MRP : 720\nDiscount : 10%\nTotal Amount: 648");
				int discount = (int) (720 * 0.9);
				System.out.print("Payment : ");
				int amt = sc.nextInt();
				if (amt == discount) {
					c.setAllocatedDress("Skirt");
					availSkirt--;
					System.out.println("Purchased Sucessfully\nOrderId: " + CstmId);
					c.setPaidAmt(amt);
					System.out.println(c.getLd().now().withNano(0));
					c.setLd(LocalDateTime.now().withNano(0));
					c.setRntm(LocalDateTime.now().plusSeconds(100));
				} else {
					System.out.println("Invalid Amount");
				}
			} else {
				System.out.println("Out of Stock");
			}
			break;
		case 6:
			if (availSaree > 0) {
				System.out.println("MRP : 1240\nDiscount : 10%\nTotal Amount: 1098");
				int discount = (int) (1240 * 0.9);
				System.out.print("Payment : ");
				int amt = sc.nextInt();
				if (amt == discount) {
					c.setAllocatedDress("Saree");
					availSaree--;
					System.out.println("Purchased Sucessfully\nOrderId: " + CstmId);
					c.setPaidAmt(amt);
					System.out.println(c.getLd().now().withNano(0));
					c.setLd(LocalDateTime.now().withNano(0));
					c.setRntm(LocalDateTime.now().plusSeconds(100));
				} else {
					System.out.println("Invalid Amount");
				}
			} else {
				System.out.println("Out of Stock");
			}
			break;
		default:
			System.out.println("Invalid Selection");
			break;
		}
	}

	static void Order(Customer c) {
		if (availDress > 0) {
			allocatedDress(c);
			availDress--;
			PurcDetails.add(c);
		} else {
			System.out.println("Out of Limit");
		}
	}

	static void viewDetail(int cId) {
		if (PurcDetails.isEmpty()) {
			System.out.println("Id Not found");
		} else {
			PurcDetails.forEach(e -> {
				if (e.getCustomerId() == cId) {
					System.out.println("Name: " + e.getName());
					System.out.println("Mobile No: " + e.getMobNo());
					System.out.println("Purchased Dress: " + e.getAllocatedDress());
					System.out.println("Bill Amount: " + e.getPaidAmt());
					System.out.println("Date&Time: " + e.getLd());
				}
			});
		}
	}

	static void removesld(String rem) {
		switch (rem.toUpperCase()) {
		case "SHIRT":
			availShirt++;
			availDress++;
			break;
		case "Phant":
			availPhant++;
			availDress++;
			break;
		case "TRADITIONAL":
			availShirt++;
			availDress++;
			break;
		case "TOP":
			availTop++;
			availDress++;
			break;
		case "SKIRT":
			availSkirt++;
			availDress++;
			break;
		case "SAREE":
			availSaree++;
			availDress++;
			break;
		}

	}

	static void returnItem(int rId) {
		List<Customer> rtmIm = PurcDetails.stream().filter(e -> e.getCustomerId() == rId).collect(Collectors.toList());
		if (!rtmIm.isEmpty()) {
			Iterator<Customer> it = PurcDetails.iterator();
			while (it.hasNext()) {
				Customer c = it.next();
				if (c.getCustomerId() == rId) {
					if (LocalDateTime.now().isBefore(c.getRntm())) {
						it.remove();
						String rem = c.getAllocatedDress();
						removesld(rem);
						System.out.println(c.getAllocatedDress() + " Returned Sucessfully");
					} else {
						System.out.println("Sorry, Time Out Can't be Returned");
					}
				}
			}
		} else {
			System.out.println("Id Not found");
		}
	}

	static void Stock(int st) {
		Scanner sc=new Scanner(System.in);
		switch (st) {
		case 1:
			System.out.println("Enter the No of Stocks to Add");
			int sh=sc.nextInt();
			availShirt+=sh;
			availDress+=sh;
			System.out.println("Shirt - Stock Updated Sucessfully");
			break;
		case 2:
			System.out.println("Enter the No of Stocks to Add");
			int ph=sc.nextInt();
			availPhant+=ph;
			availDress+=ph;
			System.out.println("Phant - Stock Updated Sucessfully");
			break;
		case 3:
			System.out.println("Enter the No of Stocks to Add");
			int tr=sc.nextInt();
			availTraditional+=tr;
			availDress+=tr;
			System.out.println("Traditional - Stock Updated Sucessfully");
			break;
		case 4:
			System.out.println("Enter the No of Stocks to Add");
			int tp=sc.nextInt();
			availTop+=tp;
			availDress+=tp;
			System.out.println("Top - Stock Updated Sucessfully");
			break;
		case 5:
			System.out.println("Enter the No of Stocks to Add");
			int sk=sc.nextInt();
			availSkirt+=sk;
			availDress+=sk;
			System.out.println("Skirt - Stock Updated Sucessfully");
			break;
		case 6:
			System.out.println("Enter the No of Stocks to Add");
			int sa=sc.nextInt();
			availSaree+=sa;
			availDress+=sa;
			System.out.println("Saree - Stock Updated Sucessfully");
			break;
		default:
			System.out.println("Invalid Product");
			break;
		}
	}

	static void User(String Userna) {
		String us = "admin";
		if (Userna.equals(us)) {
			System.out.println("Enter your Password");
			Scanner sc = new Scanner(System.in);
			String ps = sc.next();
			if (ps.equals(us)) {
				System.out.println("Choose the Product\n1.Shirt   2.Phant   3.Traditional   4.Top   5.Skirt   6.Saree");
				int st = sc.nextInt();
				Stock(st);
			} else {
				System.out.println("Incorrect Password");
			}
		} else {
			System.out.println("Invalid UserName");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "Y";
		System.out.println("WELCOME TO SHOPPING");
		while (choice.equalsIgnoreCase("Y")) {
			System.out.println("Enter   1.Purchase   2.Purchase Details   3.Return Product   4.Admin");
			int prefChoice = sc.nextInt();
			switch (prefChoice) {
			case 1:
				System.out.println("Enter your Name");
				String Name = sc.next().toUpperCase();
				System.out.println("Enter your Mob No");
				boolean valid = true;
				while (valid) {
					long MobNo = sc.nextLong();
					if (MobNo > 1000000000 && MobNo < 9999999999L) {
						System.out.println(
								"Select your Option\n1.Shirt   2.Phant   3.Traditional   4.Top   5.Skirt   6.Saree");
						int prefDress = sc.nextInt();
						Order(new Customer(CstmId, Name, MobNo, prefDress));
						CstmId++;
						valid = false;
					} else {
						System.out.println("please Enter Valid Mob NO");
						valid = true;
					}
				}
//				System.out.println("Select your Dress\n*Shirt\t*Phant\t*Traditional\t*Top\t*Skirt\t*Saree");
//				String prefDress=sc.next().toUpperCase();
//				Order(new Customer(CstmId,Name,MobNo,prefDress));
//				CstmId++;
				break;
			case 2:
				System.out.println("Enter your Order Id to View Details");
				int cId = sc.nextInt();
				viewDetail(cId);
				break;
			case 3:
				System.out.println("Enter your Order Id to Return Dress");
				int rId = sc.nextInt();
				returnItem(rId);
				break;
			case 4:
				System.out.println("Current Stock Level : ");
				System.err.print(
						"Shirt - " + availShirt + ",   Phant - " + availPhant + "   Traditional - " + availTraditional);
				System.err.println(",   Top - " + availTop + ",   Skrit - " + availSkirt + ",   Saree - " + availSaree);
				System.out.println("Update Stock\nEnter your UserName:");
				String Userna = sc.next();
				User(Userna);
				break;
			default:
				System.out.println("Invalid Selection");
				break;
			}
			System.out.println("\nDo u want to Continue Shopping Y/N");
			choice = sc.next();
		}
		System.out.println("Thank You For Shopping. Good Bye🩷🩷🩷");
		sc.close();
	}
}
