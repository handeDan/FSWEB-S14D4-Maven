package org.example.rpg;

public class Game {
        public static void main(String[] args) {
            Monster[] characters = new Monster[] {
                    new Troll("Troll", 8, 2.5),
                    new Werewolf("Werewolf", 9, 2.6),
            };
            listCharacters(characters);
        }

        public static void listCharacters(Monster[] characters) {
            for(Monster character : characters) {
                character.characterDetails();
            }
        }
}