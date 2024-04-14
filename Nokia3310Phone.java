 import java.util.Scanner;

public class Nokia3310Phone  {
	public static void main(String... args){

		String prompt = """
		Nokia menu map 
		List of menu functions

		1 -> Phone book 
		2 -> Messages
		3 -> Chat
		4 -> Call register
		5 -> Tones
		6 -> Settings
		7 -> Call divert
		8 -> Games
		9 -> Calculator
		10 -> Reminders
		11 -> Clock
		12 -> Profiles
		13 -> SIM services
		""";

			String phoneBookPrompt = """
			1 -> Search
			2 -> Services Nos. 
			3 -> Add name
			4 -> Erase
			5 -> Edit
			6 -> Assign tone
			7 -> Send b'card
			8 -> Options
			9 -> Speed dials
			10 -> Voice tags
			11 -> Back
			""";


				String optionsPrompt = """
				1 -> Type of view
				2 -> Memory status
				3 -> Back
				""";


			String messagesPrompt = """
			1 -> Write messages
			2 -> Inbox
			3 -> Outbox
			4 -> Pictures messages
			5 -> Templates
			6 -> Simleys
			7 -> Message settings
			8 -> Info service
			9 -> Voice mailbox number
			10 -> Service command editor
			11 -> Back
			""";

				String messageSettingsPrompt = """
				1 -> Set 1
				2 -> Common
				3 -> Back
				""";

					String set1Prompt = """
					1 -> Message centre number
					2 -> Message sent as
					3 -> Message validity
					4 -> Back
					""";

					String commonPrompt = """
					1 -> Delivery reports
					2 -> Reply via same centre
					3 -> Character support
					4 -> Back
					""";


			String callRegisterPrompt = """
			1 -> Missed calls
			2 -> Received calls
			3 -> Dialled numbers
			4 -> Erase recent call lists
			5 -> Show call duration
			6 -> Show call costs
			7 -> Call cost settings
			8 -> Prepaid credit
			9 -> Back
			""";

				String showCallDurationPrompt = """
				1 -> Last call duration
				2 -> All calls' duration
				3 -> Received calls' duration
				4 -> Dialled calls' duration
				5 -> Clear timers
				6 -> Back
				""";

				String showCallCostsPrompt = """
				1 -> Last call cost
				2 -> All calls' cost
				3 -> Clear counters
				4 -> Back
				""";

				String callCostSettingsPrompt = """
				1 -> Call cost limit
				2 -> Show costs in
				3 -> Back
				""";


			String tonesPrompt = """
			1 -> Ringing tone
			2 -> Ringing volume
			3 -> Incoming call alert
			4 -> Composer
			5 -> Message alert tone 
			6 -> Keypad tones
			7 -> Warning and game tones
			8 -> Vibrating alert
			9 -> Screen saver
			10 -> Back
			""";

			String settingsPrompt = """
			1 -> Call settings
			2 -> Phone settings
			3 -> Security settings
			4 -> Restore factory settings
			5 -> Back
			""";

				String callSettingsPrompt = """
				1 -> Automatic redial
				2 -> Speed dialling
				3 -> Call waiting options
				4 -> Own number sending
				5 -> Phone line in use 
				6 -> Automatic answer
				7 -> Back
				""";

				String phoneSettingsPrompt = """
				1 -> Language 
				2 -> Cell info display 
				3 -> Welcome note
				4 -> Network selection
				5 -> Lights
				6 -> Confirm SIM service actions
				7 -> Back
				""";

				String securitySettingsPrompt = """
				1 -> PIN code request
				2 -> Call barring service
				3 -> Fixed dailling
				4 -> Closed user group
				5 -> Phone security
				6 -> Change access codes
				7 -> Back
				""";

			String clockPrompt = """
			1 -> Alarm clock
			2 -> Clock setting
			3 -> Date setting
			4 -> Stopwatch
			5 -> Countdown timer
			6 -> Auto update of date and time
			7 -> Back
			""";
		
		System.out.println(prompt);
		Scanner KeyboardInput = new Scanner(System.in);
		int userInput = KeyboardInput.nextInt(); 		

		int count = 1;

		while (count <= 100) {
			

		switch(userInput){
			case 1: {
				System.out.println("Phone book");
				count++;

					System.out.println(phoneBookPrompt);
					KeyboardInput = new Scanner(System.in);
					int digitEntered = KeyboardInput.nextInt();

					switch (digitEntered){

						case 1: {
							System.out.println("Search");
							break;
						}
						case 2: {
							System.out.println("Service Nos.");
							break;
						}
						case 3: {
							System.out.println("Add name");
							break;
						}
						case 4: {
							System.out.println("Erase");
							break;
						}
						case 5: {
							System.out.println("Edit");
							break;
						}
						case 6: {
							System.out.println("Assign tone");
							break;
						}
						case 7: {
							System.out.println("Send b'card");
							break;
						}
						case 8: {
							System.out.println("Options");

								System.out.println(optionsPrompt);
								KeyboardInput = new Scanner(System.in);
								int digitInput = KeyboardInput.nextInt();

								switch (digitInput){

									case 1: {
										System.out.println("Type of view");
										break;
									}
									case 2: {
										System.out.println("Memory status");
										break;
									}
									case 3: {
										System.out.println(phoneBookPrompt);
										break;
									}
									default:{
										System.out.print("Invalid input");
										break;
									} 
								}

							break;
						}
						case 9: {
							System.out.println("Speed dials");
							break;
						}
						case 10: {
							System.out.println("Voice tags");
							break;
						}
						case 11: {
							System.out.println(prompt);
							break;
						}
						default: {
							System.out.print("Invalid input");
							break;
						} 
 
					}

				break;
				}

			case 2: {
				System.out.println("Messages");

					System.out.println(messagesPrompt);
					KeyboardInput = new Scanner(System.in);
					int digitEntered = KeyboardInput.nextInt();

					switch (digitEntered){

						case 1: {
							System.out.println("Write messages");
							break;
						}
						case 2: {
							System.out.println("Inbox");
							break;
						}
						case 3: {
							System.out.println("Outbox");
							break;
						}
						case 4: {
							System.out.println("Picture messages");
							break;
						}
						case 5: {
							System.out.println("Templates");
							break;
						}
						case 6: {
							System.out.println("Smileys");
							break;
						}
						case 7: {
							System.out.println("Message Settings");

								System.out.println(messageSettingsPrompt);
								KeyboardInput = new Scanner(System.in);
								int digitInput = KeyboardInput.nextInt();

								switch (digitInput){

									case 1: {
										System.out.println("Set 1");

											System.out.println(set1Prompt);
											KeyboardInput = new Scanner(System.in);
											int takeInput = KeyboardInput.nextInt();

											switch (takeInput){

												case 1: {
													System.out.println("Message centre number");
													break;
												}
												case 2: {
													System.out.println("Message sent as");
													break;
												}
												case 3: {
													System.out.println("Message validity");
													break;
												}
												case 4: {
													System.out.println(messageSettingsPrompt);
													break;
												}
												default:{
													System.out.print("Invalid input");
													break;
												} 
 
											}

										break;
									}
									case 2: {
										System.out.println("Common");

											System.out.println(commonPrompt);
											KeyboardInput = new Scanner(System.in);
											int takeInput = KeyboardInput.nextInt();

											switch (takeInput){

												case 1: {
													System.out.println("Delivery reports");
													break;
												}
												case 2: {
													System.out.println("Reply via same centre");
													break;
												}
												case 3: {
													System.out.println("Character support");
													break;
												}
												case 4: {
													System.out.println(messageSettingsPrompt);
													break;
												}

												default:{
													System.out.print("Invalid input");
													break;
												} 
 
											}

										break;
									}
								}
							break;
						}
						case 8: {
							System.out.println("Info service");
							break;
						}
						case 9: {
							System.out.println("Voice mailbox number");
							break;
						}
						case 10: {
							System.out.println("Service command editor");
							break;
						}
						case 11: {
							System.out.println(prompt);
							break;
						}
						default: {
							System.out.print("Invalid input");
							break;
						} 
 
					}
				break;
				}
			case 3: {
				System.out.println("Chat");
				break;
				}
			case 4: {
				System.out.println("Call register");

					System.out.println(callRegisterPrompt);
					KeyboardInput = new Scanner(System.in);
					int digitEntered = KeyboardInput.nextInt();

					switch (digitEntered){

						case 1: {
							System.out.println("Missed calls");
							break;
						}
						case 2: {
							System.out.println("Received calls");
							break;
						}
						case 3: {
							System.out.println("Dialled numbers");
							break;
						}
						case 4: {
							System.out.println("Erase recent call lists");
							break;
						}
						case 5: {
							System.out.println("Show call duration");

								System.out.println(showCallDurationPrompt);
								KeyboardInput = new Scanner(System.in);
								int digitInput = KeyboardInput.nextInt();

								switch (digitInput){

									case 1: {
										System.out.println("Last call duration");
										break;
									}
									case 2: {
										System.out.println("All calls' duration");
										break;
									}
									case 3: {
										System.out.println("Received calls' duration");
										break;
									}
									case 4: {
										System.out.println("Dialled calls' duration");
										break;
									}
									case 5: {
										System.out.println("Clear timers");
										break;
									}
									case 6: {
										System.out.println(callRegisterPrompt);
										break;
									}
									default:{
										System.out.print("Invalid input");
										break;
									} 
 
								}

							break;
						}

						case 6: {
							System.out.println("Show call costs");

								System.out.println(showCallCostsPrompt);
								KeyboardInput = new Scanner(System.in);
								int digitInput = KeyboardInput.nextInt();

								switch (digitInput){

									case 1: {
										System.out.println("Last call cost");
										break;
									}
									case 2: {
										System.out.println("All calls' cost");
										break;
									}
									case 3: {
										System.out.println("Clear counters");
										break;
									}
									case 4: {
										System.out.println(callRegisterPrompt);
										break;
									}

									default:{
										System.out.print("Invalid input");
										break;
									} 
 
								}
							break;
						}

						case 7: {
							System.out.println("Call cost settings");

								System.out.println(callCostSettingsPrompt);
								KeyboardInput = new Scanner(System.in);
								int digitInput = KeyboardInput.nextInt();

								switch (digitInput){

									case 1: {
										System.out.println("Call cost limit");
										break;
									}
									case 2: {
										System.out.println("Show costs in");
										break;
									}
									case 3: {
										System.out.println(callRegisterPrompt);
										break;
									}
									default:{
										System.out.print("Invalid input");
										break;
									} 
 
								}
							break;
						}

						case 8: {
							System.out.println("Prepaid credit");
							break;
						}
						case 9: {
							System.out.println(prompt);
							break;
						}
						default:{
							System.out.print("Invalid input");
							break;
						} 

					}
				break;
				}

			case 5: {
				System.out.println("Tones");

					System.out.println(tonesPrompt);
					KeyboardInput = new Scanner(System.in);
					int digitEntered = KeyboardInput.nextInt();

					switch (digitEntered){

						case 1: {
							System.out.println("Ringing tone");
							break;
						}
						case 2: {
							System.out.println("Ringing volume");
							break;
						}
						case 3: {
							System.out.println("Incoming call alert");
							break;
						}
						case 4: {
							System.out.println("Composer");
							break;
						}
						case 5: {
							System.out.println("Message alert tone");
							break;
						}
						case 6: {
							System.out.println("Keypad tones");
							break;
						}
						case 7: {
							System.out.println("Warning and game tones");
							break;
						}
						case 8: {
							System.out.println("Vibrating alert");
							break;
						}
						case 9: {
							System.out.println("Screen saver");
							break;
						}
						case 10: {
							System.out.println(prompt);
							break;
						}
						default:{
							System.out.print("Invalid input");
							break;
						} 

					}
				break;
				}

			case 6: {
				System.out.println("Settings");

					System.out.println(settingsPrompt);
					KeyboardInput = new Scanner(System.in);
					int digitEntered = KeyboardInput.nextInt();

					switch (digitEntered){

						case 1: {
							System.out.println("Call settings");

								System.out.println(callSettingsPrompt);
								KeyboardInput = new Scanner(System.in);
								int digitInput = KeyboardInput.nextInt();

								switch (digitInput){

									case 1: {
										System.out.println("Automatic redial");
										break;
									}
									case 2: {
										System.out.println("Speed dialling");
										break;
									}
									case 3: {
										System.out.println("Call waiting options");
										break;
									}
									case 4: {
										System.out.println("Own number sending");
										break;
									}
									case 5: {
										System.out.println("Phone line in use");
										break;
									}
									case 6: {
										System.out.println("Automatic answer");
										break;
									}
									case 7: {
										System.out.println(settingsPrompt);
										break;
									}
									default:{
										System.out.print("Invalid input");
										break;
									} 

								}

							break;
						}
						case 2: {
							System.out.println("Phone settings");

								System.out.println(phoneSettingsPrompt);
								KeyboardInput = new Scanner(System.in);
								int digitInput = KeyboardInput.nextInt();

								switch (digitInput){

									case 1: {
										System.out.println("Language");
										break;
									}
									case 2: {
										System.out.println("Cell info display");
										break;
									}
									case 3: {
										System.out.println("Welcome note");
										break;
									}
									case 4: {
										System.out.println("Network selection");
										break;
									}
									case 5: {
										System.out.println("Lights");
										break;
									}
									case 6: {
										System.out.println("Confirm SIM service actions");
										break;
									}
									case 7: {
										System.out.println(settingsPrompt);
										break;
									}

									default:{
										System.out.print("Invalid input");
										break;
									} 

								}
							break;
						}
						case 3: {
							System.out.println("Security settings");

								System.out.println(securitySettingsPrompt);
								KeyboardInput = new Scanner(System.in);
								int digitInput = KeyboardInput.nextInt();

								switch (digitInput){

									case 1: {
										System.out.println("PIN code request");
										break;
									}
									case 2: {
										System.out.println("Call barring service");
										break;
									}
									case 3: {
										System.out.println("Fixed dailling");
										break;
									}
									case 4: {
										System.out.println("Closed user group");
										break;
									}
									case 5: {
										System.out.println("Phone security");
										break;
									}
									case 6: {
										System.out.println("Change access codes");
										break;
									}
									case 7: {
										System.out.println(settingsPrompt);
										break;
									}
									default:{
										System.out.print("Invalid input");
										break;
									} 

								}

							break;
						}
						case 4: {
							System.out.println("Restore factory settings");
							break;
						}
					}
				break;
				}
			case 7: {
				System.out.println("Call divert");
				break;
				}
			case 8: {
				System.out.println("Games");
				break;
				}
			case 9: {
				System.out.println("Calculator");
				break;
				}
			case 10: {
				System.out.println("Reminders");
				break;
				}
			case 11: {
				System.out.println("Clock");

					System.out.println(clockPrompt);
					KeyboardInput = new Scanner(System.in);
					int digitInput = KeyboardInput.nextInt();

					switch (digitInput){

						case 1: {
							System.out.println("Alarm clock");
							break;
						}
						case 2: {
							System.out.println("Clock settings");
							break;
						}
						case 3: {
							System.out.println("Date setting");
							break;
						}
						case 4: {
							System.out.println("Stopwatch");
							break;
						}
						case 5: {
							System.out.println("Coutdown timer");
							break;
							}
						case 6: {
							System.out.println("Auto update of date and time");
							break;
						}
						case 7: {
							System.out.println(prompt);
							break;
						}
						default:{
							System.out.print("Invalid input");
							break;
						} 

					}
				break;
				}

			case 12: {
				System.out.println("Profiles");
				break;
				}

			case 13: {
				System.out.println("SIM services");
				break;
				}
			default:{
				System.out.print("Invalid input");
				break;
			} 

		}


	}
}

}