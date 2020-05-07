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
  cout<<"Sum of rows is ";
  for(int i=0;i<r;i++)
  {
    int sum1=0;
    for(int j=0;j<c;j++)
    {
      sum1+=a[i][j];
    }
    cout<<sum1<<" ";
    if(sum1>maxSum)
    {
      maxSum=sum1;
      no1=i+1;
    }
  }
  cout<<"\nRow "<<no1<<" has maximum sum";
  
  
  cout<<"\nSum of columns is ";
  for(int i=0;i<c;i++)
  {
    int sum2=0;
    for(int j=0;j<r;j++)
    {
      sum2+=a[j][i];
    }
    cout<<sum2<<" ";
    if(sum2>maxSum1)
    {
      maxSum1=sum2;
      no2=i+1;
    }
  }
  cout<<"\nColumn "<<no2<<" has maximum sum";
}