
public class Character {

	// Data fields
	public final String CharacterName;
	public final String Faction;
	public final String Race;
	public final String Class;
	public final String Gender;
	public boolean up;

	// Constructor
	public Character(String CharacterName, String Faction, String Race, String Class, String Gender) {
		this.CharacterName = CharacterName;
		this.Faction = Faction;
		this.Race = Race;
		this.Class = Class;
		this.Gender = Gender;
		up = true;
	}

	//flips the character down

	public void flipDown(){
		
		if(up){
			
			up = false;
			
		}
		
	}
	
	//flips the character up
	
	public void flipUp(){
		
		if(!up){
			
			up = true;
			
		}
		
	}
	
	//returns true if the character is still "up" or valid, false otherwise
	
	public boolean status(){
		
		return up;
		
	}
	
	public String getFullInfo(){
		
		String info = "";
		
		info += "Character Name: " + CharacterName + "\n";
		info += "Faction: " + Faction + "\n";
		info += "Race: " + Race + "\n";
		info += "Class: " + Class + "\n";
		info += "Gender: " + Gender + "\n";
		
		return info;
		
	}
	
	public String getName() {
		return CharacterName;
	}

	public boolean hasTrait(String trait) {

		if (trait.equalsIgnoreCase(Faction)) {
			return true;
		} else if (trait.equalsIgnoreCase(Race)) {
			return true;
		} else if (trait.equalsIgnoreCase(Class)) {
			return true;
		} else if (trait.equalsIgnoreCase(Gender)) {
			return true;
		}
		return false;

	}

}
