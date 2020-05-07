#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str1,str2,str3;
  getline(cin,str1);
  getline(cin,str2);
  
  for(string::reverse_iterator i=str2.rbegin();i<str2.rend();i++)
  {
    str3=str3+*i;
  }
  int n=str1.compare(str3);
  
  if(n==0)
  {
    cout<<"It is correct";
  }
  else
  {
    cout<<"It is wrong";
  }
}