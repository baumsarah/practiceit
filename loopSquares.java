/* Write a for loop that produces the following output:

1 4 9 16 25 36 49 64 81 100 
For added challenge, try to modify your code so that it does not need to use the * multiplication operator. 
(It can be done! Hint: Look at the differences between adjacent numbers.)
*/

int j = 1;
for(int i = 1; i < 101; i += j) {
    System.out.print(i + " ");
    j += 2;
}
