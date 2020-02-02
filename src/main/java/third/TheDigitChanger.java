package third;

public class TheDigitChanger {

    public int changeTheMostRightDigitFromZeroToOne(int n) {
        return n | (n + 1);
    }
}
