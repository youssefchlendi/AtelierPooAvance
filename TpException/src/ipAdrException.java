public class ipAdrException extends Exception {
    public ipAdrException(int num,int pos) {
        super(num==1?"Position: "+pos+" Octet max 255":"Position: "+pos+" Octet Min 0");
    }
}
