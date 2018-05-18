public enum bedroomType {

    SINGLE(50),
    DOUBLE(60);

    private final int rate;

    bedroomType(int rate) {
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }
}

