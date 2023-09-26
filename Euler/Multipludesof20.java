package Euler;

public class Multipludesof20 {
    public static void main(String[] args) {
        int cnum = 19*20;
        for(;;cnum+=20){
            if (cnum%19==0){
                if(cnum%18==0){
                    if (cnum%17==0){
                        if (cnum%16==0){
                            if (cnum%15==0){
                                if (cnum%14==0){
                                    if (cnum%13==0){
                                        if (cnum%12==0){
                                            if (cnum%11==0){
                                                if (cnum%9==0){
                                                    if (cnum%8==0){
                                                        if (cnum%7==0){
                                                            if (cnum%6==0){
                                                                if (cnum%3==0){
                                                                System.out.println(cnum);
                                                                break;
                                                                }       
                                                            }   
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                               }
                            }
                        }
                    }
                }  
            }
        }
    }
}
