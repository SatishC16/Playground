#include<iostream>
using namespace std;
int main()
{
  int n1,n2,n6;
  float n3,n4,n5;
  cin>>n1>>n3>>n2>>n4;
  n5=n3+n4;
  if(n5>12)
  {
    n6=n1+n2+1;
    n5=n5-12;
    cout<<n6<<"'-"<<n5<<'"';
  }
  else if(n5<=12)
  {
    n6=n1+n2;
    cout<<n6<<"'-"<<n5<<'"';
  }
}