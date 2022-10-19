public class DemoApp {
    public static void main(String[] args) {
        Card cards[] = new Card[10];
        CardStack cardStack = new CardStack(cards);
        cardStack.push(new Card(1,"blue"));
        cardStack.push(new Card(2,"green"));
        cardStack.push(new Card(3,"yellow"));
        cardStack.push(new Card(4,"red"));
        System.out.println(cardStack.pop().toString() + "\n");
        System.out.println(cardStack.pop().toString() + "\n");
        System.out.println(cardStack.pop().toString() + "\n");
        System.out.println(cardStack.pop().toString() + "\n");

    }
}