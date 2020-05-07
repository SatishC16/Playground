#include<iostream>
using namespace std;
struct College 
{ 
  char name[100]; 
  char city[100]; 
  int yr; 
  float per; 
};

int main()
{
  int n;
  cout<<"Enter the number of colleges";
  cin>>n;
  struct College arr[n];
  for(int i=0;i<n;i++)
  {
    cout<<"\nEnter the details of college "<<i+1;
cout<<"\nEnter name";
    cin>>arr[i].name;
cout<<"\nEnter city";
    cin>>arr[i].city;
cout<<"\nEnter year of establishment";
    cin>>arr[i].yr;
cout<<"\nEnter pass percentage";
    cin>>arr[i].per;
  }
    
  cout<<"\nDetails of colleges";
  for(int i=0;i<n;i++)
  {
cout<<"\nCollege:"<<i+1;
cout<<"\nName:"<<arr[i].name;
cout<<"\nCity:"<<arr[i].city;
cout<<"\nYear of establishment:"<<arr[i].yr;
cout<<"\nPass percentage:"<<arr[i].per;  
}
}