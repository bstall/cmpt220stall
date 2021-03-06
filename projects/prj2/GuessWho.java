import java.util.Scanner;
import java.util.Random;

public class GuessWho {

	public static Character charWithName(Character board[][], String name) {

		for (int i = 0; i < board.length; ++i) {

			for (int j = 0; j < board[i].length; ++j) {

				if (board[i][j].getName().equals(name.trim())) {

					return board[i][j];

				}

			}

		}

		return null;

	}
	//Displays character traits
	public static void traitList(Character board[][], String trait) {

		String list = "";

		for (int i = 0; i < board.length; ++i) {

			for (int j = 0; j < board[i].length; ++j) {

				if (board[i][j].hasTrait(trait)) {

					list += "[ " + board[i][j].getName() + " ]";

				}

			}

		}

		System.out.println(list);

	}
	//Flips the characters with trait
	public static void flipWithTrait(Character board[][], String trait) {

		for (int i = 0; i < board.length; ++i) {

			for (int j = 0; j < board[i].length; ++j) {

				// if the Character does have the trait and is UP

				if (board[i][j].hasTrait(trait)) {

					board[i][j].flipDown();

				}

			}

		}

	}
	//Flips characters who don't have the trait
	public static void flipWithoutTrait(Character board[][], String trait) {

		for (int i = 0; i < board.length; ++i) {

			for (int j = 0; j < board[i].length; ++j) {

				// if the Character does not have the trait and is UP

				if (!board[i][j].hasTrait(trait)) {

					board[i][j].flipDown();

				}

			}

		}

	}
	//Displays board
	public static void printBoard(Character board[][]) {

		for (int i = 0; i < board.length; ++i) {

			for (int j = 0; j < board[i].length; ++j) {

				if (board[i][j].status()) {

					System.out.print("[ " + board[i][j].getName() + " ]");

				}

				else {

					System.out.print("[ ]");

				}

			}

			System.out.println();

		}

	}

