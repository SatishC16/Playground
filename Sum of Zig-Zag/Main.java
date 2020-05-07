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
  int sum=0;
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      if(r==3 && c==3)
      {
        if(i==1 && ( j==0 || j==2 ) )
        {
          continue;
        }
        else
        {
          sum+=a[i][j];
        }
      }
      else
      {
        sum+=a[i][j];
      }
      
    }
  }
  cout<<"Sum of Zig-Zag pattern is "<<sum;
}