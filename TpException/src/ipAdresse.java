public class ipAdresse {
    private int[] octet = { 0, 0, 0, 0 };

    public ipAdresse(int a, int b, int c, int d) {
        octet[0] = a;
        octet[1] = b;
        octet[2] = c;
        octet[3] = d;
    }

    public String toString() {
        return this.octet[3] + "." + this.octet[2] + "." + this.octet[1] + "." + this.octet[0];
    }

    public static void main(String[] args) {
		ipAdresse ip=null;
			ip = new ipAdresse(-5,1,1,1);
		if (ip!=null) {			
			System.out.print(ip.toString());
		}
	}

}
