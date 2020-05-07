#include<iostream>
using namespace std;

struct TIME
{
  int sec;
  int min;
  int hr;
};

void Ctd(struct TIME,struct TIME,struct TIME *);

int main()
{
  struct TIME t1,t2,diff;
  
  cin>>t1.hr>>t1.min>>t1.sec;
  cin>>t2.hr>>t2.min>>t2.sec;
  
  Ctd(t1,t2,&diff);
  cout<<diff.hr<<":"<<diff.min<<":"<<diff.sec;
  return 0;
}

void Ctd(struct TIME t1,struct TIME t2,struct TIME *diff)
{
  if(t2.sec>t1.sec)
  {
    --t1.min;
    t1.sec+=60;
  }
  diff->sec = t1.sec - t2.sec;
  if(t2.min>t1.min)
  {
    --t1.hr;
    t1.min+=60;
  }
  diff->min = t1.min - t2.min;
  diff->hr = t1.hr - t2.hr;
}