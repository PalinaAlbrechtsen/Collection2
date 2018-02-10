package Homework.first;

public class Main {

    public static void main(String[] args) {
        String text = "Everyone in this world was born with a specific set of gifts; " +
                "many of which can directly benefit our peers and society as a whole. " +
                "Your calling or vocation is going to be that merging point between your passions " +
                "and giftedness. The way we navigate this space is going to largely determine " +
                "the type of impact we have on the world. Each of us has the CAPACITY for greatness " +
                "(emphasis on capacity)... To actualize this potential we have to work, move, " +
                "and interact. Otherwise we'll all just be empty vessels walking around. " +
                "But think about when you're putting in the work, garnering the knowledge and gaining " +
                "the experience to fulfill your calling. Your cup will not only start to fill " +
                "but also run over. That's where truly making an impact comes in";

        //если попроще :)
       // String text = "Hello! It's me. Is it me? Yes. It is me. (I love Java)";

        WordsOfText.getOverReps(TextFormatting.createListFromStringLine(TextFormatting.deletePunctuationMarks(text)));
    }
}
