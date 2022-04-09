public class ipAdresse {
    private int[] octet = { 0, 0, 0, 0 };

    public ipAdresse(int a, int b, int c, int d) throws ipAdrException {
        if (a > 255) {
            throw new ipAdrException(1, 0);
        }
        if (a < 0) {
            throw new ipAdrException(0, 0);
        }
        if (b > 255) {
            throw new ipAdrException(1, 1);
        }
        if (b < 0) {
            throw new ipAdrException(0, 1);
        }
        if (c > 255) {
            throw new ipAdrException(1, 2);
        }
        if (c < 0) {
            throw new ipAdrException(0, 2);
        }
        if (d > 255) {
            throw new ipAdrException(1, 3);
        }
        if (d < 0) {
            throw new ipAdrException(0, 3);
        }

        octet[0] = a;
        octet[1] = b;
        octet[2] = c;
        octet[3] = d;
    }

    public String toString() {
        return this.octet[3] + "." + this.octet[2] + "." + this.octet[1] + "." + this.octet[0];
    }

    public static void main(String[] args) {
        ipAdresse ip = null;
        try {
            ip = new ipAdresse(-5, 1, 1, 1);
        } catch (ipAdrException e) {
            System.out.println(e.getMessage());
        }
        if (ip != null) {
            System.out.print(ip.toString());
        }
    }

}
