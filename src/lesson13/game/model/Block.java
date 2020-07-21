package lesson13.game.model;

public class Block {

    private int blockId;
    private int x;
    private int y;

    private static int blockIdCounter = 0;

    public Block(int x, int y){
        this.x = x;
        this.y = y;
        blockIdCounter ++;
        blockId = blockIdCounter;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getBlockId() {
        return blockId;
    }
}
