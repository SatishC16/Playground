#include<string>
#include<iostream>
using namespace std;
int main()
{
  string str1,str2;
  getline(cin,str1);
  getline(cin,str2);
  
  int n=str1.compare(str2);
  if(n==0)
  {
    cout<<"It is correct"<<endl;
  }
  else
  {
    cout<<"It is wrong"<<endl;
  }
}