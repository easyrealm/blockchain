import java.util.Date;

public class Block
{
    private int index;
    public String hash;
    public String prevHash;
    private long timeStamp;
    private String data;
    

    public Block(int index, String hash, String data)
    {
        this.data = data;
        this.timeStamp = new Date().getTime();
        this.prevHash = prevHash;
        this.hash = generateHash();
    }

    public String generateHash()
    {
        String newHash = BlockUtility.applySHA256(prevHash + Long.toString(timeStamp) + data);
        return newHash;
    }
}