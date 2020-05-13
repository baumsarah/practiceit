/* Modify the SlashFigure program from the previous exercise to produce a new program SlashFigure2 
that uses a global constant for the figure's height. 
The previous output used a constant height of 6. 
Here is the outputs for a constant height of 4 and 7 respectively: 

size 4	
!!!!!!!!!!!!!!
\\!!!!!!!!!!//
\\\\!!!!!!////
\\\\\\!!//////

size 7
!!!!!!!!!!!!!!!!!!!!!!!!!!
\\!!!!!!!!!!!!!!!!!!!!!!//
\\\\!!!!!!!!!!!!!!!!!!////
\\\\\\!!!!!!!!!!!!!!//////
\\\\\\\\!!!!!!!!!!////////
\\\\\\\\\\!!!!!!//////////
\\\\\\\\\\\\!!////////////
(You must solve this problem using only ONE public static final constant, not multiple constants; and its value must be used in the way described in this problem.)
*/

public class SlashFigure2 {
    public static final int SIZE = 6; 
    public static void main(String[] args) {
        for(int i = 0; i < SIZE; i++) {
            for(int j = 0; j < (i * 2); j++) {
                System.out.print("\\");
            }
            for(int j = ((SIZE - i) * 2 - 1) * 2; j > 0; j--) {
                System.out.print("!");
            }
            for(int j = 0; j < (i * 2); j++) {
                System.out.print("/");
            }
            System.out.println();
        }
    }
}
