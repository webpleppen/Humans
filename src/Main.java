public class Main{
    public static void main(String[] args) {

        Forum forum = new Forum();

        Human swedishPerson = new Swedish("Anna");
        Human spanishPerson = new Spanish("Maria");
        Human englishPerson = new English("John");
        Human latinPerson = new Latin("Julius");



        forum.makePeopleTalk(swedishPerson);
        forum.makePeopleTalk(spanishPerson);
        forum.makePeopleTalk(englishPerson);
        forum.makePeopleTalk(latinPerson);
    }
}