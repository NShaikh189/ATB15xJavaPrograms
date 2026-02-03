package ENUM;

 enum Hex_Codes{
    RED("#F3000"),
    BLACK("00000"),
    GREEN("F54334");

    private String hexCode;

    Hex_Codes(String hexCode)
    {
        this.hexCode = hexCode;
    }


    public String getHexCode()
    {
        return this.hexCode;
    }

}
public class EnumHexCodes {

    public static void main(String[] args) {
        System.out.println(Hex_Codes.RED.getHexCode());
    }
}
