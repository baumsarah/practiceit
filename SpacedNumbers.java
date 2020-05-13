/* Write nested for loops to produce the following output:

    1
   2
  3
 4
5
*/

for(int i = 1; i < 6; i++) {
    //i = 1, space = 4; i = 2, space = 3; i = 3, space = 2; i = 4, space = 1
    for(int j = 0; j < (i * -1 + 5); j++) {
        System.out.print(" ");
    }
    System.out.println(i);
}
