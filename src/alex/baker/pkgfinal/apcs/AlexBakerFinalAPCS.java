package alex.baker.pkgfinal.apcs;

import java.util.Scanner;

public class AlexBakerFinalAPCS 
{
    public static void main(String[] args) 
    {
        /*Original Plan:
        intro!
        write and initialize 10 stories with 4 verbs/ 4 nouns/ 4 adj/ 4 adv
        create variables for the parts of speech
        ask user for which story(1-10) they want to do
        ask user for their parts of speech
        Print out story for their number with their words inserted*/
              
        System.out.println("                             ___     ___         ___                  ");
        System.out.println("                            (   )   (   )  .-.  (   )                 ");
        System.out.println(" ___ .-. .-.     .---.    .-.| |     | |  ( __)  | |.-.       .--.    ");
        System.out.println("(   )   '   \\   / .-, \\  /   \\ |     | |  (''\")  | /   \\    /  _  \\   ");
        System.out.println(" |  .-.  .-. ; (__) ; | |  .-. |     | |   | |   |  .-. |  . .' `. ;  ");
        System.out.println(" | |  | |  | |   .'`  | | |  | |     | |   | |   | |  | |  | '   | |  ");
        System.out.println(" | |  | |  | |  / .'| | | |  | |     | |   | |   | |  | |  _\\_`.(___) ");
        System.out.println(" | |  | |  | | | /  | | | |  | |     | |   | |   | |  | | (   ). '.   ");
        System.out.println(" | |  | |  | | ; |  ; | | '  | |     | |   | |   | '  | |  | |  `\\ |  ");
        System.out.println(" | |  | |  | | ' `-'  | ' `-'  /     | |   | |   ' `-' ;   ; '._,' '  ");
        System.out.println("(___)(___)(___)`.__.'_.  `.__,'     (___) (___)   `.__.     '.___.'   ");
        System.out.println("");
        
        /*Takes user input to initialize values for 4 nouns, verbs, adverbs, and adjectives.
        
        Below is the first user question. 
        It asks the user to input a number, which corresponds to the story that will be printed.*/
        
        Scanner story = new Scanner(System.in);
        System.out.println("Note: Spaces will not compile. Please use individual words or hypens.");
        System.out.println("Enter a number(1-8): ");
        String key = story.next();
        
        if(key.equals("batman")||key.equals("BATMAN"))
        {System.out.println();
        System.out.println("NA NA NA NA NA NA NA NA");
        System.out.println("NA NA NA NA NA NA NA NA");
        System.out.println("NA NA NA NA NA NA NA NA");
        System.out.println("BATMAN!");
        System.out.println("Pass me the Bat-Shark repellant, Robin!");
        System.out.println("Please restart to play again.");}

        /*These are the user inputs for the variables.
        Each variable corresponds to the user's input of
        a noun verb, adjective, or adverb. Then they
        replace their counterparts in the story as it is printed.*/
        
        Scanner n1 = new Scanner(System.in);
        System.out.println("Subject's name: ");
        String noun1 = n1.next();
        
        Scanner n2 = new Scanner(System.in);
        if(key.equals("eight")||key.equals("8")||key.equals("Eight")||key.equals("EIGHT"))
        {System.out.println("Subject's last name: ");}
        else
        {System.out.println("Noun Two: ");}
        String noun2 = n2.next();
        
        Scanner n3 = new Scanner(System.in);
        System.out.println("Noun Three: ");
        String noun3 = n3.next();
        
        Scanner n4 = new Scanner(System.in);
        System.out.println("Noun Four: ");
        String noun4 = n4.next();
        
        Scanner v1 = new Scanner(System.in);
        System.out.println("Verb ending in ing: ");
        String verb1 = v1.next();
        
        Scanner v2 = new Scanner(System.in);
        System.out.println("Verb ending in ed: ");
        String verb2 = v2.next();
        
        Scanner v3 = new Scanner(System.in);
        System.out.println("Another verb ending in ed: ");
        String verb3 = v3.next();
        
        Scanner v4 = new Scanner(System.in);
        System.out.println("Another verb ending in ing: ");
        String verb4 = v4.next();
        
        Scanner av1 = new Scanner(System.in);
        System.out.println("Adverb One: ");
        String adv1 = av1.next();
        
        Scanner av2 = new Scanner(System.in);
        System.out.println("Adverb Two: ");
        String adv2 = av2.next();
        
        Scanner av3 = new Scanner(System.in);
        System.out.println("Adverb Three: ");
        String adv3 = av3.next();
        
        Scanner av4 = new Scanner(System.in);
        System.out.println("Adverb Four: ");
        String adv4 = av4.next();
        
        Scanner aj1 = new Scanner(System.in);
        System.out.println("Adjective One: ");
        String adj1 = aj1.next();
        
        Scanner aj2 = new Scanner(System.in);
        System.out.println("Adjective Two: ");
        String adj2 = aj2.next();
        
        Scanner aj3 = new Scanner(System.in);
        System.out.println("Adjective Three: ");
        String adj3 = aj3.next();
        
        Scanner aj4 = new Scanner(System.in);
        System.out.println("Adjective Four: ");
        String adj4 = aj4.next();
        
        /*Below are the stories themselves with the variables
        included as names but not yet defined. The variables will
        be substituted during the compiling and will be printed as
        part of the story.*/
        
        String one = new String(noun1+" got out of bed and began getting ready for school. Once on the bus, "
                +" "+noun1+" began \n"+verb1+" with "+noun2+". As the bus driver "+verb2+" "+adv1 
                +", "+noun2+" leaned over and gave me a very "+adj1+"\n"+ noun3+"."+" We got off the " 
                +adj2+", "+adj3+" bus and "+verb3+" "+adv2+" to our classes. All day long, "+noun1
                +"\nthought about the "+noun3+" that "+noun2+" had bestowed. When the last bell rang, "+noun1 
                +" walked\neagerly towards the bus, thinking about "+verb4+" "+noun2+" "+adv3+". Getting on the bus, " 
                +noun1+" finds "+noun2+"'s\n"+noun4+" and "+adv4+" sits down next to "+noun2+" with a "+adj4 
                +" smile.");
        
        String two = new String(verb1+" "+adv1+" into "+noun2+", "+noun1+" began "+verb4+" with his "
                +noun3+".\n"+noun1+" "+verb2+" "+adv2+" about what he "+" "+verb3+" last night.\nWhen "
                +" "+noun1+" talked, "+noun1+" realized how "+adj1+" and "+adj2+" last night was. "+noun1
                +" "+adv3+" realized the "+adj3+" mistake. "+noun1+" "+ verb3+" "+adv4+" about the error"
                +" and apologized for the "+adj4+" behavior.");
        
        String three = new String("As "+noun1+" "+verb2+" with his friends on their way to the big game,"
                + "\nthey expressed their excitement about getting to watch the famed\nNew York "+adj1
                +" Jackets play their hometown "+adj2+" Knights. After tip-off,\nthe "+adj2
                +" Knights quickly threw an alley-oop for a salient slam dunk.\nThe "+noun2
                +" went wild and the stadium immidiately grew loud with cheers.\n"+noun1+" began "+verb1
                +" "+adv1+ " and "+adj2+" Jackets fans "+verb3+" "+adv2+ " at the "+adj3+" child.\n"+noun1
                +" ignored their taunts andcontinued to watch the thrilling match.\n"+verb4+" his seat, "
                +noun1+" was lucky enough to run into his favorite player,\n"+noun3+". Talking rapidly, "
                +noun1+" asked every question possible of his\nfavorite star. He taught "+noun1+" only one lesson: "
                +adv3+" work towards your\n"+adj4+" goals without apprehension.");
        
        String four = new String(noun1+", ready for the camping trip, was "+verb1+ " his "+noun2
                +". As he did this,\nhe " +verb2+ " "+adv1+" about the days to come. The "+adj1
                +" hikes and "+adv2+" fires placed\na feeling of " +adj2+" "+noun3+ " on his heart. "
                +verb4+" to the sound of a trickling stream,\nJack grabbed his "+adj3+" fishing pole and "
                +verb3+" "+adv3+" down to the stream to catch\nhis breakfast. A kingly looking old bass"
                +" slipped silently through the\nrwater. "+noun1+" eyed the regal racer "+adv4
                +" and cast his line into the pond,\nhoping to snatch the "+adj4+" fish for his early"
                +" morning meal.");
        
        String five = new String("Tonight is the night of the "+adj1+" fight. "+noun1+" is ready to take the ring to"
                +" face off\nagainst his rival, the "+adj2+" "+noun2+". "+verb1+" "+adv1+" around the"
                +" room, "+noun1+" looks for "+noun3+".\nWalking to the jug, "+noun1+" "+adv2
                +" "+verb2+" down the "+adj3+" "+noun3+". "+noun1+" "+verb3+" the room "+adv3+"\nbefore donning"
                +" a robe for the entrance. The cheering fans adore the champion\nentering the ring. "
                +noun1+", hearing the ding of the "+noun4+", throws a swift knockout punch.\nThe blow ends"
                +" the match immediately. "+adv4+" "+verb4+" out of the arena, "+noun1+" signs\nautographs"
                +" for "+adj4+" spectators.");
        
        String six = new String("It was a "+adj1+" and stormy night in Gotham city. "+noun1+" was "+verb1
                +" "+adv1+" over Wayne Tower.\nWatching the city, "+noun1+" "+verb2+" "+noun2
                +" robbing a museum for the famed "+adj2+" "+noun3+".\n"+adv3+" jumping into action and"
                +" vaulting into the air, "+noun1+" activated his winged\ncape and floated to the sidewalk."
                +" lauching a net-filled Batarang at "+noun2+",\n"+noun1+" "+adv4+" "+verb3+" over to the"
                +" tangled, would-be burglar. After "+verb4+" "+noun2+" to\nArkham Asylum, "+noun1
                +" drove back to Wayne Manor for a "+adj3+", "+adj4+" rest.");
        
        String seven = new String("Beekeeping is a precarious task, as "+adj1+" beekeeper "+noun1+" tells me.\n"
                +"A Slovenian native, "+noun1+" has grown up around around the art and\n"+adv1+" "+verb2
                +" our request for this interview. 'Honey is nature's golden "+noun2+",'\nstates the artisan."
                +" It has fed people for centuries. "+verb1+" the technique,\n"+noun1+" "+verb3+" the "+adj2
                +" liquid off the "+noun3+" and into a bucket "+adv2+". As I watched\nthe process, the "+adj3
                +" nature of beekeeping "+adv3+" became apparent.\nBeekeeping, although a lost art, continually"
                +" provides food and "+adj4+" "+noun4+ "\nto harvesters. "+verb4+" away from the honey farm"
                +" complex, I understood why the\ntradition had been "+adv4+" passed down, generation after"
                +" generation.");      
        
        String eight = new String("'Hi, my name is "+noun1+" "+noun2+" and this is my pawn shop. I work here\n"
                +"with my "+adj1+" man and my son, Big Hoss. Everything in here has a story,\nand a "+noun3+". "
                +"One thing i've "+verb2+" after twenty-one years,\nttis that you never know what "+adj2+" "+noun4
                +" is gonna walk through that door,'\nthe tv resounded before I "+verb3+" it off as "+adv1
                +" as possible to save my eyes.\nI had heard of the show but wanted to finish my studies."
                +" The quiet saturday night\nleft me alone with my books while others partied "+adv2+" next door. "
                +verb4+" "+adv3+"\nto my studies, I noticed the "+adj3+" buzz of my cellphone."
                +" My spam email filter\nwas full and needed to be cleared. The hope and denial of excitement\n"
                +adv4+" urged me to the "+adj4+" solace of sleep.");
        
        /*Here the code determines which story to print out. 
        It tests the user's numeric input to see whch string
        name it equals before printing the final string.*/
        
        if(key.equals("one")||key.equals("1")||key.equals("One")||key.equals("ONE"))
        {System.out.println();
        System.out.println(one);} 
        
        if(key.equals("two")||key.equals("2")||key.equals("Two")||key.equals("TWO"))
        {System.out.println();
        System.out.println(two);}
        
        if(key.equals("three")||key.equals("3")||key.equals("Three")||key.equals("THREE"))
        {System.out.println();
        System.out.println(three);}
         
        if(key.equals("four")||key.equals("4")||key.equals("Four")||key.equals("FOUR"))
        {System.out.println();
        System.out.println(four);}  
        
        if(key.equals("five")||key.equals("5")||key.equals("Five")||key.equals("FIVE"))
        {System.out.println();
        System.out.println(five);}
        
        if(key.equals("six")||key.equals("6")||key.equals("Six")||key.equals("SIX"))
        {System.out.println();
        System.out.println(six);}
        
        if(key.equals("seven")||key.equals("7")||key.equals("Seven")||key.equals("SEVEN"))
        {System.out.println();
        System.out.println(seven);}
        
        if(key.equals("eight")||key.equals("8")||key.equals("Eight")||key.equals("EIGHT"))
        {System.out.println();
        System.out.println(eight);}
    }
    
}
