public class Printer {

    private int paperLeft;
    private int tonerVolume;

    public Printer(int paperLeft, int tonerVolume) {
        this.paperLeft = paperLeft;
        this.tonerVolume = tonerVolume;
    }

    public int getPaperLeft() {
        return paperLeft;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }

    //The public void specifies that there is no return in the method
    public void print(int numberOfPages, int numberOfCopies) {
        int totalPagesPrinted = numberOfPages * numberOfCopies;
        if (paperLeft >= totalPagesPrinted) {
            paperLeft -= totalPagesPrinted;
            tonerVolume -= totalPagesPrinted;
        } else {
            System.out.println("Not enough paper!");
        }
    }
}
