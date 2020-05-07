#include<iostream>
using namespace std;
struct Emp
{ 
  char name[10]; 
  char des[10]; 
  int id;
  int age;
  int salary;
};

int main()
{
  struct Emp e1;
    
    cout<<"Enter name:";
    cin>>e1.name;
    cout<<"\nEnter ID:";
    cin>>e1.id;
    cout<<"\nEnter age:";
    cin>>e1.age;
    cout<<"\nEnter designation:";
	cin>>e1.des;
  	cout<<"\nEnter Salary:";
    cin>>e1.salary;
  
  cout<<"\nEmployee Details";
  
    
    cout<<"\nName of the Employee : "<<e1.name;
    cout<<"\nID of the Employee : "<<e1.id;
    cout<<"\nAge of the Employee : "<<e1.age;
  cout<<"\nDesignation of the Employee : "<<e1.des;
  cout<<"\nSalary of the Employee : "<<e1.salary;
   
  
}