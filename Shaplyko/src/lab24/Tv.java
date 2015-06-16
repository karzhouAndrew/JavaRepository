package lab24;

public class Tv extends WhiteGoods {
    private int diagonalSize;

    public Tv(String brandName, int diagonalSize) {
        super(brandName);
        this.diagonalSize = diagonalSize;
    }

    public int getDiagonalSize() {
        return diagonalSize;
    }

    public void setDiagonalSize(int diagonalSize) {
        this.diagonalSize = diagonalSize;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "diagonalSize=" + diagonalSize +
                '}';
    }
}

