// Author: Dimitar Ivanov
// Starting date: 12.03.2025
// Ending date: 20.03.2025
// Description: Adventure simulation game where Tom Aspinall tries to get a title shot against Jon Jones.
// Version: 1.0

package addovenchia;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class addovenchia_geimu {
    public static void main(String[] args) throws InterruptedException {
        Scanner userInput; // undefeated, undisputed, game intro champion of the world!
        int answerInput;
        System.out.println("██████████████████████████████████████████████████");
        System.out.println("██████████████████████████████████████████████████");
        System.out.println("██████████████████████████████████████████████████");
        System.out.println("██████████████████████████████████████████████████");
        System.out.println("█▒█▒█▒██▒█▒▒█▒▒▒█▒▒▒▒▒▒█▒▒█▒▒█▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█");
        System.out.println("█▒███▒█▓▒█▒▒█▒▒█▒█▒█▒▒▒█▒█▒█▒██▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█");
        System.out.println("█▒█▒█▒██▒██▒██▒▒█▒▒▓▒▒█▒▒▒█▒▒█▒▒█▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒█");
        System.out.println("█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█");
        System.out.println("█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓█▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█");
        System.out.println("█░░░░▒▒▒▒▒▒░░░░░░░░▒▓▓█████▓▓▓▓▓▓▓▓▓▓▒░▒▒▒▒▒▒▒▒▒▒█");
        System.out.println("█░░░░░░▒▒▒▒▒▒░░░░░░▒▒▒▒▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▓█");
        System.out.println("█░░░░░░▒▒▒▒▒▒▒░░░░░▓▒▒░▒▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▒▒▒▒▒▒▓▓█");
        System.out.println("█░░░░░░▒▒▒▒▒▒▒░▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓█");
        System.out.println("█░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓█");
        System.out.println("█░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▓▒▒▒▒▓▓▓▓▓▓▓▓▒▓▓▓▓▓▓▓▓▓█");
        System.out.println("█░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▒▒▒▓▓▓▓▓▓▓▓▓▓▓▒▒▒▓▓▓▓▓▓▓▓█");
        System.out.println("█░░░░░▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▓▓▓▓▓█");
        System.out.println("█░░░░░▒▒▒▓▓▓▒▒▒▒▓▓▓▓▒▒▒▓▓▒▒▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▒▓▓▓█");
        System.out.println("█░░░░░▒▒▓▓▓▓▒▓▓▓▒▒▒▒▒▒▒░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓█");
        System.out.println("█░░░░░▒▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▒▓▓▓█");
        System.out.println("█░░░▒█████▓▓▓▒▓▒▒▒▒▒▒▒▒░░░░░░░░░▒▒▒▒▒▒▒▒▒▓▒▓▒▒▒▓▓█");
        System.out.println("█▓▓▓▓▓▓▓▓▓▓██▓██▒▒▒▒▒▒▒░░░░░░░▒▒▒▓▓▓▓▒▒▒▒▓▓▒▒▒▓▓▒█");
        System.out.println("█▓▓▓▓█▓▓███▓▒▒▒▒▒▒▒▒▒▒░░░░░░░▒▒▒▒▒▒▒▒░▒▒▒▒▓░▒▓▓▓▓█");
        System.out.println("██████████████████████████████████████████████████");
        System.out.println("██████████████████████████████████████████████████");
        System.out.println("██████████████████████████████████████████████████");
        System.out.println("██████████████████████████████████████████████████");
        System.out.println("LIVE ASPINALL REACTION");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("");
        System.out.println("Game has started!");
        System.out.println("Title: Hello, Jon! I'm getting my first undisputed title shot.");
        System.out.println("");
        TimeUnit.SECONDS.sleep(3);
        while (true) {
            System.out.println("Jon Jones is ducking you, he wants to fight Alex Pereira for the title! What do you do?"); // starting scenario
            System.out.println("Option 1: Make Pereira lose against Ankalaev");
            System.out.println("Option 2: Talk more rubbish/trash and call out Jon Jones after a win");
            System.out.println("Option 3: Convince Dana to try to give Jon the payday he's asking for in order to fight you");
            System.out.println("Enter 1, 2, or 3 to make your choice. (Type in the desired option number and hit Enter/Return)");
            userInput = new Scanner(System.in); // ask user, every time this appears it's asking user
            if (userInput.hasNextInt()) {
                answerInput = userInput.nextInt();
                if (answerInput == 1) {
                    System.out.println("The discussion for this matchup has been dramatically neutered, therefore your choice was significantly effective at helping you get the matchup!");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("");
                    System.out.println("Now Jon Jones has no choice but to fight you or vacate the title, he instead decides to price himself out of the fight even more than before. What do you do?");
                    System.out.println("Option 1: Convince Dana to get the fight to happen in Saudi Arabia so Turki can pay Jon's bag");
                    System.out.println("Option 2: Post more regarding the fight, pressuring Jon even more into a potential fight or vacating the title");
                    System.out.println("Option 3: Give up.");
                    System.out.println("Enter 1, 2, or 3 to make your choice. (Type in the desired option number and hit Enter/Return)");
                    if (userInput.hasNextInt()) {
                        answerInput = userInput.nextInt();
                        if (answerInput == 1) {
                            System.out.println("It worked! This means you got to fight for the undisputed heavyweight title and knocked Jon Jones out in the first round to secure the win and become the undisputed champion!");
                            System.out.println("The good ending."); // best ending :")
                            break;
                        } else if (answerInput == 3) {
                            System.out.println("Your career ends prematurely because you weren't willing to go after what you sought out in the first place, all because you let someone get in your way.");
                            System.out.println("The bad ending.");
                            break;
                        } else if (answerInput == 2) {
                            System.out.println("Jon has now officially ran away from the heavyweight title picture, vacating the belt for a new contender fight of five rounds for the undisputed belt. You have now won the belt against some other heavyweight contender, congrats! You've won... but at what cost?");
                            System.out.println("The middle ending.");
                            break;
                        } else {
                            System.out.println("Option not available, please answer again and PROPERLY this time! Thank you!");
                            TimeUnit.SECONDS.sleep(3);
                            continue;
                        }
                    }
                } else if (answerInput == 2) {
                    System.out.println("You've won fan support, but Jon Jones thinks you're an \"asshole\" and a \"dirtbag\" now. Those are his words, not very kind as you can see.");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("");
                    System.out.println("Jon is more likely to price himself out of the fight now, what choice do you take to make the fight happen?");
                    System.out.println("Option 1: Beg for the fight to be in Saudi Arabia so His Exellency Turki Alalshikh can pay up his oil money to make this fight happen");
                    System.out.println("Option 2: Double down. Who cares, bradda? Put him Tom Aspinall");
                    System.out.println("Option 3: Glaze Jon Jones to an absurd point where it really doesn't make sense anymore, bordering on sucking up (it basically is)");
                    System.out.println("Enter 1, 2, or 3 to make your choice. (Type in the desired option number and hit Enter/Return)");
                    if (userInput.hasNextInt()) {
                        answerInput = userInput.nextInt();
                        if (answerInput == 1) {
                            System.out.println("Uh oh! Looks like Dana and Turki are too busy promoting boxing instead of... MMA? The thing Dana is known for promoting? Looks like Jon has vacated too, unfortunately you don't get to beat him in decisive fashion! At least now you're the undisputed champion and can therefore build your legacy even further!");
                            System.out.println("The decent ending.");
                            break;
                        } else if (answerInput == 2) {
                            System.out.println("Jon is getting more upset with you, calling you even more mean names than before! He really is thinking of vacating, what to do? Call him out for not adhering to God's word if he decides to be a coward? What do you do?");
                            TimeUnit.SECONDS.sleep(3);
                            System.out.println("Now you have to make it count or it's too late! What do you decide to do?");
                            System.out.println("Option 1: Triple down like Triple C!!! MAKE SURE U GET U WAY HOMIE!!! DON'T LET NOBODY HOLD U BACC!!!");
                            System.out.println("Option 2: Defend your interim title until Jon retires");
                            System.out.println("Option 3: Shank Jon Jones and take his watch away, innit");
                            System.out.println("Enter 1, 2, or 3 to make your choice. (Type in the desired option number and hit Enter/Return)");
                            if (userInput.hasNextInt()) {
                                answerInput = userInput.nextInt();
                                if (answerInput == 1) {
                                    System.out.println("At this point Jon has been bullied into a fight by everyone. Tom goes on to not only stuff his takedown, but be the first one to knock Jon Jones out in the first round. Tom Aspinall by 1st round KO.");
                                    System.out.println("The best ending."); // better than best ending ☆*: .｡. o(≧▽≦)o .｡.:*☆
                                    break;
                                } else if (answerInput == 2) {
                                    System.out.println("Now you have been promoted to undisputed champion after Jon Jones vacated the belt due to an injury. Now your interim title defences count as real ones.");
                                    System.out.println("The most \"likely possible\" ending.");
                                    break;
                                } else if (answerInput == 3) {
                                    System.out.println("Now you have been imprisoned for murder and attempted robbery, how did Jon get away with all HIS crimes then?");
                                    System.out.println("The criminal ending.");
                                    break;
                                } else {
                                    System.out.println("Option not available, please answer again and PROPERLY this time! Thank you!");
                                    TimeUnit.SECONDS.sleep(3);
                                    continue;
                                }
                            }
                        } else if (answerInput == 3) {
                            System.out.println("You have lost all fan support now, you get the fight but at the cost of your dignity. You win by split decision and become the undisputed champion, albeit with a lot of controversy from Jones fans.");
                            System.out.println("The \"I'll take what I can get\" ending.");
                            break;
                        }
                    }
                } else if (answerInput == 3) {
                    System.out.println("This didn't work, Dana White is too much of a cheapskate to give any payday in the millions, let alone what Jon is asking for!");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("Now you have to find a different way to financially make it happen! Make your choice!");
                    System.out.println("Option 1: Fundraiser where people donate to a cause, in this case a fight against Jon Jones(shameless)");
                    System.out.println("Option 2: Get His Exellency Turki Alalshikh to finance the fight and make it possible");
                    System.out.println("Option 3: Steal Dana's money(Romanian)");
                    System.out.println("Enter 1, 2, or 3 to make your choice. (Type in the desired option number and hit Enter/Return)");
                    if (userInput.hasNextInt()) {
                        answerInput = userInput.nextInt();
                        if (answerInput == 1) {
                            System.out.println("People actually paid for this. Anyway(s), there was a bad omen in doing so, and you lost by a robbery decision, cementing Jon Jones as the \"GOAT\" of MMA as a whole.");
                            System.out.println("The most humiliating ending.");
                            break;
                        } else if (answerInput == 2) {
                            System.out.println("This actually worked, because Turki is a huge fight fan like the rest of us! Now we get to see this fight, and thus defeated was Jon Jones. It turns out you can't run from your sins forever, Jon.");
                            System.out.println("The \"moral of the story\" ending.");
                            break;
                        } else if (answerInput == 3) {
                            System.out.println("Dana is really angry his money got stolen in a heist! Thankfully, you weren't caught. What do you do now?");
                            System.out.println("Option 1: Gamble the money away as if you're Dana himself in Las Vegas!!!");
                            System.out.println("Option 2: Use it to fund the Jon Jones fight, and win!");
                            System.out.println("Option 3: Take a dive, and also pay Jon additional money to even take the fight.");
                            System.out.println("Enter 1, 2, or 3 to make your choice. (Type in the desired option number and hit Enter/Return)");
                            if (userInput.hasNextInt()) {
                                answerInput = userInput.nextInt();
                                if (answerInput == 1) {
                                    System.out.println("Now all the money you've robbed is gone! Tough luck, shouldn't have taken what wasn't yours in the first place!");
                                    System.out.println("The brokie ending.");
                                    break;
                                } else if (answerInput == 2) {
                                    System.out.println("Now you get to fight Jon Jones. You do, and you beat him by first round knockout. Best day of your life!");
                                    System.out.println("The other good ending.");
                                    break;
                                } else if (answerInput == 3) {
                                    System.out.println("This one made many people, including me, upset. You should've made better life choices, you absolute buffoon.");
                                    System.out.println("The disapproved ending.");
                                    break;
                                }
                            }
                        } else {
                            System.out.println("Option not available, please answer again and PROPERLY this time! Thank you!");
                            TimeUnit.SECONDS.sleep(3);
                            continue;
                        }
                    }
                } else {
                    System.out.println("Option not available, please answer again and PROPERLY this time! Thank you!");
                    TimeUnit.SECONDS.sleep(3);
                    continue;
                }
            } else {
                System.out.println("Option not available, please answer again and PROPERLY this time! Thank you!");
                    TimeUnit.SECONDS.sleep(3);
                    continue;
            }
        }
    }
}