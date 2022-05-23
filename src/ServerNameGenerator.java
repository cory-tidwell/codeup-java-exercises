public class ServerNameGenerator {
    static String[] adjectives = {"bald", "tiny", "tall", "gigantic", "chubby", "flabby", "angry", "clumsy","nervous", "plump"};
    static String[] nouns = {"cat", "ship", "babies", "hero", "ocean", "Uncle Mike", "pen", "clock", "man", "state"};



    static String randomString(String[] words) {
        int randomElement = (int)(Math.random() * words.length);
        return words[randomElement];
    }

    public static void main(String[] args) {
        String adjective = randomString(adjectives);
        String noun = randomString(nouns);
        String serverName = adjective + "-" + noun;
        System.out.printf("Here is your server name:%n%s",serverName);
    }
}
