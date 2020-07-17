package pinduoduo;

public class boge {
    public char[] soulution(char[] chr) {
        int i = -1;
        int j = 0;
        for(; j < chr.length; j++) {
               if(chr[j] == chr[j+1] && chr[j+1] == ' ') {
                   j++;
               while(chr[j] == ' ') j++;
               --j;
               }
          chr[++i] = chr[j];
        }
          return chr;
    }
}
