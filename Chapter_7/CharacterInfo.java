class CharacterInfo {
    public static void main(String[] args){

        char character = 'C';
        System.out.println("The character is: " + character);

        if(Character.isUpperCase(character)){
            System.out.println(character + " is uppercase");
        } else {
            System.out.println(character + " is not an uppercase");
        }

        if(Character.isLowerCase(character)){
            System.out.println(character + " is lowercase");
        } else {
            System.out.println(character + " is not a lowercase");
        }

        System.out.println("After toLowerCase(), " + Character.toLowerCase(character));
        System.out.println("After toUpperCase(), " + Character.toUpperCase(character));

        if(Character.isLetterOrDigit(character)){
            System.out.println(character + " is a letter or digit");
        } else {
            System.out.println(character + " is not a letter or digit");
        }

        if(Character.isWhitespace(character)){
            System.out.println(character + " is a whitespace");
        } else {
            System.out.println(character + " is not a whitespace");
        }
        

    }
}