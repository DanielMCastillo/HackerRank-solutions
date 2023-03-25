public class Multiples {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        
        for(int i=1; i<= N; N++){
            system.out.println(N, "x" , i, "=", N*i);
        }
    }
}
