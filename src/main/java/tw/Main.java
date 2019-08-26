package tw;

import tw.commands.GuessInputCommand;

/**
 * Created by jxzhong on 2017/5/16.
 */
public class Main {
    private static final int RUN_TIMES = 6;
    private static final String right = "1234";

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < RUN_TIMES; i++) {
            String input = new GuessInputCommand().input();
            int countA = 0;
            int countB = 0;
            //iput变array
            char[] inputchar =input.toCharArray();
            //step1 统计相同数字
            for(int j = 0;j < inputchar.length; j++){
                if(right.indexOf(inputchar[j])!=-1){
                    if(right.indexOf(inputchar[j]) == j){
                        countA++;

                    }else{
                        countB++;
                    }
                }
            }
            System.out.println(input);
            System.out.println(countA+"A"+countB+"B");

        }
        System.out.println("游戏结束");
    }
}
