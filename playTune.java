import java.util.Scanner;

public class playTune
    {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Tune tunePlayer = new Tune();

        System.out.println("Welcome to the Tune player");
        
        System.out.println("");
        
        System.out.println("Choose from the options below: ");
        int answer = 0;

        do 
        {
            System.out.println("Press 1 if you want to add a song");
            System.out.println("Press 2 if you want to remove a song");
            System.out.println("Press 3 if you want to enter in a minimum number of streams");
            System.out.println("Press 4 if you want to print all the songs");
            System.out.println("Press 8 to exit Tune Player");
        
            if (scanner.hasNextInt()) {
                answer = scanner.nextInt();
                scanner.nextLine();


            switch(answer) {
                case 1:               
                String answer2;
                tunePlayer.addSong();

                do 
                {
                    
                    System.out.println("Do you want to add another song?");
                    answer2 = scanner.nextLine();
                    if(answer2.equalsIgnoreCase("Yes"))
                    
                    {
                        tunePlayer.addSong();
                        System.out.println("Your chosen song has been added!");
                        }

                    } while(answer2.equalsIgnoreCase("Yes)"));

                    break;

                case 2:
                String answer3;
                tunePlayer.removeSong();
                
                do
                {

                    System.out.println("Do you want to remove another song?");
                    answer3 = scanner.nextLine();
                    if(answer3.equals("Yes"))
                        
                        {
                            tunePlayer.removeSong();
                            System.out.println("Your song has been removed.");
                            }

                        } while (answer3.equalsIgnoreCase("Yes"));


                        break;

                        case 3:

                        String answer4;
                        tunePlayer.GivenPlays();
                        
                        do 
                        {
                            System.out.println("Do you want to enter a minimum number of streams again?");
                            answer4 = scanner.nextLine();
                            if(answer4.equalsIgnoreCase("Yes"))
                            {
                                tunePlayer.GivenPlays();
                                } 
                            
                            } while (answer4.equalsIgnoreCase("yes"));
                               
                            tunePlayer.GivenPlays();
                                
                                break;

                        case 4: 
                        tunePlayer.printSong();

                            break;

                        case 5:
                        System.out.println("Invalid response");
                            
                            break;

                        case 8: 
                        System.out.println("You are now exiting the TunePlayer...goodbye!");
                            
                            break;

                            }
                        }
                    } while(answer != 5 && answer != 8); 

                     scanner.close();
                }
            }
                