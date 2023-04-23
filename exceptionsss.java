
class exceptionsss {
    public static void main(String[] args) {
        try {
            long[] arr = { 34, 56, 89, 11, 23, 65, 89, 53, 29 };

            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("out of boundry");
        } finally {
            System.out.println("code execution is finished");
        }
    }
}