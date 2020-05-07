#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str;
  getline(cin,str);
  
  int n=str.length();
  cout<<"The number of letters in the name is "<<n;
}