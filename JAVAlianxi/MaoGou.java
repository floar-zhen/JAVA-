import java.util.*;
public class MaoGou {
        public ArrayList<Integer> asylum(int[][] ope) {
            // write code here
            ArrayList<Integer> result = new ArrayList<Integer>();
            ArrayList<Integer> maogou = new ArrayList<Integer>();
            int rows = ope.length;
            for(int i = 0;i<rows;i++){
                switch(ope[i][0]){
                    //有动物进入
                    case 1:
                        result.add(ope[i][1]);
                        break;
                    //有人领养
                    case 2:
                        //第一种领养方式
                        if(ope[i][1] == 0){
                            for(int j = 0; j<result.size();j++){
                                if(result.get(j) != 0){
                                    maogou.add(result.get(j));
                                    result.set(j, 0);
                                    break;
                                }
                            }
                        }
                        //指定收养狗
                        else if(ope[i][1]==1){
                            for(int j = 0; j<result.size();j++){
                                if(result.get(j) > 0){
                                    maogou.add(result.get(j));
                                    result.set(j, 0);
                                    break;
                                }
                            }
                        }
                        //指定收养猫
                        else if(ope[i][1]== -1){
                            for(int j = 0; j<result.size();j++){
                                if(result.get(j) < 0){
                                    maogou.add(result.get(j));
                                    result.set(j, 0);
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
            return maogou;
        }
    }
