#include<iostream>
using namespace std;
struct Comp
{
  int r;
  int i;
};
int main()
{
  int c;
  cin>>c;
  struct Comp c1,c2,res;
  cin>>c1.r>>c1.i;
  cin>>c2.r>>c2.i;
  if(c==1)
  {
    res.r=c1.r+c2.r;
    res.i=c1.i+c2.i;
    cout<<res.r<<"+"<<res.i<<"i";
  }
  else if(c==2)
  {
    res.r=c1.r-c2.r;
    res.i=c1.i-c2.i;
    cout<<res.r<<"+"<<res.i<<"i";
  }
  else if(c==3)
  {
    res.r=(c1.r*c2.r)-(c1.i*c2.i);
    res.i=(c1.r*c2.i)+(c1.i*c2.r);
    cout<<res.r<<res.i<<"i";
  }
  else
  {
    cout<<"Invalid choice";
  }
}