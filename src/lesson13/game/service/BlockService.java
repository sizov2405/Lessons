package lesson13.game.service;

import lesson13.game.model.Block;

public class BlockService {

    private Block[] blocks = new Block[10];
    private int qtyOfBlocks = 0;

    public void addToBlock (Block block){
        for (int i = 0; i < blocks.length; i++){
            if(blocks[i] == null){
                blocks[i] = block;
                qtyOfBlocks++;
                return;
            }
        }
        System.out.println("All 10 blocks are placed already");
    }

    public void removeFromBlockById (int id) {
        for (int i = 0; i < blocks.length; i++){
            if (blocks[i] != null && blocks[i].getBlockId() == id) {
                blocks[i] = null;
                qtyOfBlocks--;
                return;
            }
        }
    }

    public int qtyOfBlocks (){
        return qtyOfBlocks;
    }

    public boolean isBlockHere(int x, int y){
        for (Block block : blocks) {
            if (block != null && block.getX() == x && block.getY() == y) {
                return true;
            }
        }
        return false;
    }

}


