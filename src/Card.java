import java.util.Arrays;

public class Card {
    private int value;
    private String colour;

    private String allowedColours[] = {"blue","green","yellow","red"};

    public Card(int value, String colour) {
        if (Arrays.asList(allowedColours).contains(colour)) {
            this.colour = colour;
        } else {
            System.out.println("This colour is not allowed!\nJust blue, green, yellow or red is allowed!");
        }

        if (value > 0 && value < 10) {
            this.value = value;
        } else {
            System.out.println("Value not allowed!\nNumber must be between 1 and 9 (1 and 9 included)");
        }
    }

    public int getValue() {
        return this.value;
    }

    public String getColour() {
        return this.colour;
    }

    @Override
    public String toString() {
        return "Card value  = " + this.value + "\nCard colour = " + this.colour;
    }
}