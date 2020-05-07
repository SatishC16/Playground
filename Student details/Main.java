#include<iostream>
#include<bits/stdc++.h>
using namespace std;
struct student 
{ 
  char name[30]; 
  char department[25]; 
  int yOs; 
  float cgpa; 
}s[10];

bool compare(student a,student b)
{
  if(a.name<b.name)
  {
    return 1;
  } 
  else
  {
    return 0;
  }
}

int main()
{
  int n;
  cout<<"Enter the number of students";
  cin>>n;
 
  for(int i=0;i<n;i++)
  {
    cout<<"\nEnter the details of student "<<i+1;
    cout<<"\nEnter name";
    cin>>s[i].name;
    cout<<"\nEnter department";
    cin>>s[i].department;
    cout<<"\nEnter year of study";
    cin>>s[i].yOs;
    cout<<"\nEnter cgpa";
	cin>>s[i].cgpa;
  }
  
  sort(s,s+n,compare);
  
  cout<<"\nDetails of students";
  for(int i=0;i<n;i++)
  {
    cout<<"\nStudent "<<i+1;
    cout<<"\nName:"<<s[i].name;
    cout<<"\nDepartment:"<<s[i].department;
    cout<<"\nYear of study:"<<s[i].yOs;
    cout<<"\nCGPA:"<<s[i].cgpa;
  }
}