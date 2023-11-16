package org.example;

 class Cricket {
     protected String batsman="Virat";
     public void player(){
         System.out.println("G O A T");
         class Athlete extends Cricket{
             private String playerName="Kohli";

             public static void main(String[] args) {
                 Athlete myFav=new Athlete();
                 myFav.player();
                 System.out.println(myFav.batsman + " " + myFav.playerName);
             }
         }
     }
}
