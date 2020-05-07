#include <iostream>
int main()
{
char str[100], rev[100];     
int end,i,c=0;    
//Your code goes here
  std::cin.getline(str,100);
  while (str[c] != '\0')
  {    c++;
  }
   end = c - 1;

   for (i = 0; i < c; i++) 
   {
      rev[i] = str[end];
      end--;
   }

   rev[i] = '\0';

std::cout<<rev;
}