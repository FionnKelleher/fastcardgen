import System.Diagnostics;
import Newtonsoft.Json;
public class Program {
    
    public static void Main() {
        Console.Write("Thank-you note bot");
        Console.Write("\n");
        Console.Write("Version 1.0.0");
        Console.Write("\n");
        int attempts = 0;
        int attempts1 = 0;
        boolean done = false;
        string reciever;
        "placeholder";
        string gift;
        "placeholder";
        string party;
        "placeholder";
        string title;
        "placeholder";
        string recognize;
        "placeholder";
        string article;
        "placeholder";
        string sender;
        "placeholder";
        string address;
        "placeholder";
        string save;
        "placeholder";
        while (!done) {
            if ((attempts > 1)) {
                Console.Write(("You have redone this section " 
                                + (attempts + " times.")));
                Console.Write("\n");
            }
            
            if ((attempts == 1)) {
                Console.Write(("You have redone this section " 
                                + (attempts + " time.")));
                Console.Write("\n");
            }
            
            Console.Write("\n");
            Console.Write("Who are you writing to?");
            Console.Write("\n");
            reciever = Console.ReadLine();
            Console.Write("\n");
            Console.Write(("What gift did you get from " 
                            + (reciever + "?")));
            Console.Write("\n");
            gift = Console.ReadLine();
            Console.Write("\n");
            Console.Write(("What party did you invite " 
                            + (reciever + " to? (Just write the noun with no connectors)")));
            Console.Write("\n");
            party = Console.ReadLine();
            Console.Write("\n");
            Console.Write("Here is your letter so far:");
            Console.Write("\n");
            Console.Write(("Dear " 
                            + (reciever 
                            + (("," + ("\n" + "\n")) 
                            + (("Thank you so much for coming to my " + party) 
                            + ((". Thank you so much for the " + gift) 
                            + "."))))));
            Console.Write("\n");
            Console.Write("\n");
            Console.Write(("Do you like it so far? Type in \"yes\" or \"no\". " + ("\n" + ("Typing in \"no\" will restart this part of the creation process, and typing in \"yes\" will move you on t" +
                "o the next part of the creation process. " + "\n"))));
            string continue1;
            Console.ReadLine();
            Console.Write("\n");
            switch (continue1) {
                case "yes":
                    done = true;
                    break;
                case "no":
                    done = false;
                    Console.Clear();
                    attempts++;
                    Console.Write("\n");
                    Console.Write("\n");
                    break;
            }
        }
        
        Console.Write(("Section 2 " + ("\n" + "\n")));
        boolean done1 = false;
        while (!done1) {
            if ((attempts1 > 1)) {
                Console.Write(("You have redone this section " 
                                + (attempts1 + " times.")));
                Console.Write("\n");
            }
            
            if ((attempts1 == 1)) {
                Console.Write(("You have redone this section " 
                                + (attempts1 + " time.")));
                Console.Write("\n");
            }
            
            Console.Write(("What do you recognize " 
                            + (reciever + (" as? (e.g: \"aunt\", \"friend\", \"grandfather\") " + "\n"))));
            title = Console.ReadLine();
            Console.Write("\n");
            Console.Write("\n");
            Console.Write(("How do you describe " 
                            + (reciever 
                            + ((" as? (Context: \'answer\' " + title) + (")" + "\n")))));
            recognize = Console.ReadLine();
            Console.Write("\n");
            Console.Write("\n");
            Console.Write(("What article do you want to use? (Context: You are \'answer\' " 
                            + (recognize 
                            + ((" " + title) + (".)" + "\n")))));
            article = Console.ReadLine();
            Console.Write("\n");
            Console.Write("\n");
            Console.Write(("How would you like to address " 
                            + (reciever + ("? (e.g: Love, From, Regards)" + "\n"))));
            address = Console.ReadLine();
            Console.Write("\n");
            Console.Write("\n");
            Console.Write(("What is your name?" + "\n"));
            sender = Console.ReadLine();
            Console.Write("\n");
            Console.Write("\n");
            Console.Write("Here is your letter so far:");
            Console.Write("\n");
            Console.Write(("Dear " 
                            + (reciever 
                            + (("," + ("\n" + "\n")) 
                            + (("Thank you so much for coming to my " + party) 
                            + ((". Thank you so much for the " + gift) 
                            + ((". You are " + article) 
                            + ((" " + recognize) 
                            + ((" " + title) + ("." + ("\n" 
                            + (("\n" + address) 
                            + ((", " + sender) 
                            + ".")))))))))))));
            Console.Write("\n");
            Console.Write("\n");
            Console.Write(("Do you like it so far? Type in \"yes\" or \"no\". " + ("\n" + ("Typing in \"no\" will restart this part of the creation process, and typing in \"yes\" will move you on t" +
                "o outputting your letter to a file. " + "\n"))));
            string continue2;
            Console.ReadLine();
            Console.Write("\n");
            switch (continue2) {
                case "yes":
                    done1 = true;
                    break;
                case "no":
                    done1 = false;
                    Console.Clear();
                    attempts1++;
                    Console.Write("\n");
                    Console.Write("\n");
                    break;
            }
            boolean done2 = false;
            while (!done2) {
                Console.Write(("Would you like to save your letter to a text file for later use?" + ("\n" + ("Type in \"yes\" or \"no\". This will overwrite any text file with the same name." + "\n"))));
                save = Console.ReadLine();
                switch (save) {
                    case "yes":
                        done2 = true;
                        break;
                    case "no":
                        done2 = true;
                        Console.Write(("Exiting program..." + "\n"));
                        Environment.Exit(0);
                        break;
                    default:
                        done2 = false;
                        break;
                }
                Console.Write(("What do you want the name of the text file to be?" + "\n"));
                string fileName;
                Console.ReadLine();
                Console.Write("\n");
                string[] lines;
                ("Dear " 
                            + (reciever + ","));
                "";
                ("Thank you so much for coming to my " 
                            + (party 
                            + ((". Thank you so much for the " + gift) 
                            + ((". You are " + article) 
                            + ((" " + recognize) 
                            + ((" " + title) 
                            + "."))))));
                "";
                (address 
                            + ((", " + sender) 
                            + "."));
                string docPath = Environment.GetFolderPath(Environment.SpecialFolder.Desktop);
                Using;
                ((StreamWriter)(outputFile)) = new StreamWriter(Path.Combine(docPath, (fileName + ".txt")), false);
                for (string line : lines) {
                    outputFile.WriteLine(line);
                }
                
            }
            
            Console.Write((fileName + (".txt is now saved in " 
                            + (docPath + ("\n" + ("Do you want to open it now?" + "\n"))))));
            string openFile;
            Console.ReadLine();
            switch (openFile) {
                case "yes":
                    Process p = new Process();
                    ProcessStartInfo pi = new ProcessStartInfo();
                    pi.UseShellExecute = true;
                    pi.FileName = Path.Combine(docPath, (fileName + ".txt"));
                    p.StartInfo = pi;
                    try {
                        p.Start();
                    }
                    catch (Exception __unusedException1__) {
                    }
                    
                    break;
                case "no":
                    Environment.Exit(0);
                    break;
                default:
                    Environment.Exit(0);
                    break;
            }
        }
        
    }
}
Endclass Unknown {
}