	public static void main(String args[]) {

		// Block character creation
		Character sylvanas = new Character("Sylvanas Windrunner", "Horde", "Undead", "Hunter", "Female");
		Character guldan = new Character("Gul'dan", "Horde", "Orc", "Warlock", "Male");
		Character thrall = new Character("Thrall", "Horde", "Orc", "Shaman", "Male");
		Character khadgar = new Character("Khadgar", "Alliance", "Human", "Mage", "Male");
		Character anduin = new Character("Anduin Lothar", "Alliance", "Human", "Warrior", "Male");
		Character jaina = new Character("Jaina Proudmoore", "Alliance", "Human", "Mage", "Female");
		Character tyrande = new Character("Tyrande Whisperwind", "Alliance", "Night Elf", "Priest", "Female");
		Character malfurion = new Character("Malfurion Stormrage", "Alliance", "Night Elf", "Druid", "Male");
		Character voljin = new Character("Vol'jin", "Horde", "Troll", "Rogue", "Male");
		Character baine = new Character("Baine Bloodhoof", "Horde", "Tauren", "Warrior", "Male");
		Character velen = new Character("Velen", "Alliance", "Draenei", "Priest", "Male");
		Character chen = new Character("Chen Stormstout", "Neither", "Pandaren", "Monk", "Male");
		Character modimus = new Character("Modimus Anvilmar", "Alliance", "Dwarf", "Paladin", "Male");
		Character sicco = new Character("Sicco Thermaplugg", "Alliance", "Gnome", "Warrior", "Male");
		Character genn = new Character("Genn Greymane", "Alliance", "Worgen", "Warrior", "Female");
		Character jastor = new Character("Jastor Gallywix", "Horde", "Goblin", "Mage", "Male");
		Character tamaala = new Character("Tamaala", "Horde", "Tauren", "Druid", "Female");
		Character aysa = new Character("Aysa Cloudsinger", "Alliance", "Pandaren", "Monk", "Female");
		Character ji = new Character("Ji Firepaw", "Horde", "Pandaren", "Monk", "Male");
		Character taran = new Character("Taran Zhu", "Neither", "Pandaren", "Monk", "Male");
		Character liadrin = new Character("Lady Liadrin", "Horde", "Blood Elf", "Paladin", "Female");
		Character lich = new Character("Lich King", "Neither", "Undead", "Death Knight", "Male");
		Character teron = new Character("Teron Gorefiend", "Neither", "Orc", "Death Knight", "Male");
		Character vanessa = new Character("Vanessa VanCleef", "Neither", "Human", "Rogue", "Female");
		Character shandris = new Character("Shandris Feathermoon", "Alliance", "Night Elf", "Hunter", "Female");
		Character hemet = new Character("Hemet Nesingwary", "Neither", "Dwarf", "Hunter", "Male");
		Character illidan = new Character("Illidan Stormrage", "Neither", "Night Elf", "Demon Hunter", "Male");
		Character alandien = new Character("Alandien", "Neither", "Night Elf", "Demon Hunter", "Female");
		Character hamuul = new Character("Hamuul Runetotem", "Horde", "Tauren", "Druid", "Male");
		Character celestine = new Character("Celestine of the Harvest", "Alliance", "Worgen", "Druid", "Female");
		Character medivh = new Character("Medivh", "Neither", "Human", "Warlock", "Male");
		Character drek = new Character("Drek'Thar", "Horde", "Orc", "Shaman", "Male");
		Character nobundo = new Character("Farseer Nobundo", "Alliance", "Draenei", "Shaman", "Male");
		Character arthas = new Character("Arthas Menethil", "Neither", "Undead", "Paladin", "Male");
		Character leotheras = new Character("Leotheras the Blind", "Neither", "Blood Elf", "Demon Hunter", "Male");
		Character durotan = new Character("Durotan", "Horde", "Orc", "Warrior", "Male");

		// Board
		Character board[][] = new Character[6][6];
		{
			// Put characters on board
			board[0][0] = sylvanas;
			board[0][1] = guldan;
			board[0][2] = thrall;
			board[0][3] = khadgar;
			board[0][4] = anduin;
			board[0][5] = jaina;
			board[1][0] = tyrande;
			board[1][1] = malfurion;
			board[1][2] = voljin;
			board[1][3] = baine;
			board[1][4] = velen;
			board[1][5] = chen;
			board[2][0] = modimus;
			board[2][1] = sicco;
			board[2][2] = genn;
			board[2][3] = jastor;
			board[2][4] = tamaala;
			board[2][5] = aysa;
			board[3][0] = ji;
			board[3][1] = taran;
			board[3][2] = liadrin;
			board[3][3] = lich;
			board[3][4] = teron;
			board[3][5] = vanessa;
			board[4][0] = shandris;
			board[4][1] = hemet;
			board[4][2] = illidan;
			board[4][3] = alandien;
			board[4][4] = hamuul;
			board[4][5] = celestine;
			board[5][0] = medivh;
			board[5][1] = drek;
			board[5][2] = nobundo;
			board[5][3] = arthas;
			board[5][4] = leotheras;
			board[5][5] = durotan;
		}
		// Instructions and intro
		System.out.println(
				"Welcome to World of Warcraft Guess Who!\n" + "At the beginning of each turn please indicate whether "
						+ "you will guess a name or trait.\n" + "To win the game you guess the computer's character.\n"
						+ "To ask for a character's traits, use the help command.\n"
						+ "The factions are horde, alliance or neither.\n"
						+ "The races are human, night elf, draenei, dwarf, gnome, worgen, \n"
						+ "pandaren, undead, orc, troll, tauren, goblin, and blood elf.\n"
						+ "The classes are mage, warrior, druid, priest, paladin, monk, \n"
						+ "hunter, warlock, shaman, rogue, death knight, and demon hunter.");

		boolean gameWon = false;

		Random generator = new Random();

		int rand = generator.nextInt(36);

		// we have to initialize computer to null but the nested for loops
		// guarantee an actual selection

		Character computer = null;

		// computer becomes a randomly selected character in the board

		for (int i = 0; i < 6; ++i) {

			for (int j = 0; j < 6; ++j) {

				if (rand == 0) {

					computer = board[i][j];

				}

				--rand;

			}

			--rand;

		}

		Scanner reader = new Scanner(System.in);
		//Game loop
		while (!gameWon) {

			System.out.println("Here is the current board state: ");
			printBoard(board);
			System.out.println("Name, trait, or help?");
			String userAns = reader.nextLine();
			
			//If user wants to guess a name
			if (userAns.equalsIgnoreCase("name")) {

				System.out.println("What's your guess? ");
				String guess = reader.nextLine();
				if (computer.getName().equalsIgnoreCase(guess)) {

					gameWon = true;

				}

				else {
					//Flips down wrong character guesses
					System.out.println("Sorry, that's not the right Character!");
					flipWithTrait(board, guess);

				}

			}
			
			//If user wants to ask about a trait
			else if (userAns.equalsIgnoreCase("trait")) {

				System.out.println("What trait would you like to ask about? ");
				String trait = reader.nextLine();

				if (computer.hasTrait(trait)) {

					System.out.println(
							"The computer's character does have that trait! Flipping down all characters that don't.");
					flipWithoutTrait(board, trait);

				}

				else {

					System.out.println(
							"The computer's character does not have that trait! Flipping down all characters that do.");
					flipWithTrait(board, trait);

				}

			}
			//Displays attributes of character the user asks for
			else if (userAns.equalsIgnoreCase("help")) {

				System.out.println("Would you like to know more about a trait or a character?");
				String help = reader.nextLine();

				if (help.equalsIgnoreCase("character")) {

					System.out.println("What character would you like to find out more about?");
					String character = reader.nextLine();

					Character helper = charWithName(board, character);
					System.out.println(helper.getFullInfo());

				}
				
				//Displays characters with trait
				else if(help.equalsIgnoreCase("trait")){
					
					System.out.println("What trait would you like to find out more about?");
					String trait = reader.nextLine();
					
					traitList(board, trait);
					
				}
				
			}

		}

		System.out.println(
				"Congratulations! You've guessed that the computer's Character was " + computer.getName() + "!");
		reader.close();

	}

}
