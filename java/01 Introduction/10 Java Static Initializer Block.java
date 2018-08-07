// https://www.hackerrank.com/challenges/java-static-initializer-block/problem

static short B, H;
static Boolean flag;

static {
    Scanner sc = new Scanner(System.in);
    B = sc.nextShort();
    H = sc.nextShort();
    flag = (B>0 && H>0);
    if(!flag)
        System.out.println("java.lang.Exception: Breadth and height must be positive");
}