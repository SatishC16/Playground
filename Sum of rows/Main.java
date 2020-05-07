#include<iostream>
using namespace std;
int main()
{
  int r,c,max1=0,no1=0,no2=0,maxSum=0,maxSum1=0;
  cin>>r>>c;
  int a[r][c];
  
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  
  for(int i=0;i<r;i++)
  {
    int sum1=0;
    for(int j=0;j<c;j++)
    {
      sum1+=a[i][j];
    }
    cout<<sum1<<"\n";
  }
}